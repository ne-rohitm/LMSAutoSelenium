package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
	
	public void clickOnDashboardRequestLeavePermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("dashboardRequestLeavePermissionsLink"))).click();
	}
	
	public void clickOnDashboardMyRequestsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("dashboardMyRequestsPermissionsLink"))).click();
	}
	
	public void clickOnDashboardMySettingsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("dashboardMySettingsPermissionsLink"))).click();
	}
	
	public void clickOnLmsAutoContactUsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("lmsAutoContactUsPermissionsLink"))).click();
	}
	
	public void clickOnLmsAutoSMSAndEmailSettingsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("lmsAutoSMSAndEmailSettingsPermissionsLink"))).click();
	}
	
	public void clickOnLmsAutoApIManagementPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("lmsAutoApIManagementPermissionsLink"))).click();
	}
	
	public void clickOnHrSalaryManagementPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("hrSalaryManagementPermissionsLink"))).click();
	}
	
	public void clickOnHrRoleManagementPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("hrRoleManagementPermissionsLink"))).click();
	}
	
	public void clickOnSalesMyReassignedEnquiriesPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("salesMyReassignedEnquiriesPermissionsLink"))).click();
	}
	
	public void clickOnSalesMyLostEnquiriesPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("salesMyLostEnquiriesPermissionsLink"))).click();
	}
	
	public void clickOnVehiclePricingAddPricingPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("vehiclePricingAddPricingPermissionsLink"))).click();
	}
	
	public void clickOnResponseTestimonialsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("responseTestimonialsPermissionsLink"))).click();
	}
	
	public void clickOnResponseWebsiteVisitorsPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("responseWebsiteVisitorsPermissionsLink"))).click();
	}
	
	public void clickOnCareersCreateJobPostingPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("careersCreateJobPostingPermissionsLink"))).click();
	}
	
	public void clickOnCloudTelephonyManageVirtualNumbersPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("cloudTelephonyManageVirtualNumbersPermissionsLink"))).click();
	}
	
	public void clickOnMyStorageStorageListPermissionsLink() {
		driver.findElement(By.xpath(prop.getProperty("myStorageStorageListPermissionsLink"))).click();
	}
	
	public void navigateToUserPermissionsPage() throws IOException, InterruptedException {
		HRListUsersPage hrListUsersPage = new HRListUsersPage(driver);
		Commons.waitFor(1000);
		hrListUsersPage.navigateToHrListUsersPage();
		Commons.waitFor(1000);
		hrListUsersPage.clearDataOfRecordsPerPageTextField();
		hrListUsersPage.sendDataToRecordsPerPageTextField("1");
		String total_records = hrListUsersPage.getPaginationPageCount();
		System.out.println("Total Records= " + total_records);
		int total_rec = Integer.parseInt(total_records);
		hrListUsersPage.clearDataOfRecordsPerPageTextField();
		hrListUsersPage.sendDataToRecordsPerPageTextField(total_rec+"");	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("scrollBy(0,25000)");
	    Commons.waitFor(5000);
		hrListUsersPage.clickOnUserPermissionsPage(total_rec);
	}
	
	public void verifyCountOfOnPermissions() throws InterruptedException {
		Commons.waitFor(1000);
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
		}
	}
	
	public void TurnOffPermissionsOfLmsAutoSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("lmsAutoPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_020"+i+"']")).click();
			} else {
				continue;
			}
		}
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
	
	public void TurnOffPermissionsOfHRSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("hrPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_030"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfDashboardSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("dashboardPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<8;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_010"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfSalesSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("salesPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_040"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfVehiclePricingSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("vehiclePricingPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_050"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_050"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfResponseSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("responsePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<5;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_060"+i+"']")).getAttribute("ng-checked");
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_060"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfMarketingSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("marketingPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_070"+i+"']")).getAttribute("ng-checked");		
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_070"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfAccountsSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("accountsPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<2;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_080"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_080"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfReportsSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("reportsPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_090"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_090"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfCareersSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("careersPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0100"+i+"']")).getAttribute("ng-checked");		
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0100"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfCloudTelephonySection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("cloudTelephonyPermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<3;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0110"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0110"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfMyStorageSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("myStoragePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0120"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0120"+i+"']")).click();
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
	
	public void TurnOffPermissionsOfServiceSection() throws InterruptedException {
		Commons.waitFor(100);
		driver.findElement(By.xpath(prop.getProperty("servicePermissionsLink"))).click();
		Commons.waitFor(100);
		for(int i = 1;i<4;i++) {
			String val = driver.findElement(By.xpath("//*[@id='child1_0130"+i+"']")).getAttribute("ng-checked");			
			if(val.equals("true")) {
				Commons.waitFor(100);
				driver.findElement(By.xpath("//*[@id='child1_0130"+i+"']")).click();
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
}