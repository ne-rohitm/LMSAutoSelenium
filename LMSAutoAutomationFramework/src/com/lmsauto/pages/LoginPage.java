package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

/* 
 * Used in Commons.java
 * 
 * */

public class LoginPage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	ReadExcelData readExcelData = new ReadExcelData(); 
	Properties prop; 
	
	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void sendDataToUsernameTextField(String username) {
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(username);
	}
	
	public void sendDataToPasswordTextField(String password) {
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
	}
	
	public void clickOnNextButton() {
		driver.findElement(By.xpath(prop.getProperty("nextButton"))).click();
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
	}
	
	public String getUsernameValidationMessage() {
		String usernameValidationText = driver.findElement(By.xpath(prop.getProperty("UsernameValidationText"))).getText();
		return usernameValidationText;	
	}
	
	public WebElement getWebElementUsername() {
		return driver.findElement(By.xpath(prop.getProperty("username")));
	}
	
	public WebElement getWebElementPassword() {
		return driver.findElement(By.xpath(prop.getProperty("password")));
	}
	
	public void verifyRedirectionToTheLoginPage() throws BiffException, IOException {
		Assert.assertEquals("User is Not Redirected to the Login Page", driver.getCurrentUrl(), readExcelData.getCellDataWithRowColAndSheetName(0, 2, "LoginPage"));
		System.out.println("User is redirected to the login page");
	}
	
	public void loginToTheApplication() throws InterruptedException, IOException, BiffException {
		LoginPage loginPage = new LoginPage(driver);
		Commons.waitFor(1000);
		loginPage.sendDataToUsernameTextField(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage"));
		Commons.waitFor(1000);
		loginPage.clickOnNextButton();
		Commons.waitFor(1000);
		loginPage.sendDataToPasswordTextField(readExcelData.getCellDataWithRowColAndSheetName(1, 1, "LoginPage"));
		Commons.waitFor(1000);
		loginPage.clickOnLoginButton();
	}
}