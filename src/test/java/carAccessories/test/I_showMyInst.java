package carAccessories.test;

import static org.junit.Assert.assertEquals;

import carAccessories.first.Customer;
import carAccessories.first.Initialing;
import carAccessories.first.Installation;
import carAccessories.first.Installer;
import carAccessories.first.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_showMyInst {
	Installer i =new Installer("new9@gmail.com","");
	Customer c=new Customer("new8@gmail.com","");
	Product p3=new Product("p3",75,true,"","Electronic",true);
	  Product p1=new Product("p1",200,true ,"","Electronic",true);
	  Product p2=new Product("p2",55,true,"","Electronic",true);
	String out1="",out2="";
	
	  
	@Given("i want to show  my Inst")
	public void i_want_to_show_my_inst() {
		Initialing.initialInstallation();
		Initialing.productsLL.add(p1);
		Initialing.productsLL.add(p2);
		Initialing.productsLL.add(p3);
		c.makeInstOrder(p1,"Skoda","2025-01-15 08:45");
		c.makeInstOrder(p2, "Skoda","2025-04-15 08:43");
		c.makeInstOrder(p3, "Skoda","2025-03-15 08:44");
		i.changeStatus(3);
		i.changeStatus(4);
		i.changeStatus(5);
		i.AddInstallationToWork(3);
		i.AddInstallationToWork(4);
		i.AddInstallationToWork(5);
		i.changeStatus(3);
		i.changeStatus(4);
		i.changeStatus(5);
		out1=i.showMyInstallations();
		out2="0: " + i.myInstWork.get(0).toString()+"\n"+"1: " + i.myInstWork.get(1).toString()+"\n"+"2: " + i.myInstWork.get(2).toString()+"\n";

	}

	@When("call show my installations")
	public void call_show_my_installations() {
		
	   
	}

	@Then("print my installations")
	public void print_my_installations() {
	 assertEquals(out1,out2);  
	}

}
