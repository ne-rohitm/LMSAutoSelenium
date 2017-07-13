package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lmsauto.classes.ReadObjectRepository;

public class SideBarPage {
	
	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private Properties prop; 
	
	public SideBarPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public WebElement clickOnHR() {
		return driver.findElement(By.xpath(prop.getProperty("hr")));
	}
	
	public WebElement clickOnHRUserManagement() {
		return driver.findElement(By.xpath(prop.getProperty("hrUserManagement")));
	}
	
	public WebElement clickOnHRListUsers() {
		return driver.findElement(By.xpath(prop.getProperty("hrListUsers")));
	}
	
	public WebElement clickOnHRNewUser() {
		return driver.findElement(By.xpath(prop.getProperty("hrNewUser")));
	}
	
	public WebElement clickOnHrRoleManagement() {
		return driver.findElement(By.xpath(prop.getProperty("hrRoleManagement")));
	}
	
	public WebElement clickOnHrRoleManagementCreateRole() {
		return driver.findElement(By.xpath(prop.getProperty("hrCreateRole")));
	}
	
	public WebElement clickOnHrRoleManagementManageRole() {
		return driver.findElement(By.xpath(prop.getProperty("hrManageRole")));
	}
	
	public WebElement clickOnHRQuickUser() {
		return driver.findElement(By.xpath(prop.getProperty("hrQuickUser")));
	}
	
	public String getWelcomeText() {
		return driver.findElement(By.xpath(prop.getProperty("welcomeText"))).getText();
	}
	
	public WebElement clickOnLMSAuto() {
		return driver.findElement(By.xpath(prop.getProperty("lmsAuto")));
	}
	
	public WebElement clickOnSales() {
		return driver.findElement(By.xpath(prop.getProperty("sales")));
	}
	
	public WebElement clickOnDashboard() {
		return driver.findElement(By.xpath(prop.getProperty("dashboard")));
	}
	
	public WebElement clickOnVehiclePricing() {
		return driver.findElement(By.xpath(prop.getProperty("vehiclePricing")));
	}
	
	public WebElement clickOnResponse() {
		return driver.findElement(By.xpath(prop.getProperty("response")));
	}
	
	public WebElement clickOnMarketing() {
		return driver.findElement(By.xpath(prop.getProperty("marketing")));
	}
	
	public WebElement clickOnAccounts() {
		return driver.findElement(By.xpath(prop.getProperty("accounts")));
	}
	
	public WebElement clickOnReports() {
		return driver.findElement(By.xpath(prop.getProperty("reports")));
	}
	
	public WebElement clickOnCareers() {
		return driver.findElement(By.xpath(prop.getProperty("careers")));
	}
	
	public WebElement clickOnCloudTelephoney() {
		return driver.findElement(By.xpath(prop.getProperty("cloudTelephoney")));
	}
	
	public WebElement clickOnMyStorage() {
		return driver.findElement(By.xpath(prop.getProperty("myStorage")));
	}
	
	public WebElement clickOnService() {
		return driver.findElement(By.xpath(prop.getProperty("service")));
	}
	
	public void verifyHrLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("hr"))).size() < 1)
		System.out.println("Now Hr link is not present in sidebar");
		else 
			System.out.println("Hr link is present in sidebar");
	}
	
	public void verifyDashboardLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboard"))).size() < 1)
			System.out.println("Now Dashboard link is not present in sidebar");
		else 
			System.out.println("Dashboard is present in sidebar");
	}
	
	public void verifySalesLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("sales"))).size() < 1)
			System.out.println("Now sales link is not present in sidebar");
		else 
			System.out.println("Sales is present in sidebar");
	}
	
	public void verifyLmsAutoLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("lmsAuto"))).size() < 1)
			System.out.println("Now lmsAuto link is not present in sidebar");
		else 
			System.out.println("LmsAuto is present in sidebar");
	}
	
	public void verifyVehiclePricingLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("vehiclePricing"))).size() < 1)
			System.out.println("Now vehiclePricing link is not present in sidebar");
		else 
			System.out.println("VehiclePricing is present in sidebar");
	}
	
	public void verifyResponseLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("response"))).size() < 1)
			System.out.println("Now response link is not present in sidebar");
		else 
			System.out.println("Response is present in sidebar");
	}
	
	public void verifyMarketingLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("marketing"))).size() < 1)
			System.out.println("Now marketing link is not present in sidebar");
		else 
			System.out.println("Marketing is present in sidebar");
	}
	
	public void verifyAccountsLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("accounts"))).size() < 1)
			System.out.println("Now accounts link is not present in sidebar");
		else 
			System.out.println("Accounts is present in sidebar");
	}
	
	public void verifyReportsLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("reports"))).size() < 1)
			System.out.println("Now reports link is not present in sidebar");
		else 
			System.out.println("Reports is present in sidebar");
	}
	
	public void verifyCareersLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("careers"))).size() < 1)
			System.out.println("Now careers link is not present in sidebar");
		else 
			System.out.println("Careers is present in sidebar");
	}
	
	public void verifyCloudTelephonyLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("cloudTelephony"))).size() < 1)
			System.out.println("Now cloudTelephony link is not present in sidebar");
		else 
			System.out.println("CloudTelephony is present in sidebar");
	}
	
	public void verifyMyStorageLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("myStorage"))).size() < 1)
			System.out.println("Now myStorage link is not present in sidebar");
		else 
			System.out.println("MyStorage is present in sidebar");
	}
	
	public void verifyServiceLinkIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("service"))).size() < 1)
			System.out.println("Now service link is not present in sidebar");
		else 
			System.out.println("Service is present in sidebar");
	}
	
	public void verifyDashboardRequestLeaveIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboardRequestLeave"))).size() < 1)
			System.out.println("Now Dashboard Request Leave link is not present in sidebar");
		else 
			System.out.println("Dashboard Request Leave link is present in sidebar");
	}
	
	public void verifyDashboardMySettingsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboardMySettings"))).size() < 1)
			System.out.println("Now Dashboard My Settings link is not present in sidebar");
		else 
			System.out.println("Dashboard My Settings link is present in sidebar");
	}
	
	public void verifyDashboardMyRequestsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboardMyRequests"))).size() < 1)
			System.out.println("Now Dashboard My Requests link is not present in sidebar");
		else 
			System.out.println("Dashboard My Requests link is present in sidebar");
	}
	public void verifyHrRoleManagementIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("hrRoleManagement"))).size() < 1)
			System.out.println("Now Hr Role Management link is not present in sidebar");
		else 
			System.out.println("Hr Role Management link is present in sidebar");
	}
	
	public void verifyHrSalaryManagementIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("hrSalaryManagement"))).size() < 1)
			System.out.println("Now Hr Salary Management link is not present in sidebar");
		else 
			System.out.println("Hr Salary Management link is present in sidebar");
	}
	
	public void verifyLmsAutoApiMangementIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("lmsAutoApiMangement"))).size() < 1)
			System.out.println("Now Lms Auto Api Mangement link is not present in sidebar");
		else 
			System.out.println("Lms Auto Api Mangement link is present in sidebar");
	}
	
	public void verifyLmsAutoContactUsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("lmsAutoContactUs"))).size() < 1)
			System.out.println("Now Lms Auto Contact Us link is not present in sidebar");
		else 
			System.out.println("Lms Auto Api Contact Us link is present in sidebar");
	}
	
	public void verifyLmsAutoSMSAndEmailSettingsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("lmsAutoSMSAndEmailSettings"))).size() < 1)
			System.out.println("Now Lms Auto SMS And Email Settings link is not present in sidebar");
		else 
			System.out.println("Lms Auto SMS And Email Settings link is present in sidebar");
	}
	
	public void verifySalesMyLostEnquiriesIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("salesMyLostEnquiries"))).size() < 1)
			System.out.println("Now Sales My Lost Enquiries link is not present in sidebar");
		else 
			System.out.println("Sales My Lost Enquiries link is present in sidebar");
	}
	
	public void verifySalesMyReassignedEnquiriesIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("salesMyReassignedEnquiries"))).size() < 1)
			System.out.println("Now Sales My Reassigned Enquiries link is not present in sidebar");
		else 
			System.out.println("Sales My Reassigned Enquiries link is present in sidebar");
	}
	
	public void verifyVehiclePricingAddPricingIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("vehiclePricingAddPricing"))).size() < 1)
			System.out.println("Now Vehicle Pricing Add Pricing link is not present in sidebar");
		else 
			System.out.println("Now Vehicle Pricing Add Pricing link is present in sidebar");
	}
	
	public void verifyResponseTestimonialsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("responseTestimonials"))).size() < 1)
			System.out.println("Now Response Testimonials link is not present in sidebar");
		else 
			System.out.println("Response Testimonials link is present in sidebar");
	}
	
	public void verifyResponseWebsiteVisitorsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("responseWebsiteVisitors"))).size() < 1)
			System.out.println("Now Response Website Visitors link is not present in sidebar");
		else 
			System.out.println("Response Website Visitors link is present in sidebar");
	}
	
	public void verifyCareersCreateJobPostingsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("careersCreateJobPostings"))).size() < 1)
			System.out.println("Now Careers Create Job Postings link is not present in sidebar");
		else 
			System.out.println("Careers Create Job Postings link is present in sidebar");
	}
	
	public void verifyCloudTelephonyManageVirtualNumbersIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("cloudTelephonyManageVirtualNumbers"))).size() < 1)
			System.out.println("Now Cloud Telephony Manage Virtual Numbers link is not present in sidebar");
		else 
			System.out.println("Cloud Telephony Manage Virtual Numbers link is present in sidebar");
	}
	
	public void verifyMyStorageStorageListIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("myStorageStorageList"))).size() < 1)
			System.out.println("Now My Storage Storage List link is not present in sidebar");
		else 
			System.out.println("My Storage Storage List link is present in sidebar");
	}
}