package com.lmsauto.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRQuickUserPage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class HRQuickUserTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	
	@Test
	public void hrQuickUserCreationTest() throws IOException, InterruptedException, BiffException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HRQuickUserPage hrQuickUserPage = new HRQuickUserPage(driver);
		hrQuickUserPage.navigateToQuickUserPage();
		Commons.waitFor(500);
		hrQuickUserPage.clickOnCreateButton();
		hrQuickUserPage.validateRequiredFieldsQuickUserPage();
		hrQuickUserPage.selectQuickUserTitle();
		hrQuickUserPage.sendDataToQuickUserFirstNameTextField();
		hrQuickUserPage.sendDataToQuickUserLastNameTextField();
		hrQuickUserPage.sendDataToQuickUserPersonalMobileNumberTextField();
		hrQuickUserPage.clearPersonalEmailTextField();
		hrQuickUserPage.sendDataToQuickUserPersonalEmailTextField();
		hrQuickUserPage.selectQuickUserDesignation();
		hrQuickUserPage.selectQuickUserReportTo();
		hrQuickUserPage.selectQuickUserTeamLead();
		hrQuickUserPage.selectQuickUserRole();
		hrQuickUserPage.clickOnCreateButton();
	}
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}