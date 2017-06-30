package com.lmsauto.classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProvideDriverInstance {

	public WebDriver getDriverInstance() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
