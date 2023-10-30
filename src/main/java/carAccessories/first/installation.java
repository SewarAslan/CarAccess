package carAccessories.first;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class installation {

	
	String car_model;
	LocalDateTime prefered_date_time;
	product product;
	String instname=product.description;
	
	public installation(String car_model,LocalDateTime prefered_date_time,String name) {
		
		this.prefered_date_time=prefered_date_time;
		this.car_model=car_model;
		this.instname=name;
		
	}
	
}
