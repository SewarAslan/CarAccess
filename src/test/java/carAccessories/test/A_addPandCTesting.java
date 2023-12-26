package carAccessories.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import carAccessories.first.Admin;
import carAccessories.first.Initialing;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_addPandCTesting {
	boolean flag;
	Admin a=new Admin("","");
	@Given("want to add a  prod")
	public void want_to_add_a_prod() {
	flag=false;
	Initialing.initialProductsAndCategories();
	}

	@When("set Productname {string} And Type {string} And price {int} And avil to {string} And needInst to {string}")
	public void set_productname_and_type_and_price_and_avil_to_and_need_inst_to(String desc, String type, Integer price, String avi, String needIN) {
		boolean B1=Boolean.parseBoolean(avi);
		boolean B2=Boolean.parseBoolean(needIN);
		flag=a.addProd(desc,"",price, B1,type, B2);
	}
	
	
	@Then("adding prod failed")
	public void adding_prod_failed() {
	  assertFalse(flag);
	}

	@Then("adding prod success")
	public void adding_prod_success() {
	    assertTrue(flag); 
	}

	@Given("want to add a  Cate")
	public void want_to_add_a_cate() {
	    Initialing.initialProductsAndCategories();
        flag=false;
	}

	@When("set name Catetname {string}")
	public void set_name_catetname(String string) {
		flag=a.addCate(string);
	    
	}

	@Then("adding Cate failed")
	public void adding_cate_failed() {
	   assertFalse(flag);
	}

	@Then("adding Cate success")
	public void adding_cate_success() {
	  assertTrue(flag);
	}
}
