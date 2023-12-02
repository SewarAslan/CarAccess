package carAccessories.test;

import carAccessories.first.Initialing;
import carAccessories.first.Customer;
import carAccessories.first.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;

import static org.junit.Assert.*;


public class P_DescSearchTesting {

	boolean flag;	
	
@Given("The user wants to search")
public void the_user_wants_to_search() {
	 flag=false;
	 Initialing.initialProductsAndCategories();
		System.out.println("===== ProducDescSearch Testing====");

}

@When("the user set the name of product {string}")
public void the_user_set_the_name_of_product(String string) {
	Customer c=new Customer();
	flag=c.Searchproduct(string);
	for(Product prod : Initialing.SimilarproductsLL) {
		String desc=prod.description;
		System.out.println(desc);
	}
	System.out.println("flag="+flag);

}

@Then("Searched Successfully")
public void searched_successfully() {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(flag);
    
}

@Then("Searching failed")
public void searching_failed() {	assertFalse(flag);
}
}
