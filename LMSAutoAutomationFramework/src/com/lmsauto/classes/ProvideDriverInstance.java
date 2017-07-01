package com.lmsauto.classes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProvideDriverInstance {

	public WebDriver getDriverInstance() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://la.netestaws.in/office.php#/login"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
