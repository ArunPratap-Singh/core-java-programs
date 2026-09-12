package inheritanceProgramingMultilevel.Organization;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("==================================Main Method Starts=======================================");

		Director d1 = new Director("Global Technology Organization", "New Delhi", "Tech Solutions India Pvt Ltd", 101, "Software Development", "Bangalore", 1001, "Arunendra Singh", 250000.50, "Java Development Team", 15, 12, "Software Architecture", "North India", 50000000.00);
		Director d2 = new Director("Global Business Organization", "Mumbai", "Business Solutions Pvt Ltd", 102, "Information Technology", "Pune", 1002, "Rahul Sharma", 275000.75, "Software Testing Team", 18, 14, "Test Automation", "West India", 55000000.00);
		Director d3 = new Director("Digital Innovation Organization", "Bangalore", "Digital Systems Ltd", 103, "Product Development", "Hyderabad", 1003, "Priya Verma", 300000.00, "Product Engineering Team", 20, 15, "Product Management", "South India", 60000000.00);
		Director d4 = new Director("International Technology Organization", "Delhi", "Global Software Pvt Ltd", 104, "Cloud Computing", "Noida", 1004, "Amit Kumar", 325000.50, "Cloud Development Team", 22, 16, "Cloud Architecture", "North India", 65000000.00);
		Director d5 = new Director("Enterprise Solutions Organization", "Chennai", "Enterprise Technologies Ltd", 105, "Data Engineering", "Chennai", 1005, "Sneha Singh", 280000.25, "Data Engineering Team", 16, 13, "Big Data", "South India", 52000000.00);
		Director d6 = new Director("Smart Systems Organization", "Hyderabad", "Smart Tech Pvt Ltd", 106, "Artificial Intelligence", "Hyderabad", 1006, "Vikas Gupta", 350000.00, "AI Development Team", 25, 17, "Machine Learning", "South India", 70000000.00);
		Director d7 = new Director("Future Technology Organization", "Pune", "Future Innovations Ltd", 107, "Research and Development", "Mumbai", 1007, "Neha Kapoor", 310000.75, "Research Team", 19, 14, "Technology Innovation", "West India", 58000000.00);
		Director d8 = new Director("Global Finance Organization", "Mumbai", "Finance Technology Ltd", 108, "Financial Technology", "Bangalore", 1008, "Rohan Mehta", 360000.50, "FinTech Development Team", 24, 18, "Financial Systems", "West India", 75000000.00);
		Director d9 = new Director("Healthcare Technology Organization", "Delhi", "HealthTech Solutions Pvt Ltd", 109, "Healthcare Software", "Noida", 1009, "Anjali Gupta", 290000.00, "Healthcare Development Team", 17, 12, "Healthcare Systems", "North India", 54000000.00);
		Director d10 = new Director("E-Commerce Organization", "Bangalore", "Online Shopping Technologies Ltd", 110, "E-Commerce Development", "Bangalore", 1010, "Karan Malhotra", 340000.25, "E-Commerce Team", 23, 16, "Enterprise Architecture", "South India", 68000000.00);
		Director d11 = new Director("Education Technology Organization", "Pune", "EdTech Solutions Pvt Ltd", 111, "Learning Platform Development", "Pune", 1011, "Pooja Sharma", 270000.50, "EdTech Development Team", 14, 11, "Learning Systems", "West India", 48000000.00);
		Director d12 = new Director("Banking Technology Organization", "Mumbai", "Banking Systems Ltd", 112, "Banking Software", "Mumbai", 1012, "Suresh Yadav", 380000.00, "Banking Development Team", 28, 20, "Banking Architecture", "West India", 80000000.00);
		Director d13 = new Director("Automation Technology Organization", "Delhi", "Automation Solutions Pvt Ltd", 113, "Test Automation", "Gurgaon", 1013, "Kavita Singh", 295000.75, "Automation Testing Team", 16, 13, "Selenium Automation", "North India", 56000000.00);
		Director d14 = new Director("Mobile Technology Organization", "Bangalore", "Mobile Apps Pvt Ltd", 114, "Mobile Application Development", "Chennai", 1014, "Manish Verma", 330000.50, "Mobile Development Team", 21, 15, "Android Development", "South India", 63000000.00);
		Director d15 = new Director("Cyber Security Organization", "New Delhi", "Secure Systems Pvt Ltd", 115, "Cyber Security", "Noida", 1015, "Ritika Kapoor", 370000.25, "Security Engineering Team", 26, 19, "Cyber Security Architecture", "North India", 78000000.00);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		System.out.println(d14);
		System.out.println(d15);

		System.out.println("=====================================Main Method Ends==========================================");

	}

}
