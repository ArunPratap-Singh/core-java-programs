package constructor.shallowCopy.Order;

public class Customer {
	
	    int customerId;
	    String customerName;
	    String city;
	    int age;
	    String gender;
	    String customerType;

	    Customer() {
	    }

	    Customer(int customerId, String customerName, String city, int age, String gender, String customerType) {

	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.city = city;
	        this.age = age;
	        this.gender = gender;
	        this.customerType = customerType;
	    }

	    public String toString() {

	        return "CustomerId is: " + customerId + "\nCustomerName is: " + customerName + "\nCity is: " + city + "\nAge is: " + age+ "\nGender is: " + gender + "\nCustomerType is: " + customerType;
	    }
	

}
