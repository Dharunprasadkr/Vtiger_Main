package TestCaseRepo;


	import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomClass.ContactsPage;
import PomClass.CreatingNewContactPage;
import PomClass.HomePage;

	public class TC_005 extends BaseClass {
		@Test(groups = "Smoke")
	    public void CreatingNewContactPage_002() throws Exception
	    {
	    	System.out.println("Text Execution Started");
			HomePage hp = new HomePage(driver);
			hp.clickOnContactsMenu();

			ContactsPage cp = new ContactsPage(driver);
			cp.ClickOnCreateContacts();
			
			String fName = eUtil.getDataFromExcel("contacts", 5, 1);
			String lName = eUtil.getDataFromExcel("contacts", 5, 2);
			String title = eUtil.getDataFromExcel("contacts", 5, 3);
		    String email = eUtil.getDataFromExcel("contacts", 5, 4);
		    CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		    cncp.CreateNewContact(fName, lName, title, email);
		    System.out.println("test execution ended");
	    }
	}



