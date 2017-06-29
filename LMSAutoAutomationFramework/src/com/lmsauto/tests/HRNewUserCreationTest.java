package com.lmsauto.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRListUsersPage;
import com.lmsauto.pages.HRNewUserPage;
import com.lmsauto.pages.SideBarPage;

import jxl.read.biff.BiffException;

public class HRNewUserCreationTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	
	@Test
	public void hrNewUserCreationTest() throws IOException, InterruptedException, BiffException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SideBarPage sideBarPage = new SideBarPage(driver);	
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement userManagement = sideBarPage.clickOnHRUserManagement();
		ac.moveToElement(userManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement newUser = sideBarPage.clickOnHRNewUser();
		ac.moveToElement(newUser).click().build().perform();
		// Create New User
		//Step 1
		Commons.waitFor(500);
		HRNewUserPage hrNewUserPage = new HRNewUserPage(driver);
		hrNewUserPage.clickOnNextButtonStepOne();
		hrNewUserPage.validateRequiredFieldsNewUserStepOne();
		Commons.waitFor(500);
		hrNewUserPage.selectTitle();											
		hrNewUserPage.sendDataToFirstNameTextField();                     		
		hrNewUserPage.sendDataToLastNameTextField();							
		hrNewUserPage.selectGender();											
		hrNewUserPage.selectMaritalStatus();
		hrNewUserPage.selectPhysic();
		hrNewUserPage.clickOnNextButtonStepOne();
		//Step 2
		Commons.waitFor(1000);
		hrNewUserPage.clickOnNextButtonStepTwo();
		hrNewUserPage.validateRequiredFieldsNewUserStepTwo();
		hrNewUserPage.sendDataToPersonalMobileNumberTextField();				
		hrNewUserPage.sendDataToOfficeMobileNumberTextField();					
		hrNewUserPage.sendDataToPersonalEmailTextField();						
		hrNewUserPage.sendDataToCorrespondenceAddressTextField();
		hrNewUserPage.selectState();
		hrNewUserPage.selectCity();
		hrNewUserPage.sendDataToPinCodeTextField();
		hrNewUserPage.clickOnSameAsCorrespondenceAddressCheckBox();
		Commons.waitFor(10000);
		hrNewUserPage.clickOnNextButtonStepTwo();
		//Step 3
		Commons.waitFor(10000);
		hrNewUserPage.clickOnNextButtonStepThree();
		Commons.waitFor(500);
		hrNewUserPage.validateRequiredFieldsNewUserStepThree();
		Commons.waitFor(500);
		hrNewUserPage.selectHighestEducation(); 
		Commons.waitFor(1000);				
		hrNewUserPage.clickOnNextButtonStepThree();
		//Step 4
		Commons.waitFor(10000);
		hrNewUserPage.sendDataToDepartments();
		hrNewUserPage.selectDesignation();
		hrNewUserPage.selectReportingTo();
		hrNewUserPage.selectTeamLead();
		hrNewUserPage.clickOnJoiningDateCalendar();
		hrNewUserPage.clickOnActualJoiningDate();
		Commons.waitFor(10000);
		hrNewUserPage.clickOnNextButtonStepFour();
		//Step 5
		Commons.waitFor(1000);
		hrNewUserPage.selectDisplayOnWebsite();
		hrNewUserPage.sendDataToEmployeeIdTextField();							
		hrNewUserPage.selectHighSecurityPasswordType();
		Commons.waitFor(1000);
		hrNewUserPage.clickOnUpdate();
		Commons.waitFor(1000);
		
		SideBarPage sideBarPage1 = new SideBarPage(driver);
		Commons.waitFor(500);
		WebElement hr1 = sideBarPage1.clickOnHR();
		ac.moveToElement(hr1).click().build().perform();
		Commons.waitFor(500);
		WebElement userManagement1 = sideBarPage.clickOnHRUserManagement();
		ac.moveToElement(userManagement1).click().build().perform();
		Commons.waitFor(500);
		WebElement listUsers = sideBarPage.clickOnHRListUsers();
		ac.moveToElement(listUsers).click().build().perform();
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		Commons.waitFor(1000);
		hrListUsersPage.getDataOfNewlyAddedEnquiry();	
	}

	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		Commons c = new Commons(driver);
		c.loginToTheApplication();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}