package carAccessories.first;
import java.util.logging.Logger;

import java.util.LinkedList;
import java.util.List;



public class Customer extends User {
    private static final Logger logger = Logger.getLogger(Customer.class.getName());

	private  List<Installation> myInst= new LinkedList<>();
	private  List<Product> myOrdersLL= new LinkedList<>();
public List<Installation> getMyInst() {
		return myInst;
	}
	public void setMyInst(List<Installation> myInst) {
		this.myInst = myInst;
	}
	public List<Product> getMyOrdersLL() {
		return myOrdersLL;
	}
	public void setMyOrdersLL(List<Product> myOrdersLL) {
		this.myOrdersLL = myOrdersLL;
	}
	
String lline="\n--------------------------------\n";
	public Customer(String email, String password) {
		super(email, password);
		Type=3;
		// TODO Auto-generated constructor stub
	}	public 	Customer(String email,String password,String name,String phone,String address) {
		super(email,password,name,phone,address);
		Type=3;
	}

	public Customer() {
		this.Name="";
		this.Address="";
		this.Password="";
		this.Email="";
		this.Phone="";
		
	}
	public boolean changeMyData(String email,String name,String phone,String address) {
		
		
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
		logger.info(p.toString());
		logger.info(lline);
		}
	return flag;
	
}
public void showAllproducts() {
	
	for (int i = 0; i < Initialing.productsLL.size(); i++) {
	    logger.info(i + ": " + Initialing.productsLL.get(i));
		logger.info(lline);
	}
}
private static boolean isValidDatePattern(String dateString) {
    // Check if the user input matches the expected pattern
    return dateString.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}$");
}


public boolean makeSimpleOrder(Product p) {
	boolean paymentSuccessful=false;
		myOrdersLL.add(p);
		paymentSuccessful=true;
		
			 logger.info("Purchase completed successfully:");
			    logger.info("Item: " + p.description);
			    logger.info(" Price: $" + p.price);
                   
        
	return paymentSuccessful;}
	
	public boolean makeInstOrder(Product p,String car_model,String date) {
		boolean paymentSuccessful=false;
		if(p.needInst==true &&!car_model.isBlank()) {
		if(isValidDatePattern(date)) {
		paymentSuccessful=true;
		logger.info("Item: " + p.description);
	    logger.info(" Price: $" + (p.price+50));
	    logger.info("Thank you!");
		logger.info("Please, bring your Car to Our Center at your preferred date");
		
		Installation i=new Installation(car_model,date,p.description,this.Email);
		Initialing.installationRequests.add(i);
		myInst.add(i);
		p.status="Pending";
		myOrdersLL.add(p);
		return true;}
		else {
			paymentSuccessful=false;
		logger.info("wrong date,Try again Later");
		}
	}
	if(paymentSuccessful==false)  logger.info("Error: Payment failed. Purchase not completed.");
return paymentSuccessful;
}
public void viewOrders() {
	for(Product p: myOrdersLL) {
		logger.info(p.toString());
		
	}
	logger.info(lline);
}


}
