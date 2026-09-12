package inheritanceProgramingMultilevel.Account;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("===================================Main Method Starts======================================");

		WealthAccount w1 = new WealthAccount("Arun", "WA1001", "HDFC Bank", 500000, "Lucknow", 7.5, true, "Platinum", 100000, "Mutual Funds", 2000000, "Rahul Sharma", 12.5, "Amit Verma", 5000000);
		WealthAccount w2 = new WealthAccount("Rahul", "WA1002", "ICICI Bank", 750000, "Delhi", 7.8, true, "Diamond", 150000, "Stocks", 3000000, "Vikas Singh", 14.2, "Raj Mehta", 7500000);
		WealthAccount w3 = new WealthAccount("Priya", "WA1003", "SBI Bank", 600000, "Mumbai", 7.2, true, "Platinum", 120000, "Bonds", 2500000, "Neha Sharma", 10.8, "Sanjay Kapoor", 6000000);
		WealthAccount w4 = new WealthAccount("Amit", "WA1004", "Axis Bank", 900000, "Bangalore", 8.0, true, "Diamond", 200000, "Real Estate", 5000000, "Rohit Verma", 15.5, "Manoj Gupta", 10000000);
		WealthAccount w5 = new WealthAccount("Neha", "WA1005", "Kotak Bank", 450000, "Pune", 7.6, false, "Platinum", 90000, "Mutual Funds", 1800000, "Karan Malhotra", 11.5, "Deepak Jain", 4500000);
		WealthAccount w6 = new WealthAccount("Vikas", "WA1006", "Yes Bank", 850000, "Hyderabad", 8.2, true, "Diamond", 175000, "Stocks", 4000000, "Ankit Sharma", 16.0, "Ramesh Gupta", 9000000);
		WealthAccount w7 = new WealthAccount("Sneha", "WA1007", "HDFC Bank", 550000, "Chennai", 7.4, true, "Platinum", 110000, "Bonds", 2200000, "Pooja Verma", 10.5, "Suresh Kumar", 5500000);
		WealthAccount w8 = new WealthAccount("Rohit", "WA1008", "ICICI Bank", 1000000, "Kolkata", 8.5, true, "Diamond", 250000, "Stocks", 6000000, "Nitin Agarwal", 18.0, "Vivek Sharma", 12000000);
		WealthAccount w9 = new WealthAccount("Pooja", "WA1009", "SBI Bank", 700000, "Jaipur", 7.7, false, "Platinum", 140000, "Gold", 3000000, "Ravi Singh", 13.0, "Ashok Mehta", 7000000);
		WealthAccount w10 = new WealthAccount("Sanjay", "WA1010", "Axis Bank", 950000, "Noida", 8.1, true, "Diamond", 225000, "Real Estate", 4500000, "Manish Kumar", 15.2, "Ajay Verma", 9500000);
		WealthAccount w11 = new WealthAccount("Karan", "WA1011", "Kotak Bank", 650000, "Gurgaon", 7.9, true, "Platinum", 130000, "Mutual Funds", 2800000, "Rakesh Sharma", 12.8, "Mohan Gupta", 6500000);
		WealthAccount w12 = new WealthAccount("Anjali", "WA1012", "HDFC Bank", 800000, "Lucknow", 8.3, true, "Diamond", 180000, "Stocks", 3500000, "Vijay Singh", 15.0, "Rajesh Verma", 8500000);
		WealthAccount w13 = new WealthAccount("Manoj", "WA1013", "ICICI Bank", 1200000, "Delhi", 8.7, true, "Diamond", 300000, "Bonds", 7000000, "Suresh Sharma", 13.5, "Ravi Kapoor", 15000000);
		WealthAccount w14 = new WealthAccount("Deepa", "WA1014", "SBI Bank", 500000, "Kanpur", 7.3, false, "Platinum", 100000, "Gold", 2000000, "Amit Sharma", 11.2, "Vishal Gupta", 5000000);
		WealthAccount w15 = new WealthAccount("Vivek", "WA1015", "Axis Bank", 1100000, "Mumbai", 8.6, true, "Diamond", 275000, "Mutual Funds", 5500000, "Rahul Verma", 14.8, "Arvind Mehta", 11000000);
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		System.out.println(w7);
		System.out.println(w8);
		System.out.println(w9);
		System.out.println(w10);
		System.out.println(w11);
		System.out.println(w12);
		System.out.println(w13);
		System.out.println(w14);
		System.out.println(w15);
		
		System.out.println("=======================================Main Method Ends==============================================");
	}

}
