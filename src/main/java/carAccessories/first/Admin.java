package carAccessories.first;

public class Admin extends User{
	
	public Admin(String Email, String Password) {
		super(Email, Password);
		Type=1;
	}
	public 	Admin(String Email,String Password,String Name,String Phone,String Address) {
		super(Email,Password,Name,Phone,Address);
		Type=1;
	}

public boolean changeType(String email,int newType) {
	
		for(int i=0;i<Checker.accounts.size();i++) {
			if(email.equals(Checker.accounts.get(i).Email)) {
				if(Checker.accounts.get(i).Type==3) {
				Checker.accounts.get(i).Type=newType;
				return true;
				}
			}
		}
		return false;
}
public boolean  deleteUser(String email) {
	for(int i=0;i<Checker.accounts.size();i++) {
		if(email.equals(Checker.accounts.get(i).Email)) {
			if(!email.equals("Sewar@gmail.com")) {
			Checker.accounts.remove(i);
			return true;}
		}
	}
	return false;
}

public boolean changeEmail(String oldEmail,String newEmail) {
	boolean exist=false;
	for(int i=0;i<Checker.accounts.size();i++) {
		if(oldEmail.equals(Checker.accounts.get(i).Email)) {
			
			if(Checker.validEmail(newEmail)) {
				for(int j=0;j<Checker.accounts.size();j++) {
					if(newEmail.equals(Checker.accounts.get(j).Email)) {
					exist=true;	
					}
				}
				if(!exist) {
					Checker.accounts.get(i).Email=newEmail;
			return true;
				}
			}
		}
	}
	return false;

}

public boolean changePass(String email,String Pass) {

	for(int i=0;i<Checker.accounts.size();i++) {
		if(email.equals(Checker.accounts.get(i).Email)) {
			if(!Pass.isBlank()) {
			Checker.accounts.get(i).Password=Pass;
			return true;
			}
		}
	}
	return false;

}


public boolean changeData(String email,String name,String phone,String address) {
	for(int i=0;i<Checker.accounts.size();i++) {
		if(email.equals(Checker.accounts.get(i).Email)) {
			if(name.isBlank()&&phone.isBlank()&&!address.isBlank()) {
				Checker.accounts.get(i).Address=address;
				return true;
			}
			else if(name.isBlank()&&!phone.isBlank()&&address.isBlank()) {
				Checker.accounts.get(i).Phone=phone;
				return true;
			}
			else if(!name.isBlank()&&phone.isBlank()&&address.isBlank()) {
				Checker.accounts.get(i).Name=name;
				return true;
			}
			
		}}
	return false;
}


}
