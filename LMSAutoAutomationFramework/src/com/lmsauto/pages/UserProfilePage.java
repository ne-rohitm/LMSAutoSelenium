package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class UserProfilePage {
	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private Properties prop;  
	private ReadExcelData readExcelData = new ReadExcelData();
	
	public UserProfilePage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void navigateToUserProfile() throws InterruptedException {
		Actions ac = new Actions(driver);
		Commons.waitFor(5000);
		WebElement manageUserLink = this.clickOnManageProfile();
		ac.moveToElement(manageUserLink).click().build().perform();
	}
	
	public void verifyColorIsApplied() throws InterruptedException {
		for (int i = 1; i <= 12; i++) {
			Commons.waitFor(1000);
			WebElement userProfile = this.clickOnUserProfile();
			Actions ac = new Actions(driver);
			ac.moveToElement(userProfile).click().build().perform();
			driver.findElement(By.xpath(prop.getProperty("color" + i))).click();
			String colorOne = driver.findElement(By.xpath(prop.getProperty("color" + i)))
					.getCssValue("background-color");
			String hexOne = Color.fromString(colorOne).asHex();
			System.out.println("colorbtn " + hexOne);
			Commons.waitFor(200);
			String UpdateColorOne = driver.findElement(By.xpath(prop.getProperty("changePasswordUpdateButton")))
					.getCssValue("background-color");
			String UpdatehexOne = Color.fromString(UpdateColorOne).asHex();
			System.out.println("colorUpdatebtn " + UpdatehexOne);

			Assert.assertEquals(hexOne, UpdatehexOne, "Chosen Color is not applied to the application");
			System.out.println("Chosen Color is applied to the application");
		}
	}
	
	public WebElement clickOnUserProfile() throws InterruptedException {
		Commons.waitFor(100);
		return driver.findElement(By.xpath(prop.getProperty("profileUserName")));
	}
	
	public WebElement clickOnManageProfile() {
		return driver.findElement(By.xpath(prop.getProperty("manageProfile")));
	}
	
	public void clickOnChangePasswordUpdateButton() {
		driver.findElement(By.xpath(prop.getProperty("changePasswordUpdateButton"))).click();
	}
	
	public void clickOnProfileUpdateButton() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("profileUpdateButton"))).click();
	}
	
	public void sendDataToOldPasswordTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("oldPassword"))).clear();
		driver.findElement(By.xpath(prop.getProperty("oldPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(1, 1, "LoginPage"));
	}
	
	public void sendDataToNewPasswordTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("newPassword"))).clear();
		driver.findElement(By.xpath(prop.getProperty("newPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "UserProfilePage"));
	}
	
	public void sendDataToConfirmPasswordTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("confirmPassword"))).clear();
		driver.findElement(By.xpath(prop.getProperty("confirmPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "UserProfilePage"));
	}
	
	public void validateChangePasswordSection() throws BiffException, IOException, InterruptedException {
		System.out.println("Validating the required fields for Change Password.....");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("oldPasswordValidationMsg"))).getText(), "Old password cannot be blank.", "Old Password is not Validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("newPasswordValidationMsg"))).getText(), "New Password cannot be blank.", "New Password is not Validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("confirmPasswordValidationMsg"))).getText(), "Confirm Password cannot be blank.", "Confirm Password is not Validated");
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("oldPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 2, "UserProfilePage"));
		Commons.waitFor(5000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("oldPasswordMatchValidationMsg"))).getText(), "Password could not be matched", "Old Password [Matching] is not Validated");
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("newPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "UserProfilePage"));
		driver.findElement(By.xpath(prop.getProperty("confirmPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "UserProfilePage"));
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("confirmPasswordMatchValidationMsg"))).getText(), "Must match new password and confirm password.", "Confirm Password[Matching] is not Validated");
		System.out.println("All required fields on Change Password page are Validated successfully.....");	
	}
	public void clickOnSignOutLink() throws InterruptedException {
		Commons.waitFor(2000);
		WebElement userProfile = this.clickOnUserProfile();
		Actions ac = new Actions(driver);
		ac.moveToElement(userProfile).click().build().perform();
		driver.findElement(By.xpath(prop.getProperty("signOutLink"))).click();
	}
	
	public void compareUserNames() throws BiffException, IOException, InterruptedException {
		Commons.waitFor(5000);
		WebElement userProfile = this.clickOnUserProfile();
		Actions ac = new Actions(driver);
		ac.moveToElement(userProfile).click().build().perform();
		Commons.waitFor(5000);
		String text = driver.findElement(By.xpath(prop.getProperty("profileUserNameMobileNumber"))).getText();
		String actualUserName = readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage");	
		Assert.assertEquals(actualUserName, text, "User Name on Profile page and change password page is wrong !!");
		System.out.println("User Names are matching");
	}
	
	public String getUpdatedPassword() throws BiffException, IOException {
		return readExcelData.getCellDataWithRowColAndSheetName(0, 0, "UserProfilePage");
	}
	
	public void sendPathOfImageToProfilePicture() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("profilePicture"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 3, "UserProfilePage"));
	}
	
	public void validateProfileSection() throws BiffException, IOException, InterruptedException {
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("profilePictureValidationMsg"))).getText(),"Profile picture cannot be blank.", "Profile Picture is not Validated");
	}
}