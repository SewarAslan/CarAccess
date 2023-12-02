package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletecateg {
	
	boolean f;
	Admin a=new Admin("","");
	
	@Given("Admin wants to delete a categorie")
	public void admin_wants_to_delete_a_categorie() {
	    // Write code here that turns the phrase above into concrete actions
		Initialing.initialProductsAndCategories();
        f=false;
	}

	@When("set categorie index {int}")
	public void set_categorie_index(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		if((int1>0)&&(int1<(Initialing.CategoriesLL.size()+1))) {
			
			f=a.deletecateg(int1);
		}
	}

	@Then("successfuly_deleted")
	public void successfuly_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	  assertTrue(f);
	}

	@Then("failed_")
	public void failed() {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(f);
	}

}
