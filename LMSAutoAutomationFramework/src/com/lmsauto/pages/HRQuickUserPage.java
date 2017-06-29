package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

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
		Assert.assertEquals("Quick User Title is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserTitleValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserFirstNameValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserLastNameValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserPersonalMobileNumberValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserPersonalEmailValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserDesignationValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserReportToValidationMsg"))).getText());
		Assert.assertEquals("Quick User First Name is not Validated", "This field is required.", driver.findElement(By.xpath(prop.getProperty("QuickUserTeamLeadValidationMsg"))).getText());
		System.out.println("All required fields on Quick User page are Validated successfully.....");
	}
}