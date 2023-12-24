package carAccessories.first;

public class AuthenAndReg {
	 public static boolean emailAv;
		public static boolean checkUser(String email,String password) {
			
	        emailAv=false;

			for(int i=0;i<Initialing.accounts.size();i++ ) {
				emailAv=true;
			if(email.equalsIgnoreCase(Initialing.accounts.get(i).Email)) {
	              emailAv=false;
				if(Initialing.accounts.get(i).Password.equals(password)) {
					return true;

				}

		}}
			return false;
	}
		
		public static User getTypeUser(String Email) {
			
			for(User u:Initialing.accounts) {
				if(u.Email.equalsIgnoreCase(Email))return u;
			}
			return null;
			
		}

		public static boolean validEmail(String email) {
		    if(email.contains("@")&&email.contains(".com")&&!email.isBlank()) {
	         return true;
		}
		    else return false;
		}}


