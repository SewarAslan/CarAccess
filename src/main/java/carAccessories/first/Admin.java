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
	
		for(int i=0;i<Initialing.accounts.size();i++) {
			if(email.equals(Initialing.accounts.get(i).Email)) {
				if(Initialing.accounts.get(i).Type==3) {
				Initialing.accounts.get(i).Type=newType;
				return true;
				}
			}
		}
		return false;
}
public boolean  deleteUser(String email) {
	for(int i=0;i<Initialing.accounts.size();i++) {
		if(email.equals(Initialing.accounts.get(i).Email)) {
			if(!email.equals("Sewar@gmail.com")) {
			Initialing.accounts.remove(i);
			return true;}
		}
	}
	return false;
}

public boolean changeEmail(String oldEmail,String newEmail) {
	boolean exist=false;
	for(int i=0;i<Initialing.accounts.size();i++) {
		if(oldEmail.equals(Initialing.accounts.get(i).Email)) {
			
			if(AuthenAndReg.validEmail(newEmail)) {
				for(int j=0;j<Initialing.accounts.size();j++) {
					if(newEmail.equals(Initialing.accounts.get(j).Email)) {
					exist=true;	
					}
				}
				if(!exist) {
					Initialing.accounts.get(i).Email=newEmail;
			return true;
				}
			}
		}
	}
	return false;

}


public boolean changePass(String email,String Pass) {

	for(int i=0;i<Initialing.accounts.size();i++) {
		if(email.equals(Initialing.accounts.get(i).Email)) {
			if(!Pass.isBlank()) {
			Initialing.accounts.get(i).Password=Pass;
			return true;
			}
		}
	}
	return false;

}


public boolean changeData(String email,String name,String phone,String address) {
	for(int i=0;i<Initialing.accounts.size();i++) {
		if(email.equals(Initialing.accounts.get(i).Email)) {
			if(name.isBlank()&&phone.isBlank()&&!address.isBlank()) {
				Initialing.accounts.get(i).Address=address;
				return true;
			}
			else if(name.isBlank()&&!phone.isBlank()&&address.isBlank()) {
				Initialing.accounts.get(i).Phone=phone;
				return true;
			}
			else if(!name.isBlank()&&phone.isBlank()&&address.isBlank()) {
				Initialing.accounts.get(i).Name=name;
				return true;
			}
			
		}}
	return false;
}
public boolean AddCate(String name) {
	for(int i=0;i<Initialing.CategoriesLL.size();i++) {
		if(name.equals(Initialing.CategoriesLL.get(i).categorieName)) {
			return false;	
	}}
	if(!name.isBlank()) {
	Categorie e=new Categorie("name");
	Initialing.CategoriesLL.add(e);
	return true;}
	else return false;
	
}

public boolean AddProd(String desc,String url,int price,boolean availability,String Type,boolean needIN) {
	
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(desc.equals(Initialing.productsLL.get(i).description)) {
			return false;	
	}}
		
	
		for(Categorie c : Initialing.CategoriesLL) {
			if(Type.equalsIgnoreCase(c.categorieName)&&!desc.isBlank()&&!Type.isBlank()) {
				Product p=new Product(desc,price,availability,url,Type,needIN);
				c.categorieofProdLL.add(p);
				Initialing.productsLL.add(p);
				return true;
		}
		}
	
	return false;
}
public boolean editurl(String desc,String url) {
	if(!desc.isBlank()) {
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(desc.equals(Initialing.productsLL.get(i).description)) {
			Initialing.productsLL.get(i).url=url;
			return true;
	}}}
		return false;}

public boolean editPrice(String desc,int price) {
	if(!desc.isBlank()) {
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(desc.equals(Initialing.productsLL.get(i).description)) {
			Initialing.productsLL.get(i).price=price;
			return true;
	}}}
	
	return false;
}
public boolean editavi(String desc) {
	
	if(!desc.isBlank()) {
			for (Product prod : Initialing.productsLL) {	
	String desc2=prod.description;
        if (desc2.toLowerCase().equals(desc.toLowerCase())) {
        	prod.availability=!prod.availability;
        	return true;
        }}}
	
	return false;
}


}