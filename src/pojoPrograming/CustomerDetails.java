package pojoPrograming;

public class CustomerDetails {
	
		private String customerID;
		private String customerName;
		private String email;
		private long phoneNumber;
		private String address;
		private String city;
		private String state;
		private String country;
		private String gender;
		private int age;
		private String customerType;
		private String membership;
		private String occupation;
		private String companyName;
		private String pincode;
		private String accountStatus;

		public CustomerDetails() {

		}

		public CustomerDetails(String customerID, String customerName, String email, long phoneNumber, String address, String city, String state, String country, String gender, int age, String customerType, String membership, String occupation, String companyName, String pincode, String accountStatus) {

			this.customerID = customerID;
			this.customerName = customerName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.city = city;
			this.state = state;
			this.country = country;
			this.gender = gender;
			this.age = age;
			this.customerType = customerType;
			this.membership = membership;
			this.occupation = occupation;
			this.companyName = companyName;
			this.pincode = pincode;
			this.accountStatus = accountStatus;
		}


		public String getCustomerID() {

			return customerID;
		}


		public void setCustomerID(String customerID) {

			this.customerID = customerID;
		}


		public String getCustomerName() {

			return customerName;
		}


		public void setCustomerName(String customerName) {

			this.customerName = customerName;
		}


		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			
			this.email = email;
		}	


		public long getPhoneNumber() {

			return phoneNumber;
		}


		public void setPhoneNumber(long phoneNumber) {

			this.phoneNumber = phoneNumber;
		}


		public String getAddress() {

			return address;
		}


		public void setAddress(String address) {

			this.address = address;
		}


		public String getCity() {

			return city;
		}


		public void setCity(String city) {

			this.city = city;
		}


		public String getState() {

			return state;
		}


		public void setState(String state) {

			this.state = state;
		}


		public String getCountry() {

			return country;
		}


		public void setCountry(String country) {

			this.country = country;
		}


		public String getGender() {

			return gender;
		}


		public void setGender(String gender) {

			this.gender = gender;
		}


		public int getAge() {

			return age;
		}


		public void setAge(int age) {

			this.age = age;
		}


		public String getCustomerType() {

			return customerType;
		}


		public void setCustomerType(String customerType) {

			this.customerType = customerType;
		}


		public String getMembership() {

			return membership;
		}


		public void setMembership(String membership) {

			this.membership = membership;
		}


		public String getOccupation() {

			return occupation;
		}


		public void setOccupation(String occupation) {

			this.occupation = occupation;
		}


		public String getCompanyName() {

			return companyName;
		}


		public void setCompanyName(String companyName) {

			this.companyName = companyName;
		}


		public String getPincode() {

			return pincode;
		}


		public void setPincode(String pincode) {

			this.pincode = pincode;
		}


		public String getAccountStatus() {

			return accountStatus;
		}


		public void setAccountStatus(String accountStatus) {

			this.accountStatus = accountStatus;
		}


	

}
