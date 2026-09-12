package upcastingdowncasting.fruit;

public class DriverMango {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		Fruit f1 = new Mango("Alphonso Mango", "Golden Yellow", 900, "Ratnagiri Alphonso", 5);
		Fruit f2 = new Mango("Kesar Mango", "Orange-Yellow", 700, "Gir Kesar", 7);
		Fruit f3 = new Mango("Dasheri Mango", "Light Green-Yellow", 500, "Dasheri Fresh", 1);
		Fruit f4 = new Mango("Langra Mango", "Green", 450, "Banarasi Langra", 2);
		Fruit f5 = new Mango("Himsagar Mango", "Yellow", 650, "Himsagar Golden", 3);
		Fruit f6 = new Mango("Banganapalli Mango", "Bright Yellow", 550, "Banganapalli", 3);
		Fruit f7 = new Mango("Totapuri Mango", "Green-Yellow", 400, "Totapuri Fresh", 6);
		Fruit f8 = new Mango("Chausa Mango", "Golden Yellow", 600, "Chausa King", 8);
		Fruit f9 = new Mango("Neelam Mango", "Orange", 550, "Neelam Premium", 9);
		Fruit f10 = new Mango("Amrapalli Mango", "Red-Yellow", 580, "Amraplli Farms", 10);
		
		System.out.println("====================================================================");
		
		System.out.println("===============f1 UPCASTING DETAILS=================");
		System.out.println("Name is: " +f1.name);
		System.out.println("Color is: " +f1.color);
		System.out.println("Price is: " +f1.price);
		
		System.out.println("==============f2 UPCASTING DETAILS================");
		System.out.println("Name is: " +f2.name);
		System.out.println("Color is: " +f2.color);
		System.out.println("Price is: " +f2.price);
		
		System.out.println("==============f3 UPCASTING DETAILS================");
		System.out.println("Name is: " +f3.name);
		System.out.println("Color is: " +f3.color);
		System.out.println("Price is: " +f3.price);
		
		System.out.println("==============f4 UPCASTING DETAILS================");
		System.out.println("Name is: " +f4.name);
		System.out.println("Color is: " +f4.color);
		System.out.println("Price is: " +f4.price);
		
		System.out.println("==============f5 UPCASTING DETAILS================");
		System.out.println("Name is: " +f5.name);
		System.out.println("Color is: " +f5.color);
		System.out.println("Price is: " +f5.price);
		
		System.out.println("==============f6 UPCASTING DETAILS================");
		System.out.println("Name is: " +f6.name);
		System.out.println("Color is: " +f6.color);
		System.out.println("Price is: " +f6.price);
		
		System.out.println("==============f7 UPCASTING DETAILS================");
		System.out.println("Name is: " +f7.name);
		System.out.println("Color is: " +f7.color);
		System.out.println("Price is: " +f7.price);
		
		System.out.println("==============f8 UPCASTING DETAILS================");
		System.out.println("Name is: " +f8.name);
		System.out.println("Color is: " +f8.color);
		System.out.println("Price is: " +f8.price);
		
		System.out.println("==============f9 UPCASTING DETAILS================");
		System.out.println("Name is: " +f9.name);
		System.out.println("Color is: " +f9.color);
		System.out.println("Price is: " +f9.price);
		
		System.out.println("==============f10 UPCASTING DETAILS================");
		System.out.println("Name is: " +f10.name);
		System.out.println("Color is: " +f10.color);
		System.out.println("Price is: " +f10.price);
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("**********************************************************");
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		Mango m1 = (Mango) f1;
		Mango m2 = (Mango) f2;
		Mango m3 = (Mango) f3;
		Mango m4 = (Mango) f4;
		Mango m5 = (Mango) f5;
		Mango m6 = (Mango) f6;
		Mango m7 = (Mango) f7;
		Mango m8 = (Mango) f8;
		Mango m9 = (Mango) f9;
		Mango m10 = (Mango) f10;
		
		System.out.println("================m1 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m1.name);
		System.out.println("Color is: " +m1.color);
		System.out.println("Price is: " +m1.price);
		System.out.println("Brandname is: " +m1.brand);
		System.out.println("Quantity is: " +m1.quantity);
		
		System.out.println("================m2 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m2.name);
		System.out.println("Color is: " +m2.color);
		System.out.println("Price is: " +m2.price);
		System.out.println("Brandname is: " +m2.brand);
		System.out.println("Quantity is: " +m2.quantity);
		
		System.out.println("================m3 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m3.name);
		System.out.println("Color is: " +m3.color);
		System.out.println("Price is: " +m3.price);
		System.out.println("Brandname is: " +m3.brand);
		System.out.println("Quantity is: " +m3.quantity);
		
		System.out.println("================m4 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m4.name);
		System.out.println("Color is: " +m4.color);
		System.out.println("Price is: " +m4.price);
		System.out.println("Brandname is: " +m4.brand);
		System.out.println("Quantity is: " +m4.quantity);
		
		System.out.println("================m1 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m5.name);
		System.out.println("Color is: " +m5.color);
		System.out.println("Price is: " +m5.price);
		System.out.println("Brandname is: " +m5.brand);
		System.out.println("Quantity is: " +m5.quantity);
		
		System.out.println("================m6 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m6.name);
		System.out.println("Color is: " +m6.color);
		System.out.println("Price is: " +m6.price);
		System.out.println("Brandname is: " +m6.brand);
		System.out.println("Quantity is: " +m6.quantity);
		
		System.out.println("================m7 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m7.name);
		System.out.println("Color is: " +m7.color);
		System.out.println("Price is: " +m7.price);
		System.out.println("Brandname is: " +m7.brand);
		System.out.println("Quantity is: " +m7.quantity);
		
		System.out.println("================m8 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m8.name);
		System.out.println("Color is: " +m8.color);
		System.out.println("Price is: " +m8.price);
		System.out.println("Brandname is: " +m8.brand);
		System.out.println("Quantity is: " +m8.quantity);
		
		System.out.println("================m9 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m9.name);
		System.out.println("Color is: " +m9.color);
		System.out.println("Price is: " +m9.price);
		System.out.println("Brandname is: " +m9.brand);
		System.out.println("Quantity is: " +m9.quantity);
		
		System.out.println("================m10 DOWNCASTING DETAILS=================");
		System.out.println("Name is: " +m10.name);
		System.out.println("Color is: " +m10.color);
		System.out.println("Price is: " +m10.price);
		System.out.println("Brandname is: " +m10.brand);
		System.out.println("Quantity is: " +m10.quantity);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
		

	}

}
