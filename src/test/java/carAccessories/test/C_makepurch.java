package carAccessories.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Customer;
import carAccessories.first.Initialing;
import carAccessories.first.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C_makepurch {
	boolean flag;
	@Given("i want to make a purch")
	public void i_want_to_make_a_purch() {
	    flag=false;
	    Initialing.installationRequests.clear();
	}
Customer c=new Customer("","");
Product p=new Product("Seat Covers",25,true ,"","Interior",false);
Product p2=new Product("In-Car DVD Players",200,true ,"","Electronic",true);
int bef,aft;
	@When("set size {int}")
	public void set_size(Integer int1) {
		bef=c.myOrdersLL.size();
	   c.makePurch(p);
	   aft=c.myOrdersLL.size();
	   
	}

	@Then("the size will be {int}")
	public void the_size_will_be(Integer int1) {
if((aft-bef)==1) {assertTrue(true);}
	else assertTrue(false);
	}

	@When("set size date {string}")
	public void set_size_date(String string) {
		
	    flag=c.makePurch(p2);
	
	}

	@Then("wrong date")
	public void wrong_date() {
	    assertFalse(flag);
	}

	@Then("right date")
	public void right_date() {
assertTrue(flag);
}

}
