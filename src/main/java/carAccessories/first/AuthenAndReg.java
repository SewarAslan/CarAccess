package carAccessories.first;

public class AuthenAndReg {
	 public static boolean emailExists;
		public static boolean checkUser(String email,String password) {
			
	        emailExists=false;

			for(int i=0;i<Initialing.accounts.size();i++ ) {

			if(email.equals(Initialing.accounts.get(i).Email)) {
	              emailExists=true;
				if(Initialing.accounts.get(i).Password.equals(password)) {
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


