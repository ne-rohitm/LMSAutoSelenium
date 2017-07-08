package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRQuickUserPage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop;
	ReadExcelData readExcelData = new ReadExcelData();
	
	public HRQuickUserPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void clickOnCreateButton() {
		driver.findElement(By.xpath(prop.getProperty("createButton"))).click();
	}
	
	public void validateRequiredFieldsQuickUserPage() throws BiffException, IOException, InterruptedException {
		System.out.println("Validating the required fields for quick user page.....");
		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserTitleValidationMsg"))).getText(), "This field is required.", "Quick User Title is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserFirstNameValidationMsg"))).getText(), "This field is required.", "Quick User First Name is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserLastNameValidationMsg"))).getText(), "This field is required.", "Quick User Last Name is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumberValidationMsg"))).getText(), "This field is required.", "Quick User Personal Mobile is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmailValidationMsg"))).getText(), "This field is required.", "Quick User Personal Email is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserDesignationValidationMsg"))).getText(), "This field is required.", "Quick User Designation is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserReportToValidationMsg"))).getText(), "This field is required.", "Quick User Report To is not Validated");		
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserTeamLeadValidationMsg"))).getText(), "This field is required.", "Quick User Team Lead is not Validated");
		
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumber"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 11, "QuickUserPage"));
		clickOnCreateButton();
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumberValidationMsg"))).getText(), "Personal mobile no. must be 10 digits", "Quick User Personal Mobile No.[invalid] is not Validated");
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumber"))).clear();
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumber"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 12, "QuickUserPage"));
		clickOnCreateButton();
		Commons.waitFor(10000);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumberValidationMsg"))).getText(), "Number already exists enter different number", "Quick User Personal Mobile No. [Exists] is not Validated");
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmail"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 9, "QuickUserPage"));
		clickOnCreateButton();
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmailExistValidationMsg"))).getText(), "Invalid email address.", "Quick User Personal Email [invalid] is not Validated");
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmail"))).clear();
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmail"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 10, "QuickUserPage"));
		clickOnCreateButton();
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmailExistValidationMsg"))).getText(), "Email address exist. Please enter another email address!", "Quick User Personal Email [Exists] is not Validated");
		System.out.println("All required fields on Quick User page are Validated successfully.....");
	}
	
	public void selectQuickUserTitle() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("quickUserTitle")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "QuickUserPage"));
	}
	
	public void sendDataToQuickUserFirstNameTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("quickUserFirstName"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "QuickUserPage"));
	}
	
	public void sendDataToQuickUserLastNameTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("quickUserLastName"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 2, "QuickUserPage"));
	}
	
	public void sendDataToQuickUserPersonalMobileNumberTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumber"))).clear();
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumber"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 3, "QuickUserPage"));
	}
	
	public void sendDataToQuickUserPersonalEmailTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmail"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 4, "QuickUserPage"));
	}
	
	public void clearPersonalEmailTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmail"))).clear();
	}
	
	public void selectQuickUserDesignation() throws BiffException, IOException, InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("quickUserDesignation"))).click();
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserDesignationFilterTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 5, "QuickUserPage"));
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserDesignationFilterTextField"))).sendKeys(Keys.ENTER);
	}
	
	public void selectQuickUserReportTo() throws BiffException, IOException, InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("quickUserReportTo"))).click();
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserReportToFilterTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 6, "QuickUserPage"));
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserReportToFilterTextField"))).sendKeys(Keys.ENTER);
	}
	
	public void selectQuickUserTeamLead() throws BiffException, IOException, InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("quickUserTeamLead"))).click();
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserTeamLeadFilterTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 7, "QuickUserPage"));
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserTeamLeadFilterTextField"))).sendKeys(Keys.ENTER);
	}
	
	public void selectQuickUserRole() throws BiffException, IOException, InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("quickUserRole"))).click();
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserRoleFilterTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 8, "QuickUserPage"));
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("quickUserRoleFilterTextField"))).sendKeys(Keys.ENTER);
	}
	
	public void navigateToQuickUserPage() throws IOException, InterruptedException {
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
	}
}