package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import GenericUtility.SeleniumUtility;
import PomClass.CreatingNewLeadpage;
import PomClass.HomePage;
import PomClass.LeadsPage;
import PomClass.LoginPage;

	public class TC_001Practice {
	    @Test
		public void tc_001() throws Exception 
		{   
	    	//to open the chrome browser and maximization.
			WebDriver driver = new ChromeDriver();
			SeleniumUtility sUtil = new SeleniumUtility();
			sUtil.maximizeWindow(driver);
			sUtil.implicitWait(driver, 15);
			
			//for login in vtiger
			PropertiesUtility pUtil = new PropertiesUtility();
			String URL = pUtil.getDataFromPropertiesFile("url");
			String UN = pUtil.getDataFromPropertiesFile("username");
			String PWD = pUtil.getDataFromPropertiesFile("password");
			sUtil.accessToApplication(driver, URL);
			
			LoginPage lop = new LoginPage(driver);
			lop.loginToApplication(UN, PWD);
			
			//to click on leads page
			HomePage hp = new HomePage(driver);
			hp.clickOnLeadsMenu();
			//to click on plus icon
			LeadsPage lp=new LeadsPage(driver);
			lp.ClickOnCreateLeads();
			
			//to get the data from excel file
			ExcelUtility eUtil = new ExcelUtility();
			String lName = eUtil.getDataFromExcel("leads", 2, 1);
			String company = eUtil.getDataFromExcel("leads", 2, 2);
			CreatingNewLeadpage cnlp = new CreatingNewLeadpage(driver);
			cnlp.CreateNewLead(lName, company);
			
			hp.signOutOperation(driver);
			driver.quit();
		}
	}


