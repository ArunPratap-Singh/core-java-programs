package upcastingdowncasting.Product;

public class DriverPenDrive {
	
	public static void main(String[] args) {
		
	System.out.println("UPCASTING PROGRAM STARTS");
		
	Product p1 = new PenDrive("Sandisk Ultra Flair", 500, 1, "32GB");
	Product p2 = new PenDrive("HP x796w", 600, 1, "64GB");
	Product p3 = new PenDrive("Kingston Data Traveler Exodia", 1200, 2, "128");
	Product p4 = new PenDrive("Samsung Bar Plus", 800, 2, "256GB");
	Product p5 = new PenDrive("Sony Micro Vault", 900, 1, "16GB");
	Product p6 = new PenDrive("Sony", 600, 1, "8GB");
	Product p7 = new PenDrive("Toshiba Hayabusa", 1000, 8, "64GB");
	Product p8 = new PenDrive("ADATA UV150", 400, 2, "32GB");
	Product p9 = new PenDrive("PNY Turbo Attache3", 1500, 2, "128");
	Product p10 = new PenDrive("Transcent JetFlash", 2000, 5, "64GB");
	
	System.out.println("==================================================");
	
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
	
	System.out.println("=================P10 UPCASTING DETAILS===================");
	System.out.println("Name is: " +p10.name);
	System.out.println("Price is: " +p10.price);
	System.out.println("Quantity is: " +p10.quantity);
	
	System.out.println("UPCASTING PROGRAME ENDS");
	
	System.out.println("***************************************************************");
	
	System.out.println("DOWNCASTING PROGRAME STARTS");
	
	PenDrive d1 = (PenDrive) p1;
	PenDrive d2 = (PenDrive) p2;
	PenDrive d3 = (PenDrive) p3;
	PenDrive d4 = (PenDrive) p4;
	PenDrive d5 = (PenDrive) p5;
	PenDrive d6 = (PenDrive) p6;
	PenDrive d7 = (PenDrive) p7;
	PenDrive d8 = (PenDrive) p8;
	PenDrive d9 = (PenDrive) p9;
	PenDrive d10 = (PenDrive) p10;
	
	System.out.println("================d1 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d1.name);
	System.out.println("Price is: " +d1.price);
	System.out.println("Quantity is: " +d1.quantity);
	System.out.println("Storage is: " +d1.storage);
	System.out.println("================d1 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d2.name);
	System.out.println("Price is: " +d2.price);
	System.out.println("Quantity is: " +d2.quantity);
	System.out.println("Storage is: " +d2.storage);
	System.out.println("================d3 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d3.name);
	System.out.println("Price is: " +d3.price);
	System.out.println("Quantity is: " +d3.quantity);
	System.out.println("Storage is: " +d3.storage);
	System.out.println("================d4 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d4.name);
	System.out.println("Price is: " +d4.price);
	System.out.println("Quantity is: " +d4.quantity);
	System.out.println("Storage is: " +d4.storage);
	System.out.println("================d5 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d5.name);
	System.out.println("Price is: " +d5.price);
	System.out.println("Quantity is: " +d5.quantity);
	System.out.println("Storage is: " +d5.storage);
	System.out.println("================d6 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d6.name);
	System.out.println("Price is: " +d6.price);
	System.out.println("Quantity is: " +d6.quantity);
	System.out.println("Storage is: " +d6.storage);
	System.out.println("================d7 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d7.name);
	System.out.println("Price is: " +d7.price);
	System.out.println("Quantity is: " +d7.quantity);
	System.out.println("Storage is: " +d7.storage);
	System.out.println("================d8 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d8.name);
	System.out.println("Price is: " +d8.price);
	System.out.println("Quantity is: " +d8.quantity);
	System.out.println("Storage is: " +d8.storage);
	System.out.println("================d9 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d9.name);
	System.out.println("Price is: " +d9.price);
	System.out.println("Quantity is: " +d9.quantity);
	System.out.println("Storage is: " +d9.storage);
	System.out.println("================d10 DOWNCASTING DETAILS================");
	System.out.println("Name is: " +d10.name);
	System.out.println("Price is: " +d10.price);
	System.out.println("Quantity is: " +d10.quantity);
	System.out.println("Storage is: " +d10.storage);
	
	System.out.println("DOWNCASTING PROGRAM ENDS");
	
}
}