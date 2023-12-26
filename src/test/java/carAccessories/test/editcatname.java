package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editcatname {
	
	boolean f;
	Admin a=new Admin("","");
	
	@Given("Admin wants to edit categorie name")
	public void admin_wants_to_edit_categorie_name() {
	    // Write code here that turns the phrase above into concrete actions
		Initialing.initialProductsAndCategories();
		
        f=false;
	}

	@When("set index {int} and categorie name to {string}")
	public void set_index_and_categorie_name_to(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	   if((int1>0)&&(int1<(Initialing.categoriesLL.size()+1))) {
		f=a.editcatname(int1, string);
		
	   }
	   System.out.print(Initialing.categoriesLL.get(int1).toString());
	}

	@Then("Success Changed")
	public void success_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(f);
	}

	@Then("failed Changed")
	public void failed_changed() {
	    // Write code here that turns the phrase above into concrete actions
	 assertFalse(f);
	}
}
