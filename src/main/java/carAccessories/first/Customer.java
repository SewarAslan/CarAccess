package carAccessories.first;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Customer extends User {
	public  List<Installation> myInst= new LinkedList<>();
	public  List<Product> myOrdersLL= new LinkedList<>();
String lline="\n--------------------------------\n";
	public Customer(String Email, String Password) {
		super(Email, Password);
		Type=3;
		// TODO Auto-generated constructor stub
	}	public 	Customer(String Email,String Password,String Name,String Phone,String Address) {
		super(Email,Password,Name,Phone,Address);
		Type=3;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public boolean changeMyData(String email,String name,String phone,String address) {
		String em=email;
		em=this.Email;
		
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
public  boolean Searchproduct(String deSearch) {
	boolean flag=false;
	Initialing.similarproductsLL.clear();
	if(!deSearch.isBlank()) {
			for (Product prod : Initialing.productsLL) {	
	String desc=prod.description;
        if (desc.toLowerCase().contains(deSearch.toLowerCase())) {
        	 Initialing.similarproductsLL.add(prod);
  		  flag= true;
        }}}
	for(Product p:Initialing.similarproductsLL) {
		System.out.println(p);
		System.out.println(lline);
		}
	return flag;
	
}
public void showAllproducts() {
	
	for (int i = 0; i < Initialing.productsLL.size(); i++) {
	    System.out.println(i + ": " + Initialing.productsLL.get(i));
		System.out.println(lline);
	}
}
private static final String EXPECTED_DATE_PATTERN = "yyyy-MM-dd HH:mm";
private static boolean isValidDatePattern(String dateString) {
    // Check if the user input matches the expected pattern
    return dateString.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}$");
}


public boolean makeSimpleOrder(Product p) {
	boolean paymentSuccessful=false;
		myOrdersLL.add(p);
		paymentSuccessful=true;
		
			 System.out.println("Purchase completed successfully:");
			    System.out.println("Item: " + p.description);
			    System.out.println(" Price: $" + p.price);
                   
        
	return paymentSuccessful;}
	
	public boolean makeInstOrder(Product p,String car_model,String date) {
		boolean paymentSuccessful=false;
		if(p.needInst==true &&!car_model.isBlank()) {
		if(isValidDatePattern(date)) {
		paymentSuccessful=true;
		System.out.println("Item: " + p.description);
	    System.out.println(" Price: $" + (p.price+50));
	    System.out.println("Thank you!");
		System.out.println("Please, bring your Car to Our Center at your preferred date");
		
		Installation i=new Installation(car_model,date,p.description,this.Email);
		Initialing.installationRequests.add(i);
		myInst.add(i);
		p.status="Pending";
		myOrdersLL.add(p);
		return true;}
		else {
			paymentSuccessful=false;
		System.out.println("wrong date,Try again Later");
		}
	}
	if(paymentSuccessful==false)  System.out.println("Error: Payment failed. Purchase not completed.");
return paymentSuccessful;
}
public void viewOrders() {
	for(Product p: myOrdersLL) {
		System.out.println(p);
		
	}
	System.out.println(lline);
}


}
