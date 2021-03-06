package com.lmsauto.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ProvideDriverInstance;
import com.lmsauto.pages.HRListUsersPage;
import com.lmsauto.pages.LoginPage;

import jxl.read.biff.BiffException;

public class HRListUsersRecordsTest extends ProvideDriverInstance {
	private WebDriver driver;
	//private final static Logger LOGGER = Logger.getLogger(HRListUsersRecordsPerPageCountTest.class.getName());
	/*
	 * Counts record per page and comapres with expected count
	 */
	
	@Test(priority = 0)
	public void pagePerCountTest() throws InterruptedException, IOException, BiffException {		
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		Commons.waitFor(1000);
		hrListUsersPage.navigateToHrListUsersPage();
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
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		Commons.waitFor(1000);
		hrListUsersPage.navigateToHrListUsersPage();
		Commons.waitFor(1000);
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
		driver = getDriverInstance();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToTheApplication();
	}
}