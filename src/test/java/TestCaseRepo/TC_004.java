package TestCaseRepo;


	import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.ContactsPage;
import PomClass.CreatingNewContactPage;
import PomClass.HomePage;


	public class TC_004 extends BaseClass{
	    @Test(groups = {"Regression"})
		public void Contacts_001() throws Exception
		{
			System.out.println("Text Execution Started");
			HomePage hp = new HomePage(driver);
			hp.clickOnContactsMenu();

			ContactsPage cp = new ContactsPage(driver);
			cp.ClickOnCreateContacts();

			String fName = eUtil.getDataFromExcel("contacts", 2, 1);
			String lName = eUtil.getDataFromExcel("contacts", 2, 2);
			String leadsourcee = eUtil.getDataFromExcel("contacts", 2, 3);
			CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
			cncp.CreateNewContact(fName, lName, leadsourcee);
			System.out.println("Test Execution ended");
		}
	}


