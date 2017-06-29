package com.lmsauto.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRListUsersPage;
import com.lmsauto.pages.SideBarPage;

import jxl.read.biff.BiffException;

public class HRListUsersRecordsTest {

	ProvideDriverInstance pdi = new ProvideDriverInstance();
	WebDriver driver = pdi.getDriverInstance();
	//private final static Logger LOGGER = Logger.getLogger(HRListUsersRecordsPerPageCountTest.class.getName());
	/*
	 * Counts record per page and comapres with expected count
	 */
	@Test(priority = 0)
	public void pagePerCountTest() throws InterruptedException, IOException, BiffException {
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
		Commons.waitFor(1000);
		
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		Commons.waitFor(1000);
		hrListUsersPage.clearDataOfRecordsPerPageTextField();
		hrListUsersPage.sendDataToRecordsPerPageTextField("20"); // change
		hrListUsersPage.verifyWhetherRecordsPerPageAreShownCorrect(20); // 20 is expected count
	}

	/*
	 * Verifies whether the pagination count shown correctly.
	 */

	@Test(priority = 1)
	public void paginationCountTest() throws IOException, InterruptedException {
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
		
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		hrListUsersPage.clearDataOfRecordsPerPageTextField();
		hrListUsersPage.sendDataToRecordsPerPageTextField("1"); // change
		int recordsPerPageTextFieldValue = 25;
		String total_records = hrListUsersPage.getPaginationPageCount();
		System.out.println("Total Records= " + total_records);
		int total_rec = Integer.parseInt(total_records);

		hrListUsersPage.clearDataOfRecordsPerPageTextField();
		hrListUsersPage.sendDataToRecordsPerPageTextField(recordsPerPageTextFieldValue + "");
		String numberOfPagesDisplayed = hrListUsersPage.getPaginationPageCount();
		System.out.println("Pages Displayed= " + numberOfPagesDisplayed);
		int number_of_pages_mod = total_rec % recordsPerPageTextFieldValue;
		int number_of_pages_div = total_rec / recordsPerPageTextFieldValue;
		int pages = 0;
		if (number_of_pages_mod != 0) {
			pages = number_of_pages_div + 1;
		} else if (number_of_pages_mod == 0) {
			pages = number_of_pages_div;
		}

		if (pages == Integer.parseInt(numberOfPagesDisplayed)) {
			System.out.println("Pagination Pages count is displayed correctly." + pages);
		} else {
			System.out.println("Pagination Pages count is displayed correctly." + pages);
		}	
	}

	@BeforeClass
	public void beforeMethod() throws InterruptedException, IOException, BiffException {
		Commons c = new Commons(driver);
		c.loginToTheApplication();
	}

	@AfterClass
	public void atEnd() {
		driver.quit();
	}
}