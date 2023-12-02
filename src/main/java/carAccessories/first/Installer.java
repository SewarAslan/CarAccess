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
		 for (int i = 0; i < Initialing.installationRequests.size(); i++) {
	            String time = Initialing.installationRequests.get(i).prefered_date_time;

	            for (int j = i + 1; j < Initialing.installationRequests.size(); j++) {
	                String timing = Initialing.installationRequests.get(j).prefered_date_time;

	                int comparisonResult = time.compareTo(timing);

	                if (comparisonResult > 0) {
	                    // Swap elements at positions i and j
	                    Installation temp = Initialing.installationRequests.get(i);
	                    Initialing.installationRequests.set(i, Initialing.installationRequests.get(j));
	                    Initialing.installationRequests.set(j, temp);
	                } else if (comparisonResult == 0) {
	                    return false;
	                }
	            }
	        }

	        // Now, the installations list is sorted based on prefered_date_time (as strings)
	        return true;
	    }
	
	
	
}
