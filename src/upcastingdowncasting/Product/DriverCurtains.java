package upcastingdowncasting.Product;

public class DriverCurtains {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAM STARTS");
		
		Product p1 = new Curtains("Window Curtains", 1600, 2, "White", "5Feet", "Cotton");
		Product p2 = new Curtains("Hall Curtains", 1500, 2, "Pink", "9Feet", "Cotton");
		Product p3 = new Curtains("Mandir Curtains", 999, 2, "Red", "7Feet", "Polyster");
		Product p4 = new Curtains("Normal Door Curtains", 1700, 4, "Pink", "7Feet", "Linen");
		Product p5 = new Curtains("Window Curtains", 1900, 4, "Velvet Golden", "7Feet", "Velvet");
		Product p6 = new Curtains("Mandir Curtains", 1200, 4, "Yellow", "7Feet", "Polyster");
		Product p7 = new Curtains("Hall Curtains", 1500, 2, "Light Blue", "7Feet", "Cotton");
		Product p8 = new Curtains("Hall Curtains", 1800, 2, "Light Pink", "9Feet", "Polyster");
		Product p9 = new Curtains("Mandir Curtains", 2000, 4, "Light Blue", "8Feet", "Linen");
		
		System.out.println("=========================================================================");
		
		System.out.println("=================P1 UPCASTING DETAILS===================");
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
		
		Curtains c1 = (Curtains) p1;
		Curtains c2 = (Curtains) p2;
		Curtains c3 = (Curtains) p3;
		Curtains c4 = (Curtains) p3;
		Curtains c5 = (Curtains) p3;
		Curtains c6 = (Curtains) p3;
		Curtains c7 = (Curtains) p3;
		Curtains c8 = (Curtains) p3;
		Curtains c9 = (Curtains) p3;
		
		System.out.println("=================C1 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c1.name);
		System.out.println("Price is: " +c1.price);
		System.out.println("Quantity is: " +c1.quantity);
		System.out.println("Color is: " +c1.color);
		System.out.println("Length is: " +c1.length);
		System.out.println("Fabric is: " +c1.fabric);
		
		System.out.println("=================C2 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c2.name);
		System.out.println("Price is: " +c2.price);
		System.out.println("Quantity is: " +c2.quantity);
		System.out.println("Color is: " +c2.color);
		System.out.println("Length is: " +c2.length);
		System.out.println("Fabric is: " +c2.fabric);
		
		System.out.println("=================C3 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c3.name);
		System.out.println("Price is: " +c3.price);
		System.out.println("Quantity is: " +c3.quantity);
		System.out.println("Color is: " +c3.color);
		System.out.println("Length is: " +c3.length);
		System.out.println("Fabric is: " +c3.fabric);
		
		System.out.println("=================C4 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c4.name);
		System.out.println("Price is: " +c4.price);
		System.out.println("Quantity is: " +c4.quantity);
		System.out.println("Color is: " +c4.color);
		System.out.println("Length is: " +c4.length);
		System.out.println("Fabric is: " +c4.fabric);
		
		System.out.println("=================C5 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c5.name);
		System.out.println("Price is: " +c5.price);
		System.out.println("Quantity is: " +c5.quantity);
		System.out.println("Color is: " +c5.color);
		System.out.println("Length is: " +c5.length);
		System.out.println("Fabric is: " +c5.fabric);
		
		System.out.println("=================C6 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c6.name);
		System.out.println("Price is: " +c6.price);
		System.out.println("Quantity is: " +c6.quantity);
		System.out.println("Color is: " +c6.color);
		System.out.println("Length is: " +c6.length);
		System.out.println("Fabric is: " +c6.fabric);
		
		System.out.println("=================C7 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c7.name);
		System.out.println("Price is: " +c7.price);
		System.out.println("Quantity is: " +c7.quantity);
		System.out.println("Color is: " +c7.color);
		System.out.println("Length is: " +c7.length);
		System.out.println("Fabric is: " +c7.fabric);
		
		System.out.println("=================C8 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c8.name);
		System.out.println("Price is: " +c8.price);
		System.out.println("Quantity is: " +c8.quantity);
		System.out.println("Color is: " +c8.color);
		System.out.println("Length is: " +c8.length);
		System.out.println("Fabric is: " +c8.fabric);
		
		System.out.println("=================C9 DOWNCASTING DETAILS==================");
		System.out.println("Name is: " +c9.name);
		System.out.println("Price is: " +c9.price);
		System.out.println("Quantity is: " +c9.quantity);
		System.out.println("Color is: " +c9.color);
		System.out.println("Length is: " +c9.length);
		System.out.println("Fabric is: " +c9.fabric);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
		
		




	}

}
