package carAccessories.first;

public class User {
	public String Name;
	public String Email;
	public String Password;
	public String Address;
	public String Phone;
	
	public int Type;
	private  boolean logStateflag;
	
	
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

	public  void setlogState(boolean logstate) {
        this.logStateflag=logstate;		
	}
    public boolean getLogState() {
	return this.logStateflag;
}
    
   
}

