package upcastingdowncasting;

public class DriverCycle {

	public static void main(String[] args) {
		
		Vehicle v1 = new Cycle("Hero Sprint", 8000, 2, "Hero", "Mountain Cycle");
		Vehicle v2 = new Cycle("Firefox Bad Attitude", 15000, 2, "Firefox", "MTB");
		Vehicle v3 = new Cycle("Btwin Rockrider", 18000, 2, "BTwin", "Mountain Bike");
		Vehicle v4 = new Cycle("Atlas Goldline", 6500, 2, "Atlas", "Road Cycle");
		Vehicle v5 = new Cycle("Hercules Roadeo", 12000, 2, "Hercules", "Sports Cycle");
		Vehicle v6 = new Cycle("Mach City Munich", 10000, 2, "Mach City", "City Bike");
		Vehicle v7 = new Cycle("Montra Downtown", 20000, 2, "Montra", "Hybrid Bike");
		Vehicle v8 = new Cycle("Avon Buke", 7000, 2, "Avon", "Standard Cycle");
		Vehicle v9 = new Cycle("Kross Maximus", 11000, 2, "Kross", "MTB");
		Vehicle v10 = new Cycle("Leader Beast", 9500, 2, "Leader", "Gear Cycle");
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		System.out.println("=======================================================================");
		
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
		
		System.out.println("===========V6 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v6.name);
		System.out.println("Price is: " +v6.price);
		System.out.println("Number of wheels is: " +v6.numberofwheels);
		
		System.out.println("===========V7 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v7.name);
		System.out.println("Price is: " +v7.price);
		System.out.println("Number of wheels is: " +v7.numberofwheels);
		
		System.out.println("===========V8 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v8.name);
		System.out.println("Price is: " +v8.price);
		System.out.println("Number of wheels is: " +v8.numberofwheels);
		
		System.out.println("===========V9 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v9.name);
		System.out.println("Price is: " +v9.price);
		System.out.println("Number of wheels is: " +v9.numberofwheels);
		
		System.out.println("===========V10 UPCASTING DETAILS===========");
		System.out.println("Name is: " +v10.name);
		System.out.println("Price is: " +v10.price);
		System.out.println("Number of wheels is: " +v10.numberofwheels);
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("=============================================================");
		
		Cycle c1 = (Cycle) v1;
		Cycle c2 = (Cycle) v2;
		Cycle c3 = (Cycle) v3;
		Cycle c4 = (Cycle) v4;
		Cycle c5 = (Cycle) v5;
		Cycle c6 = (Cycle) v6;
		Cycle c7 = (Cycle) v7;
		Cycle c8 = (Cycle) v8;
		Cycle c9 = (Cycle) v9;
		Cycle c10 = (Cycle) v10;
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		System.out.println("======================================================");
		
		System.out.println("=============== C1 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c1.name);
		System.out.println("Price is: " +c1.price);
		System.out.println("Number of Wheels is: " +c1.numberofwheels);
		System.out.println("Brandname is: " +c1.brandname);
		System.out.println("Type is: " +c1.type);
		
		System.out.println("=============== C2 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c2.name);
		System.out.println("Price is: " +c2.price);
		System.out.println("Number of Wheels is: " +c2.numberofwheels);
		System.out.println("Brandname is: " +c2.brandname);
		System.out.println("Type is: " +c2.type);
		
		System.out.println("=============== C3 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c3.name);
		System.out.println("Price is: " +c3.price);
		System.out.println("Number of Wheels is: " +c3.numberofwheels);
		System.out.println("Brandname is: " +c3.brandname);
		System.out.println("Type is: " +c3.type);
		
		System.out.println("=============== C4 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c4.name);
		System.out.println("Price is: " +c4.price);
		System.out.println("Number of Wheels is: " +c4.numberofwheels);
		System.out.println("Brandname is: " +c4.brandname);
		System.out.println("Type is: " +c4.type);
		
		System.out.println("=============== C5 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c5.name);
		System.out.println("Price is: " +c5.price);
		System.out.println("Number of Wheels is: " +c5.numberofwheels);
		System.out.println("Brandname is: " +c5.brandname);
		System.out.println("Type is: " +c5.type);
		
		System.out.println("============C6 DOWNCASTING DETAILS=====================");
		System.out.println("Name is: " +c6.name);
		System.out.println("Price is:" +c6.price);
		System.out.println("Number of Wheels is: " +c6.numberofwheels);
		System.out.println("Brandname is: " +c6.brandname);
		System.out.println("Type is: " +c6.type);
		
		System.out.println("=============== C7 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c7.name);
		System.out.println("Price is: " +c7.price);
		System.out.println("Number of Wheels is: " +c7.numberofwheels);
		System.out.println("Brandname is: " +c7.brandname);
		System.out.println("Type is: " +c7.type);
		
		System.out.println("=============== C8 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c8.name);
		System.out.println("Price is: " +c8.price);
		System.out.println("Number of Wheels is: " +c8.numberofwheels);
		System.out.println("Brandname is: " +c8.brandname);
		System.out.println("Type is: " +c8.type);
		
		System.out.println("=============== C9 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c9.name);
		System.out.println("Price is: " +c9.price);
		System.out.println("Number of Wheels is: " +c9.numberofwheels);
		System.out.println("Brandname is: " +c9.brandname);
		System.out.println("Type is: " +c9.type);
		
		System.out.println("=============== C10 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +c10.name);
		System.out.println("Price is: " +c10.price);
		System.out.println("Number of Wheels is: " +c10.numberofwheels);
		System.out.println("Brandname is: " +c10.brandname);
		System.out.println("Type is: " +c10.type);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
	}

}
