package upcastingdowncasting.fruit;

public class DriverApple {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAM STARTS");
		
		Fruit f1 = new Apple("Red Delicious Apple", "Dark Red", 180, "Kashmiri Apple", 4);
		Fruit f2 = new Apple("Green Apple", "Green", 250, "Washington Apples", 5);
		Fruit f3 = new Apple("Fuji Apple", "Red", 180, "Kinnaur", 6);
		Fruit f4 = new Apple("Gala Apple", "Red-Yellow", 250, "Royal Gala", 6);
		Fruit f5 = new Apple("Honey Crisp Apple", "Red", 320, "Honey Crisp", 10);
		Fruit f6 = new Apple("Golden Apple", "Golden Yellow", 240, "Golden Delicious", 9);
		Fruit f7 = new Apple("Ambri Apple", "Red", 190, "Kasmiri Ambri", 8);
		Fruit f8 = new Apple("Pink Lady Apple", "Pink-Red", 350, "Pink Lady", 7);
		Fruit f9 = new Apple("Granny Smith", "Bright Green", 280, "Granny Smith", 11);
		Fruit f10 = new Apple("McIntosh Apple", "Red-Green", 260, "McIntosh", 12);
		
		System.out.println("=======================================================================");
		
		System.out.println("===========F1 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f1.name);
		System.out.println("Color is: " +f1.color);
		System.out.println("Price is: " +f1.price);
		
		System.out.println("===========F2 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f2.name);
		System.out.println("Color is: " +f2.color);
		System.out.println("Price is: " +f2.price);
		
		System.out.println("===========F3 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f3.name);
		System.out.println("Color is: " +f3.color);
		System.out.println("Price is: " +f3.price);
		
		System.out.println("===========F4 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f4.name);
		System.out.println("Color is: " +f4.color);
		System.out.println("Price is: " +f4.price);
		
		System.out.println("===========F5 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f5.name);
		System.out.println("Color is: " +f5.color);
		System.out.println("Price is: " +f5.price);
		
		System.out.println("===========F6 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f6.name);
		System.out.println("Color is: " +f6.color);
		System.out.println("Price is: " +f6.price);
		
		System.out.println("===========F7 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f7.name);
		System.out.println("Color is: " +f7.color);
		System.out.println("Price is: " +f7.price);
		
		System.out.println("===========F8 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f8.name);
		System.out.println("Color is: " +f8.color);
		System.out.println("Price is: " +f8.price);
		
		System.out.println("===========F9 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f9.name);
		System.out.println("Color is: " +f9.color);
		System.out.println("Price is: " +f9.price);
		
		System.out.println("===========F10 UPCASTING DETAILS=============");
		System.out.println("Name is: " +f10.name);
		System.out.println("Color is: " +f10.color);
		System.out.println("Price is: " +f10.price);
		
		System.out.println("UPCSTING PROGRAM ENDS");
		
		System.out.println("*********************************************************");
		
		System.out.println("DOWNCASTING PROGRAM STARTS");
		
		Apple a1 = (Apple) f1;
		Apple a2 = (Apple) f2;
		Apple a3 = (Apple) f3;
		Apple a4 = (Apple) f4;
		Apple a5 = (Apple) f5;
		Apple a6 = (Apple) f6;
		Apple a7 = (Apple) f7;
		Apple a8 = (Apple) f8;
		Apple a9 = (Apple) f9;
		Apple a10 = (Apple) f10;
		
		System.out.println("=============a1 DOWNCASTING DETAILS==============");
		System.out.println("Name is: " +a1.name);
		System.out.println("Price is: " +a1.color);
		System.out.println("Price is: " +a1.price);
		System.out.println("Brandname is: " +a1.brand);
		System.out.println("Quantity is: " +a1.quantity);
		
		System.out.println("=============a2 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a2.name);
		System.out.println("Price is: " +a2.color);
		System.out.println("Price is: " +a2.price);
		System.out.println("Brandname is: " +a2.brand);
		System.out.println("Quantity is: " +a2.quantity);
		
		System.out.println("=============a3 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a3.name);
		System.out.println("Price is: " +a3.color);
		System.out.println("Price is: " +a3.price);
		System.out.println("Brandname is: " +a3.brand);
		System.out.println("Quantity is: " +a3.quantity);
		
		System.out.println("=============a4 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a4.name);
		System.out.println("Price is: " +a4.color);
		System.out.println("Price is: " +a4.price);
		System.out.println("Brandname is: " +a4.brand);
		System.out.println("Quantity is: " +a4.quantity);
		
		System.out.println("=============a5 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a5.name);
		System.out.println("Price is: " +a5.color);
		System.out.println("Price is: " +a5.price);
		System.out.println("Brandname is: " +a5.brand);
		System.out.println("Quantity is: " +a5.quantity);
		
		System.out.println("=============a6 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a6.name);
		System.out.println("Price is: " +a6.color);
		System.out.println("Price is: " +a6.price);
		System.out.println("Brandname is: " +a6.brand);
		System.out.println("Quantity is: " +a6.quantity);
		
		System.out.println("=============a7 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a7.name);
		System.out.println("Price is: " +a7.color);
		System.out.println("Price is: " +a7.price);
		System.out.println("Brandname is: " +a7.brand);
		System.out.println("Quantity is: " +a7.quantity);
		
		System.out.println("=============a8 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a8.name);
		System.out.println("Price is: " +a8.color);
		System.out.println("Price is: " +a8.price);
		System.out.println("Brandname is: " +a8.brand);
		System.out.println("Quantity is: " +a8.quantity);
		
		System.out.println("=============a9 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a9.name);
		System.out.println("Price is: " +a9.color);
		System.out.println("Price is: " +a9.price);
		System.out.println("Brandname is: " +a9.brand);
		System.out.println("Quantity is: " +a9.quantity);
		
		System.out.println("=============a10 DOWNCATING DETAILS===============");
		System.out.println("Name is: " +a10.name);
		System.out.println("Price is: " +a10.color);
		System.out.println("Price is: " +a10.price);
		System.out.println("Brandname is: " +a10.brand);
		System.out.println("Quantity is: " +a10.quantity);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
		
		
		
		
		
		
		

	}

}
