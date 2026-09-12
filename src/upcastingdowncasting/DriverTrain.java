package upcastingdowncasting;

public class DriverTrain {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		Vehicle v1 = new Train("Tejas Lucknow New Delhi", 20000000, 80, "Diesel", 10, "Semi High Speed", "AC");
		Vehicle v2 = new Train("Shatabdi", 30000000, 64, "Electric", 8, "High Speed", "non AC");
		Vehicle v3 = new Train("Lucknow Mail", 40000000, 96, "Diesel", 12, "Semi High Speed", "ACnonAC");
		Vehicle v4 = new Train("Lucknow New Delhi AC Superfast ", 50000000, 104, "Diesel", 13, "Semi High Speed", "AC");
		Vehicle v5 = new Train("Dibrugarh Rajdhani", 50000000, 96, "Electric", 12, "Semi High Speed", "AC");
		Vehicle v6 = new Train("Duranto Express", 90000000, 80, "Diesel", 10, "Semi High Speed", "AC");
		Vehicle v7 = new Train("Mahamana Express", 50000000, 104, "Diesel", 13, "Semi High Speed", "ACnonAC");
		Vehicle v8 = new Train("SaryuGangaExpress", 60000000, 64, "Diesel", 8, "Semi Speed", "ACnonAC");
		Vehicle v9 = new Train("Pushpak Express", 40000000, 88, "Diesel", 11, "Semi  Speed", "ACnonAC");
		Vehicle v10 = new Train("Garibrath Express", 90000000, 114, "Diesel", 14, "Semi High Speed", "AC");
		
		System.out.println("===================================================================================");
		
		System.out.println("===========v1 UPCASTING Details============");
		System.out.println("Name is: " +v1.name);
		System.out.println("Price is: " +v1.price);
		System.out.println("Number of wheels is: " +v1.numberofwheels);
		
		System.out.println("===========v2 UPCASTING Details============");
		System.out.println("Name is: " +v2.name);
		System.out.println("Price is: " +v2.price);
		System.out.println("Number of wheels is: " +v2.numberofwheels);
		
		System.out.println("===========v3 UPCASTING Details============");
		System.out.println("Name is: " +v3.name);
		System.out.println("Price is: " +v3.price);
		System.out.println("Number of wheels is: " +v3.numberofwheels);
		
		System.out.println("===========v4 UPCASTING Details============");
		System.out.println("Name is: " +v4.name);
		System.out.println("Price is: " +v4.price);
		System.out.println("Number of wheels is: " +v4.numberofwheels);
		
		System.out.println("===========v5 UPCASTING Details============");
		System.out.println("Name is: " +v5.name);
		System.out.println("Price is: " +v5.price);
		System.out.println("Number of wheels is: " +v5.numberofwheels);
		
		System.out.println("===========v6 UPCASTING Details============");
		System.out.println("Name is: " +v6.name);
		System.out.println("Price is: " +v6.price);
		System.out.println("Number of wheels is: " +v6.numberofwheels);
		
		System.out.println("===========v7 UPCASTING Details============");
		System.out.println("Name is: " +v7.name);
		System.out.println("Price is: " +v7.price);
		System.out.println("Number of wheels is: " +v7.numberofwheels);
		
		System.out.println("===========v8 UPCASTING Details============");
		System.out.println("Name is: " +v8.name);
		System.out.println("Price is: " +v8.price);
		System.out.println("Number of wheels is: " +v8.numberofwheels);
		
		System.out.println("===========v9 UPCASTING Details============");
		System.out.println("Name is: " +v9.name);
		System.out.println("Price is: " +v9.price);
		System.out.println("Number of wheels is: " +v9.numberofwheels);
		
		System.out.println("===========v10 UPCASTING Details============");
		System.out.println("Name is: " +v10.name);
		System.out.println("Price is: " +v10.price);
		System.out.println("Number of wheels is: " +v10.numberofwheels);
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("********************************************************");
		
		Train t1 = (Train) v1;
		Train t2 = (Train) v2;
		Train t3 = (Train) v3;
		Train t4 = (Train) v4;
		Train t5 = (Train) v5;
		Train t6 = (Train) v6;
		Train t7 = (Train) v7;
		Train t8 = (Train) v8;
		Train t9 = (Train) v9;
		Train t10 = (Train) v10;
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		System.out.println("======================================================");
		
		System.out.println("==================t1 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t1.name);
		System.out.println("Price is: " +t1.price);
		System.out.println("Number Of Wheels is: " +t1.numberofwheels);
		System.out.println("Engine Type is: " +t1.enginetype);
		System.out.println("Number Of Coaches is: " +t1.numberofcoaches);
		System.out.println("Type of Train is: " +t1.typeoftrain);
		System.out.println("ACnonAC is: " +t1.ACnonAC);
		
		System.out.println("==================t2 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t2.name);
		System.out.println("Price is: " +t2.price);
		System.out.println("Number Of Wheels is: " +t2.numberofwheels);
		System.out.println("Engine Type is: " +t2.enginetype);
		System.out.println("Number Of Coaches is: " +t2.numberofcoaches);
		System.out.println("Type of Train is: " +t2.typeoftrain);
		System.out.println("ACnonAC is: " +t2.ACnonAC);
		
		System.out.println("==================t3 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t3.name);
		System.out.println("Price is: " +t3.price);
		System.out.println("Number Of Wheels is: " +t3.numberofwheels);
		System.out.println("Engine Type is: " +t3.enginetype);
		System.out.println("Number Of Coaches is: " +t3.numberofcoaches);
		System.out.println("Type of Train is: " +t3.typeoftrain);
		System.out.println("ACnonAC is: " +t3.ACnonAC);
		
		System.out.println("==================t4 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t4.name);
		System.out.println("Price is: " +t4.price);
		System.out.println("Number Of Wheels is: " +t4.numberofwheels);
		System.out.println("Engine Type is: " +t4.enginetype);
		System.out.println("Number Of Coaches is: " +t4.numberofcoaches);
		System.out.println("Type of Train is: " +t4.typeoftrain);
		System.out.println("ACnonAC is: " +t4.ACnonAC);
		
		System.out.println("==================t5 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t5.name);
		System.out.println("Price is: " +t5.price);
		System.out.println("Number Of Wheels is: " +t5.numberofwheels);
		System.out.println("Engine Type is: " +t5.enginetype);
		System.out.println("Number Of Coaches is: " +t5.numberofcoaches);
		System.out.println("Type of Train is: " +t5.typeoftrain);
		System.out.println("ACnonAC is: " +t5.ACnonAC);
		
		System.out.println("==================t6 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t6.name);
		System.out.println("Price is: " +t6.price);
		System.out.println("Number Of Wheels is: " +t6.numberofwheels);
		System.out.println("Engine Type is: " +t6.enginetype);
		System.out.println("Number Of Coaches is: " +t6.numberofcoaches);
		System.out.println("Type of Train is: " +t6.typeoftrain);
		System.out.println("ACnonAC is: " +t6.ACnonAC);
		
		System.out.println("==================t7 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t7.name);
		System.out.println("Price is: " +t7.price);
		System.out.println("Number Of Wheels is: " +t7.numberofwheels);
		System.out.println("Engine Type is: " +t7.enginetype);
		System.out.println("Number Of Coaches is: " +t7.numberofcoaches);
		System.out.println("Type of Train is: " +t7.typeoftrain);
		System.out.println("ACnonAC is: " +t7.ACnonAC);
		
		System.out.println("==================t8 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t8.name);
		System.out.println("Price is: " +t8.price);
		System.out.println("Number Of Wheels is: " +t8.numberofwheels);
		System.out.println("Engine Type is: " +t8.enginetype);
		System.out.println("Number Of Coaches is: " +t8.numberofcoaches);
		System.out.println("Type of Train is: " +t8.typeoftrain);
		System.out.println("ACnonAC is: " +t8.ACnonAC);
		
		System.out.println("==================t9 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t9.name);
		System.out.println("Price is: " +t9.price);
		System.out.println("Number Of Wheels is: " +t9.numberofwheels);
		System.out.println("Engine Type is: " +t9.enginetype);
		System.out.println("Number Of Coaches is: " +t9.numberofcoaches);
		System.out.println("Type of Train is: " +t9.typeoftrain);
		System.out.println("ACnonAC is: " +t9.ACnonAC);
		
		System.out.println("==================t10 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +t10.name);
		System.out.println("Price is: " +t10.price);
		System.out.println("Number Of Wheels is: " +t10.numberofwheels);
		System.out.println("Engine Type is: " +t10.enginetype);
		System.out.println("Number Of Coaches is: " +t10.numberofcoaches);
		System.out.println("Type of Train is: " +t10.typeoftrain);
		System.out.println("ACnonAC is: " +t10.ACnonAC);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
		
		
	}

}
