package PomClass;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		@FindBy(xpath="//input[@name='user_name']")
		private WebElement username;
		
		@FindBy(xpath="//input[@name='user_password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@id='submitButton']")
		private WebElement loginbutton;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}
		/**
		 * this is a business libraries to perform login operation to the application
		 * @param user name
		 * @param password
		 */
		public void loginToApplication(String username,String password){
			getUsername().sendKeys("admin");
			getPassword().sendKeys("admin");
			getLoginbutton().click();
			
		}

	}


