package upcastingdowncasting.Product;

public class DriverLaptop {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAM STARTS");
		
		Product p1 = new Laptop("Inspiron 15", 52000, 1, "Dell", "8GB", "Silver");
		Product p2 = new Laptop("Pavilion x360", 65000, 2, "HP", "16GB", "Blue");
		Product p3 = new Laptop("IdeaPad Slim 5", 58000, 2, "Lenovo", "18GB", "Grey");
		Product p4 = new Laptop("MacBook Air M3", 115000, 1, "Apple", "16GB", "MidNight");
		Product p5 = new Laptop("VivoBook 15", 49000, 2, "Asus", "8GB", "Black");
		Product p6 = new Laptop("Swift Go 14", 72000, 3, "Acer", "16GB", "Silver");
		Product p7 = new Laptop("Galaxy Book 4", 78000, 2, "Samsung", "16GB", "Graphite");
		Product p8 = new Laptop("Modern 14", 55000, 4, "MSI", "8GB", "White");
		Product p9 = new Laptop("XPS 13", 135000, 5, "DELL", "32GB", "Platinum");
		Product p10 = new Laptop("TUF Gaming F15", 89000, 2, "ASUS", "16GB", "Eclipse Grey");
		
		System.out.println("========================================================================");
		
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
		
		Laptop l1 = (Laptop) p1;
		Laptop l2 = (Laptop) p2;
		Laptop l3 = (Laptop) p3;
		Laptop l4 = (Laptop) p4;
		Laptop l5 = (Laptop) p5;
		Laptop l6 = (Laptop) p6;
		Laptop l7 = (Laptop) p7;
		Laptop l8 = (Laptop) p8;
		Laptop l9 = (Laptop) p9;
		Laptop l10 = (Laptop) p10;
		
		System.out.println("==================l1 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l1.name);
		System.out.println("Price is: " +l1.price);
		System.out.println("Quantity is: " +l1.quantity);
		System.out.println("Brandname is: " +l1.brandname);
		System.out.println("Ram is: " +l1.ram);
		System.out.println("Color is: " +l1.color);
		
		System.out.println("==================l2 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l2.name);
		System.out.println("Price is: " +l2.price);
		System.out.println("Quantity is: " +l2.quantity);
		System.out.println("Brandname is: " +l2.brandname);
		System.out.println("Ram is: " +l2.ram);
		System.out.println("Color is: " +l2.color);
		
		System.out.println("==================l3 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l3.name);
		System.out.println("Price is: " +l3.price);
		System.out.println("Quantity is: " +l3.quantity);
		System.out.println("Brandname is: " +l3.brandname);
		System.out.println("Ram is: " +l3.ram);
		System.out.println("Color is: " +l3.color);
		
		System.out.println("==================l4 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l4.name);
		System.out.println("Price is: " +l4.price);
		System.out.println("Quantity is: " +l4.quantity);
		System.out.println("Brandname is: " +l4.brandname);
		System.out.println("Ram is: " +l4.ram);
		System.out.println("Color is: " +l4.color);
		
		System.out.println("==================l5 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l5.name);
		System.out.println("Price is: " +l5.price);
		System.out.println("Quantity is: " +l5.quantity);
		System.out.println("Brandname is: " +l5.brandname);
		System.out.println("Ram is: " +l5.ram);
		System.out.println("Color is: " +l5.color);
		
		System.out.println("==================l6 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l6.name);
		System.out.println("Price is: " +l6.price);
		System.out.println("Quantity is: " +l6.quantity);
		System.out.println("Brandname is: " +l6.brandname);
		System.out.println("Ram is: " +l6.ram);
		System.out.println("Color is: " +l6.color);
		
		System.out.println("==================l7 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l7.name);
		System.out.println("Price is: " +l7.price);
		System.out.println("Quantity is: " +l7.quantity);
		System.out.println("Brandname is: " +l7.brandname);
		System.out.println("Ram is: " +l7.ram);
		System.out.println("Color is: " +l7.color);
		
		System.out.println("==================l8 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l8.name);
		System.out.println("Price is: " +l8.price);
		System.out.println("Quantity is: " +l8.quantity);
		System.out.println("Brandname is: " +l8.brandname);
		System.out.println("Ram is: " +l8.ram);
		System.out.println("Color is: " +l8.color);
		
		System.out.println("==================l9 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l9.name);
		System.out.println("Price is: " +l9.price);
		System.out.println("Quantity is: " +l9.quantity);
		System.out.println("Brandname is: " +l9.brandname);
		System.out.println("Ram is: " +l9.ram);
		System.out.println("Color is: " +l9.color);
		
		System.out.println("==================l10 DOWNCASTING PROGRAME====================");
		System.out.println("Name is: " +l10.name);
		System.out.println("Price is: " +l10.price);
		System.out.println("Quantity is: " +l10.quantity);
		System.out.println("Brandname is: " +l10.brandname);
		System.out.println("Ram is: " +l10.ram);
		System.out.println("Color is: " +l10.color);
		
		System.out.println("DOWNCASTING PROGRAM ENDS");

	}

}
