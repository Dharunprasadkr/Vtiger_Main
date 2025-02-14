package TestCaseRepo;


	import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.CreatingNewLeadpage;
import PomClass.HomePage;
import PomClass.LeadsPage;


	public class TC_003 extends BaseClass {

		@Test(groups= {""})
		public void CreatNewLeadpaage_003() throws Exception
		{
			System.out.println("Text Execution Started");
			HomePage hp = new HomePage(driver);
			hp.clickOnLeadsMenu();

			LeadsPage lp = new LeadsPage(driver);
			lp.ClickOnCreateLeads();

			String fName = eUtil.getDataFromExcel("leads", 8, 1);
			String lName = eUtil.getDataFromExcel("leads", 8, 2);
			String company = eUtil.getDataFromExcel("leads", 8, 3);
			String phone = eUtil.getDataFromExcel("leads", 8, 4);
			String website = eUtil.getDataFromExcel("leads", 8, 5);
			String numofemp = eUtil.getDataFromExcel("leads", 8, 6);
			String country = eUtil.getDataFromExcel("leads", 8, 7);
			String city = eUtil.getDataFromExcel("leads", 8, 8);
			String state = eUtil.getDataFromExcel("leads", 8, 9);
			CreatingNewLeadpage cnlp = new CreatingNewLeadpage(driver);
			cnlp.CreateNewLead(fName, lName, company, phone, website, numofemp, country, city, state);
			System.out.println("Test Execution ended");
		}
	}



