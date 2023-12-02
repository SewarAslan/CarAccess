package carAccessories.first;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public  class Initialing {
 
	public static LinkedList<Product> productsLL = new LinkedList<Product>();
	public static LinkedList<Product> SimilarproductsLL = new LinkedList<Product>();
	public static LinkedList<User> accounts = new LinkedList<User>();
	public static LinkedList<Installation> installationRequests= new LinkedList<Installation>();
	public static LinkedList<Categorie> CategoriesLL= new LinkedList<Categorie>();
	
	public static void initialAccountsLL() {
		 User a=new Admin("Sewar@gmail.com","123123");
		User c=new Admin("Noor@gmail.com","123123");
		 User b=new Customer("sew@gmail.com","123123");
		 User x=new Installer("new@gmail.com","123123");
		 User u=new Customer("new2@gmail.com","123123");
	  User z=new Customer("new3@gmail.com","123123","Name","10989","Jerusalem");
	  if(accounts.isEmpty()) {
			 c.Type=1;
			 a.Type=1;
			 b.Type=3;
			 x.Type=2;
			 u.Type=3;
			 z.Type=3;
		 accounts.add(c);
		accounts.add(a);
		accounts.add(b);
		accounts.add(x);
		accounts.add(u);
		accounts.add(z);
		 }	
	}
	public static Categorie Int=new Categorie("Interior");
	public static Categorie Ext=new Categorie("Exterior");
	public static Categorie Elect=new Categorie("Electronic");
	public static void initialProductsAndCategories() {
		
		if(CategoriesLL.isEmpty()) {
        CategoriesLL.add(Int);
        CategoriesLL.add(Ext);
        CategoriesLL.add(Elect);}
		
		  Product p1=new Product("Floor Mats",100,true ,"","Interior",false);
		  Product p2=new Product("Seat Covers",25,true ,"","Interior",false);
		  Product p3=new Product("Steering Wheel Covers",10,true," ","Interior",false);
		  
		  Product p4=new Product("Car Covers",75,true ,"","Exterior",false);
		  Product p5=new Product("Windshield Sun Shades",25,true,"","Exterior",false);
		  Product p6=new Product("License Plate Frames",55,true,"","Exterior",false);
		  
		  Product p7=new Product("Car Alarms",75,true,"","Electronic",true);
		  Product p8=new Product("In-Car DVD Players",200,true ,"","Electronic",true);
		  Product p9=new Product("Car Audio Systems",55,true,"","Electronic",true);
		  
		  if(productsLL.isEmpty()) {
				 productsLL.add(p1);
				 productsLL.add(p2);
				 productsLL.add(p3);
				 productsLL.add(p4);
				 productsLL.add(p5);
				 productsLL.add(p6);
				 productsLL.add(p7);
				 productsLL.add(p8);
				 productsLL.add(p9);
			}
		  if(Int.categorieofProdLL.isEmpty()&&Ext.categorieofProdLL.isEmpty()&&Elect.categorieofProdLL.isEmpty()) {
			  Int.categorieofProdLL.add(p1);
			  Int.categorieofProdLL.add(p2);
			  Int.categorieofProdLL.add(p3);
			  
			  Ext.categorieofProdLL.add(p4);
			  Ext.categorieofProdLL.add(p5);
			  Ext.categorieofProdLL.add(p6);
			  
			  Elect.categorieofProdLL.add(p7);
			  Elect.categorieofProdLL.add(p8);
			  Elect.categorieofProdLL.add(p9);
			  
		  }
		  
	}
	
	public static LocalDateTime DateTime(String s) {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime dateTime = LocalDateTime.parse(s, formatter);
	return dateTime;
	}

	   
	    
		 public static void initialInstallation() {
				
			
             if(installationRequests.isEmpty()) {
            	Installation b1=new Installation("Skoda","2024-01-01 12:30","Tires","new7@gmail.com");
            	Installation b2=new Installation("mazda","2024-01-02 20:00","Lights","new7@gmail.com");
            	Installation b3=new Installation("kia sorento","2023-12-22 20:00","mirror","new@gmail.com");
            	installationRequests.add(b1);
            	installationRequests.add(b2);
            	installationRequests.add(b3);
			}
			 }
}
		 

	