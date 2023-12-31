package carAccessories.first;

import java.util.Iterator;
import java.util.logging.Logger;


public class Admin extends User{
    private static final Logger logger = Logger.getLogger(Admin.class.getName());

	public Admin(String email, String password) {
		super(email, password);
		Type=1;
	}
	public 	Admin(String email,String password,String name,String phone,String address) {
		super(email,password,name,phone,address);
		Type=1;
	}

public boolean changeType(String email,int newType) {
	
		for(int i=0;i<Initialing.accounts.size();i++) {
			if(email.equals(Initialing.accounts.get(i).Email)&&Initialing.accounts.get(i).Type==3) {
				Initialing.accounts.get(i).Type=newType;
				return true;
				
			}
		}
		return false;
}
public boolean  deleteUser(String email) {

	    Iterator<User> iterator = Initialing.accounts.iterator();
	    while (iterator.hasNext()) {
	        User account = iterator.next();
	        if (email.equals(account.Email) && !email.equals("Sewar@gmail.com")) {
	            iterator.remove(); // Safely removes the element from the list
	            return true;
	        }
	    }
	    return false;
	}


public boolean changeEmail(String oldEmail, String newEmail) {
    if (!isOldEmailValid(oldEmail)) {
        return false;
    }

    if (!AuthenAndReg.validEmail(newEmail)) {
        return false;
    }

    if (isEmailInUse(newEmail)) {
        return false;
    }

    updateAccountEmail(oldEmail, newEmail);
    return true;
}

private boolean isOldEmailValid(String oldEmail) {
    for (User account : Initialing.accounts) {
        if (oldEmail.equals(account.Email)) {
            return true;
        }
    }
    return false;
}

private boolean isEmailInUse(String newEmail) {
    for (User account : Initialing.accounts) {
        if (newEmail.equals(account.Email)) {
            return true;
        }
    }
    return false;
}

private void updateAccountEmail(String oldEmail, String newEmail) {
    for (User account : Initialing.accounts) {
        if (oldEmail.equals(account.Email)) {
            account.Email = newEmail;
            break;
        }
    }
}



public boolean changePass(String email,String pass) {

	for(int i=0;i<Initialing.accounts.size();i++) {
		if(email.equals(Initialing.accounts.get(i).Email)&&!pass.isBlank()) {
			
			Initialing.accounts.get(i).Password=pass;
			return true;
			
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
public boolean addCate(String name) {
	for(int i=0;i<Initialing.categoriesLL.size();i++) {
		if(name.equals(Initialing.categoriesLL.get(i).categorieName)) {
			return false;	
	}}
	if(!name.isBlank()) {
	Categorie e=new Categorie(name);
	Initialing.categoriesLL.add(e);
	return true;}
	else return false;
	
}

public boolean addProd(String desc,String url,int price,boolean availability,String type,boolean needIN) {

	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(desc.equals(Initialing.productsLL.get(i).description)) {
			return false;	
	}}
		
	
		for(Categorie c : Initialing.categoriesLL) {
			if(type.equalsIgnoreCase(c.categorieName)&&!desc.isBlank()&&!type.isBlank()) {
				Product p=new Product(desc,price,availability,url,type,needIN);
				c.categorieofProdLL.add(p);
				Initialing.productsLL.add(p);
				return true;
		}
		}
	
	return false;
}
public void showAllproducts() {
	
	for (int i = 0; i < Initialing.productsLL.size(); i++) {
	    logger.info(i + ": " + Initialing.productsLL.get(i));
	}
}

public boolean editurl(int index,String url) {
	
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(index==i) {
			Initialing.productsLL.get(i).url=url;
			return true;
	}}
		return false;}

public boolean editPrice(int index,int price) {
	
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if(index==i) {
			Initialing.productsLL.get(i).price=price;
			return true;
	}}
	
	return false;
}
public boolean editavi(int index) {
	
	
	for(int i=0;i<Initialing.productsLL.size();i++) {	

        if (index==i) {
        	Initialing.productsLL.get(i).availability=!(Initialing.productsLL.get(i).availability);
        	return true;
        }}
	
	return false;
}


public boolean delpro(int index) {
	
	for(int i=0;i<Initialing.productsLL.size();i++) {
		if (index==i) {
			Initialing.productsLL.remove(Initialing.productsLL.get(i));
		return true;	
		}
	}
	
	
	return false;
}

public void showAllcategories() {
	
	for (int i = 0; i < Initialing.categoriesLL.size(); i++) {
	    logger.info(i + ": " + Initialing.categoriesLL.get(i));
	}
}
public String showAllUsers() {
	String out="";
	for (int i = 0; i < Initialing.accounts.size(); i++) {
	    out+=i + ": " + Initialing.accounts.get(i);
	}
	logger.info(out);
	return out;
}


public boolean editcatname(int index,String name) {
	for(int i=0;i<Initialing.categoriesLL.size();i++) {
		if(name.equals(Initialing.categoriesLL.get(i).categorieName)) {
			return false;	
	}}
	if(!name.isBlank()) {
		for(int i=0;i<Initialing.categoriesLL.size();i++) {
	
		if(index==i) {
			Initialing.categoriesLL.get(i).categorieName=name;
			return true;
		}
		
	}}
	return false;
}

public boolean deletecateg(int index) {
	
	for (int i = 0; i < Initialing.categoriesLL.size(); i++) {
		if(index==i) {
			Initialing.categoriesLL.get(i).categorieofProdLL.clear();
			Initialing.categoriesLL.remove(Initialing.categoriesLL.get(i));
	return true;
		}

}
	return false;}










}