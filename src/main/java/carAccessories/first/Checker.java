package carAccessories.first;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public  class Checker {
 
	public static LinkedList<product> products = new LinkedList<product>();
	public static product c1=new product("Cleaning products",100,"True " ," ");
	public static product c2=new product("Steering wheel red cover",25,"True " ," ");
	public static product c3=new product("Rear view mirror",10,"True"," ");
	
	public static LocalDateTime DateTime(String s) {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime dateTime = LocalDateTime.parse(s, formatter);
	return dateTime;
	}
	
	public static installation b1=new installation("Skoda",DateTime("2024-01-01 12:30"),"Tires");
	public static installation b2=new installation("mazda",DateTime("2024-01-02 20:00 "),"Lights");
	public static installation b3=new installation("kia sorento",DateTime("2023-12-22 20:00"),"mirror");
	
	public static LinkedList<product> Similarproducts = new LinkedList<product>();
	

	public static LinkedList<User> accounts = new LinkedList<User>();
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
			 }		 }
		 
		 
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
		 
		 public static void ReqAdd() {
			 if(Installer.installations.isEmpty()) {
				
				 
				 Installer.installations.add(b1);
				 Installer.installations.add(b2);
				 Installer.installations.add(b3);
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

	
	
	

	public static boolean validEmail(String email) {
	    if(email.contains("@")&&email.contains(".com")&&!email.isBlank()) {
         return true;

	}
	    else return false;
	}}
