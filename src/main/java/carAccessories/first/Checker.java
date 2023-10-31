package carAccessories.first;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public  class Checker {
 
	public static LinkedList<product> products = new LinkedList<product>();
	public static LinkedList<product> Similarproducts = new LinkedList<product>();
	public static LinkedList<User> accounts = new LinkedList<User>();
	public static LinkedList<installation> installations= new LinkedList<installation>();

	
	
	public static LocalDateTime DateTime(String s) {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime dateTime = LocalDateTime.parse(s, formatter);
	return dateTime;
	}
	
	private static installation b1=new installation("Skoda","2024-01-01 12:30","Tires","new7@gmail.com");
	private static installation b2=new installation("mazda","2024-01-02 20:00","Lights","new7@gmail.com");
	private static installation b3=new installation("kia sorento","2023-12-22 20:00","mirror","new@gmail.com");
	private static product c1=new product("red Cleaning products",100,"True " ," ");
	private static product c2=new product("Steering wheel red cover",25,"True " ," ");
	private static product c3=new product("Rear view mirror",10,"True"," ");
	private static User a=new Admin("Sewar@gmail.com","123123");
	private static User c=new Admin("Noor@gmail.com","123123");
	private static User b=new Customer("sew@gmail.com","123123");
	private static User x=new Installer("new@gmail.com","123123");
	private static User u=new Customer("new2@gmail.com","123123");
	private static User z=new Customer("new3@gmail.com","123123","Name","10989","Jerusalem");

	    public static boolean emailExists;
	    
		 public static void testAdd() {
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
			 if(products.isEmpty()) {
				 c1.Type="Interior";
				 c2.Type="Interior";
				 c3.Type="Interior";
				 
				 products.add(c1);
				 products.add(c2);
				 products.add(c3);
			}
             if(installations.isEmpty()) {
				
				 installations.add(b1);
				 installations.add(b2);
				 installations.add(b3);
			}
			 }
		 
		 

	
	public static boolean checkUser(String email,String password) {
		
        emailExists=false;

		for(int i=0;i<accounts.size();i++ ) {

		if(email.equals(accounts.get(i).Email)) {
              emailExists=true;
			if(accounts.get(i).Password.equals(password)) {
				return true;

			}

	}}
		return false;
}
	

	
	public static boolean Searchproduct(String deSearch) {
		boolean flag=false;
		Similarproducts.clear();
		if(!deSearch.isBlank()) {
				for (product prod : products) {	
		String desc=prod.description;
            if (desc.toLowerCase().contains(deSearch.toLowerCase())) {
            	 Similarproducts.add(prod);
      		  flag= true;
            }}}
		/**for(int i=0;i<products.size();i++) {
			
			String [] wordList=products.get(i).description.split(" ");
			 
			for (String word1 : wordList) {
	           for(String word2 : wordSearch) {
	        	   if (word1.equalsIgnoreCase(word2)) {
	        		   Similarproducts.add(products.get(i));
	        		   return true;
	        	   }
	        	   
	           }
			
		}
			}**/
		return flag;
		
	}
	
	

	public static boolean validEmail(String email) {
	    if(email.contains("@")&&email.contains(".com")&&!email.isBlank()) {
         return true;

	}
	    else return false;
	}}
