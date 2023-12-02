package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class A_deleteUser {
	
	boolean flag;
	Admin a=new Admin("sss","111");
	
	@Given("wants to delete a user")
	public void wants_to_delete_a_user() {
	   flag=false;
	    Initialing.initialAccountsLL();
	}

	@When("set Email {string}")
	public void set_email(String email) {
	  flag=a.deleteUser(email);
	  
	}

	@Then("Sucessfully Deleted")
	public void sucessfully_deleted() {
	    assertTrue(flag);
	}

	@Then("Deletion failed")
	public void deletion_failed() {
	  assertFalse(flag);
	}

}
