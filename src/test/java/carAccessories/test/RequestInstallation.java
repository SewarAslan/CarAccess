package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import carAccessories.first.Checker;
import carAccessories.first.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;

public class RequestInstallation {

	
	boolean Flag;
	
	private static final boolean False = false;
	private static final boolean True = true;

@Given("the customer wants to request an installation")
public void the_customer_wants_to_request_an_installation() {
    // Write code here that turns the phrase above into concrete actions
   Flag=False;
}

@When("the customer sets a datetime {string}")
public void the_customer_sets_a_datetime(String string) {
    // Write code here that turns the phrase above into concrete actions
  Checker.ReqAdd();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime dateTime = LocalDateTime.parse(string, formatter);
  if(Customer.AddRequest(null, dateTime, null)&&!string.isBlank()) {
	  Flag=True;
  }else Flag=False;
 
}
  
  
  

@When("the customer sets a car model {string}")
public void the_customer_sets_a_car_model(String string) {
    // Write code here that turns the phrase above into concrete actions
	if(string.isBlank()) {
		  Flag=False;} else Flag=True; 
}

@When("the customer sets a product {string}")
public void the_customer_sets_a_product(String string) {
    // Write code here that turns the phrase above into concrete actions
	if(string.isBlank()) {
  Flag=False;} else Flag=True;
}


@Then("Requested successfully")
public void requested_successfully() {
    // Write code here that turns the phrase above into concrete actions
  assertTrue(Flag);
}

@Then("Request failed")
public void request_failed() {
    // Write code here that turns the phrase above into concrete actions
 
	assertFalse(Flag);
	
}
}
