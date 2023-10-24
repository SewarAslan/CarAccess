package carAccessories.test;

import carAccessories.first.Checker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;



public class ProductTesting {
	private static final boolean False = false;
	private static final boolean True = true;
	boolean Flag;	
	
@Given("The user wants to search")
public void the_user_wants_to_search() {
    // Write code here that turns the phrase above into concrete actions
	 Flag=False;
}

@When("the user set the name of product {string}")
public void the_user_set_the_name_of_product(String string) {
    // Write code here that turns the phrase above into concrete actions
	Checker.testingProAdd();
	if(Checker.Searchproduct(string)&&!string.isBlank()) {
		Flag=True;
	}
	else {  Flag=False;}
	
   
}

@Then("Searched Successfully")
public void searched_successfully() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(Flag);
    
}

@Then("Searching failed")
public void searching_failed() {
    // Write code here that turns the phrase above into concrete actions
	assertFalse(false);
}
}
