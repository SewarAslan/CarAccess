package carAccessories.first;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class Installation {

	String car_model;
	String prefered_date_time;
	String instname;
	String custEmail;
	public Installation(String car_model,String date,String name,String custEmail) {
		
		
			this.prefered_date_time=date;
			this.car_model=car_model;
			this.instname=name;
			this.custEmail=custEmail;
			
		}
	
	public String toString() {
         String s="Installation Name="+this.instname+"\n Customer Email="+this.custEmail+"\nInstallation Time="+this.prefered_date_time+"\nCar Model="+this.car_model; 
    return s; 
	}
}
