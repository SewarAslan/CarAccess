package carAccessories.first;

public class User {
	public String Email;
	public String Password;
	public int Type;
	private  boolean logStateflag;
	
	
	public User(String Email,String Password) {
		super();
		this.Email=Email;
		this.Password=Password;
		this.logStateflag=false;
	}


	public  void setlogState(boolean logstate) {
        this.logStateflag=logstate;		
	}
    public boolean getLogState() {
	return this.logStateflag;
}
    
   
}

