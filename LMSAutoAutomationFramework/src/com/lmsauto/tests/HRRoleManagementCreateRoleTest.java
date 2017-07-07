package com.lmsauto.tests;

import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRRoleManagementCreateRolePage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HRRoleManagementCreateRoleTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();

	@Test
	public void createRoleTest() throws IOException, InterruptedException, BiffException {
		HRRoleManagementCreateRolePage hrRoleManagementCreateRolePage = new HRRoleManagementCreateRolePage(driver);
		hrRoleManagementCreateRolePage.navigateToCreateRole();
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.clickOnSubmitButton();
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.validateRequiredFieldsOnCreateRolePage();
		hrRoleManagementCreateRolePage.sendDataToDefineRoleTextField();
	}

	@BeforeClass
	public void beforeClass() throws BiffException, InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
