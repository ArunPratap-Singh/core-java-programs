package encapsulation;

public class ElectricityBill {
	
	private String name;
	private String address;
	private String customerid; 
	private int unitsconsumed;
	private double billamount;
	
	ElectricityBill(String name, String address, String customerid, int unitsconsumed, double billamount){
		
		this.name = name;
		this.address = address;
		this.customerid = customerid;
		this.unitsconsumed = unitsconsumed;
		this.billamount = billamount;
	}
	
	public void setName(String name) {
		if(name.length()>3 && name.length()<=50 && !name.isBlank() && name.matches("[A-Z a-z 1-100 \s]+"))
			this.name = name;
		else
			System.out.println("Wrong name entered");
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		if(address.length()>3 && address.length()<=50 && !address.isBlank() && address.matches("[A-Z a-z 1-100 \s]+"))
			this.address = address;
		else
			System.out.println("Wrong Address");
	}
	public String getAddress() {
		return address;
	}
	public void setCustomerID(String customerid) {
		if(customerid.length()>3 && customerid.length()<=50 && !customerid.isBlank() && customerid.matches("[A-Z a-z 1-20]+"))
			this.customerid = customerid;
		else
			System.out.println("Inavlid CustomerID");
	}
	public String getCustomerID() {
		return customerid;
	}
	public void setUnitsConsumed(int unitsconsumed) {
		if(unitsconsumed>0)
			this.unitsconsumed = unitsconsumed;
	}
	public int getUnitsConsumed() {
		return unitsconsumed;
	}
	public void setBillAmount(double billamount) {
		if(billamount>0)
			this.billamount = billamount;
		else
			System.out.println("Wrong bill amount");
	}
	public double getBillAmount() {
		return billamount;
	}

}

