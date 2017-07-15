package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class LoginPage {

	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private ReadExcelData readExcelData = new ReadExcelData(); 
	private Properties prop; 
	
	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void sendDataToUsernameTextFieldForRegularLogin() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage"));	
	}
	
	public void sendDataToPasswordTextFieldForRegularLogin() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(1, 1, "LoginPage"));
	}
	
	public void sendDataToUsernameTextFieldForLoginTest() throws BiffException, IOException, InterruptedException {
		this.clickOnNextButton();
		Commons.waitFor(1000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("usernameValidationText"))).getText(), "Username is required.", "Username is required message is not validated");
		
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 3, "LoginPage"));
		Commons.waitFor(1000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("usernameValidationText"))).getText(), "Invalid username.", "Invalid Username message is not validated");
		
		driver.findElement(By.xpath(prop.getProperty("username"))).clear();
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 4, "LoginPage"));
		Commons.waitFor(1000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("usernameValidationText"))).getText(), "Username does not exist.", "Username does not exist message is not validated");
		
		driver.findElement(By.xpath(prop.getProperty("username"))).clear();
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage"));
	}
	
	public void sendDataToPasswordTextFieldForLoginTest() throws BiffException, IOException, InterruptedException {
		this.clickOnLoginButton();
		Commons.waitFor(1000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("passwordValidationText"))).getText(), "Password id required", "Password is required message is not validated");		
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(1, 2, "LoginPage"));
		Commons.waitFor(1000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("passwordValidationText"))).getText(), "Wrong password.", "Wrong password message is not validated");
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
		Assert.assertEquals(readExcelData.getCellDataWithRowColAndSheetName(0, 2, "LoginPage"), driver.getCurrentUrl(), "User is Not Redirected to the Login Page");
		System.out.println("User is redirected to the login page");
	}
	
	public void loginToTheApplication() throws InterruptedException, IOException, BiffException {
		LoginPage loginPage = new LoginPage(driver);
		Commons.waitFor(1000);
		loginPage.sendDataToUsernameTextFieldForRegularLogin();
		Commons.waitFor(1000);
		loginPage.clickOnNextButton();
		Commons.waitFor(1000);
		loginPage.sendDataToPasswordTextFieldForRegularLogin();
		Commons.waitFor(1000);
		loginPage.clickOnLoginButton();
		Commons.waitFor(1000);
	}
}