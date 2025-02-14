package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import PomClass.HomePage;
import PomClass.LoginPage;


	public class BaseClass {
		public WebDriver driver;
		public static WebDriver sDriver;     //used only in listeners
		public ExcelUtility eUtil = new ExcelUtility();
		public PropertiesUtility putil=new PropertiesUtility();
		public SeleniumUtility sutil=new SeleniumUtility();
		
		@BeforeSuite(alwaysRun = true)
		public void DBconnection() {
			System.out.println("database connection is sucessful");
		}
		
		@Parameters("browser")
		@BeforeClass(alwaysRun = true)
		public void launchBrowser(@Optional("chrome") String BROWSER) throws Exception {
		   if(BROWSER.equals("chrome")) 
		   {
			   driver = new ChromeDriver();
		   }
		   else if(BROWSER.equals("edge"))
		   {
			   driver = new EdgeDriver();
		   }
		   else
		   {
			   driver = new ChromeDriver();
		   }
		    sDriver=driver;     // initializing static driver with actual driver 
			sutil.maximizeWindow(driver);
			sutil.implicitWait(driver,10);
			String url=putil.getDataFromPropertiesFile("url");
			sutil.accessToApplication(driver, url);
			System.out.println("Browser launched Successfully");
		}
		@BeforeMethod(alwaysRun = true)
		public void LoginOperation() throws Exception {
			String UN=putil.getDataFromPropertiesFile("username");
			String PWD=putil.getDataFromPropertiesFile("password");
			LoginPage lop=new LoginPage(driver);
			lop.loginToApplication(UN, PWD);
			System.out.println("Login done Successfully");
		}
		@AfterMethod(alwaysRun = true)
		public void LogoutOperation() {
				HomePage hp=new HomePage(driver);
				hp.signOutOperation(driver);
			}
		@AfterClass(alwaysRun = true)
		public void ClosingBrowser() {
				driver.quit();
			}
		@AfterSuite(alwaysRun = true)
		public void DBconnectionClosed() {
			
				System.out.println("database connection is closed");

		}

	}
	


