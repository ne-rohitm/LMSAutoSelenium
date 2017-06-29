package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	public void validateRequiredFieldsQuickUserPage() {
		System.out.println("Validating the required fields for quick user page.....");
		Assert.assertEquals("Quick User Title is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserTitleValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserFirstNameValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserLastNameValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserPersonalMobileNumberValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserPersonalEmailValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserDesignationValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserReportToValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("quickUserTeamLeadValidationMsg"))).getText());
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
}