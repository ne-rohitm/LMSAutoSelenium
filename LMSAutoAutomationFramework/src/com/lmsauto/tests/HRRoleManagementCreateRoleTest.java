package com.lmsauto.tests;

import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRRoleManagementCreateRolePage;
import com.lmsauto.pages.HRRoleManagementManageRolePage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HRRoleManagementCreateRoleTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();

	@Test
	public void createRoleTestAndCheckCreatedRoleInManageRole() throws IOException, InterruptedException, BiffException {
		HRRoleManagementCreateRolePage hrRoleManagementCreateRolePage = new HRRoleManagementCreateRolePage(driver);
		hrRoleManagementCreateRolePage.navigateToCreateRole();
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.clickOnSubmitButton();
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.validateRequiredFieldsOnCreateRolePage();
		hrRoleManagementCreateRolePage.sendDataToDefineRoleTextField();
	
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfLmsAutoSection();
		hrRoleManagementCreateRolePage.clickOnLMSAutoPermissionsLink();
		System.out.println("on1");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfDashboardSection();
		hrRoleManagementCreateRolePage.clickOnDashboardPermissionsLink();
		System.out.println("on2");
	
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfHRSection();
		hrRoleManagementCreateRolePage.clickOnHrPermissionsLink();
		System.out.println("on3");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfSalesSection();
		hrRoleManagementCreateRolePage.clickOnSalesPermissionsLink();
		System.out.println("on4");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfVehiclePricingSection();
		hrRoleManagementCreateRolePage.clickOnVehiclePricingPermissionsLink();
		System.out.println("on5");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfResponseSection();
		hrRoleManagementCreateRolePage.clickOnResponsePermissionsLink();
		System.out.println("on6");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfMarketingSection();
		hrRoleManagementCreateRolePage.clickOnMarketingPermissionsLink();
		System.out.println("on7");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfAccountsSection();
		hrRoleManagementCreateRolePage.clickOnAccountsPermissionsLink();
		System.out.println("on8");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfReportsSection();
		hrRoleManagementCreateRolePage.clickOnReportsPermissionsLink();
		System.out.println("on9");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfCareersSection();
		hrRoleManagementCreateRolePage.clickOnCareersPermissionsLink();
		System.out.println("on10");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfCloudTelephonySection();
		hrRoleManagementCreateRolePage.clickOnCloudTelephonyPermissionsLink();
		System.out.println("on11");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfMyStorageSection();
		hrRoleManagementCreateRolePage.clickOnMyStoragePermissionsLink();
		System.out.println("on12");
		
		Commons.waitFor(500);
		hrRoleManagementCreateRolePage.TurnOnPermissionsOfServiceSection();
		hrRoleManagementCreateRolePage.clickOnServicePermissionsLink();
		System.out.println("on13");
		Commons.waitFor(1000);
		int cnt_on_createRole = 150;//hrRoleManagementCreateRolePage.getCountOfOnPermissionsOnCreateRolePage();
		hrRoleManagementCreateRolePage.clickOnSubmitButton();
		Commons.waitFor(1000);
		
		HRRoleManagementManageRolePage hrRoleManagementManageRolePage = new HRRoleManagementManageRolePage(driver);
		hrRoleManagementManageRolePage.navigateToManageRole();
		hrRoleManagementManageRolePage.moveToManagePermissionsPage();
		int cnt_shown_on_manageRole = hrRoleManagementManageRolePage.getPermissionsCountShownOnManageRolePage();
		
		hrRoleManagementManageRolePage.comapreBoththeCounts(cnt_on_createRole, cnt_shown_on_manageRole);
	}

	@BeforeClass
	public void beforeClass() throws BiffException, InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}