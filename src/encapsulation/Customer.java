package encapsulation;

public class Customer {
	
	private String name;
	private String address;
	private String nearbylocation;
	private long phonenumber;
	
	Customer(String name, String address, String nearbylocation, long phonenumber){
		
		this.name = name;
		this.address = address;
		this.nearbylocation = nearbylocation;
		this.phonenumber = phonenumber;
	}
	
	public void setName(String name) {
		if(name.length()>3 && name.length()<50 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))
			this.name = name;
		
		else
				System.out.println("Invalid name entered"); 
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		if(address.length()>3 && address.length()<100 && !address.isBlank() && address.matches("[A-Z a-z 1-100 \s]+"))
			this.address = address;
		
		else
			System.out.println("Wrong address entered");
	}
	public String getAddress() {
		return address;
	}
	public void setNearByLocation(String nearbylocation) {
		if(nearbylocation.matches("[A-Z a-z 1-100 \s]+") && nearbylocation.length()>3)
			this.nearbylocation = nearbylocation;
		
		else
			System.out.println("wrong NearByLocation entered");
	}
	public String getNearByLocation() {
		return nearbylocation;
	}
	public void setPhoneNumber(long phonenumber) {
		if((phonenumber+"").length()==10)
			this.phonenumber = phonenumber;
		
		else
			System.out.println("Invalid Phone Number");
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	

}
