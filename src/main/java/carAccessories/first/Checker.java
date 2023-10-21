package carAccessories.first;

import java.util.LinkedList;

public  class Checker {
	public static LinkedList<User> accounts = new LinkedList<User>();
	private static User a=new Admin("Sewar@gmail.com","123123");
	private static User c=new Admin("Noor@gmail.com","123123");

	 public static void testAdd() {
		 if(accounts.isEmpty()) {
		 accounts.add(c);
		accounts.add(a);}
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
	}
