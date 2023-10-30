package carAccessories.first;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Customer extends User {
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

public static boolean AddRequest(String car_model,LocalDateTime timing,String Proname) {
	
	installation req=new installation(car_model,timing,Proname);
	
	LinkedList<installation> installions=Installer.get_insta();
	
	installions.addLast(req);
	boolean flag=Installer.scheduling();
	return true;
}





}