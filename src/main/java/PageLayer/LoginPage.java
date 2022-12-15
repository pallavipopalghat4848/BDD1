package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

@FindBy(name="email")   
	
	private WebElement username;
	
	@FindBy (name="password")				
	
	private WebElement password;		
	
	@FindBy (xpath="//div[text()='Login']")
	
	private WebElement loginButton;
	
	
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void typeUsername(String value) {
			UtilsClass.enterValue(username, value);
		}
		
		
		public void typePassword(String pass) {
			UtilsClass.enterValue(password, pass);
		}	
		
		public void clickOnLoginButton() {
			UtilsClass.clickOnButton(loginButton);
		}
		
		
	
	
}
