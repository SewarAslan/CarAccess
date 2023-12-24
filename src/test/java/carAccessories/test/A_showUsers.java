package carAccessories.test;

import static org.junit.Assert.assertEquals;

import carAccessories.first.Admin;
import carAccessories.first.Customer;
import carAccessories.first.Initialing;
import carAccessories.first.Installer;
import carAccessories.first.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_showUsers {
String out1="",out2="";
Admin ad=new Admin("","");
User a=new Admin("Sewar@gmail.com","123123");
	User c=new Admin("Noor@gmail.com","123123");
	 User b=new Customer("sewsew@gmail.com","123123");
	 User x=new Installer("new@gmail.com","123321");
	
  User u=new Customer("new3@gmail.com","123123","Sewar","090807","Nablus");
  
@Given("i want to show all users")
public void i_want_to_show_all_users() {
    Initialing.initialAccountsLL();
	 c.Type=1;
	 a.Type=1;
	 b.Type=3;
	 x.Type=2;
	 u.Type=2;
	 
	 a.Name="Sewar Aslan";
    
}

@When("call show all users")
public void call_show_all_users() {
	  out1=ad.showAllUsers();
	  out2="0" + ": " + a.toString()+"1" + ": " + c.toString()+"2" + ": " + b.toString()+"3" + ": " + x.toString()+"4" + ": " + u.toString();
}

@Then("print all users")
public void print_all_users() {
   assertEquals(out1,out2);
}

}
