package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import carAccessories.first.Checker;
import carAccessories.first.Customer;
import carAccessories.first.installation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;

public class C_requestInstallation {

	
	boolean flag;
	Customer c=new Customer("new4@gmail.com","123123","sss","111","Jerusalem");
	Customer c2=new Customer("new7@gmail.com","123123","sss","111","Jerusalem");

@Given("the customer wants to request an installation")
public void the_customer_wants_to_request_an_installation() {
   flag=false;
}

@When("the customer sets model {string} And datetime {string} And product {string}")
public void the_customer_sets_model_and_datetime_and_product(String model, String date, String product) {
   Checker.testAdd();
   flag=c.AddRequest(model, date, product);
}

@Then("Requested successfully")
public void requested_successfully() {
    // Write code here that turns the phrase above into concrete actions
  assertTrue(flag);
  System.out.println("======= the installations for "+c2.Email+" ========");
  
  for(installation inst: c2.searchMyInst()) {
	  System.out.println(inst);
  }
  
}

@Then("Request failed")
public void request_failed() {
    // Write code here that turns the phrase above into concrete actions
 
	assertFalse(flag);
	
}
}
