package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{

	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	 BaseClass.initialization();
	}

	@When("user Enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		LoginPage login= new LoginPage();
		login.typeUsername("prafulp1010@gmail.com");
		login.typePassword("Pr@ful0812");
		login.clickOnLoginButton();

	}
	@Then("user is on homepage")
	public void user_is_on_homepage() {
	  String a=  driver.getCurrentUrl();
	}
	

}
