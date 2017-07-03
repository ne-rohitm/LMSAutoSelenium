package com.lmsauto.pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

public class HRListUserUserPermissionsPage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	ReadExcelData readExcelData = new ReadExcelData(); 
	Properties prop;
	
	
	public HRListUserUserPermissionsPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void navigateToUserPermissionsPage() throws IOException, InterruptedException {
		SideBarPage sideBarPage = new SideBarPage(driver);
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement userManagement = sideBarPage.clickOnHRUserManagement();
		ac.moveToElement(userManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement listUsers = sideBarPage.clickOnHRListUsers();
		ac.moveToElement(listUsers).click().build().perform();
		Commons.waitFor(500);
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		hrListUsersPage.clickOnUserPermissionsPage();	
	}
	
	public void verifyCountOfOnPermissions() throws InterruptedException {	
		int countParent = driver.findElements(By.xpath(prop.getProperty("childOne"))).size();
		int countSub = driver.findElements(By.xpath(prop.getProperty("childTwo"))).size();
		int CountSubToSub = driver.findElements(By.xpath(prop.getProperty("childThree"))).size();
		int countGot = countParent+countSub+CountSubToSub;
		System.out.println("On Permissions found are "+countGot);
		
		String displayedCount = driver.findElement(By.xpath(prop.getProperty("totalPermissionsCount"))).getText();
		String array[] = displayedCount.split(":\\s");
		System.out.println("Displayed count is "+array[1]);
		if(countGot == Integer.parseInt(array[1])) {
			System.out.println("Permissions count is displayed correctly");
		} else {
			System.out.println("Permissions count is incorrect");
			Assert.fail("Permissions count is incorrect");
		}
	}
	
	public void TurnOffPermissionsOfLmsAutoSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#lms']")).click();
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfLmsAutoSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#lms']")).click();
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).getAttribute("ng-checked");
			if(val.equals("")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOffPermissionsOfHRSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#hr']")).click();
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfHRSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#hr']")).click();
		
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).getAttribute("ng-checked");
			if(val.equals("")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOffPermissionsOfDashboardSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#dashboard']")).click();
		for(int i = 1;i<8;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfDashboardSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#dashboard']")).click();
		for(int i = 1;i<8;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).getAttribute("ng-checked");
			if(val.equals("")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOffPermissionsOfSalesSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#sales']")).click();
		for(int i = 1;i<3;i++) {
			Commons.waitFor(500);
			String val = driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).getAttribute("ng-checked");
			
			if(val.equals("true")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfSalesSection() throws InterruptedException {
		Commons.waitFor(500);
		driver.findElement(By.xpath("//a[@href='#sales']")).click();
		for(int i = 1;i<3;i++) {
			Commons.waitFor(500);
			String val = driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).getAttribute("ng-checked");
			
			if(val.equals("")) {
				Commons.waitFor(500);
				driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
}