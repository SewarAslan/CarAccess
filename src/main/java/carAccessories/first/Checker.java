package carAccessories.first;

import java.util.LinkedList;

public  class Checker {
 
	public static LinkedList<product> products = new LinkedList<product>();
	public static product c1=new product("Cleaning products",100,"True " ," ");
	public static product c2=new product("Steering wheel red cover",25,"True " ," ");
	public static product c3=new product("Rear view mirror",10,"True"," ");
	
	
	public static LinkedList<product> Similarproducts = new LinkedList<product>();
	 public static LinkedList<User> accounts = new LinkedList<User>();
		private static User a=new Admin("Sewar@gmail.com","123123");
		private static User c=new Admin("Noor@gmail.com","123123");
		private static User b=new Customer("sew@gmail.com","123123");
		private static User x=new Customer("new@gmail.com","123123");

	    public static boolean emailExists;
		 public static void testAdd() {
			 if(accounts.isEmpty()) {
				 c.Type=1;
				 a.Type=1;
				 b.Type=3;
				 x.Type=3;
			 accounts.add(c);
			accounts.add(a);
			accounts.add(b);
			accounts.add(x);}
		 }
		 
		 
		 public static void testingProAdd() {
			 if(products.isEmpty()) {
				 c1.Type="Interior";
				 c2.Type="Interior";
				 c3.Type="Interior";
				 
				 products.add(c1);
				 products.add(c2);
				 products.add(c3);
			}
		 }
		 
		 
	
	public static boolean checkUser(String email,String password) {
		




		for(int i=0;i<accounts.size();i++ ) {

		if(email.equals(accounts.get(i).Email)) {

			if(accounts.get(i).Password.equals(password)) {
				return true;

			}

	}}
		return false;
}
	
	
	public static boolean Searchproduct(String name) {
		
		String [] g=name.split(" ");
		Similarproducts.clear();
		
		
		for(int i=0;i<products.size();i++) {
			
			String [] A=products.get(i).description.split(" ");
			for(int k=0;k<g.length;k++) {
			if((g[k]).contains(A[0])) {
				
			
				Similarproducts.addLast(products.get(i));
				
				
				
				
			return true;	
			}
			}
		
		}
		return false;
		
		
	}

	
	
	
	
	}
