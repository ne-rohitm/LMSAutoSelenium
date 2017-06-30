package com.lmsauto.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.UserProfilePage;

import jxl.read.biff.BiffException;

public class UserProfileTest {

	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	
	@Test
	public void userProfileValidationTest() throws InterruptedException, IOException, BiffException {
		
		UserProfilePage userProfilePage = new UserProfilePage(driver);
		userProfilePage.navigateToUserProfile();
		Commons.waitFor(500);
		userProfilePage.navigateToUserProfile();
		userProfilePage.verifyColorIsApplied();
		
	}
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		Commons c = new Commons(driver);
		c.loginToTheApplication();
	}

	@AfterClass
	public void atEnd() {
		driver.quit();
	}
}
