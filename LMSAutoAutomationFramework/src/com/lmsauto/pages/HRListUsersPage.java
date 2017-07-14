package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRListUsersPage {

	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private Properties prop;  
	private ReadExcelData readExcelData = new ReadExcelData();
	
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
	
	public  void getDataOfNewlyAddedUser() throws BiffException, IOException {
		
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
	
	public void clickOnEditNewlyCreatedUser() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("editUser"))).click();
	}
	
	public void clickOnEditUserStepOne() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stepOneName"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 28, "NewUserPage"));
		System.out.println("Step 1 name is asserted");
		driver.findElement(By.xpath(prop.getProperty("editUserStepOne"))).click();
	}
	
	public void clickOnEditUserStepTwo() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stepTwoName"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 29, "NewUserPage"));
		System.out.println("Step 2 name is asserted");
		driver.findElement(By.xpath(prop.getProperty("editUserStepTwo"))).click();
	}
	
	public void clickOnEditUserStepThree() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stepThreeName"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 30, "NewUserPage"));
		System.out.println("Step 3 name is asserted");
		driver.findElement(By.xpath(prop.getProperty("editUserStepThree"))).click();
	}
	
	public void clickOnEditUserStepFour() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stepFourName"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 31, "NewUserPage"));
		System.out.println("Step 4 name is asserted");
		driver.findElement(By.xpath(prop.getProperty("editUserStepFour"))).click();
	}
	
	public void clickOnEditUserStepFive() throws InterruptedException, BiffException, IOException {
		Commons.waitFor(100);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stepFiveName"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 32, "NewUserPage"));
		System.out.println("Step 5 name is asserted");
		driver.findElement(By.xpath(prop.getProperty("editUserStepFive"))).click();
	}
	
	public void verifyEditUserStepOneValues() throws BiffException, IOException {
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("title")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 0, "NewUserPage"));
		System.out.println("Title is asserted on edit user step 1");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("firstname"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 1, "NewUserPage"));
		System.out.println("Firstname is asserted on edit user step 1");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("lastname"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 2, "NewUserPage"));
		System.out.println("Lastname is asserted on edit user step 1");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("gender")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 9, "NewUserPage"));
		System.out.println("Gender is asserted on edit user step 1");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("physic")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 11, "NewUserPage"));
		System.out.println("Physic is asserted on edit user step 1");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("maritalStatus")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 10, "NewUserPage"));
		System.out.println("MaritalStatus is asserted on edit user step 1");		
	}
	
	public void verifyEditUserStepTwoValues() throws BiffException, IOException {
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalMobile"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 3, "NewUserPage"));
		System.out.println("Personal Mobile is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("officeMobileNumber"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 4, "NewUserPage"));
		System.out.println("Office Mobile is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalEmail"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 5, "NewUserPage"));
		System.out.println("Personal Email is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("correspondenceAddress"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 6, "NewUserPage"));
		System.out.println("Correspondance Address is asserted on edit user step 2");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("state")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 12, "NewUserPage"));
		System.out.println("State in Correspondance Address is asserted on edit user step 2");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("city")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 13, "NewUserPage"));
		System.out.println("City in Correspondance Address is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("pin"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 7, "NewUserPage"));
		System.out.println("Pin in Correspondance Address is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddress"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 6, "NewUserPage"));
		System.out.println("Permanent Address is asserted on edit user step 2");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("permanentAddressCountry")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 27, "NewUserPage"));
		System.out.println("Country in Permanent Address is asserted on edit user step 2");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("permanentAddressState")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 12, "NewUserPage"));
		System.out.println("State in Permanent Address is asserted on edit user step 2");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("permanentAddressCity")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 13, "NewUserPage"));
		System.out.println("City in Permanent Address is asserted on edit user step 2");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressPin"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 7, "NewUserPage"));
		System.out.println("Pin in Permanent Address is asserted on edit user step 2");
	}
	
	public void verifyEditUserStepThreeValues() throws BiffException, IOException {
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("highestEducation")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 14, "NewUserPage"));
		System.out.println("Highest education is asserted on edit user step 3");
	}
	
	public void verifyEditUserStepFourValues() throws BiffException, IOException {
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("departmentsValue"))).getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 15, "NewUserPage"));
		System.out.println("Department Value is asserted on edit user step 4");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("designation")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 17, "NewUserPage"));
		System.out.println("Designation is asserted on edit user step 4");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("reportingTo")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 18, "NewUserPage"));
		System.out.println("ReportingTo is asserted on edit user step 4");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("teamLead")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 19, "NewUserPage"));
		System.out.println("TeamLead is asserted on edit user step 4");
	}
	
	public void verifyEditUserStepFiveValues() throws BiffException, IOException {
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("displayOnWebsite")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 20, "NewUserPage"));
		System.out.println("Display on website is asserted on edit user step 5");
		Assert.assertEquals(new Select(driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordTypeOnEditUser")))).getFirstSelectedOption().getText(), readExcelData.getCellDataWithRowColAndSheetName(0, 21, "NewUserPage"));
		System.out.println("High Security password type is asserted on edit user step 5");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("employeeId"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 8, "NewUserPage"));
		System.out.println("Employee Id is asserted on edit user step 5");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("usernameInStepFive"))).getAttribute("value"), readExcelData.getCellDataWithRowColAndSheetName(0, 3, "NewUserPage"));
		System.out.println("Username is asserted on edit user step 5");
	}
}