package carAccessories.first;

import java.util.LinkedList;
import java.util.List;


public  class Initialing {
 
	public static List<Product> productsLL = new LinkedList<>();
	public static List<Product> similarproductsLL = new LinkedList<>();
	public static List<User> accounts = new LinkedList<User>();
	public static List<Installation> installationRequests= new LinkedList<>();
	public static List<Categorie> categoriesLL= new LinkedList<>();
	public static final String DEFAULT_PASS = "123123";
        public static final String DEF_IN = "Interior";
        public static final String DEF_EX = "Exterior";
        public static final String DEF_EL = "Electronic";

	public static void initialAccountsLL() {
		 User a=new Admin("Sewar@gmail.com",DEFAULT_PASS);
		User c=new Admin("Noor@gmail.com",DEFAULT_PASS);
		 User b=new Customer("sew@gmail.com",DEFAULT_PASS);
		 User x=new Installer("new@gmail.com",DEFAULT_PASS);
		 User u=new Customer("new2@gmail.com",DEFAULT_PASS);
	  User z=new Customer("new3@gmail.com",DEFAULT_PASS,"Name","10989","Jerusalem");
	  if(accounts.isEmpty()) {
			 c.Type=1;
			 a.Type=1;
			 b.Type=3;
			 x.Type=2;
			 u.Type=3;
			 z.Type=3;
			 a.Name="Sewar Aslan";
		 accounts.add(a);
		accounts.add(c);
		accounts.add(b);
		accounts.add(x);
		accounts.add(u);
		accounts.add(z);
		 }	
	}
	public static Categorie inte=new Categorie(DEF_IN);
	public static Categorie ext=new Categorie(DEF_EX);
	public static Categorie elect=new Categorie(DEF_EL);
	public static void initialProductsAndCategories() {
		
		if(categoriesLL.isEmpty()) {
        categoriesLL.add(inte);
        categoriesLL.add(ext);
        categoriesLL.add(elect);}
		
		  Product p1=new Product("Floor Mats",100,true ,"",DEF_IN,false);
		  Product p2=new Product("Seat Covers",25,true ,"",DEF_IN,false);
		  Product p3=new Product("Steering Wheel Covers",10,true," ",DEF_IN,false);
		  
		  Product p4=new Product("Car Covers",75,true ,"",DEF_EX,false);
		  Product p5=new Product("Windshield Sun Shades",25,true,"",DEF_EX,false);
		  Product p6=new Product("License Plate Frames",55,true,"",DEF_EX,false);
		  
		  Product p7=new Product("Car Alarms",75,true,"",DEF_EL,true);
		  Product p8=new Product("In-Car DVD Players",200,true ,"",DEF_EL,true);
		  Product p9=new Product("Car Audio Systems",55,true,"",DEF_EL,true);
		  
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
		  if(inte.categorieofProdLL.isEmpty()&&ext.categorieofProdLL.isEmpty()&&elect.categorieofProdLL.isEmpty()) {
			  inte.categorieofProdLL.add(p1);
			  inte.categorieofProdLL.add(p2);
			  inte.categorieofProdLL.add(p3);
			  
			  ext.categorieofProdLL.add(p4);
			  ext.categorieofProdLL.add(p5);
			  ext.categorieofProdLL.add(p6);
			  
			  elect.categorieofProdLL.add(p7);
			  elect.categorieofProdLL.add(p8);
			  elect.categorieofProdLL.add(p9);
			  
		  }
		  
	}
	
	      
		 public static void initialInstallation() {
				
			
             if(installationRequests.isEmpty()) {
            	Installation b1=new Installation("Skoda","2023-01-01 12:30","Car Alarms","new7@gmail.com");
            	Installation b2=new Installation("mazda","2024-01-02 20:00","In-Car DVD Players","new7@gmail.com");
            	Installation b3=new Installation("kia sorento","2023-12-22 20:00","Car Audio Systems","new@gmail.com");
            	
            	installationRequests.add(b1);
            	installationRequests.add(b2);
            	installationRequests.add(b3);
			}
			 }
}
		 

	
