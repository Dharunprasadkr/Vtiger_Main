package PomClass;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
	  @FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	  private WebElement leadsMenu;
	  
	  @FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Contacts']")
	  private WebElement contactsMenu;
	  
	  @FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	  private WebElement accountsIcon;
	  
	  @FindBy(xpath="//a[text()='Sign Out']")
	  private WebElement signOutOption;
	  
	  public HomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public WebElement getLeadsMenu()
	  {
		  return leadsMenu;
	  }
	  
	  public WebElement getContactsMenu()
	  {
		  return contactsMenu;
	  }
	  
	  public WebElement getAccountsIcon()
	  {
		  return accountsIcon;
	  }
	  
	  public WebElement getSignOutOption()
	  {
		  return signOutOption;
	  }
	  
	  /**
	   * this is a business library to click on leads menu in Home Page
	   */
	  public void clickOnLeadsMenu()
	  {
		  getLeadsMenu().click();
	  }
	  
	  /**
	   * this is a business library to click on contacts menu in Home Page
	   */
	  public void clickOnContactsMenu()
	  {
		  getContactsMenu().click();
	  }
	  /**
	   * this is a business library to perform the sign out operation in application 
	   */
	  public void signOutOperation(WebDriver driver)
	    {
		 Actions act = new Actions(driver);
		 act.moveToElement(getAccountsIcon()).perform();
		 getSignOutOption().click();
	    }
	  }


