package abstraction.ElectricityBill;

public class ElectricityBillDriver {

	public static void main(String[] args) {

		ElectricityBill e1 = new DomesticBill(102, "Amit Kumar", "CON102", "Domestic", "Indira Nagar", "Lucknow",
				"Uttar Pradesh", "MTR102", 180, "September 2026", "15-10-2026", 120, 5, 50, 0, true, true);
		ElectricityBill e2 = new DomesticBill(103, "Rahul Sharma", "CON103", "Domestic", "Gomti Nagar", "Lucknow",
				"Uttar Pradesh", "MTR103", 250, "September 2026", "15-10-2026", 150, 5, 100, 50, true, false);
		ElectricityBill e3 = new DomesticBill(104, "Priya Singh", "CON104", "Domestic", "Aliganj", "Lucknow",
				"Uttar Pradesh", "MTR104", 320, "September 2026", "15-10-2026", 180, 5, 75, 0, true, true);
		ElectricityBill e4 = new DomesticBill(105, "Vikas Verma", "CON105", "Domestic", "Hazratganj", "Lucknow",
				"Uttar Pradesh", "MTR105", 145, "September 2026", "15-10-2026", 100, 5, 25, 30, false, false);
		ElectricityBill e5 = new DomesticBill(106, "Neha Gupta", "CON106", "Domestic", "Indira Nagar", "Lucknow",
				"Uttar Pradesh", "MTR106", 410, "September 2026", "15-10-2026", 200, 5, 150, 0, true, true);
		ElectricityBill e6 = new DomesticBill(107, "Rohit Singh", "CON107", "Domestic", "Rajajipuram", "Lucknow",
				"Uttar Pradesh", "MTR107", 220, "September 2026", "15-10-2026", 130, 5, 50, 40, false, false);
		ElectricityBill e7 = new DomesticBill(108, "Pooja Mishra", "CON108", "Domestic", "Mahanagar", "Lucknow",
				"Uttar Pradesh", "MTR108", 275, "September 2026", "15-10-2026", 160, 5, 80, 0, true, true);
		ElectricityBill e8 = new DomesticBill(109, "Sanjay Kumar", "CON109", "Domestic", "Vikas Nagar", "Lucknow",
				"Uttar Pradesh", "MTR109", 390, "September 2026", "15-10-2026", 175, 5, 100, 60, true, false);
		ElectricityBill e9 = new DomesticBill(110, "Anjali Singh", "CON110", "Domestic", "Gomti Nagar Extension",
				"Lucknow", "Uttar Pradesh", "MTR110", 160, "September 2026", "15-10-2026", 110, 5, 40, 0, true, true);
		ElectricityBill e10 = new DomesticBill(111, "Manish Tiwari", "CON111", "Domestic", "Chinhat", "Lucknow",
				"Uttar Pradesh", "MTR111", 450, "September 2026", "15-10-2026", 220, 5, 125, 75, false, false);
		
		System.out.println(e1);
		System.out.println("==============");

		System.out.println(e2);
		System.out.println("==============");

		System.out.println(e3);
		System.out.println("==============");

		System.out.println(e4);
		System.out.println("==============");

		System.out.println(e5);
		System.out.println("==============");

		System.out.println(e6);
		System.out.println("==============");

		System.out.println(e7);
		System.out.println("==============");

		System.out.println(e8);
		System.out.println("==============");

		System.out.println(e9);
		System.out.println("==============");

		System.out.println(e10);
		System.out.println("==============");
		
		System.out.println("====================e1 Details=======================");
		System.out.println("Bill is: " + e1.calculateBill());
		e1.displayBillAmount();

		System.out.println("====================e2 Details=======================");
		System.out.println("Bill is: " + e2.calculateBill());
		e2.displayBillAmount();

		System.out.println("====================e3 Details=======================");
		System.out.println("Bill is: " + e3.calculateBill());
		e3.displayBillAmount();

		System.out.println("====================e4 Details=======================");
		System.out.println("Bill is: " + e4.calculateBill());
		e4.displayBillAmount();

		System.out.println("====================e5 Details=======================");
		System.out.println("Bill is: " + e5.calculateBill());
		e5.displayBillAmount();

		System.out.println("====================e6 Details=======================");
		System.out.println("Bill is: " + e6.calculateBill());
		e6.displayBillAmount();

		System.out.println("====================e7 Details=======================");
		System.out.println("Bill is: " + e7.calculateBill());
		e7.displayBillAmount();

		System.out.println("====================e8 Details=======================");
		System.out.println("Bill is: " + e8.calculateBill());
		e8.displayBillAmount();

		System.out.println("====================e9 Details=======================");
		System.out.println("Bill is: " + e9.calculateBill());
		e9.displayBillAmount();

		System.out.println("====================e10 Details=======================");
		System.out.println("Bill is: " + e10.calculateBill());
		e10.displayBillAmount();

		ElectricityBill e11 = new CommercialBill(202, "XYZ Pvt Ltd", "CON202", "Commercial", "Sector 18", "Noida",
		        "Uttar Pradesh", "MTR202", 2500, "September 2026", "15-10-2026", 10000, 3000, 18, 1000, 0.95, true, false);
		ElectricityBill e12 = new CommercialBill(203, "ABC Enterprises", "CON203", "Commercial", "Sector 62", "Noida",
		        "Uttar Pradesh", "MTR203", 3200, "September 2026", "15-10-2026", 12000, 3500, 18, 750, 0.92, true, true);
		ElectricityBill e13 = new CommercialBill(204, "Tech Solutions Pvt Ltd", "CON204", "Commercial", "Cyber City", "Gurugram",
		        "Haryana", "MTR204", 4500, "September 2026", "15-10-2026", 15000, 5000, 18, 1200, 0.96, true, false);
		ElectricityBill e14 = new CommercialBill(205, "Sharma Industries", "CON205", "Commercial", "Industrial Area", "Kanpur",
		        "Uttar Pradesh", "MTR205", 5200, "September 2026", "15-10-2026", 18000, 6000, 18, 1500, 0.88, true, true);
		ElectricityBill e15 = new CommercialBill(206, "Bright Retail Store", "CON206", "Commercial", "Hazratganj", "Lucknow",
		        "Uttar Pradesh", "MTR206", 1800, "September 2026", "15-10-2026", 7000, 2500, 18, 500, 0.91, false, false);
		ElectricityBill e16 = new CommercialBill(207, "Global Traders", "CON207", "Commercial", "Aliganj", "Lucknow",
		        "Uttar Pradesh", "MTR207", 2800, "September 2026", "15-10-2026", 9500, 3200, 18, 800, 0.87, true, false);
		ElectricityBill e17 = new CommercialBill(208, "Metro Hospital", "CON208", "Commercial", "Gomti Nagar", "Lucknow",
		        "Uttar Pradesh", "MTR208", 3800, "September 2026", "15-10-2026", 14000, 4500, 18, 1000, 0.94, true, true);
		ElectricityBill e18 = new CommercialBill(209, "Royal Hotel", "CON209", "Commercial", "MG Road", "Agra",
		        "Uttar Pradesh", "MTR209", 6000, "September 2026", "15-10-2026", 20000, 7000, 18, 2000, 0.89, true, false);
		ElectricityBill e19 = new CommercialBill(210, "Modern Mall", "CON210", "Commercial", "Sector 21", "Noida",
		        "Uttar Pradesh", "MTR210", 7500, "September 2026", "15-10-2026", 25000, 8500, 18, 2500, 0.97, true, true);
		ElectricityBill e20 = new CommercialBill(211, "Sunrise Manufacturing", "CON211", "Commercial", "Industrial Estate", "Ghaziabad",
		        "Uttar Pradesh", "MTR211", 9000, "September 2026", "15-10-2026", 30000, 10000, 18, 3000, 0.86, true, true);
		
		System.out.println(e11);
		System.out.println("====================");

		System.out.println(e12);
		System.out.println("====================");

		System.out.println(e13);
		System.out.println("====================");

		System.out.println(e14);
		System.out.println("====================");

		System.out.println(e15);
		System.out.println("====================");

		System.out.println(e16);
		System.out.println("====================");

		System.out.println(e17);
		System.out.println("====================");

		System.out.println(e18);
		System.out.println("====================");

		System.out.println(e19);
		System.out.println("====================");

		System.out.println(e20);
		System.out.println("====================");
		
		System.out.println("====================e11 Details=======================");
		System.out.println("Bill is: " + e11.calculateBill());
		e11.displayBillAmount();

		System.out.println("====================e12 Details=======================");
		System.out.println("Bill is: " + e12.calculateBill());
		e12.displayBillAmount();

		System.out.println("====================e13 Details=======================");
		System.out.println("Bill is: " + e13.calculateBill());
		e13.displayBillAmount();

		System.out.println("====================e14 Details=======================");
		System.out.println("Bill is: " + e14.calculateBill());
		e14.displayBillAmount();

		System.out.println("====================e15 Details=======================");
		System.out.println("Bill is: " + e15.calculateBill());
		e15.displayBillAmount();

		System.out.println("====================e16 Details=======================");
		System.out.println("Bill is: " + e16.calculateBill());
		e16.displayBillAmount();

		System.out.println("====================e17 Details=======================");
		System.out.println("Bill is: " + e17.calculateBill());
		e17.displayBillAmount();

		System.out.println("====================e18 Details=======================");
		System.out.println("Bill is: " + e18.calculateBill());
		e18.displayBillAmount();

		System.out.println("====================e19 Details=======================");
		System.out.println("Bill is: " + e19.calculateBill());
		e19.displayBillAmount();

		System.out.println("====================e20 Details=======================");
		System.out.println("Bill is: " + e20.calculateBill());
		e20.displayBillAmount();
	}

}
