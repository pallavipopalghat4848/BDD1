package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactPageTest extends BaseClass {
	protected static ContactPage contact;
	
	@Given("user is on Contact Page")
	public void user_is_on_contact_page() {
	 contact= new ContactPage();
	 contact.clickOnContactPage();
	contact.captureContactPageUrl();
	}

	@Then("create new contact")
	public void create_new_contact() {
	contact.clickonCreatebutton();
	}

	@Then("enter first and Last Name")
	public void enter_first_and_last_name() {
	contact.enterFirstName("akash");
	contact.enterLastName("patil");
	}

	@Then("save the contact")
	public void save_the_contact() {
	   contact.clickOnSaveButton();
	}

}
