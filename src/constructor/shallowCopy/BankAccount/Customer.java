package constructor.shallowCopy.BankAccount;

public class Customer {
	
		int customerId;
		String customerName;
		String city;
		int age;
		String gender;
		String occupation;

		Customer() {

		}

		Customer(int customerId, String customerName, String city, int age, String gender, String occupation) {

			this.customerId = customerId;
			this.customerName = customerName;
			this.city = city;
			this.age = age;
			this.gender = gender;
			this.occupation = occupation;

		}

		public String toString() {

			return "CustomerId is: " + customerId + "\nCustomerName is: " + customerName + "\nCity is: " + city + "\nAge is: " + age + "\nGender is: " + gender + "\nOccupation is: " + occupation;

		}

	

}
