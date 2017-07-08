package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRRoleManagementCreateRolePage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop;  
	ReadExcelData readExcelData = new ReadExcelData();
	
	public HRRoleManagementCreateRolePage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void clickOnSubmitButton() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("scrollBy(0,25000)");
		driver.findElement(By.xpath(prop.getProperty("submitButton"))).click();
	}
	
	public void clickOnDashboardPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("dashboardPermissionsLink"))).click();
	}
	
	public void clickOnHrPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("hrPermissionsLink"))).click();
	}
	
	public void clickOnLMSAutoPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("lmsAutoPermissionsLink"))).click();
	}
	
	public void clickOnSalesPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("salesPermissionsLink"))).click();
	}
	
	public void clickOnVehiclePricingPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("vehiclePricingPermissionsLink"))).click();
	}
	
	public void clickOnResponsePermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("responsePermissionsLink"))).click();
	}
	
	public void clickOnMarketingPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("marketingPermissionsLink"))).click();
	}
	
	public void clickOnAccountsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("accountsPermissionsLink"))).click();
	}
	
	public void clickOnReportsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("reportsPermissionsLink"))).click();
	}
	
	public void clickOnCareersPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("careersPermissionsLink"))).click();
	}
	
	public void clickOnCloudTelephonyPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("cloudTelephonyPermissionsLink"))).click();
	}
	
	public void clickOnMyStoragePermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("myStoragePermissionsLink"))).click();
	}
	
	public void clickOnServicePermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("servicePermissionsLink"))).click();
	}
	
	public void TurnOnPermissionsOfLmsAutoSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("lmsAutoPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).getAttribute("ng-checked");
			if(val.equals("")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfHRSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("hrPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).getAttribute("ng-checked");
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfDashboardSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("dashboardPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<8;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).getAttribute("ng-checked");
			if(val.equals("")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfSalesSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("salesPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).getAttribute("ng-checked");
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfVehiclePricingSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("vehiclePricingPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_050"+i+"']")).getAttribute("ng-checked");
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_050"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfResponseSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("responsePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<5;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_060"+i+"']")).getAttribute("ng-checked");
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_060"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfMarketingSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("marketingPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_070"+i+"']")).getAttribute("ng-checked");
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_070"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfAccountsSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("accountsPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<2;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_080"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_080"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfReportsSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("reportsPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_090"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_090"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfCareersSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("careersPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0100"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0100"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfCloudTelephonySection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("cloudTelephonyPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0110"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0110"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfMyStorageSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("myStoragePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0120"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0120"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void TurnOnPermissionsOfServiceSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("servicePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0130"+i+"']")).getAttribute("ng-checked");			
			if(!val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0130"+i+"']")).click();
			} else {
				continue;
			}
		}
	}
	
	public void navigateToCreateRole() throws IOException, InterruptedException {
		SideBarPage sideBarPage = new SideBarPage(driver);
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement roleManagement = sideBarPage.clickOnHrRoleManagement();
		ac.moveToElement(roleManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement createRole = sideBarPage.clickOnHrRoleManagementCreateRole();
		ac.moveToElement(createRole).click().build().perform();
	}
	
	public void sendDataToDefineRoleTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("defineRoleNameTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "HRCreateRolePage"));
	}
	
	public void validateRequiredFieldsOnCreateRolePage() {
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("defineRoleNameValidationMsg"))).getText(), "Please enter define role name.", "Define Role text field is not Validated");	
	}
	
	public int getCountOfOnPermissionsOnCreateRolePage() throws InterruptedException {
		Commons.waitFor(1000);
		int countParent = driver.findElements(By.xpath(prop.getProperty("childOne"))).size();	
		int countSub = driver.findElements(By.xpath(prop.getProperty("childTwo"))).size();	
		int CountSubToSub = driver.findElements(By.xpath(prop.getProperty("childThree"))).size();
		int countGot = countParent+countSub+CountSubToSub;
		System.out.println("On Permissions found are "+countGot);
		return countGot;
	}
}