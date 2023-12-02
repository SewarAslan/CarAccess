package carAccessories.test;

import org.junit.Test;

import carAccessories.first.EmailSender;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailSenderTest {
	@Given("all data needed")
	public void all_data_needed() {
	   
	}
String s="",ss="",sss="";
	@When("put email {string} And Sub {string} And Msg {string}")
	public void put_email_and_sub_and_msg(String string, String string2, String string3) {
		 EmailSender.sendEmail(string, string2, string3);
		 
	}

	}

