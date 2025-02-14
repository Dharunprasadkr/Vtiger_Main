package TestCaseRepo;

	import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.ContactsPage;
import PomClass.CreatingNewContactPage;
import PomClass.HomePage;


	public class TC_006 extends BaseClass {
		@Test(groups = {"Smoke", "Sanity"})
	   public void CreatingNewContactPage_003() throws Exception
	   {
		   System.out.println("Text Execution Started");
			HomePage hp = new HomePage(driver);
			hp.clickOnContactsMenu();

			ContactsPage cp = new ContactsPage(driver);
			cp.ClickOnCreateContacts();
			
			String fName = eUtil.getDataFromExcel("contacts", 8, 1);
			String lName = eUtil.getDataFromExcel("contacts", 8, 2);
			String title = eUtil.getDataFromExcel("contacts", 8, 3);
		    String email = eUtil.getDataFromExcel("contacts", 8, 4);
		    String mCity = eUtil.getDataFromExcel("contacts", 8, 4);
		    String mState = eUtil.getDataFromExcel("contacts", 8, 4);
		    CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		    cncp.CreateNewContact(fName, lName, title, email, mCity, mState);
	   }
	}



