package upcastingdowncasting;

public class DriverBus {
	
	public static void main(String[] args) {
		
		Vehicle v1 = new Bus("Volvo 9400", 9000000, 6, "Delhi-Jaipur", "AC");
		Vehicle v2 = new Bus("Ashok Leyland Viking", 3500000, 6, "Noida-Agra", "AC");
		Vehicle v3 = new Bus("Tata Starbus", 2800000, 6, "Gurgaon-Delhi", "AC");
		Vehicle v4 = new Bus("Eicher Skyline Pro", 3200000, 6, "Chandigarh-Manali", "AC");
		Vehicle v5 = new Bus("BharatBenz Staff Bus", 3800000, 6, "Pune-Mumbai", "AC");
		Vehicle v6 = new Bus("Scania Metrolink", 10000000, 6, "Banglore-Hydrabad", "AC");
		Vehicle v7 = new Bus("Mini Bus Force Traveller", 1800000, 4, "School Route", "non AC");
		Vehicle v8 = new Bus("Mahindra Cruzio", 3000000, 6, "Lucknow-Kanpur", "AC");
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		System.out.println("========================================================================");
		
		System.out.println("===========V1 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v1.name);
		System.out.println("Price is: " +v1.price);
		System.out.println("Number of wheels is: " +v1.numberofwheels);
		
		System.out.println("===========V2 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v2.name);
		System.out.println("Price is: " +v2.price);
		System.out.println("Number of wheels is: " +v2.numberofwheels);
		
		System.out.println("===========V3 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v3.name);
		System.out.println("Price is: " +v3.price);
		System.out.println("Number of wheels is: " +v3.numberofwheels);
		
		System.out.println("===========V4 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v4.name);
		System.out.println("Price is: " +v4.price);
		System.out.println("Number of wheels is: " +v4.numberofwheels);
		
		System.out.println("===========V5 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v5.name);
		System.out.println("Price is: " +v5.price);
		System.out.println("Number of wheels is: " +v5.numberofwheels);
		
		System.out.println("============V6 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v6.name);
		System.out.println("Price is: " +v6.price);
		System.out.println("Number Of Wheels is: " +v6.numberofwheels);
		
		System.out.println("===========V7 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v7.name);
		System.out.println("Price is: " +v7.price);
		System.out.println("Number of wheels is: " +v7.numberofwheels);
		
		System.out.println("===========V8 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v8.name);
		System.out.println("Price is: " +v8.price);
		System.out.println("Number of wheels is: " +v8.numberofwheels);
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("================================================");
		
		Bus b1 = (Bus) v1;
		Bus b2 = (Bus) v2;
		Bus b3 = (Bus) v3;
		Bus b4 = (Bus) v4;
		Bus b5 = (Bus) v5;
		Bus b6 = (Bus) v6;
		Bus b7 = (Bus) v7;
		Bus b8 = (Bus) v8;
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		System.out.println("============================================================");
		
		System.out.println("===========b1 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b1.name);
		System.out.println("Price is: " +b1.price);
		System.out.println("Number of wheels is: " +b1.numberofwheels);
		System.out.println("Route is: " +b1.route);
		System.out.println("AC non AC is: " +b1.ACnonAC);
		
		System.out.println("===========b2 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b2.name);
		System.out.println("Price is: " +b2.price);
		System.out.println("Number of wheels is: " +b2.numberofwheels);
		System.out.println("Route is: " +b2.route);
		System.out.println("AC non AC is: " +b2.ACnonAC);
		
		System.out.println("===========b3 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b3.name);
		System.out.println("Price is: " +b3.price);
		System.out.println("Number of wheels is: " +b3.numberofwheels);
		System.out.println("Route is: " +b3.route);
		System.out.println("AC non AC is: " +b3.ACnonAC);
		
		System.out.println("===========b4 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b4.name);
		System.out.println("Price is: " +b4.price);
		System.out.println("Number of wheels is: " +b4.numberofwheels);
		System.out.println("Route is: " +b4.route);
		System.out.println("AC non AC is: " +b4.ACnonAC);
		
		System.out.println("===========b5 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b5.name);
		System.out.println("Price is: " +b5.price);
		System.out.println("Number of wheels is: " +b5.numberofwheels);
		System.out.println("Route is: " +b5.route);
		System.out.println("AC non AC is: " +b5.ACnonAC);
		
		System.out.println("===========b6 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b6.name);
		System.out.println("Price is: " +b6.price);
		System.out.println("Number of wheels is: " +b6.numberofwheels);
		System.out.println("Route is: " +b6.route);
		System.out.println("AC non AC is: " +b6.ACnonAC);
		
		System.out.println("===========b7 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b7.name);
		System.out.println("Price is: " +b7.price);
		System.out.println("Number of wheels is: " +b7.numberofwheels);
		System.out.println("Route is: " +b7.route);
		System.out.println("AC non AC is: " +b7.ACnonAC);
		
		System.out.println("===========b8 DOWNCASTING DETAILS===========");
		System.out.println("Name is: " +b8.name);
		System.out.println("Price is: " +b8.price);
		System.out.println("Number of wheels is: " +b8.numberofwheels);
		System.out.println("Route is: " +b8.route);
		System.out.println("AC non AC is: " +b8.ACnonAC);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
	}

}
