package com.lmsauto.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commons {
	private WebDriver driver;
	public Commons(WebDriver driver) {
		this.driver = driver;
	}
	
	public void explicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitFor(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
}
