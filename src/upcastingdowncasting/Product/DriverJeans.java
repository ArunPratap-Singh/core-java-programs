package upcastingdowncasting.Product;

public class DriverJeans {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAM STARTS");
		
		Product p1 = new Jeans("Slim Fit Jeans", 700, 2, "Levis", "Blue", "L");
		Product p2 = new Jeans("Regular Fit Jeans", 800, 2, "Wranglers", "Black", "XL");
		Product p3 = new Jeans("Skinny Jeans", 900, 2, "Lee", "Dark Blue", "M");
		Product p4 = new Jeans("Relaxed Fit Jeans", 1200, 1, "Pepe Jeans", "Grey", "XXL");
		Product p5 = new Jeans("Ripped Jeans", 1100, 2, "Diesel", "Light Blue", "XXXL");
		Product p6 = new Jeans("Straight Fit Jeans", 1500, 3, "Spykar", "Navy Blue Jeans", "S");
		Product p7 = new Jeans("Bootcut Jeans", 2000, 1, "Calvin Klien", "White", "XL");
		Product p8 = new Jeans("Tapered Jeans", 1100, 3, "Tommy Hilfiger", "Sky Blue", "XXL");
		Product p9 = new Jeans("Cargo Jeans", 1700, 3, "Jack & Jones", "Olive Green", "L");
		Product p10 = new Jeans("Distressed Jeans", 1500, 3, "Roadster", "Charcoal Black", "S");
		
		System.out.println("========================================================================");
		
		System.out.println("===============P1 UPCASTING DETAILS=================");
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
		
		Jeans j1 = (Jeans) p1;
		Jeans j2 = (Jeans) p2;
		Jeans j3 = (Jeans) p3;
		Jeans j4 = (Jeans) p4;
		Jeans j5 = (Jeans) p4;
		Jeans j6 = (Jeans) p5;
		Jeans j7 = (Jeans) p7;
		Jeans j8 = (Jeans) p8;
		Jeans j9 = (Jeans) p9;
		Jeans j10 = (Jeans) p10;
		
		System.out.println("================j1 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j1.name);
		System.out.println("Price is: " +j1.price);
		System.out.println("Quantity is: " +j1.quantity);
		System.out.println("Brandname is: " +j1.brandname);
		System.out.println("Color is: " +j1.color);
		System.out.println("Size is: " +j1.size);
		
		System.out.println("================j2 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j2.name);
		System.out.println("Price is: " +j2.price);
		System.out.println("Quantity is: " +j2.quantity);
		System.out.println("Brandname is: " +j2.brandname);
		System.out.println("Color is: " +j2.color);
		System.out.println("Size is: " +j2.size);
		
		System.out.println("================j3 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j3.name);
		System.out.println("Price is: " +j3.price);
		System.out.println("Quantity is: " +j3.quantity);
		System.out.println("Brandname is: " +j3.brandname);
		System.out.println("Color is: " +j3.color);
		System.out.println("Size is: " +j3.size);
		
		System.out.println("================j4 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j4.name);
		System.out.println("Price is: " +j4.price);
		System.out.println("Quantity is: " +j4.quantity);
		System.out.println("Brandname is: " +j4.brandname);
		System.out.println("Color is: " +j4.color);
		
		System.out.println("================j5 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j5.name);
		System.out.println("Price is: " +j5.price);
		System.out.println("Quantity is: " +j5.quantity);
		System.out.println("Brandname is: " +j5.brandname);
		System.out.println("Color is: " +j5.color);
		System.out.println("Size is: " +j5.size);
		
		System.out.println("================j6 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j6.name);
		System.out.println("Price is: " +j6.price);
		System.out.println("Quantity is: " +j6.quantity);
		System.out.println("Brandname is: " +j6.brandname);
		System.out.println("Color is: " +j6.color);
		System.out.println("Size is: " +j6.size);
		
		System.out.println("================j7 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j7.name);
		System.out.println("Price is: " +j7.price);
		System.out.println("Quantity is: " +j7.quantity);
		System.out.println("Brandname is: " +j7.brandname);
		System.out.println("Color is: " +j7.color);
		System.out.println("Size is: " +j7.size);
		
		System.out.println("================j8 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j8.name);
		System.out.println("Price is: " +j8.price);
		System.out.println("Quantity is: " +j8.quantity);
		System.out.println("Brandname is: " +j8.brandname);
		System.out.println("Color is: " +j8.color);
		System.out.println("Size is: " +j8.size);
		System.out.println("Size is: " +j8.size);
		
		System.out.println("================j9 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j9.name);
		System.out.println("Price is: " +j9.price);
		System.out.println("Quantity is: " +j9.quantity);
		System.out.println("Brandname is: " +j9.brandname);
		System.out.println("Color is: " +j9.color);
		System.out.println("Size is: " +j9.size);
		
		System.out.println("================j10 DOWNCASTING PROGRAM STARTS===================");
		System.out.println("Name is: " +j10.name);
		System.out.println("Price is: " +j10.price);
		System.out.println("Quantity is: " +j10.quantity);
		System.out.println("Brandname is: " +j10.brandname);
		System.out.println("Color is: " +j10.color);
		System.out.println("Size is: " +j10.size);
		
		System.out.println("DOWNCASTING PROGRAM ENDS");
	}

}
