package Practice;


	import java.io.FileInputStream;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FetchingPropertiesdata 
	{
	 public static void main(String[] args) throws Exception 
	  {
			
			WebDriver driver=new ChromeDriver();
	      //C:\Users\SOUMYA\OneDrive\Desktop\sample.properties
			FileInputStream fis=new FileInputStream("C:\\Users\\SOUMYA\\OneDrive\\Desktop\\sample.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String URL=prop.getProperty("url");
			driver.get(URL);
	   }
	}


