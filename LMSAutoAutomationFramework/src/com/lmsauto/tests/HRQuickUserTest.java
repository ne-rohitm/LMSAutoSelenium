package com.lmsauto.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRQuickUserPage;
import com.lmsauto.pages.SideBarPage;

import jxl.read.biff.BiffException;

public class HRQuickUserTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	
	@Test
	public void hrQuickUserCreationTest() throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SideBarPage sideBarPage = new SideBarPage(driver);	
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement userManagement = sideBarPage.clickOnHRUserManagement();
		ac.moveToElement(userManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement quickUser = sideBarPage.clickOnHRQuickUser();
		ac.moveToElement(quickUser).click().build().perform();
		
		HRQuickUserPage hrQuickUserPage = new HRQuickUserPage(driver);
		hrQuickUserPage.clickOnCreateButton();
		hrQuickUserPage.validateRequiredFieldsQuickUserPage();
	}
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		Commons c = new Commons(driver);
		c.loginToTheApplication();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}