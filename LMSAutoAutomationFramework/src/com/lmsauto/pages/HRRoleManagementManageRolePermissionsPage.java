package com.lmsauto.pages;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.lmsauto.classes.Commons;
import com.lmsauto.classes.ReadExcelData;
import com.lmsauto.classes.ReadObjectRepository;

import jxl.read.biff.BiffException;

public class HRRoleManagementManageRolePermissionsPage {
	private WebDriver driver;
	private ReadObjectRepository ror = new ReadObjectRepository();
	private Properties prop;  
	private ReadExcelData readExcelData = new ReadExcelData();
	
	public HRRoleManagementManageRolePermissionsPage(WebDriver driver) throws IOException {
		this.driver = driver;
		prop = ror.getObjectRepository();
	}
	
	public int getPermissionsCountShownOnManageRolePemissionsPage() throws InterruptedException, IOException {
		Commons.waitFor(1000);
		String displayedCount = driver.findElement(By.xpath(prop.getProperty("totalPermissionsCount"))).getText();
		String array[] = displayedCount.split(":\\s");
		System.out.println("Displayed count is "+array[1]);
		return Integer.parseInt(array[1]);
	}
	
	public void comapreBoththeCounts(int cnt_on_createRole, int cnt_shown_on_manageRole) {
		Assert.assertEquals(cnt_on_createRole, cnt_shown_on_manageRole);
		System.out.println("Both the counts shown on ManageRolePage and CreateRolePage are same");
	}
	
	public void verifyRoleNameOnManageRolePermissionsPage() throws BiffException, IOException, InterruptedException {
		Commons.waitFor(500);
		String roleNameSpan = driver.findElement(By.xpath(prop.getProperty("editManageRoleNameOfRole"))).getAttribute("value");
		Assert.assertEquals(roleNameSpan, readExcelData.getCellDataWithRowColAndSheetName(0, 0, "HRCreateRolePage"));
	}
}