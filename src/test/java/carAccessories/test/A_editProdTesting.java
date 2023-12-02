package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_editProdTesting {
	boolean f1,f2;
	Admin a=new Admin("","");
	@Given("want to edit a prod")
	public void want_to_edit_a_prod() {
	  Initialing.initialProductsAndCategories();
	  f1=false;
	}

	@When("set desc {string} And url {string}")
	public void set_desc_and_url(String string, String string2) {
	    f1=a.editurl(string, string2);
	}

	@Then("Successfully Changed")
	public void successfully_changed() {
	    assertTrue(f1);
	}

	@Then("failed  Changed")
	public void failed_changed() {
		assertFalse(f1);
	}

	@Given("want to edit a prod price")
	public void want_to_edit_a_prod_price() {
	    // Write code here that turns the phrase above into concrete actions
		Initialing.initialProductsAndCategories();
		  f2=false;
	}

@When("set desc  {string} And price {int}")
public void set_desc_and_price(String string, Integer int1) {
    f2=a.editPrice(string, int1);
}
	@Then("Successfully price Changed")
	public void successfully_price_changed() {
	    assertTrue(f2);
	}

	@Then("failed price Changed")
	public void failed_price_changed() {
	 assertFalse(f2);
	}

}
