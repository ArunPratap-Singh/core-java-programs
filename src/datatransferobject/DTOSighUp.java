package datatransferobject;

public class DTOSighUp {
	
	private String name;
	private String emailid;
	private long phonenumber;
	private String password;
	
	DTOSighUp(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmailId(String emailid) {
		this.emailid = emailid;
	}
	public String getEmailId() {
		return emailid;
	}
	public void setPhoneNumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
