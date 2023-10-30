package carAccessories.test;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Checker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_changePassTesting {
   boolean flag;
   Admin b=new Admin("ss","dd");
   
	@Given("want to change a user pass")
	public void want_to_change_a_user_pass() {
	    flag=false;
	}

	@When("set Email {string} And newPass {string}")
	public void set_email_and_new_pass(String email, String newPass) {
	   Checker.testAdd();
	   flag=b.changePass(email, newPass);
	}

	@Then("Sucessfully Pass Changed")
	public void sucessfully_pass_changed() {
	    assertTrue(flag);
	}

	@Then("Changing Pass failed")
	public void changing_pass_failed() {
		assertFalse(flag);
	}
}
