package carAccessories.first;
import java.util.LinkedList;

public  class Checker {
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
		accounts.add(z);
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
	
	public static boolean validEmail(String email) {
	    if(email.contains("@")&&email.contains(".com")&&!email.isBlank()) {
         return true;
	}
	    else return false;
	}}
