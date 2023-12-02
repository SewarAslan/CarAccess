package carAccessories.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import carAccessories.first.Initialing;
import carAccessories.first.Installation;
import carAccessories.first.Installer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scedTest {
Installer i =new Installer("","");
LinkedList <Installation> Ins2  =new LinkedList<Installation>();
	@Given("i want to reOrder my array")
	public void i_want_to_re_order_my_array() {
	 Initialing.initialInstallation();
	  Installation b1=new Installation("Skoda","2023-01-01 12:30","Tires","new7@gmail.com");
Installation b3=new Installation("mazda","2024-01-02 20:00","Lights","new7@gmail.com");
Installation b2=new Installation("kia sorento","2023-12-22 20:00","mirror","new@gmail.com");
Ins2.add(b1);
Ins2.add(b2);
Ins2.add(b3);  
	}

	@When("swap the array by the date")
	public void swap_the_array_by_the_date() {
	 i.scheduling(Initialing.installationRequests);
	}

	@Then("better appointments")
	public void better_appointments() {

			String out1 = null,out2 = null;
			for(Installation i:Ins2) {
				out1+=i.toString();
			}
				for(Installation i:Initialing.installationRequests) {
					out2+=i.toString();
				}
        assertEquals(out1,out2);

	}

}
