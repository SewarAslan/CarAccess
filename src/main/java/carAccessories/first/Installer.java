package carAccessories.first;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Installer extends User{
	public Installer(String Email, String Password) {
		super(Email, Password);
		Type=2;
		// TODO Auto-generated constructor stub
	}
	public 	Installer(String Email,String Password,String Name,String Phone,String Address) {
		super(Email,Password,Name,Phone,Address);
		Type=2;
	}
	
	public boolean scheduling() {
	    for (int i = 0; i < Checker.installations.size(); i++) {
	        LocalDateTime time = Checker.installations.get(i).prefered_date_time;

	        for (int j = i + 1; j < Checker.installations.size(); j++) {
	            LocalDateTime timing = Checker.installations.get(j).prefered_date_time;

	            if (timing.isBefore(time)) {
	                // Swap elements at positions i and j
	                installation temp = Checker.installations.get(i);
	                Checker.installations.set(i, Checker.installations.get(j));
	                Checker.installations.set(j, temp);
	            } else if(timing==time) {
	            	return false;
	            }
	        }
	    }
	    
	    // Now, the installations list is sorted based on prefered_date_time
	    return true;
	}
	
	
	
}
