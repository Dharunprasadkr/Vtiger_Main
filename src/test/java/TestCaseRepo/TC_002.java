package TestCaseRepo;

	import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.CreatingNewLeadpage;
import PomClass.HomePage;
import PomClass.LeadsPage;


	public class TC_002 extends BaseClass {

		@Test(groups = {"Regression"})
	    public void CreatNewLeadpaage_002() throws Exception
	    {
	      System.out.println("Text Execution Started");
	  	  HomePage hp = new HomePage(driver);
	  	  hp.clickOnLeadsMenu();
	  	  
	  	  LeadsPage lp = new LeadsPage(driver);
		  lp.ClickOnCreateLeads();
	  	  
		  String fName = eUtil.getDataFromExcel("leads", 5, 1);
		  String lName = eUtil.getDataFromExcel("leads", 5, 2);
		  String company = eUtil.getDataFromExcel("leads", 5, 3);
		  String phone = eUtil.getDataFromExcel("leads", 5, 4);
		  String website = eUtil.getDataFromExcel("leads", 5, 5);
		  CreatingNewLeadpage cnlp = new CreatingNewLeadpage(driver);
		  cnlp.CreateNewLead(fName, lName, company, phone, website);
		  System.out.println("Test Execution ended");
	    }
	}



