package com.lmsauto.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRQuickUserPage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class HRQuickUserTest extends ProvideDriverInstance {
	private WebDriver driver;
	
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
		driver = getDriverInstance();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}
}