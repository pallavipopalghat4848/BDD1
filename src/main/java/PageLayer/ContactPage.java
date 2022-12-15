package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class ContactPage extends BaseClass {

	
	@FindBy(xpath="//span[text()='Contacts']")
		private	WebElement contactpage;
	
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	
	private WebElement createContact;
	
	@FindBy(xpath="//input[@name='first_name']")
	
	private WebElement firstName;
	
@FindBy(xpath="//input[@name='last_name']")
	
	private WebElement lastName;

@FindBy(xpath="(//input[@type='text'])[5")
private WebElement company;

@FindBy(xpath="//button[@class='ui linkedin button']")
private WebElement saveButton;

	public ContactPage()
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void clickOnContactPage() {
		UtilsClass.clickOnButton(contactpage);
	}
	
	public String captureContactPageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public  void clickonCreatebutton() {
		UtilsClass.clickOnButton(createContact);
		
	}
	
	public void enterFirstName(String fname)
	{
		UtilsClass.enterValue(firstName, fname);
	}

	public void enterLastName(String lname)
	{
		UtilsClass.enterValue(lastName, lname);
	}

	
	public void clickOnSaveButton() {
		UtilsClass.clickOnButton(saveButton);
	}
}





