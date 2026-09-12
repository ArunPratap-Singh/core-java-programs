package upcastingdowncasting.Product;

public class DriverRefridgerator {

	public static void main(String[] args) {
	
		System.out.println("UPCASTING PROGRAM STARTS");
		
		Product p1 = new Refridgerator("Double door frost free", 28000, 1, "240L", 2, "Silver");
		Product p2 = new Refridgerator("Side by side Refridgerator", 75000, 1, "580L", 4, "Black");
		Product p3 = new Refridgerator("Single door refridgerator", 18500, 1, "190L", 2, "Red");
		Product p4 = new Refridgerator("Convertible refridgerator", 42000, 1, "340L", 3, "Grey");
		Product p5 = new Refridgerator("Mini Refridgerator", 9500, 1, "45L", 2, "White");
		Product p6 = new Refridgerator("Smart Inverter Refridgerator", 36000, 1, "260L", 3, "Blue");
		Product p7 = new Refridgerator("French door refridgerator", 89000, 1, "650L", 4, "Matte black");
		Product p8 = new Refridgerator("Direct cool Refridgerator", 21000, 1, "215L", 2, "Purple");
		Product p9= new Refridgerator("Botton Freezer Refridgerator", 55000, 2, "420L", 1, "Steel Finish");
		
		System.out.println("=====================================================================================");
		
		System.out.println("==============P1 UPCASTING DETAILS================");
		System.out.println("Name is: " +p1.name);
		System.out.println("Price is: " +p1.price);
		System.out.println("Quantity is: " +p1.quantity);
		
		System.out.println("=================P2 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p2.name);
		System.out.println("Price is: " +p2.price);
		System.out.println("Quantity is: " +p2.quantity);
		
		System.out.println("=================P3 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p3.name);
		System.out.println("Price is: " +p3.price);
		System.out.println("Quantity is: " +p3.quantity);
		
		System.out.println("=================P4 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p4.name);
		System.out.println("Price is: " +p4.price);
		System.out.println("Quantity is: " +p4.quantity);
		
		System.out.println("=================P5 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p5.name);
		System.out.println("Price is: " +p5.price);
		System.out.println("Quantity is: " +p5.quantity);
		
		System.out.println("=================P6 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p6.name);
		System.out.println("Price is: " +p6.price);
		System.out.println("Quantity is: " +p6.quantity);

		System.out.println("=================P7 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p7.name);
		System.out.println("Price is: " +p7.price);
		System.out.println("Quantity is: " +p7.quantity);

		System.out.println("=================P8 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p8.name);
		System.out.println("Price is: " +p8.price);
		System.out.println("Quantity is: " +p8.quantity);

		System.out.println("=================P9 UPCASTING DETAILS===================");
		System.out.println("Name is: " +p9.name);
		System.out.println("Price is: " +p9.price);
		System.out.println("Quantity is: " +p9.quantity);
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("***************************************************************");
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		Refridgerator r1 = (Refridgerator) p1;
		Refridgerator r2 = (Refridgerator) p2;
		Refridgerator r3 = (Refridgerator) p3;
		Refridgerator r4 = (Refridgerator) p4;
		Refridgerator r5 = (Refridgerator) p5;
		Refridgerator r6 = (Refridgerator) p6;
		Refridgerator r7 = (Refridgerator) p7;
		Refridgerator r8 = (Refridgerator) p8;
		Refridgerator r9 = (Refridgerator) p9;
		
		System.out.println("==================r1 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r1.name);
		System.out.println("Price is: " +r1.price);
		System.out.println("Quantity is: " +r1.quantity);
		System.out.println("Capacity is: " +r1.capacity);
		System.out.println("Number of Doors is: " +r1.numberofdoors);
		System.out.println("Colors is: " +r1.color);
		
		System.out.println("==================r2 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r2.name);
		System.out.println("Price is: " +r2.price);
		System.out.println("Quantity is: " +r2.quantity);
		System.out.println("Capacity is: " +r2.capacity);
		System.out.println("Number of Doors is: " +r2.numberofdoors);
		System.out.println("Colors is: " +r2.color);
		
		System.out.println("==================r3 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r3.name);
		System.out.println("Price is: " +r3.price);
		System.out.println("Quantity is: " +r3.quantity);
		System.out.println("Capacity is: " +r3.capacity);
		System.out.println("Number of Doors is: " +r3.numberofdoors);
		System.out.println("Colors is: " +r3.color);
		System.out.println("==================r4 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r4.name);
		System.out.println("Price is: " +r4.price);
		System.out.println("Quantity is: " +r4.quantity);
		System.out.println("Capacity is: " +r4.capacity);
		System.out.println("Number of Doors is: " +r4.numberofdoors);
		System.out.println("Colors is: " +r4.color);
		
		System.out.println("==================r5 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r5.name);
		System.out.println("Price is: " +r5.price);
		System.out.println("Quantity is: " +r5.quantity);
		System.out.println("Capacity is: " +r5.capacity);
		System.out.println("Number of Doors is: " +r5.numberofdoors);
		System.out.println("Colors is: " +r5.color);
		
		System.out.println("==================r6 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r6.name);
		System.out.println("Price is: " +r6.price);
		System.out.println("Quantity is: " +r6.quantity);
		System.out.println("Capacity is: " +r6.capacity);
		System.out.println("Number of Doors is: " +r6.numberofdoors);
		System.out.println("Colors is: " +r6.color);
		
		System.out.println("==================r7 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r7.name);
		System.out.println("Price is: " +r7.price);
		System.out.println("Quantity is: " +r7.quantity);
		System.out.println("Capacity is: " +r7.capacity);
		System.out.println("Number of Doors is: " +r7.numberofdoors);
		System.out.println("Colors is: " +r7.color);
		
		System.out.println("==================r8 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r8.name);
		System.out.println("Price is: " +r8.price);
		System.out.println("Quantity is: " +r8.quantity);
		System.out.println("Capacity is: " +r8.capacity);
		System.out.println("Number of Doors is: " +r8.numberofdoors);
		System.out.println("Colors is: " +r8.color);
		
		System.out.println("==================r9 DOWNCASTING PROGRAM STARTS====================");
		System.out.println("Name is: " +r9.name);
		System.out.println("Price is: " +r9.price);
		System.out.println("Quantity is: " +r9.quantity);
		System.out.println("Capacity is: " +r9.capacity);
		System.out.println("Number of Doors is: " +r9.numberofdoors);
		System.out.println("Colors is: " +r9.color);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
	}
	
}	

