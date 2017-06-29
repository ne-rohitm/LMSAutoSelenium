package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public String getWelcomeText() {
		return driver.findElement(By.xpath(prop.getProperty("welcomeText"))).getText();
	}
}
