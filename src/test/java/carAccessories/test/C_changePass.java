package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C_changePass {
	boolean flag;
	Customer c=new Customer("new4@gmail.com","123123","before","111","Jerusalem");
	@Given("want to change my pass")
	public void want_to_change_my_pass() {
	    flag=false;
	    System.out.println("Testing pass");
	}

	@When("set oldPass {string} And newPass {string}")
	public void set_old_pass_and_new_pass(String oldPass, String newPass) {
	  System.out.println("email: "+c.Email+" oldPass: "+c.Password);
	  flag=c.changeMyPass(oldPass, newPass);
	  System.out.println("email: "+c.Email+" newPass: "+c.Password);

	}

	@Then("Sucessfully myPass Changed")
	public void sucessfully_my_pass_changed() {
	   assertTrue(flag);
	}

	@Then("Changing myPass failed")
	public void changing_my_pass_failed() {
assertFalse(flag);
}
}
