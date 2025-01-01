package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Loginpage;

public class loginstep extends Base{
	WebDriver driver ;
	Loginpage login=new Loginpage();

	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
	  login.enter_valid_username_and_password();  
	}

	@And("click on login button")
	public void click_on_login_button() {
	   login.click_on_login_button();
	}

	@Then("user should login and navigate to homepage")
	public void user_should_login_and_navigate_to_homepage() {
	   login.user_should_login_and_navigate_to_homepage(); 
	}



}
