package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;
import PomClass.ContactsPage;
import PomClass.CreatingNewContactPage;
import PomClass.HomePage;
import PomClass.LoginPage;
	public class ExperimentOnVtiger {
		public static void main(String[] args) throws Exception {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			PropertiesUtility pro=new PropertiesUtility();
			driver.get(pro.getDataFromPropertiesFile("url"));
			LoginPage login=new LoginPage(driver);
			login.loginToApplication(pro.getDataFromPropertiesFile("username"), pro.getDataFromPropertiesFile("password"));
			if(driver.findElement(By.xpath("//a[@class='hdrLink']")).isDisplayed()) {
				System.out.println("home page is displayed");
			}
			else {
				System.out.println("home page is not displayed");
			}
			/**
			 * this code is responsible for click to create  contact page
			 */
			HomePage homepage=new HomePage(driver);
			homepage.clickOnContactsMenu();
			CreatingNewContactPage cncp=new CreatingNewContactPage(driver);
			
			ContactsPage contactpage=new ContactsPage(driver);
			contactpage.ClickOnCreateContacts();
			
			ExcelUtility excel = new ExcelUtility();
			/**
			 * fetching the data for test case 1 for creating leads  from excel
			 */
			String firstname=excel.getDataFromExcel("contact", 1, 1);
			String lastname=excel.getDataFromExcel("contact", 1, 2);
			String leadsorce=excel.getDataFromExcel("contact", 1, 3);
			cncp.CreateNewContact(firstname,lastname,leadsorce);
			/**
			 * fetching the data for test case 2 for creating leads  from excel
			 */
//			String firstname=excel.getDataFromExcel("contact", 4, 1);
//			String lastname=excel.getDataFromExcel("contact", 4, 2);
//			String title=excel.getDataFromExcel("contact", 4, 3);
//			String email=excel.getDataFromExcel("contact", 4, 4);
//			cncp.CreateNewContact(firstname, lastname  , title, email);
			/**
			 * fetching the data for test case 3 for creating leads  from excel
			 */
//			String firstname=excel.getDataFromExcel("contact", 7, 1);
//			String lastname=excel.getDataFromExcel("contact", 7, 2);
//			String title=excel.getDataFromExcel("contact", 7, 3);
//			String email=excel.getDataFromExcel("contact", 7, 4);
//			String city=excel.getDataFromExcel("contact", 7, 5);
//			String state=excel.getDataFromExcel("contact", 7, 6);
//			cncp.CreateNewContact(firstname, lastname, title, email, city, state);

			/**
			 * here we are click on create on new lead 
			 */
//			homepage.ClickOnLeads();
//			LeadsPage lp=new LeadsPage(driver);
//			lp.ClickOnCreateLeads();
//			CreatingNewLeadpage cnlp=new CreatingNewLeadpage(driver);
//			
			/**
			 * fetching the data for test case 1 for creating leads  from excel
			 */
//			String llastname=excel.getDataFromExcel("leads", 1, 1);
//			String lcompany=excel.getDataFromExcel("leads", 1, 2);
//			cnlp.CreateNewLead(llastname, lcompany);
			/**
			 * fetching the data for test case 2 for creating leads  from excel
			 */
//			String lfirstname=excel.getDataFromExcel("leads", 4, 1);
//			String llastname=excel.getDataFromExcel("leads", 4, 2);
//			String lphone=excel.getDataFromExcel("leads", 4, 3);
//			String lwebsite=excel.getDataFromExcel("leads", 4, 4);
//			cnlp.CreateNewLead(lfirstname, llastname, lphone, lwebsite);
			/**
			 * fetching the data for test case 3 for creating leads  from excel 
			 */
//			String lfirstname=excel.getDataFromExcel("leads", 7, 1);
//			String llastname=excel.getDataFromExcel("leads", 7, 2);
//			String lphone=excel.getDataFromExcel("leads", 7, 3);
//			String lwebsite=excel.getDataFromExcel("leads", 7, 4);
//			String lnoe=excel.getDataFromExcel("leads", 7, 5);
//			String lcountry=excel.getDataFromExcel("leads", 7, 6);
//			String lcity=excel.getDataFromExcel("leads", 7, 7);
//			String lstate=excel.getDataFromExcel("leads", 7, 8);
//			cnlp.CreateNewLead(lfirstname, llastname, lphone, lwebsite, lnoe, lcountry, lcity, lstate);
			/**
			 * this is responsible for sign out the vtiger application
			 */
			//homepage.SignOut(driver);
	  }
	}



