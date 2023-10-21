package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Checker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signupTesting {

	boolean sf;
	@Given("I am in the sign-up page")
	public void i_am_in_the_sign_up_page() {
	    sf=false;
	}

	@When("set Email {string} and Password {string}")
	public void set_email_and_password(String email, String password) {
		Checker.testAdd();
    if(email.contains("@")&&email.contains(".com")&&!email.isBlank()&&!password.isBlank()&&!Checker.checkUser(email, password)) {
    	sf=true;
    }
    else sf=false;
	}
	
	@Then("I signed up sucessfully")
	public void i_signed_up_sucessfully() {
	    assertTrue(sf);
	}

	@Then("I couldn't sign up")
	public void i_couldn_t_sign_up() {
        assertFalse(sf);
}
}
