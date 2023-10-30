package carAccessories.first;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class product {
 String description;
 String url;
int price;
String availability;
public String Type;

public product(String description, int price, String availability,String url) {
	
	this.availability=availability;
	this.price=price;
	this.description=description;
	this.url=url;
}




public product() {
	
	this.price=0;
	this.availability="";
	this.description="";
	this.url="";
	
}







}
