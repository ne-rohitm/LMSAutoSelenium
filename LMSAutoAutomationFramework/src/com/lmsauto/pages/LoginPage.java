package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lmsauto.classes.ReadObjectRepository;

/* 
 * Used in Commons.java
 * 
 * */

public class LoginPage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop; 
	
	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void sendDataToUsernameTextField(String username) {
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(username);
	}
	
	public void sendDataToPasswordTextField(String password) {
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
	}
	
	public void clickOnNextButton() {
		driver.findElement(By.xpath(prop.getProperty("nextButton"))).click();
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
	}
	
	public String getUsernameValidationMessage() {
		String usernameValidationText = driver.findElement(By.xpath(prop.getProperty("UsernameValidationText"))).getText();
		return usernameValidationText;	
	}
	
	public WebElement getWebElementUsername() {
		return driver.findElement(By.xpath(prop.getProperty("username")));
	}
	
	public WebElement getWebElementPassword() {
		return driver.findElement(By.xpath(prop.getProperty("password")));
	}
}
