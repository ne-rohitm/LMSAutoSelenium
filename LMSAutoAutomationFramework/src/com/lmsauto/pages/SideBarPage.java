package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lmsauto.classes.ReadObjectRepository;

public class SideBarPage {
	
	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop; 
	
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
			System.out.println("Dashboard Request Leave is present in sidebar");
	}
	
	public void verifyDashboardMySettingsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboardMySettings"))).size() < 1)
			System.out.println("Now Dashboard My Settings link is not present in sidebar");
		else 
			System.out.println("Dashboard My Settings is present in sidebar");
	}
	
	public void verifyDashboardMyRequestsIsPresentOrNotOnSideBar() {
		if(driver.findElements(By.xpath(prop.getProperty("dashboardMyRequests"))).size() < 1)
			System.out.println("Now Dashboard My Requests link is not present in sidebar");
		else 
			System.out.println("Dashboard My Requests is present in sidebar");
	}
}