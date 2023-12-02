package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_editProdTesting {
	boolean f1,f2,f3;
	Admin a=new Admin("","");
	@Given("want to edit a prod")
	public void want_to_edit_a_prod() {
	  Initialing.initialProductsAndCategories();
	  f1=false;
	}

	@When("set index {int} And url {string}")
	public void set_index_and_url(Integer int1, String string) {
		if((int1>0)&&(int1<(Initialing.productsLL.size()+1))) {
	    f1=a.editurl(int1, string);}
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

	@When("set index {int} And price {int}")
	public void set_index_and_price(Integer int1, Integer int2) {
		if((int1>0)&&(int1<(Initialing.productsLL.size()+1))) {
    f2=a.editPrice( int1,int2);
}}
	@Then("Successfully price Changed")
	public void successfully_price_changed() {
	    assertTrue(f2);
	}

	@Then("failed price Changed")
	public void failed_price_changed() {
	 assertFalse(f2);
	}

	
	@Given("want to edit a prod availabiltiy")
	public void want_to_edit_a_prod_availabiltiy() {
	    // Write code here that turns the phrase above into concrete actions
		Initialing.initialProductsAndCategories();
		  f3=false;
	}

@When("set index {int} and availabiltiy to false")
public void set_index_and_availabiltiy_to_false(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	if((int1>0)&&(int1<(Initialing.productsLL.size()+1))) {
	    f3=a.editavi(int1);
	}
}
	
	@When("set index {int} and availabiltiy to true")
	public void set_index_and_availabiltiy_to_true(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		if((int1>0)&&(int1<(Initialing.productsLL.size()+1))) {
			f3=a.editavi(int1);
		}
	}

	@Then("success availabiltiy Change")
	public void success_availabiltiy_change() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(f3);
	}

	@Then("failed availabiltiy Change")
	public void failed_availabiltiy_change() {
	    // Write code here that turns the phrase above into concrete actions
	  assertFalse(f3);
	}
}
