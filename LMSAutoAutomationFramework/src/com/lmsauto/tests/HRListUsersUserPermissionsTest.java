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
import com.lmsauto.pages.SideBarPage;

import jxl.read.biff.BiffException;

public class HRListUsersUserPermissionsTest {

	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	@Test
	public void userPermissionsOffTest() throws InterruptedException, IOException, BiffException {
		HRListUserUserPermissionsPage hrListUserUserPermissionsPage = new HRListUserUserPermissionsPage(driver);
		hrListUserUserPermissionsPage.navigateToUserPermissionsPage();
		
		hrListUserUserPermissionsPage.verifyCountOfOnPermissions();
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfLmsAutoSection();
		hrListUserUserPermissionsPage.clickOnLMSAutoPermissionsLink();
		System.out.println("off1");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfDashboardSection();
		hrListUserUserPermissionsPage.clickOnDashboardPermissionsLink();
		System.out.println("off2");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfSalesSection();
		hrListUserUserPermissionsPage.clickOnSalesPermissionsLink();
		System.out.println("off3");
	
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfHRSection();
		hrListUserUserPermissionsPage.clickOnHrPermissionsLink();
		System.out.println("off4");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfVehiclePricingSection();
		hrListUserUserPermissionsPage.clickOnVehiclePricingPermissionsLink();
		System.out.println("off5");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfResponseSection();
		hrListUserUserPermissionsPage.clickOnResponsePermissionsLink();
		System.out.println("off6");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfMarketingSection();
		hrListUserUserPermissionsPage.clickOnMarketingPermissionsLink();
		System.out.println("off7");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfAccountsSection();
		hrListUserUserPermissionsPage.clickOnAccountsPermissionsLink();
		System.out.println("off8");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfReportsSection();
		hrListUserUserPermissionsPage.clickOnReportsPermissionsLink();
		System.out.println("off9");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfCareersSection();
		hrListUserUserPermissionsPage.clickOnCareersPermissionsLink();
		System.out.println("off10");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfCloudTelephonySection();
		hrListUserUserPermissionsPage.clickOnCloudTelephonyPermissionsLink();
		System.out.println("off11");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfMyStorageSection();
		hrListUserUserPermissionsPage.clickOnMyStoragePermissionsLink();
		System.out.println("off12");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOffPermissionsOfServiceSection();
		hrListUserUserPermissionsPage.clickOnServicePermissionsLink();
		System.out.println("off13");
		
		driver.navigate().refresh();
		SideBarPage sideBarPage = new SideBarPage(driver);
		sideBarPage.verifyHrLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyDashboardLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifySalesLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyLmsAutoLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyVehiclePricingLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyResponseLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyMarketingLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyAccountsLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyReportsLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyCareersLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyCloudTelephonyLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyMyStorageLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyServiceLinkIsPresentOrNotOnSideBar();
	}
	
	@Test
	public void userPermissionsOnTest() throws InterruptedException, IOException, BiffException {
		HRListUserUserPermissionsPage hrListUserUserPermissionsPage = new HRListUserUserPermissionsPage(driver);
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfLmsAutoSection();
		hrListUserUserPermissionsPage.clickOnLMSAutoPermissionsLink();
		System.out.println("on1");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfDashboardSection();
		hrListUserUserPermissionsPage.clickOnDashboardPermissionsLink();
		System.out.println("on2");
	
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfHRSection();
		hrListUserUserPermissionsPage.clickOnHrPermissionsLink();
		System.out.println("on3");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfSalesSection();
		hrListUserUserPermissionsPage.clickOnSalesPermissionsLink();
		System.out.println("on4");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfVehiclePricingSection();
		hrListUserUserPermissionsPage.clickOnVehiclePricingPermissionsLink();
		System.out.println("on5");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfResponseSection();
		hrListUserUserPermissionsPage.clickOnResponsePermissionsLink();
		System.out.println("on6");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfMarketingSection();
		hrListUserUserPermissionsPage.clickOnMarketingPermissionsLink();
		System.out.println("on7");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfAccountsSection();
		hrListUserUserPermissionsPage.clickOnAccountsPermissionsLink();
		System.out.println("on8");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfReportsSection();
		hrListUserUserPermissionsPage.clickOnReportsPermissionsLink();
		System.out.println("on9");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfCareersSection();
		hrListUserUserPermissionsPage.clickOnCareersPermissionsLink();
		System.out.println("on10");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfCloudTelephonySection();
		hrListUserUserPermissionsPage.clickOnCloudTelephonyPermissionsLink();
		System.out.println("on11");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfMyStorageSection();
		hrListUserUserPermissionsPage.clickOnMyStoragePermissionsLink();
		System.out.println("on12");
		
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.TurnOnPermissionsOfServiceSection();
		hrListUserUserPermissionsPage.clickOnServicePermissionsLink();
		System.out.println("on13");
		
		driver.navigate().refresh();
		SideBarPage sideBarPage = new SideBarPage(driver);
		sideBarPage.verifyHrLinkIsPresentOrNotOnSideBar();	
		sideBarPage.verifyDashboardLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifySalesLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyLmsAutoLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyVehiclePricingLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyResponseLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyMarketingLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyAccountsLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyReportsLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyCareersLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyCloudTelephonyLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyMyStorageLinkIsPresentOrNotOnSideBar();
		sideBarPage.verifyServiceLinkIsPresentOrNotOnSideBar();
	}
	
	@Test
	public void separatePermissionsMakingOffTest() throws IOException, InterruptedException {
		HRListUserUserPermissionsPage hrListUserUserPermissionsPage = new HRListUserUserPermissionsPage(driver);
		hrListUserUserPermissionsPage.navigateToUserPermissionsPage();
		Commons.waitFor(500);		
		hrListUserUserPermissionsPage.clickOnHrPermissionsLink();
		hrListUserUserPermissionsPage.clickOnHrRoleManagementPermissionsLink();
		hrListUserUserPermissionsPage.clickOnHrSalaryManagementPermissionsLink();
		hrListUserUserPermissionsPage.clickOnHrPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnDashboardPermissionsLink();
		hrListUserUserPermissionsPage.clickOnDashboardMyRequestsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnDashboardMySettingsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnDashboardRequestLeavePermissionsLink();
		hrListUserUserPermissionsPage.clickOnDashboardPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnLMSAutoPermissionsLink();
		hrListUserUserPermissionsPage.clickOnLmsAutoApIManagementPermissionsLink();
		hrListUserUserPermissionsPage.clickOnLmsAutoContactUsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnLmsAutoSMSAndEmailSettingsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnLMSAutoPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnSalesPermissionsLink();
		hrListUserUserPermissionsPage.clickOnSalesMyLostEnquiriesPermissionsLink();
		hrListUserUserPermissionsPage.clickOnSalesMyReassignedEnquiriesPermissionsLink();
		hrListUserUserPermissionsPage.clickOnSalesPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnVehiclePricingPermissionsLink();
		hrListUserUserPermissionsPage.clickOnVehiclePricingAddPricingPermissionsLink();
		hrListUserUserPermissionsPage.clickOnVehiclePricingPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnResponsePermissionsLink();
		hrListUserUserPermissionsPage.clickOnResponseTestimonialsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnResponseWebsiteVisitorsPermissionsLink();
		hrListUserUserPermissionsPage.clickOnResponsePermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnCareersPermissionsLink();
		hrListUserUserPermissionsPage.clickOnCareersCreateJobPostingPermissionsLink();
		hrListUserUserPermissionsPage.clickOnCareersPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnCloudTelephonyPermissionsLink();
		hrListUserUserPermissionsPage.clickOnCloudTelephonyManageVirtualNumbersPermissionsLink();
		hrListUserUserPermissionsPage.clickOnCloudTelephonyPermissionsLink();
		Commons.waitFor(500);
		hrListUserUserPermissionsPage.clickOnMyStoragePermissionsLink();
		hrListUserUserPermissionsPage.clickOnMyStorageStorageListPermissionsLink();
		hrListUserUserPermissionsPage.clickOnMyStoragePermissionsLink();
		
		driver.navigate().refresh();
		SideBarPage sideBarPage = new SideBarPage(driver);
		sideBarPage.clickOnDashboard();
		sideBarPage.verifyDashboardRequestLeaveIsPresentOrNotOnSideBar();
		sideBarPage.verifyDashboardMyRequestsIsPresentOrNotOnSideBar();
		sideBarPage.verifyDashboardMySettingsIsPresentOrNotOnSideBar();
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