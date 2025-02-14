package Practice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import GenericUtility.PropertiesUtility;
import PomClass.LoginPage;

	public class PracticePOMClassLogin {
	   public static void main(String[] args) throws Exception {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   PropertiesUtility pUtil = new PropertiesUtility();
		   String URL = pUtil.getDataFromPropertiesFile("url");
		   driver.get(URL);
		   String UN = pUtil.getDataFromPropertiesFile("username");
		   String PWD = pUtil.getDataFromPropertiesFile("password");
		   LoginPage lp = new LoginPage(driver);
		   lp.loginToApplication(UN, PWD);
	   
	  }
	}

