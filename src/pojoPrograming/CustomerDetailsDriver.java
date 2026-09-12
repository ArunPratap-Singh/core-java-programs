package pojoPrograming;

public class CustomerDetailsDriver {
	
	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Starts=====================================");
		
		CustomerDetails c1 = new CustomerDetails("CUS101", "Mohan Singh", "mohan@gmail.com", 9876543210L, "Sector 62", "Noida", "Uttar Pradesh", "India", "Male", 28, "Premium", "Gold", "Software Engineer", "TCS", "201301", "Active" );
		CustomerDetails c2 = new CustomerDetails("CUS102", "Rohan Kumar", "rohan@gmail.com", 9876543211L, "Sector 18", "Noida", "Uttar Pradesh", "India", "Male", 30, "Regular", "Silver", "Business Analyst", "Infosys", "201301", "Active");
		CustomerDetails c3 = new CustomerDetails("CUS103", "Sohan Sharma", "sohan@gmail.com", 9876543212L, "Gomti Nagar", "Lucknow", "Uttar Pradesh", "India", "Male", 26, "Premium", "Gold", "Software Engineer", "Wipro", "226010", "Active");
		CustomerDetails c4 = new CustomerDetails("CUS104", "Rahul Verma", "rahul@gmail.com", 9876543213L, "Baner Road", "Pune", "Maharashtra", "India", "Male", 32, "Premium", "Platinum", "Project Manager", "Accenture", "411007", "Active");
		CustomerDetails c5 = new CustomerDetails("CUS105", "Shyam Gupta", "shyam@gmail.com", 9876543214L, "Andheri West", "Mumbai", "Maharashtra", "India", "Male", 29, "Regular", "Silver", "Accountant", "Deloitte", "400053", "Inactive");
		CustomerDetails c6 = new CustomerDetails("CUS106", "Manoj Singh", "manoj@gmail.com", 9876543215L, "Whitefield", "Bengaluru", "Karnataka", "India", "Male", 35, "Premium", "Gold", "Technical Lead", "IBM", "560066", "Active");
		CustomerDetails c7 = new CustomerDetails("CUS107", "Akash Kumar", "akash@gmail.com", 9876543216L, "Hitech City", "Hyderabad", "Telangana", "India", "Male", 27, "Regular", "Silver", "DevOps Engineer", "Cognizant", "500081", "Active");
		CustomerDetails c8 = new CustomerDetails("CUS108", "Samarth Singh", "samarth@gmail.com", 9876543217L, "C Scheme", "Jaipur", "Rajasthan", "India", "Male", 31, "Premium", "Platinum", "Data Scientist", "Amazon", "302001", "Active");
		CustomerDetails c9 = new CustomerDetails("CUS109", "Abhishek Kumar", "abhishek@gmail.com", 9876543218L, "Sector 44", "Gurugram", "Haryana", "India", "Male", 25, "Regular", "Silver", "Test Engineer", "HCL Technologies", "122003", "Active");
		CustomerDetails c10 = new CustomerDetails("CUS110", "Karan Singh", "karan@gmail.com", 9876543219L, "Salt Lake", "Kolkata", "West Bengal", "India", "Male", 33, "Premium", "Gold", "Project Manager", "TCS", "700091", "Active");
		
		System.out.println("=========================Customer Details=========================");
		System.out.println("Object Reference is: " + c1);
		System.out.println("Customer ID is: " + c1.getCustomerID());
		System.out.println("Customer Name is: " + c1.getCustomerName());
		System.out.println("Email is: " + c1.getEmail());
		System.out.println("Phone Number is: " + c1.getPhoneNumber());
		System.out.println("Address is: " + c1.getAddress());
		System.out.println("City is: " + c1.getCity());
		System.out.println("State is: " + c1.getState());
		System.out.println("Country is: " + c1.getCountry());
		System.out.println("Gender is: " + c1.getGender());
		System.out.println("Age is: " + c1.getAge());
		System.out.println("Customer Type is: " + c1.getCustomerType());
		System.out.println("Membership is: " + c1.getMembership());
		System.out.println("Occupation is: " + c1.getOccupation());
		System.out.println("Company Name is: " + c1.getCompanyName());
		System.out.println("Pincode is: " + c1.getPincode());
		System.out.println("Account Status is: " + c1.getAccountStatus());
		
		System.out.println("=========================Customer Details 1=========================");

		System.out.println("Object Reference is: " + c1);
		System.out.println("Customer ID is: " + c1.getCustomerID());
		System.out.println("Customer Name is: " + c1.getCustomerName());
		System.out.println("Email is: " + c1.getEmail());
		System.out.println("Phone Number is: " + c1.getPhoneNumber());
		System.out.println("Address is: " + c1.getAddress());
		System.out.println("City is: " + c1.getCity());
		System.out.println("State is: " + c1.getState());
		System.out.println("Country is: " + c1.getCountry());
		System.out.println("Gender is: " + c1.getGender());
		System.out.println("Age is: " + c1.getAge());
		System.out.println("Customer Type is: " + c1.getCustomerType());
		System.out.println("Membership is: " + c1.getMembership());
		System.out.println("Occupation is: " + c1.getOccupation());
		System.out.println("Company Name is: " + c1.getCompanyName());
		System.out.println("Pincode is: " + c1.getPincode());
		System.out.println("Account Status is: " + c1.getAccountStatus());


		System.out.println("=========================Customer Details 2=========================");

		System.out.println("Object Reference is: " + c2);
		System.out.println("Customer ID is: " + c2.getCustomerID());
		System.out.println("Customer Name is: " + c2.getCustomerName());
		System.out.println("Email is: " + c2.getEmail());
		System.out.println("Phone Number is: " + c2.getPhoneNumber());
		System.out.println("Address is: " + c2.getAddress());
		System.out.println("City is: " + c2.getCity());
		System.out.println("State is: " + c2.getState());
		System.out.println("Country is: " + c2.getCountry());
		System.out.println("Gender is: " + c2.getGender());
		System.out.println("Age is: " + c2.getAge());
		System.out.println("Customer Type is: " + c2.getCustomerType());
		System.out.println("Membership is: " + c2.getMembership());
		System.out.println("Occupation is: " + c2.getOccupation());
		System.out.println("Company Name is: " + c2.getCompanyName());
		System.out.println("Pincode is: " + c2.getPincode());
		System.out.println("Account Status is: " + c2.getAccountStatus());


		System.out.println("=========================Customer Details 3=========================");

		System.out.println("Object Reference is: " + c3);
		System.out.println("Customer ID is: " + c3.getCustomerID());
		System.out.println("Customer Name is: " + c3.getCustomerName());
		System.out.println("Email is: " + c3.getEmail());
		System.out.println("Phone Number is: " + c3.getPhoneNumber());
		System.out.println("Address is: " + c3.getAddress());
		System.out.println("City is: " + c3.getCity());
		System.out.println("State is: " + c3.getState());
		System.out.println("Country is: " + c3.getCountry());
		System.out.println("Gender is: " + c3.getGender());
		System.out.println("Age is: " + c3.getAge());
		System.out.println("Customer Type is: " + c3.getCustomerType());
		System.out.println("Membership is: " + c3.getMembership());
		System.out.println("Occupation is: " + c3.getOccupation());
		System.out.println("Company Name is: " + c3.getCompanyName());
		System.out.println("Pincode is: " + c3.getPincode());
		System.out.println("Account Status is: " + c3.getAccountStatus());


		System.out.println("=========================Customer Details 4=========================");

		System.out.println("Object Reference is: " + c4);
		System.out.println("Customer ID is: " + c4.getCustomerID());
		System.out.println("Customer Name is: " + c4.getCustomerName());
		System.out.println("Email is: " + c4.getEmail());
		System.out.println("Phone Number is: " + c4.getPhoneNumber());
		System.out.println("Address is: " + c4.getAddress());
		System.out.println("City is: " + c4.getCity());
		System.out.println("State is: " + c4.getState());
		System.out.println("Country is: " + c4.getCountry());
		System.out.println("Gender is: " + c4.getGender());
		System.out.println("Age is: " + c4.getAge());
		System.out.println("Customer Type is: " + c4.getCustomerType());
		System.out.println("Membership is: " + c4.getMembership());
		System.out.println("Occupation is: " + c4.getOccupation());
		System.out.println("Company Name is: " + c4.getCompanyName());
		System.out.println("Pincode is: " + c4.getPincode());
		System.out.println("Account Status is: " + c4.getAccountStatus());


		System.out.println("=========================Customer Details 5=========================");

		System.out.println("Object Reference is: " + c5);
		System.out.println("Customer ID is: " + c5.getCustomerID());
		System.out.println("Customer Name is: " + c5.getCustomerName());
		System.out.println("Email is: " + c5.getEmail());
		System.out.println("Phone Number is: " + c5.getPhoneNumber());
		System.out.println("Address is: " + c5.getAddress());
		System.out.println("City is: " + c5.getCity());
		System.out.println("State is: " + c5.getState());
		System.out.println("Country is: " + c5.getCountry());
		System.out.println("Gender is: " + c5.getGender());
		System.out.println("Age is: " + c5.getAge());
		System.out.println("Customer Type is: " + c5.getCustomerType());
		System.out.println("Membership is: " + c5.getMembership());
		System.out.println("Occupation is: " + c5.getOccupation());
		System.out.println("Company Name is: " + c5.getCompanyName());
		System.out.println("Pincode is: " + c5.getPincode());
		System.out.println("Account Status is: " + c5.getAccountStatus());


		System.out.println("=========================Customer Details 6=========================");

		System.out.println("Object Reference is: " + c6);
		System.out.println("Customer ID is: " + c6.getCustomerID());
		System.out.println("Customer Name is: " + c6.getCustomerName());
		System.out.println("Email is: " + c6.getEmail());
		System.out.println("Phone Number is: " + c6.getPhoneNumber());
		System.out.println("Address is: " + c6.getAddress());
		System.out.println("City is: " + c6.getCity());
		System.out.println("State is: " + c6.getState());
		System.out.println("Country is: " + c6.getCountry());
		System.out.println("Gender is: " + c6.getGender());
		System.out.println("Age is: " + c6.getAge());
		System.out.println("Customer Type is: " + c6.getCustomerType());
		System.out.println("Membership is: " + c6.getMembership());
		System.out.println("Occupation is: " + c6.getOccupation());
		System.out.println("Company Name is: " + c6.getCompanyName());
		System.out.println("Pincode is: " + c6.getPincode());
		System.out.println("Account Status is: " + c6.getAccountStatus());


		System.out.println("=========================Customer Details 7=========================");

		System.out.println("Object Reference is: " + c7);
		System.out.println("Customer ID is: " + c7.getCustomerID());
		System.out.println("Customer Name is: " + c7.getCustomerName());
		System.out.println("Email is: " + c7.getEmail());
		System.out.println("Phone Number is: " + c7.getPhoneNumber());
		System.out.println("Address is: " + c7.getAddress());
		System.out.println("City is: " + c7.getCity());
		System.out.println("State is: " + c7.getState());
		System.out.println("Country is: " + c7.getCountry());
		System.out.println("Gender is: " + c7.getGender());
		System.out.println("Age is: " + c7.getAge());
		System.out.println("Customer Type is: " + c7.getCustomerType());
		System.out.println("Membership is: " + c7.getMembership());
		System.out.println("Occupation is: " + c7.getOccupation());
		System.out.println("Company Name is: " + c7.getCompanyName());
		System.out.println("Pincode is: " + c7.getPincode());
		System.out.println("Account Status is: " + c7.getAccountStatus());


		System.out.println("=========================Customer Details 8=========================");

		System.out.println("Object Reference is: " + c8);
		System.out.println("Customer ID is: " + c8.getCustomerID());
		System.out.println("Customer Name is: " + c8.getCustomerName());
		System.out.println("Email is: " + c8.getEmail());
		System.out.println("Phone Number is: " + c8.getPhoneNumber());
		System.out.println("Address is: " + c8.getAddress());
		System.out.println("City is: " + c8.getCity());
		System.out.println("State is: " + c8.getState());
		System.out.println("Country is: " + c8.getCountry());
		System.out.println("Gender is: " + c8.getGender());
		System.out.println("Age is: " + c8.getAge());
		System.out.println("Customer Type is: " + c8.getCustomerType());
		System.out.println("Membership is: " + c8.getMembership());
		System.out.println("Occupation is: " + c8.getOccupation());
		System.out.println("Company Name is: " + c8.getCompanyName());
		System.out.println("Pincode is: " + c8.getPincode());
		System.out.println("Account Status is: " + c8.getAccountStatus());


		System.out.println("=========================Customer Details 9=========================");

		System.out.println("Object Reference is: " + c9);
		System.out.println("Customer ID is: " + c9.getCustomerID());
		System.out.println("Customer Name is: " + c9.getCustomerName());
		System.out.println("Email is: " + c9.getEmail());
		System.out.println("Phone Number is: " + c9.getPhoneNumber());
		System.out.println("Address is: " + c9.getAddress());
		System.out.println("City is: " + c9.getCity());
		System.out.println("State is: " + c9.getState());
		System.out.println("Country is: " + c9.getCountry());
		System.out.println("Gender is: " + c9.getGender());
		System.out.println("Age is: " + c9.getAge());
		System.out.println("Customer Type is: " + c9.getCustomerType());
		System.out.println("Membership is: " + c9.getMembership());
		System.out.println("Occupation is: " + c9.getOccupation());
		System.out.println("Company Name is: " + c9.getCompanyName());
		System.out.println("Pincode is: " + c9.getPincode());
		System.out.println("Account Status is: " + c9.getAccountStatus());


		System.out.println("=========================Customer Details 10=========================");

		System.out.println("Object Reference is: " + c10);
		System.out.println("Customer ID is: " + c10.getCustomerID());
		System.out.println("Customer Name is: " + c10.getCustomerName());
		System.out.println("Email is: " + c10.getEmail());
		System.out.println("Phone Number is: " + c10.getPhoneNumber());
		System.out.println("Address is: " + c10.getAddress());
		System.out.println("City is: " + c10.getCity());
		System.out.println("State is: " + c10.getState());
		System.out.println("Country is: " + c10.getCountry());
		System.out.println("Gender is: " + c10.getGender());
		System.out.println("Age is: " + c10.getAge());
		System.out.println("Customer Type is: " + c10.getCustomerType());
		System.out.println("Membership is: " + c10.getMembership());
		System.out.println("Occupation is: " + c10.getOccupation());
		System.out.println("Company Name is: " + c10.getCompanyName());
		System.out.println("Pincode is: " + c10.getPincode());
		System.out.println("Account Status is: " + c10.getAccountStatus());
		
		System.out.println("=======================================Main Method Ends=====================================");

		
	}

}
