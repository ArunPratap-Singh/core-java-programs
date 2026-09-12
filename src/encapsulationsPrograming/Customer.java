package encapsulationsPrograming;

public class Customer {
	
		private String name;
		private String customerid;
		private String address;
		private long contact;
		private String email;
		
		Customer(){
			
		}	

		Customer(String name, String customerid, String address, long contact, String email) {

			this.name = name;
			this.customerid = customerid;
			this.address = address;
			this.contact = contact;
			this.email = email;
		}

		public void setName(String name) {

			if(name.length() > 3 && name.length() <= 50 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))

				this.name = name;

			else

				System.out.println("Wrong name entered");
		}

		public String getName() {

			return name;
		}

		public void setCustomerID(String customerid) {

			if(customerid.length() > 3 && customerid.length() <= 20 && !customerid.isBlank() && customerid.matches("[A-Z a-z 0-9]+"))

				this.customerid = customerid;

			else

				System.out.println("Invalid CustomerID");
		}

		public String getCustomerID() {

			return customerid;
		}

		public void setAddress(String address) {

			if(address.length() > 3 && address.length() <= 50 && !address.isBlank() && address.matches("[A-Z a-z 0-9]+"))

				this.address = address;

			else

				System.out.println("Wrong Address");
		}

		public String getAddress() {

			return address;
		}

		public void setContact(long contact) {

			if(contact >= 1000000000L && contact <= 9999999999L)

				this.contact = contact;

			else

				System.out.println("Invalid Contact Number");
		}

		public long getContact() {

			return contact;
		}

		public void setEmail(String email) {

			if(email.length() > 5 && email.length() <= 50 && !email.isBlank() && email.matches("[A-Z a-z 0-9 ._%+-@!%$*{}()^&# \s]+"))

				this.email = email;

			else

				System.out.println("Invalid Email");
		}

		public String getEmail() {

			return email;
		}
	

}
