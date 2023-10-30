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
	
    boolean available;
	
	public static LinkedList<installation> installations= new LinkedList<installation>();
	
	public static boolean scheduling() {
	    for (int i = 0; i < installations.size(); i++) {
	        LocalDateTime time = installations.get(i).prefered_date_time;

	        for (int j = i + 1; j < installations.size(); j++) {
	            LocalDateTime timing = installations.get(j).prefered_date_time;

	            if (timing.isBefore(time)) {
	                // Swap elements at positions i and j
	                installation temp = installations.get(i);
	                installations.set(i, installations.get(j));
	                installations.set(j, temp);
	            } else if(timing==time) {
	            	return false;
	            }
	        }
	    }
	    
	    // Now, the installations list is sorted based on prefered_date_time
	    return true;
	}

	
	
	
	public static LinkedList<installation> get_insta(){
		
		return installations;
	}
	
	
}
