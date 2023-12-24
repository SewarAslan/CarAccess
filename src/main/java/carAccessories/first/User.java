package carAccessories.first;

public class User {
	public String Name;
	public String Email;
	public String Password;
	public String Address;
	public String Phone;
	
	public int Type;
	private  boolean logStateflag;
	
	public User() {
		
	}
	public User(String Email,String Password) {
		super();
		this.Email=Email;
		this.Password=Password;
		this.logStateflag=false;
	}

	public User(String Email,String Password,String Name,String Phone,String Address) {
		super();
		this.Email=Email;
		this.Password=Password;
		this.Address=Address;
		this.Phone=Phone;
		this.Name=Name;
		this.logStateflag=false;
	}

	
    public String toString() {
    	String t=null;
    	if (this.Type==1) {
    		t="Admin";
    	}
    	else if(this.Type==3) {
    		t="Customer";
    	}
    	else if(this.Type==2) {
    		t="Installer";
    	}
    	
   	 String newS=t+" Name= "+this.Name+" Email= "+this.Email+" Password= "+this.Password+" Phone= "+this.Phone+" Address= "+this.Address+"\n";
   	 newS+="----------------------------------";
   			 return newS;
   	}

   
}

