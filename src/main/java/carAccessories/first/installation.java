package carAccessories.first;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class installation {

	String car_model;
	LocalDateTime prefered_date_time;
	String instname;
	String custEmail;
	
	public installation(String car_model,String date,String name,String custEmail) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime requestTime = LocalDateTime.parse(date, formatter);
		
			this.prefered_date_time=requestTime;
			this.car_model=car_model;
			this.instname=name;
			this.custEmail=custEmail;
			
		}
	public String toString() {
         String s="Installation Name="+this.instname+"\n Customer Email="+this.custEmail+"\nInstallation Time="+this.prefered_date_time+"\nCar Model="+this.car_model; 
    return s;
	}
}
