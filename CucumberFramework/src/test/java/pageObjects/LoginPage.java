package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage
{
		public WebDriver driver;
		
		public LoginPage(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(this.driver, this);
	        
	    }
		 
		
		@FindBy(id = "username")
		@CacheLookup
		WebElement usernameField;
		
		@FindBy(id = "password")
		@CacheLookup
		WebElement passwordField;
		
		@FindBy(id = "Login")
		@CacheLookup
		WebElement loginButton;
		
		
		public String getPageTitle()
		{
			return driver.getTitle();
		
		}
	
		
		public void setUsername(String username) 
	    {
			usernameField.sendKeys(username);
	    }
		
		public void setPassword(String password) 
	    {
			passwordField.sendKeys(password);
	    }
		
		   public void clickLogin() 
		    {
		        loginButton.click();
		    }
		    
		   public void salesforceHomePage() 
			{
			 
			   
			}
		
		
	}

