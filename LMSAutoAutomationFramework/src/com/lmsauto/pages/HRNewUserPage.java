package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRNewUserPage {
	
	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private Properties prop;
	private ReadExcelData readExcelData = new ReadExcelData();
	
	public HRNewUserPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public void selectTitle() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("title")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 0, "NewUserPage"));
	}
	
	public void sendDataToFirstNameTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("firstname"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 1, "NewUserPage"));
	}
	
	public void sendDataToLastNameTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("lastname"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 2, "NewUserPage"));
	}
	
	public void sendDataToEmployeeIdTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("employeeId"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 8, "NewUserPage"));
	}
	
	public void sendDataToHighSecurityPasswordTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("highSecurityPassword"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 25, "NewUserPage"));
	}
	
	public void selectGender() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("gender")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 9, "NewUserPage"));
	}
	
	public void selectPhysic() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("physic")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 11, "NewUserPage"));
	}
	
	public void selectMaritalStatus() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("maritalStatus")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 10, "NewUserPage"));
	}
	
	public void selectState() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("state")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 12, "NewUserPage"));
	}
	
	public void selectCity() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("city")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 13, "NewUserPage"));
	}
	
	public void selectDesignation() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("designation")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 17, "NewUserPage"));
	}
	
	public void selectReportingTo() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("reportingTo")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 18, "NewUserPage"));
	}
	
	public void selectTeamLead() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("teamLead")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 19, "NewUserPage"));
	}
	
	public void selectDisplayOnWebsite() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("displayOnWebsite")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 20, "NewUserPage"));
	}
	
	public void selectHighSecurityPasswordTypeAsAlwaysOTP() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordType")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 21, "NewUserPage"));
	}
	
	public void selectHighSecurityPasswordTypeAsAlwaysFixed() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordType")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 26, "NewUserPage"));
	}
	
	public void selectHighestEducation() throws BiffException, IOException {
		WebElement element = driver.findElement(By.xpath(prop.getProperty("highestEducation")));
		Select select = new Select(element);
		select.selectByVisibleText(readExcelData.getCellDataWithRowColAndSheetName(0, 14, "NewUserPage"));
	}
	
	public void clickOnNextButtonStepOne() {
		driver.findElement(By.xpath(prop.getProperty("nextButtonStepOne"))).click();
	}
	
	public void sendDataToPersonalMobileNumberTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("personalMobile"))).clear();
		driver.findElement(By.xpath(prop.getProperty("personalMobile"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 3, "NewUserPage"));
	}
	
	public void sendDataToOfficeMobileNumberTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("officeMobileNumber"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 4, "NewUserPage"));
	}
	
	public void sendDataToPersonalEmailTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("personalEmail"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 5, "NewUserPage"));
	}
	
	public void sendDataToCorrespondenceAddressTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("correspondenceAddress"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 6, "NewUserPage"));
	}
	
	public void sendDataToPinCodeTextField() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("pin"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 7, "NewUserPage"));
	}
	
	public void clickOnSameAsCorrespondenceAddressCheckBox() {
		driver.findElement(By.xpath(prop.getProperty("sameAsCorrespondenceAddress"))).click();
	}
	
	public void clickOnJoiningDateCalendar() {
		driver.findElement(By.xpath(prop.getProperty("joiningDate"))).click();
	}
	
	public void clickOnActualJoiningDate() {
		driver.findElement(By.xpath(prop.getProperty("selectDate"))).click();
	}
	
	public void clickOnNextButtonStepTwo() {
		driver.findElement(By.xpath(prop.getProperty("nextButtonStepTwo"))).sendKeys(Keys.ENTER);
	}
	
	public void clickOnNextButtonStepThree() {
		driver.findElement(By.xpath(prop.getProperty("nextButtonStepThree"))).click();
	}
	
	public void clickOnNextButtonStepFour() {
		driver.findElement(By.xpath(prop.getProperty("nextButtonStepFour"))).click();
	}
	
	public void clickOnUpdate() {
		driver.findElement(By.xpath(prop.getProperty("updateButton"))).click();
	}
	
	public void sendDataToDepartments() throws BiffException, IOException {
		driver.findElement(By.xpath(prop.getProperty("departments"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 15, "NewUserPage"));
		driver.findElement(By.xpath(prop.getProperty("departments"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(prop.getProperty("departments"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 16, "NewUserPage"));
		driver.findElement(By.xpath(prop.getProperty("departments"))).sendKeys(Keys.ENTER);
	}
	
	public void validateRequiredFieldsNewUserStepOne() {
		System.out.println("Validating the required fields for step 1.....");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("titleValidationMsg"))).getText(), "This field is required.", "Title is not validated");			
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("firstNameValidationMsg"))).getText(), "This field is required.", "FirstName is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("lastNameValidationMsg"))).getText(), "This field is required.", "LastName is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("genderValidationMsg"))).getText(), "This field is required.", "Gender is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("physicValidationMsg"))).getText(), "This field is required.", "Physic is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("maritalStatusValidationMsg"))).getText(), "This field is required.","Marital Status is not validated");
		System.out.println("All required fields on step 1 page are Validated successfully.....");
	}
	
	public void validateRequiredFieldsNewUserStepTwo() throws BiffException, IOException, InterruptedException {
		System.out.println("Validating the required fields for step 2.....");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalMobileValidationMsg"))).getText(), "This field is required.", "Personal Mob No. is not validated");
		driver.findElement(By.xpath(prop.getProperty("personalMobile"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 23, "NewUserPage"));
		Commons.waitFor(500);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalMobileValidationMsg"))).getText(), "Personal mobile no. must be 10 digits", "Personal Mob No. is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalEmailValidationMsg"))).getText(), "This field is required.", "Personal email is not validated");
		driver.findElement(By.xpath(prop.getProperty("personalEmail"))).sendKeys(readExcelData.getCellDataWithRowColAndSheetName(0, 24, "NewUserPage"));
		Commons.waitFor(500);
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("personalEmailValidationMsg"))).getText(), "Invalid email address.", "Personal email is not validated");
		driver.findElement(By.xpath(prop.getProperty("personalEmail"))).clear();
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("correspondenceAddressValidationMsg"))).getText(), "This field is required.", "Correspondence Address is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("stateValidationMsg"))).getText(), "This field is required.", "Correspondence Address State is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("cityValidationMsg"))).getText(), "This field is required.", "Correspondence Address City is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("pinValidationMsg"))).getText(), "This field is required.", "Correspondence Address Pin is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressValidationMsg"))).getText(), "This field is required.", "Permanent Address is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressStateValidationMsg"))).getText(), "This field is required.", "Permanent Address State is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressCityValidationMsg"))).getText(), "This field is required.", "Permanent Address City is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressPinValidationMsg"))).getText(), "This field is required.", "Permanent Address Pin is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("permanentAddressCountryValidationMsg"))).getText(), "This field is required.", "Permanent Address Country is not validated");
		System.out.println("All required fields on step 2 page are Validated successfully.....");
	}
	
	public void validateRequiredFieldsNewUserStepThree() {
		System.out.println("Validating the required fields for step 3.....");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("highestEducationValidationMsg"))).getText(), "This field is required.", "Highest Education is not validated");
		System.out.println("All required fields on step 3 page are Validated successfully.....");
	}
	
	public void validateRequiredFieldsNewUserStepFour() {
		System.out.println("Validating the required fields for step 4.....");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("departmentsValidationMsg"))).getText(), "This field is required.", "Department is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("designationValidationMsg"))).getText(), "This field is required.", "Designation is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("reportingToValidationMsg"))).getText(), "This field is required.", "Reporting To is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("joiningDateValidationMsg"))).getText(), "This field is required.", "Joining Date is not validated");
		Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("teamLeadValidationMsg"))).getText(), "This field is required.", "Joining Date is not validated");
		System.out.println("All required fields on step 4 page are Validated successfully.....");
	}
	
	public void validateRequiredFieldsNewUserStepFive() {
		System.out.println("Validating the required fields for step 5.....");
		if(driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordType"))).getText().equals("Select Password Type")) {
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordTypeValidationMsg"))).getText(), "This field is required.", "High Security Password type is not validated");
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("displayOnWebsiteValidationMsg"))).getText(), "This field is required.", "Show on website is not validated");
		} else if(driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordType"))).getText().equals("Always Fixed")) {
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("highSecurityPasswordValidationMsg"))).getText(), "This field is required.", "High Security Password is not validated");
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("displayOnWebsiteValidationMsg"))).getText(), "This field is required.", "Show on website is not validated");
		} else {
			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("displayOnWebsiteValidationMsg"))).getText(), "This field is required.", "Show on website is not validated");
		}		
		System.out.println("All required fields on step 5 page are Validated successfully.....");
	}
	
	public void navigateToHrNewUserPage() throws IOException, InterruptedException {
		SideBarPage sideBarPage = new SideBarPage(driver);	
		Commons.waitFor(5000);
		WebElement hr = sideBarPage.clickOnHR();
		Actions ac = new Actions(driver);
		ac.moveToElement(hr).click().build().perform();
		Commons.waitFor(500);
		WebElement userManagement = sideBarPage.clickOnHRUserManagement();
		ac.moveToElement(userManagement).click().build().perform();
		Commons.waitFor(500);
		WebElement newUser = sideBarPage.clickOnHRNewUser();
		ac.moveToElement(newUser).click().build().perform();
	}
}