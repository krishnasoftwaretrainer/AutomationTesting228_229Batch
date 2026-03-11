package testClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pom.Swag_Locters_Methods_BY;
import pom.Swag_Locters_Methods_FindBy;
import utilities.ExcelUitilities;

public class TestRunnerClass extends BaseClass {
	
	@DataProvider(name = "loginData")
	public Object[][] getData() throws Exception {

		return ExcelUitilities.readExcelData("D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\SwagLoginTestData.xlsx",
				"Sheet1");
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String userName, String password) {

		//Swag_Locters_Methods_BY lp = new Swag_Locters_Methods_BY(driver);
		//lp.SwagLogin(userName, password);
		Swag_Locters_Methods_FindBy lp = new Swag_Locters_Methods_FindBy(driver);
		lp.login(userName, password);
		
	}

}
