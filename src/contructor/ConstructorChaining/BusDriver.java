package contructor.ConstructorChaining;

public class BusDriver {

	public static void main(String[] args) {

		System.out.println("=====================================Main Method Starts======================================");

		Bus b1 = new Bus("Volvo Express", "UP32A1001", "Lucknow", "Delhi", 45, 1500.0, "08:00 AM", "AC Sleeper");
		Bus b2 = new Bus();
		Bus b3 = new Bus("Roadways Express");
		Bus b4 = new Bus("Volvo Bus", "UP32B2002");
		Bus b5 = new Bus("Shatabdi Bus", "UP32C3003", "Lucknow");
		Bus b6 = new Bus("City Express", "UP32D4004", "Kanpur", "Lucknow");
		Bus b7 = new Bus("Rajdhani Bus", "UP32E5005", "Delhi", "Jaipur", 50);
		Bus b8 = new Bus("Highway Express", "UP32F6006", "Agra", "Delhi", 45, 900.0);
		Bus b9 = new Bus(40, "Volvo Multi Axle", "DL01A7007", "Delhi", "Chandigarh", 1200.0, "07:30 AM", "AC Seater");
		Bus b10 = new Bus(45, "Sleeper Express", "DL01B8008", "Delhi", "Jaipur", 1800.0, "09:00 PM", "Sleeper");
		Bus b11 = new Bus("Royal Travels", "UP32C9009", "Lucknow", "Varanasi", 40, 850.0, "06:30 AM", "AC Seater");
		Bus b12 = new Bus("Shiv Travels", "UP32D1010", "Lucknow", "Prayagraj", 45, 700.0, "07:00 AM", "Non AC");
		Bus b13 = new Bus("Green Line", "UP32E1111", "Delhi", "Haridwar", 50, 1000.0, "08:30 AM", "AC Seater");
		Bus b14 = new Bus("City Rider", "UP32F1212", "Noida", "Agra", 40, 650.0, "09:30 AM", "Electric");
		Bus b15 = new Bus("Express Rider", "UP32G1313", "Kanpur", "Delhi", 45, 1100.0, "10:00 AM", "AC Sleeper");
		Bus b16 = new Bus("Blue Line", "DL01H1414", "Delhi", "Amritsar", 50, 1300.0, "11:00 AM", "AC Seater");
		Bus b17 = new Bus("Golden Travels", "RJ14A1515", "Jaipur", "Delhi", 45, 1000.0, "05:00 AM", "AC Sleeper");
		Bus b18 = new Bus("Desert Express", "RJ14B1616", "Jaipur", "Jodhpur", 40, 800.0, "06:00 AM", "Non AC");
		Bus b19 = new Bus("Pink City Bus", "RJ14C1717", "Jaipur", "Udaipur", 45, 950.0, "07:30 AM", "AC Seater");
		Bus b20 = new Bus("Mewar Travels", "RJ14D1818", "Udaipur", "Delhi", 40, 1400.0, "08:00 PM", "Sleeper");
		Bus b21 = new Bus("South Express", "KA01A1919", "Bangalore", "Chennai", 45, 900.0, "09:00 PM", "AC Sleeper");
		Bus b22 = new Bus("Karnataka Travels", "KA01B2020", "Bangalore", "Mysore", 50, 500.0, "06:00 AM", "AC Seater");
		Bus b23 = new Bus("Tamil Express", "TN01C2121", "Chennai", "Coimbatore", 45, 750.0, "07:00 AM", "AC Seater");
		Bus b24 = new Bus("Coastal Rider", "TN01D2222", "Chennai", "Pondicherry", 40, 450.0, "08:00 AM", "Non AC");
		Bus b25 = new Bus("Kerala Express", "KL01E2323", "Kochi", "Trivandrum", 45, 650.0, "09:00 AM", "AC Seater");
		Bus b26 = new Bus("Malabar Travels", "KL01F2424", "Kozhikode", "Kochi", 50, 550.0, "10:00 AM", "AC Seater");
		Bus b27 = new Bus("Hyderabad Express", "TS01G2525", "Hyderabad", "Bangalore", 45, 950.0, "08:30 PM", "Sleeper");
		Bus b28 = new Bus("Deccan Travels", "TS01H2626", "Hyderabad", "Mumbai", 40, 1300.0, "09:00 PM", "AC Sleeper");
		Bus b29 = new Bus("Mumbai Express", "MH01A2727", "Mumbai", "Pune", 45, 600.0, "06:00 AM", "AC Seater");
		Bus b30 = new Bus("Maharashtra Travels", "MH01B2828", "Mumbai", "Nashik", 50, 700.0, "07:00 AM", "Electric");
		Bus b31 = new Bus("Gujarat Express", "GJ01C2929", "Ahmedabad", "Surat", 45, 650.0, "08:00 AM", "AC Seater");
		Bus b32 = new Bus("Gujarat Travels", "GJ01D3030", "Ahmedabad", "Vadodara", 40, 500.0, "09:00 AM", "Non AC");
		Bus b33 = new Bus("Bengal Express", "WB01E3131", "Kolkata", "Siliguri", 45, 1200.0, "07:30 PM", "AC Sleeper");
		Bus b34 = new Bus("Eastern Travels", "WB01F3232", "Kolkata", "Durgapur", 50, 700.0, "06:30 AM", "AC Seater");
		Bus b35 = new Bus("Odisha Express", "OD01G3333", "Bhubaneswar", "Puri", 40, 400.0, "07:00 AM", "Electric");
		Bus b36 = new Bus("Coastal Express", "OD01H3434", "Bhubaneswar", "Cuttack", 45, 350.0, "08:00 AM", "AC Seater");
		Bus b37 = new Bus("Bihar Travels", "BR01A3535", "Patna", "Gaya", 50, 500.0, "09:00 AM", "Non AC");
		Bus b38 = new Bus("Magadh Express", "BR01B3636", "Patna", "Ranchi", 45, 850.0, "08:00 PM", "AC Sleeper");
		Bus b39 = new Bus("Himalayan Travels", "UK07C3737", "Dehradun", "Mussoorie", 35, 600.0, "06:30 AM", "Mini Bus");
		Bus b40 = new Bus(50, "Premium Volvo", "DL01D3838", "Delhi", "Manali", 2200.0, "09:00 PM", "AC Sleeper");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);

		System.out.println(b11);
		System.out.println(b12);
		System.out.println(b13);
		System.out.println(b14);
		System.out.println(b15);
		System.out.println(b16);
		System.out.println(b17);
		System.out.println(b18);
		System.out.println(b19);
		System.out.println(b20);

		System.out.println(b21);
		System.out.println(b22);
		System.out.println(b23);
		System.out.println(b24);
		System.out.println(b25);
		System.out.println(b26);
		System.out.println(b27);
		System.out.println(b28);
		System.out.println(b29);
		System.out.println(b30);

		System.out.println(b31);
		System.out.println(b32);
		System.out.println(b33);
		System.out.println(b34);
		System.out.println(b35);
		System.out.println(b36);
		System.out.println(b37);
		System.out.println(b38);
		System.out.println(b39);
		System.out.println(b40);
		
		System.out.println("=========================================Main Method Ends==========================================");

	}

}
