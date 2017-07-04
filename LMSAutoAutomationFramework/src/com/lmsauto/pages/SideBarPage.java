package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
	
	public boolean verifyHrLinkIsPresentOnSideBar() {
		return driver.findElement(By.xpath(prop.getProperty("hr"))).isDisplayed();
	}
	
	public void verifyHrLinkIsNotPresentOnSideBar() {
		Assert.assertTrue(driver.findElements(By.xpath(prop.getProperty("hr"))).size() < 1 );
		System.out.println("Now Hr link is not present in sidebar");
	}
}