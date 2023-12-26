package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import carAccessories.first.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class A_changingDataTesting {
	
	boolean flagA;
	boolean flagC;
	Admin a=new Admin("ss","ss");
	Customer c=new Customer("new4@gmail.com","123123","before","111","Jerusalem");

	@Given("want to change a user data")
	public void want_to_change_a_user_data() {
	    Initialing.initialAccountsLL();
	   flagA=false;
	   flagC=false;
	   
	   

	}

	@When("set Email {string} And Name {string} And Phone {string} And Address {string}")
	public void set_email_and_name_and_phone_and_address(String email, String name, String phone, String address) {
	  flagA=a.changeData(email, name, phone, address);
	  flagC=c.changeMyData( name, phone, address);

	}

	@Then("Successfully Conn Changed")
	public void successfully_conn_changed() {
	    assertTrue(flagA&&flagC);
	}

	@Then("Changing Conn failed")
	public void changing_conn_failed() {
	   assertFalse(flagA&&flagC);
	}
}
