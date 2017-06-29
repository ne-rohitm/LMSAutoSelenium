package com.lmsauto.classes;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class Commons {
	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop; 
	ReadExcelData readExcelData = new ReadExcelData();
	public Commons(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToTheApplication() throws InterruptedException, IOException, BiffException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://la.netestaws.in/office.php#/login"); 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnNextButton();
		explicitWait(loginPage.getWebElementUsername(),10);
		Assert.assertEquals(loginPage.getUsernameValidationMessage(), "Username is required.");
		loginPage.sendDataToUsernameTextField(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "LoginPage"));
		waitFor(1000);
		loginPage.clickOnNextButton();
		explicitWait(loginPage.getWebElementPassword(),10);
		loginPage.sendDataToPasswordTextField(readExcelData.getCellDataWithRowColAndSheetName(1, 1, "LoginPage"));
		waitFor(1000);
		loginPage.clickOnLoginButton();
	}
	
	public void explicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitFor(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
}
