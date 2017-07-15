package com.lmsauto.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.LoginPage;
import jxl.read.biff.BiffException;

public class LoginTest extends ProvideDriverInstance {
	private WebDriver driver;
	
	@Test
	public void loginTestWithValidations() throws InterruptedException, BiffException, IOException {
		driver = getDriverInstance();
		LoginPage loginPage = new LoginPage(driver);
		Commons.waitFor(1000);
		loginPage.sendDataToUsernameTextFieldForLoginTest();
		Commons.waitFor(1000);
		loginPage.clickOnNextButton();
		Commons.waitFor(1000);
		loginPage.sendDataToPasswordTextFieldForLoginTest();
		Commons.waitFor(1000);
		loginPage.clickOnLoginButton();
		Commons.waitFor(1000);
	}
}