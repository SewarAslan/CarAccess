package carAccessories.test;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Checker;




public class A_changeEmailTesting {
	
	Admin a=new Admin("ss","");
	boolean flag;
	
	@Given("want to change a user Email")
	public void want_to_change_a_user_email() {
	    flag=false;
	}

	@When("set oldEmail {string} And newEmail {string}")
	public void set_old_email_and_new_email(String oldEmail, String newEmail) {
		Checker.testAdd();
	    flag=a.changeEmail(oldEmail, newEmail);
	}

	@Then("Sucessfully Email Changed")
	public void sucessfully_email_changed() {
	    assertTrue(flag);
	}

	@Then("Changing Email failed")
	public void changing_email_failed() {
	    assertFalse(flag);
	}

}
