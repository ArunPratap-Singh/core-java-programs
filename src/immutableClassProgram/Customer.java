package immutableClassProgram;

public final class Customer {
	
	    private final int customerId;
	    private final String customerName;
	    private final String email;
	    private final String phoneNumber;
	    private final String address;
	    private final String city;
	    private final String membershipType;

	    Customer(int customerId, String customerName, String email, String phoneNumber, String address, String city, String membershipType) {

	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.city = city;
	        this.membershipType = membershipType;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getMembershipType() {
	        return membershipType;
	    }
	

}
