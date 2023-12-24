package carAccessories.first;

import java.util.LinkedList;
import java.util.Scanner;

public class Installer extends User{
	public  LinkedList<Installation> myInstWork= new LinkedList<Installation>();
	
	public Installer(String Email, String Password) {
		super(Email, Password);
		Type=2;
		// TODO Auto-generated constructor stub
	}
	public 	Installer(String Email,String Password,String Name,String Phone,String Address) {
		super(Email,Password,Name,Phone,Address);
		Type=2;
	}
	public void AddInstallationToWork(int indexIN) {
		for (int i = 0; i < Initialing.installationRequests.size(); i++) {
		    if(i==indexIN) {
		    	String status="";
		    			for (Product prod : Initialing.productsLL) {	
		    	String desc=prod.description;
		            if (desc.toLowerCase().equals(Initialing.installationRequests.get(i).protname.toLowerCase())) {
		            	 status=prod.status;
		            		if(status.equals("Waiting")) {
		        		    	this.myInstWork.add(Initialing.installationRequests.get(i));
		        		    	Initialing.installationRequests.remove(i);
		        		    	prod.status="In Process";
		            }
		            		}
		    }
		    			}
		}
		
	}
	
	public String showAllInstallations() {
		String out="";
		
		scheduling(Initialing.installationRequests);
		for (int i = 0; i < Initialing.installationRequests.size(); i++) {
		    out+=i + ": " + Initialing.installationRequests.get(i)+"\n";
		    this.changeStatustoWaiting(i);
		}
		System.out.println(out);
	return out;
	}
	
	public String showMyInstallations() {
		String out="";
		scheduling(this.myInstWork);
		for (int i = 0; i < this.myInstWork.size(); i++) {
		    out+=i + ": " + this.myInstWork.get(i)+"\n";
		}
		System.out.println(out);
		return out;
	}
	
	public void changeStatustoWaiting(int indexIN) {
		Product p=null;
		for (int i = 0; i < Initialing.installationRequests.size(); i++) {
		    if(i==indexIN) {
		for (Product prod : Initialing.productsLL) {	
    if (prod.description.equals(Initialing.installationRequests.get(i).protname)) {
    
    		if(prod.status.equals("Pending")) {
    			prod.status="Waiting";
    		}
    		}
    }
		}
		}
		    }
		
	public void changeStatustoDone(int indexIN) {
		Product p=null;
		for (int i = 0; i < this.myInstWork.size(); i++) {
		    if(i==indexIN) {
		for (Product prod : Initialing.productsLL) {	
    if (prod.description.equals(this.myInstWork.get(i).protname)) {
    		if(prod.status.equals("In Process")) {
    			prod.status="Done";
    		}
    		}
    }
		}
		}
		    }
		
	
	public boolean scheduling(LinkedList<Installation> l) {
		int comparisonResult=0;
		 for (int i = 0; i < l.size(); i++) {
	            String time = l.get(i).prefered_date_time;

	            for (int j = i + 1; j < l.size(); j++) {
	                String timing = l.get(j).prefered_date_time;

	                 comparisonResult = time.compareTo(timing);

	                if (comparisonResult > 0) {
	                    // Swap elements at positions i and j
	                    Installation temp = l.get(i);
	                    l.set(i, l.get(j));
	                    l.set(j, temp);
	                } else if (comparisonResult == 0) {
	                    return false;
	                }
	            }
	        }

	        // Now, the installations list is sorted based on prefered_date_time (as strings)
	        return true;
	    }
	
	
	
}
