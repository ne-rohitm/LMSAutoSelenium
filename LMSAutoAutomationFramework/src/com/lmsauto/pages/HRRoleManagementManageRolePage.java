package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRRoleManagementManageRolePage {	
	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop;  
	ReadExcelData readExcelData = new ReadExcelData();
	
	public HRRoleManagementManageRolePage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void navigateToManageRole() throws IOException, InterruptedException {
		SideBarPage sideBarPage = new SideBarPage(driver);
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement roleManagement = sideBarPage.clickOnHrRoleManagement();
		ac.moveToElement(roleManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement manageRole = sideBarPage.clickOnHrRoleManagementManageRole();
		ac.moveToElement(manageRole).click().build().perform();
	}
	
	public void sendDataToSearchTextField() throws BiffException, IOException, InterruptedException {
		Commons.waitFor(1000);
		driver.findElement(By.xpath(prop.getProperty("mangeRoleSearchTextField"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "HRCreateRolePage"));
	}
	
	public void clickOnUserPermissionsButton() {
		driver.findElement(By.xpath("//html/body/div[4]/div/div[3]/div[3]/div/div/div/div[2]/table/tbody/tr/td[3]/div[1]/a")).click();						 
	}
	
	public void sendDataToRecordsPerPageTextField(String data) {
		driver.findElement(By.xpath(prop.getProperty("manageRolePageRecordsPerPageTextBox"))).sendKeys(data);
	}
	
	public void clearDataOfRecordsPerPageTextField() {
		driver.findElement(By.xpath(prop.getProperty("manageRolePageRecordsPerPageTextBox"))).clear();
	}
	
	public String getPaginationPageCount() {
		String text = driver.findElement(By.xpath(prop.getProperty("manageroleLastPageNumber"))).getText();
		return text;	
	}
	
	public void clickOnUserPermissionsPage(int total_cnt) {
		driver.findElement(By.xpath("//html/body/div[4]/div/div[3]/div[3]/div/div/div/div[2]/table/tbody/tr["+total_cnt+"]/td[3]/div[1]/a")).click();						 
	}
	
	public void comapreBoththeCounts(int cnt_on_createRole, int cnt_shown_on_manageRole) {
		Assert.assertEquals(cnt_on_createRole, cnt_shown_on_manageRole);
		System.out.println("Both the counts shown on ManageRolePage and CreateRolePage are same");
	}
}