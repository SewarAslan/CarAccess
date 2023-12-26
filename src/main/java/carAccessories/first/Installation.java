package carAccessories.first;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class Installation {

	public String car_model;
	public String prefered_date_time;
	public String protname;
	public String custEmail;
	public Installation(String car_model,String date,String name,String custEmail) {
		
		
			this.prefered_date_time=date;
			this.car_model=car_model;
			this.protname=name;
			this.custEmail=custEmail;
			
		}
	
	public String toString() {
         String s="Product Name="+this.protname+"\nCar Model="+this.car_model+"\nInstallation Time="+this.prefered_date_time+"\n Customer Email="+this.custEmail; 
    return s; 
	}
}
