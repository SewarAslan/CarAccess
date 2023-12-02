package carAccessories.first;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Product {
 public String description;
 public String url;
public int price;
public boolean availability;
public String Type;
public boolean needInst;
public String status;
public Product(String description, int price, boolean availability,String url,String Type,final boolean NI) {
	this.needInst=NI;
	this.availability=availability;
	this.price=price;
	this.description=description;
	this.url=url;
	if(NI==false) {
		this.status="don't need an installer";
	}else {
		this.status="need an installer";
	}
	
}


public String toString() {
 String newS="Product Name= "+this.description+"\nAvailabile? "+this.availability+"\nPrice= "+this.price+"\nStatus= "+this.status;
		 return newS;
}







}
