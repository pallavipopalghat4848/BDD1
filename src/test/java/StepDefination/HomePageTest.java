package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageTest extends BaseClass {
	protected static HomePage homepage;
	
	
	
	@Then("Verify home page Title")
	public void verify_home_page_title() {
	 homepage= new HomePage();
	 homepage.captureHomePageTitle();
	
	}

	@Then("Verify Home Page Logo")
	public void verify_home_page_logo() {
	homepage.checkHomePageLogo();
	}

	@Then("Verify Home Page Url")
	public void verify_home_page_url() {
	homepage.captureHomePageUrl();
	}

}
