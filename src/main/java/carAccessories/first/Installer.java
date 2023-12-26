package carAccessories.first;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;


public class Installer extends User{
    private static final Logger logger = Logger.getLogger(Installer.class.getName());

	private  List<Installation> myInstWork= new LinkedList<>();
	
	public List<Installation> getMyInstWork() {
		return myInstWork;
	}
	public void setMyInstWork(List<Installation> myInstWork) {
		this.myInstWork = myInstWork;
	}
	public Installer(String email, String password) {
		super(email, password);
		Type=2;

	}
	public 	Installer(String email,String password,String name,String phone,String address) {
		super(email,password,name,phone,address);
		Type=2;
	}
	public void addInstallationToWork(int indexIN) {
	    Iterator<Installation> iterator = Initialing.installationRequests.iterator();
	    
	    while (iterator.hasNext()) {
	        Installation installation = iterator.next();
	        String status = "";

	        for (Product prod : Initialing.productsLL) {
	            String desc = prod.description;

	            if (desc.equalsIgnoreCase(installation.protname)) {
	                status = prod.status;

	                if (status.equalsIgnoreCase("Waiting")) {
	                    this.myInstWork.add(installation);
	                    iterator.remove(); // Safely remove using iterator

	                    prod.status = "In Process";
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
		logger.info(out);
	return out;
	}
	
	public String showMyInstallations() {
		String out="";
		scheduling(this.myInstWork);
		for (int i = 0; i < this.myInstWork.size(); i++) {
		    out+=i + ": " + this.myInstWork.get(i)+"\n";
		}
		logger.info(out);
		return out;
	}
	
	public void changeStatustoWaiting(int indexIN) {
		
		for (int i = 0; i < Initialing.installationRequests.size(); i++) {
		    if(i==indexIN) {
		for (Product prod : Initialing.productsLL) {	
    if (prod.description.equals(Initialing.installationRequests.get(i).protname)&&prod.status.equals("Pending")) {
    			prod.status="Waiting";
    		}
    }
		}
		}
		    }
		
	public void changeStatustoDone(int indexIN) {
		
		for (int i = 0; i < this.myInstWork.size(); i++) {
		    if(i==indexIN) {
		for (Product prod : Initialing.productsLL) {	
    if (prod.description.equals(this.myInstWork.get(i).protname)&&prod.status.equals("In Process")) {
    			prod.status="Done";
    		
    		}
    }
		}
		}
		    }
		
	
	public boolean scheduling(List<Installation> installationRequests) {
		int comparisonResult=0;
		 for (int i = 0; i < installationRequests.size(); i++) {
	            String time = installationRequests.get(i).prefered_date_time;

	            for (int j = i + 1; j < installationRequests.size(); j++) {
	                String timing = installationRequests.get(j).prefered_date_time;

	                 comparisonResult = time.compareTo(timing);

	                if (comparisonResult > 0) {
	                    // Swap elements at positions i and j
	                    Installation temp = installationRequests.get(i);
	                    installationRequests.set(i, installationRequests.get(j));
	                    installationRequests.set(j, temp);
	                } else if (comparisonResult == 0) {
	                    return false;
	                }
	            }
	        }

	        // Now, the installations list is sorted based on prefered_date_time (as strings)
	        return true;
	    }
	
	
	
}
