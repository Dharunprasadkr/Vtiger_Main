package TestCaseRepo;

import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import PomClass.CreatingNewLeadpage;
import PomClass.HomePage;
import PomClass.LeadsPage;

	public class TC_001 extends BaseClass{
		  @Test(groups = {"smoke", "Regression"})
	      public void leads_001() throws Exception
	      {
	    	  System.out.println("Text Execution Started");
	    	  HomePage hp = new HomePage(driver);
	    	  hp.clickOnLeadsMenu();
	    	  
	    	  LeadsPage lp = new LeadsPage(driver);
	    	  lp.ClickOnCreateLeads();
	    	  
	    	  String lastName = eUtil.getDataFromExcel("leads", 2, 1);
	    	  String company = eUtil.getDataFromExcel("leads", 2, 2);
	    	  CreatingNewLeadpage cnlp = new CreatingNewLeadpage(driver);
	    	  cnlp.CreateNewLead(lastName, company);
	    	  System.out.println("Test Execution ended");
	      }
	}









