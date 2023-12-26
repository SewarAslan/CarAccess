package carAccessories.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.LinkedList;

import carAccessories.first.Initialing;
import carAccessories.first.Installation;
import carAccessories.first.Installer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scedTest {
	Installer i = new Installer("", "");
    LinkedList<Installation> Ins2 = new LinkedList<Installation>();
    String out1 = null, out2 = null;

	@Given("I want to reorder my array")
	public void i_want_to_reorder_my_array() {
		Initialing.installationRequests.clear();
        Initialing.initialInstallation();
        Installation b1 = new Installation("Skoda", "2023-01-01 12:30", "Car Alarms", "new7@gmail.com");
        Installation b3 = new Installation("mazda", "2024-01-02 20:00", "In-Car DVD Players", "new7@gmail.com");
        Installation b2 = new Installation("kia sorento", "2023-12-22 20:00", "Car Audio Systems", "new@gmail.com");
        Ins2.add(b1);
        Ins2.add(b2);
        Ins2.add(b3);
	}

	@When("I swap the array by the date")
	public void i_swap_the_array_by_the_date() {
        i.scheduling(Initialing.installationRequests);
	}

	@Then("I should have better appointments")
	public void i_should_have_better_appointments() {
		for (Installation i : Ins2) {
            out1 += i.toString();
        }
        for (Installation i : Initialing.installationRequests) {
            out2 += i.toString();
        }
        assertEquals(out1, out2);
	}

	@Then("I should have filed appointments")
	public void i_should_have_filed_appointments() {
		out2 = "";
        assertFalse(out1 == out2);
	}

	@When("I add a new installation request for {string} on {string} for {string} from {string}")
	public void i_add_a_new_installation_request_for_on_for_from(String carModel, String dateTime, String serviceType, String email) {
        Installation newInstallation = new Installation(carModel, dateTime, serviceType, email);
        Initialing.installationRequests.add(newInstallation);
	}

	@Then("I should see the new appointment in the scheduled list")
	public void i_should_see_the_new_appointment_in_the_scheduled_list() {
		 Installation lastAppointment = Initialing.installationRequests.getLast();
	        assertEquals("Toyota", lastAppointment.car_model);
	        assertEquals("2026-06-15 14:00", lastAppointment.prefered_date_time);
	        assertEquals("Car GPS Systems", lastAppointment.protname);
	        assertEquals("new@example.com", lastAppointment.custEmail);
	}


}
