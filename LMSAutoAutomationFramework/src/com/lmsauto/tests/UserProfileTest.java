package com.lmsauto.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.classes.WriteDataToExcel;
import com.lmsauto.pages.LoginPage;
import com.lmsauto.pages.UserProfilePage;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class UserProfileTest {

	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	WriteDataToExcel writeDataToExcel = new WriteDataToExcel();
	
	@Test
	public void userProfileTest() throws InterruptedException, IOException, BiffException {
		
		UserProfilePage userProfilePage = new UserProfilePage(driver);
		userProfilePage.compareUserNames();
		userProfilePage.navigateToUserProfile();
		Commons.waitFor(800);
		userProfilePage.verifyColorIsApplied();
	}
	@Test
	public void userProfileValidationTest() throws IOException, BiffException, InterruptedException, RowsExceededException, WriteException {
		UserProfilePage userProfilePage = new UserProfilePage(driver);
		userProfilePage.compareUserNames();
		userProfilePage.navigateToUserProfile();
		userProfilePage.clickOnChangePasswordUpdateButton();
		userProfilePage.validateChangePasswordSection();
		userProfilePage.sendDataToOldPasswordTextField();
		userProfilePage.sendDataToNewPasswordTextField();
		userProfilePage.sendDataToConfirmPasswordTextField();
		Commons.waitFor(5000);
		userProfilePage.clickOnChangePasswordUpdateButton();
		Commons.waitFor(5000);	
		userProfilePage.clickOnSignOutLink();
		Commons.waitFor(200);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}
	
	@Test
	public void validateAndUpdateProfilePicureTest() throws IOException, BiffException, InterruptedException {
		UserProfilePage userProfilePage = new UserProfilePage(driver);
		userProfilePage.compareUserNames();
		userProfilePage.navigateToUserProfile();
		userProfilePage.clickOnProfileUpdateButton();
		userProfilePage.validateProfileSection();
		userProfilePage.sendPathOfImageToProfilePicture();
		userProfilePage.clickOnProfileUpdateButton();
	}
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}
	
	@AfterClass
	public void atEnd() {
		driver.quit();
	}
}
