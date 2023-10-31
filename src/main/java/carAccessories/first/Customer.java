package carAccessories.first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;


public class Customer extends User {
	public  LinkedList<installation> myInst= new LinkedList<installation>();
	public Customer(String Email, String Password) {
		super(Email, Password);
		Type=3;
		// TODO Auto-generated constructor stub
	}
	public 	Customer(String Email,String Password,String Name,String Phone,String Address) {
		super(Email,Password,Name,Phone,Address);
		Type=3;
	}
	public boolean changeMyData(String email,String name,String phone,String address) {
		email=this.Email;
		
				if(name.isBlank()&&phone.isBlank()&&!address.isBlank()) {
					this.Address=address;
					return true;
				}
				else if(name.isBlank()&&!phone.isBlank()&&address.isBlank()) {
					this.Phone=phone;
					return true;
				}
				else if(!name.isBlank()&&phone.isBlank()&&address.isBlank()) {
					this.Name=name;
					return true;
				}
				else return false;
	}

public boolean changeMyPass(String oldPass,String newPass) {
			if(!newPass.isBlank()&&oldPass.equals(this.Password)) {
			this.Password=newPass;
			return true;
			}
			else return false;
}
public boolean AddRequest(String carModel, String date, String product) {
	String custEmail=this.Email;
	if(!carModel.isBlank()&&!date.isBlank()&&!product.isBlank()) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime requestTime = LocalDateTime.parse(date, formatter);
		if(requestTime.isBefore(LocalDateTime.now()))return false;
		else {
			for(int i=0;i<Checker.installations.size();i++) {
				
				if(requestTime.equals(Checker.installations.get(i).prefered_date_time)) {
					return false;}
			}
			
			installation a=new installation(carModel,date,product,custEmail);
			Checker.installations.add(a);
			return true;
		}
			
	}
	return false;
}


public LinkedList <installation> searchMyInst (){
	for(installation inst:Checker.installations) {
		if(this.Email.equals(inst.custEmail)) {
			myInst.add(inst);
		}
	}
	return myInst;
}


}