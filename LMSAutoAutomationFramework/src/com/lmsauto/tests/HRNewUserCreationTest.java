package com.lmsauto.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRListUsersPage;
import com.lmsauto.pages.HRNewUserPage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class HRNewUserCreationTest {
	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	
	@Test
	public void hrNewUserCreationTest() throws IOException, InterruptedException, BiffException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HRNewUserPage hrNewUserPage = new HRNewUserPage(driver);
		// Create New User
		//Step 1
		Commons.waitFor(1000);
		hrNewUserPage.navigateToHrNewUserPage();
		Commons.waitFor(1000);
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
		hrNewUserPage.clickOnNextButtonStepFour();
		hrNewUserPage.validateRequiredFieldsNewUserStepFour();
		Commons.waitFor(500);
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
		hrNewUserPage.clickOnUpdate();
		Commons.waitFor(500);
		hrNewUserPage.validateRequiredFieldsNewUserStepFive();
		hrNewUserPage.selectHighSecurityPasswordTypeAsAlwaysFixed();
		hrNewUserPage.validateRequiredFieldsNewUserStepFive();
		Commons.waitFor(500);
		hrNewUserPage.sendDataToHighSecurityPasswordTextField();
		hrNewUserPage.selectHighSecurityPasswordTypeAsAlwaysOTP();
		hrNewUserPage.validateRequiredFieldsNewUserStepFive();
		hrNewUserPage.selectDisplayOnWebsite();
		hrNewUserPage.sendDataToEmployeeIdTextField();						
		Commons.waitFor(1000);
		hrNewUserPage.clickOnUpdate();
		Commons.waitFor(1000);
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		hrListUsersPage.navigateToHrListUsersPage();
		Commons.waitFor(1000);
		hrListUsersPage.getDataOfNewlyAddedUser();	
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