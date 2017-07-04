package com.lmsauto.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRListUserUserPermissionsPage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class HRListUsersUserPermissionsTest {

	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	@Test
	public void userPermissionsTest() throws InterruptedException, IOException, BiffException {
		HRListUserUserPermissionsPage hrListUserUserPermissionsPage = new HRListUserUserPermissionsPage(driver);
		hrListUserUserPermissionsPage.navigateToUserPermissionsPage();
		
		hrListUserUserPermissionsPage.verifyCountOfOnPermissions();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfLmsAutoSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfDashboardSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfSalesSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfHRSection();
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfHRSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfLmsAutoSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfDashboardSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfSalesSection();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfSalesSection();
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
