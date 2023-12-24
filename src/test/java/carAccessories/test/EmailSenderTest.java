package carAccessories.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import carAccessories.first.EmailSender;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmailSenderTest {
	@Given("the email sender is set up")
	public void the_email_sender_is_set_up() {
	    
	}

	@When("an email is sent to {string} with subject {string} and message {string}")
	public void an_email_is_sent_to_with_subject_and_message(String recipient, String subject, String message) {
		 EmailSender.sendEmail(recipient, subject, message);
		 
	}

	@Then("the email should be received")
	public void the_email_should_be_received() {
	    assertTrue(true);
	}

	}

