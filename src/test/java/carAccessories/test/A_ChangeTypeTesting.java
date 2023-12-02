package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class A_ChangeTypeTesting {
Admin a=new Admin("sss","123");
	boolean flag;
	
	@Given("Start Point")
	public void start_point() {
		flag=false;
	    Initialing.initialAccountsLL();
	}

	@When("set Email {string} And newType {int}")
	public void set_email_and_new_type(String email, int newType) {
    flag=a.changeType(email, newType);
	}


 
	@Then("Sucessfully Type Changed")
	public void sucessfully_changed() {
		assertTrue(flag);
	  
	}

	@Then("Changing Type failed")
	public void changing_failed() {
		assertFalse(flag);
	}

}
