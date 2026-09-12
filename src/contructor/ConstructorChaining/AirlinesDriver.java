package contructor.ConstructorChaining;

public class AirlinesDriver {

	public static void main(String[] args) {

		System.out.println("=====================================Main Method Starts======================================");

		Airlines a1 = new Airlines("IndiGo", "6E101", "Delhi", 180, 5500.0, "08:00 AM", "Airbus A320", "T1");
		Airlines a2 = new Airlines();
		Airlines a3 = new Airlines("Air India");
		Airlines a4 = new Airlines("Vistara", "UK201");
		Airlines a5 = new Airlines("SpiceJet", "SG301", "Mumbai");
		Airlines a6 = new Airlines("Akasa Air", "QP401", "Bangalore", 190);
		Airlines a7 = new Airlines("IndiGo", "6E501", "Chennai", 180, 6000.0);
		Airlines a8 = new Airlines("Air India", "AI601", "Kolkata", 170, 7500.0, "10:30 AM");
		Airlines a9 = new Airlines(160, "Vistara", "UK701", "Goa", 6500.0, "11:00 AM", "Airbus A321", "T2");
		Airlines a10 = new Airlines(180, "SpiceJet", "SG801", "Hyderabad", 5200.0, "01:00 PM", "Boeing 737", "T1");
		Airlines a11 = new Airlines("IndiGo", "6E901", "Jaipur", 180, 4800.0, "02:00 PM", "Airbus A320", "T1");
		Airlines a12 = new Airlines("Air India", "AI111", "London", 250, 55000.0, "03:30 PM", "Boeing 787", "T3");
		Airlines a13 = new Airlines("Vistara", "UK222", "Dubai", 220, 28000.0, "04:00 PM", "Airbus A321", "T2");
		Airlines a14 = new Airlines("SpiceJet", "SG333", "Pune", 170, 4500.0, "05:00 PM", "Boeing 737", "T1");
		Airlines a15 = new Airlines("Akasa Air", "QP444", "Ahmedabad", 180, 5000.0, "06:00 PM", "Boeing 737 MAX", "T1");
		Airlines a16 = new Airlines("IndiGo", "6E555", "Lucknow", 180, 4200.0, "07:00 PM", "Airbus A320", "T1");
		Airlines a17 = new Airlines("Air India", "AI666", "Paris", 240, 52000.0, "08:00 PM", "Boeing 787", "T3");
		Airlines a18 = new Airlines("Vistara", "UK777", "Singapore", 230, 32000.0, "09:00 PM", "Airbus A321", "T2");
		Airlines a19 = new Airlines("SpiceJet", "SG888", "Patna", 160, 4800.0, "06:30 AM", "Boeing 737", "T1");
		Airlines a20 = new Airlines("Akasa Air", "QP999", "Kochi", 180, 6200.0, "07:30 AM", "Boeing 737 MAX", "T1");
		Airlines a21 = new Airlines("IndiGo", "6E112", "Varanasi", 180, 4300.0, "08:30 AM", "Airbus A320", "T1");
		Airlines a22 = new Airlines("Air India", "AI223", "New York", 280, 65000.0, "09:30 AM", "Boeing 777", "T3");
		Airlines a23 = new Airlines("Vistara", "UK334", "Bangkok", 220, 25000.0, "10:00 AM", "Airbus A321", "T2");
		Airlines a24 = new Airlines("SpiceJet", "SG445", "Chandigarh", 170, 4000.0, "11:30 AM", "Boeing 737", "T1");
		Airlines a25 = new Airlines("Akasa Air", "QP556", "Bhubaneswar", 180, 5600.0, "12:30 PM", "Boeing 737 MAX", "T1");
		Airlines a26 = new Airlines("IndiGo", "6E667", "Ranchi", 180, 4500.0, "01:30 PM", "Airbus A320", "T1");
		Airlines a27 = new Airlines("Air India", "AI778", "Toronto", 260, 60000.0, "02:30 PM", "Boeing 787", "T3");
		Airlines a28 = new Airlines("Vistara", "UK889", "Colombo", 210, 22000.0, "03:00 PM", "Airbus A321", "T2");
		Airlines a29 = new Airlines("SpiceJet", "SG990", "Srinagar", 160, 5800.0, "04:30 PM", "Boeing 737", "T1");
		Airlines a30 = new Airlines("Akasa Air", "QP121", "Guwahati", 180, 7000.0, "05:30 PM", "Boeing 737 MAX", "T1");
		Airlines a31 = new Airlines("IndiGo", "6E232", "Amritsar", 180, 4600.0, "06:30 PM", "Airbus A320", "T1");
		Airlines a32 = new Airlines("Air India", "AI343", "Frankfurt", 250, 58000.0, "07:30 PM", "Boeing 787", "T3");
		Airlines a33 = new Airlines("Vistara", "UK454", "Kathmandu", 210, 18000.0, "08:30 PM", "Airbus A321", "T2");
		Airlines a34 = new Airlines("SpiceJet", "SG565", "Dehradun", 160, 4300.0, "09:30 PM", "Boeing 737", "T1");
		Airlines a35 = new Airlines("Akasa Air", "QP676", "Goa", 180, 5900.0, "10:00 AM", "Boeing 737 MAX", "T1");
		Airlines a36 = new Airlines("IndiGo", "6E787", "Bhopal", 180, 4100.0, "11:00 AM", "Airbus A320", "T1");
		Airlines a37 = new Airlines("Air India", "AI898", "Sydney", 270, 70000.0, "12:00 PM", "Boeing 777", "T3");
		Airlines a38 = new Airlines("Vistara", "UK909", "Maldives", 220, 30000.0, "01:00 PM", "Airbus A321", "T2");
		Airlines a39 = new Airlines("SpiceJet", "SG010", "Nagpur", 160, 4700.0, "02:00 PM", "Boeing 737", "T1");
		Airlines a40 = new Airlines(250, "Air India", "AI111", "Dubai", 35000.0, "03:00 PM", "Boeing 787", "T3");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);

		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);
		System.out.println(a16);
		System.out.println(a17);
		System.out.println(a18);
		System.out.println(a19);
		System.out.println(a20);

		System.out.println(a21);
		System.out.println(a22);
		System.out.println(a23);
		System.out.println(a24);
		System.out.println(a25);
		System.out.println(a26);
		System.out.println(a27);
		System.out.println(a28);
		System.out.println(a29);
		System.out.println(a30);

		System.out.println(a31);
		System.out.println(a32);
		System.out.println(a33);
		System.out.println(a34);
		System.out.println(a35);
		System.out.println(a36);
		System.out.println(a37);
		System.out.println(a38);
		System.out.println(a39);
		System.out.println(a40);
		
		System.out.println("=================================Main Method Ends=====================================");

	}

}
