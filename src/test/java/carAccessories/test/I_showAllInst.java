package carAccessories.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import carAccessories.first.Initialing;
import carAccessories.first.Installation;
import carAccessories.first.Installer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_showAllInst {
	Installer i =new Installer("","");
	String out1="",out2="";
	Installation b1,b2,b3;
	@Given("i want to show all my Inst")
	public void i_want_to_show_all_my_inst() {
	    Initialing.initialInstallation();
	    b1=new Installation("Skoda","2023-01-01 12:30","Car Alarms","new7@gmail.com");
		 b2=new Installation("mazda","2024-01-02 20:00","In-Car DVD Players","new7@gmail.com");
		 b3=new Installation("kia sorento","2023-12-22 20:00","Car Audio Systems","new@gmail.com"); 
		
	}

	@When("call show all installations")
	public void call_show_all_installations() {
	  out1=i.showAllInstallations();
		  out2="0" + ": " +b1+"\n"+"1" + ": " +b3+"\n"+"2" + ": " +b2+"\n";
	  
	  
	}

	@Then("print all installations")
	public void print_all_installations() {
	   assertEquals(out1,out2);
	}
}
