package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRListUsersPage {

	WebDriver driver;
	ReadObjectRepository ror = new ReadObjectRepository();
	Properties prop;  
	ReadExcelData readExcelData = new ReadExcelData();
	public HRListUsersPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void sendDataToRecordsPerPageTextField(String data) {
		driver.findElement(By.xpath(prop.getProperty("recordsPerPage"))).sendKeys(data);
	}
	
	public String getRowText() {
		String text = driver.findElement(By.xpath(prop.getProperty("tableRow"))).getText();
		return text;	
	}
	
	public void clearDataOfRecordsPerPageTextField() {
		driver.findElement(By.xpath(prop.getProperty("recordsPerPage"))).clear();
	}
	
	public String getPaginationPageCount() {
		String text = driver.findElement(By.xpath(prop.getProperty("lastPageNumber"))).getText();
		return text;	
	}
	
	public  void getDataOfNewlyAddedEnquiry() throws BiffException, IOException {
		
		String arr[] = new String[7];
		for(int i = 1; i <7; i++) {
			String text =  driver.findElement(By.xpath("//html/body/div[4]/div/div[3]/div[3]/div/div[1]/div/div[2]/table/tbody/tr[1]/td["+i+"]")).getText();
			arr[i] = text;
		}
		
		String indexOne[] = arr[2].split("\\s");
		Assert.assertEquals(indexOne[0],readExcelData.getCellDataWithRowColAndSheetName(0, 1, "NewUserPage"));
		System.out.println("On \"list user\" page Firstname is asserted");
		Assert.assertEquals(indexOne[1],readExcelData.getCellDataWithRowColAndSheetName(0, 2, "NewUserPage"));
		System.out.println("On \"list user\" page Lastname is asserted");
		Assert.assertEquals(arr[3], readExcelData.getCellDataWithRowColAndSheetName(0, 17, "NewUserPage"));
		System.out.println("On \"list user\" page Designation is asserted");
		Assert.assertEquals(arr[4], readExcelData.getCellDataWithRowColAndSheetName(0, 22, "NewUserPage"));
		System.out.println("On \"list user\" page Reporting To is asserted");
		Assert.assertEquals(arr[5], readExcelData.getCellDataWithRowColAndSheetName(0, 22, "NewUserPage"));
		System.out.println("On \"list user\" page Team Lead is asserted");
		Assert.assertEquals(arr[6], readExcelData.getCellDataWithRowColAndSheetName(0, 15, "NewUserPage"));
		System.out.println("On \"list user\" page Department is asserted");
	}
	
	public void verifyWhetherRecordsPerPageAreShownCorrect(int expectedCount) {
		int expectedCnt = expectedCount; // change
		int cnt = 0;
		for (int i = 1; i <= expectedCnt; i++) {
			String text = driver.findElement(By.xpath(
					"//html/body/div[4]/div/div[3]/div[3]/div/div[1]/div/div[2]/table/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(text);
			if (!text.equals("")) {
				cnt++;
				continue;
			} else {
				System.exit(0);
			}
		}
		System.out.println("count is = " + cnt);
		if (expectedCnt <= cnt) {
			System.out.println("Records Per page are shown correct");
		} else {
			System.out.println("Records Per page are shown incorrect");
		}
	}
	
	public void navigateToHrListUsersPage() throws IOException, InterruptedException {
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
	}
	
	public void clickOnUserPermissionsPage(int total_cnt) throws InterruptedException {
		driver.findElement(By.xpath("//html/body/div[4]/div/div[3]/div[3]/div/div[1]/div/div[2]/table/tbody/tr["+total_cnt+"]/td[10]/div[1]/a")).click();
	}
}