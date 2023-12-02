package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteproduct {
	boolean flag;
	
	Admin a=new Admin("","");

	@Given("Admin wants to delete a product")
	public void wants_to_delete_a_product() {
	    // Write code here that turns the phrase above into concrete actions
		 flag=false;
		   Initialing.initialProductsAndCategories();
	}

	@When("set index {int}")
	public void sets_index(Integer int1) {
		
	    // Write code here that turns the phrase above into concrete actions
	  if((int1>0)&&(int1<(Initialing.productsLL.size()+1))){
		  flag=a.delpro(int1);
		  
	  }
	}
	
	@Then("successfuly deleted")
	public void successfuly_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(flag);
	}

	@Then("failed")
	public void failed() {
	    // Write code here that turns the phrase above into concrete actions
		  assertFalse(flag);
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
