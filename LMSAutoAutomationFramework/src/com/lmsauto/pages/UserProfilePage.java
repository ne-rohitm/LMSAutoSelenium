package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class UserProfilePage {
	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop;  
	ReadExcelData readExcelData = new ReadExcelData();
	public UserProfilePage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void navigateToUserProfile() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(5000);
		WebElement userProfile = this.clickOnUserProfile();
		Actions ac = new Actions(driver);
		ac.moveToElement(userProfile).click().build().perform();
		String text = driver.findElement(By.xpath(prop.getProperty("profileUserNameMobileNumber"))).getText();
		String actualUserName = readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage");	
		Assert.assertEquals("User Name on Profile page and change password page is wrong !!", text, actualUserName);
		System.out.println("User Names are matching");
		Commons.waitFor(5000);
		WebElement manageUserLink = this.clickOnManageProfile();
		ac.moveToElement(manageUserLink).click().build().perform();
	}
	
	public void verifyColorIsApplied() throws InterruptedException {
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("colorOne"))).click();
		String colorOne = driver.findElement(By.xpath(prop.getProperty("colorOne"))).getCssValue("background-color");
		String hexOne = Color.fromString(colorOne).asHex();
		String UpdateColorOne = driver.findElement(By.xpath(prop.getProperty("changePasswordUpdateButton"))).getCssValue("background-color");
		String UpdatehexOne = Color.fromString(UpdateColorOne).asHex();
	}
	
	public WebElement clickOnUserProfile() {
		return driver.findElement(By.xpath(prop.getProperty("profileUserName")));
	}
	
	public WebElement clickOnManageProfile() {
		return driver.findElement(By.xpath(prop.getProperty("manageProfile")));
	}
	
	public void clickOnChangePasswordUpdateButton() {
		driver.findElement(By.xpath(prop.getProperty("changePasswordUpdateButton"))).click();
	}
}