package carAccessories.test;


	import carAccessories.first.Checker;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import static org.junit.Assert.*;



	public class LoginTesting {
	boolean stateFlag;
	
	@Given("I am not on the system")
	public void i_am_not_on_the_system() {
		stateFlag=false;
	}

	@When("set Email {string} And Password {string}")
	public void set_email_and_password(String email, String password) {
		Checker.testAdd();
	   stateFlag=Checker.checkUser(email, password);
	}

	@Then("I am on the system")
	public void i_am_on_the_system() {
	 assertTrue(stateFlag);
	}

	@Then("log-in failed")
	public void log_in_failed() {
	 assertFalse(stateFlag);
	}

}