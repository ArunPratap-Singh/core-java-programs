package upcastingdowncasting.fruit;

public class DriverBanana {

	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		Fruit f1 = new Banana("Cavendish Banana", "Yellow", 60, "Dole", "1 Dozen" );
		Fruit f2 = new Banana("Robusta Banana", "Green-Yellow", 55, "Robusta Fresh", "2 Dozen");
		Fruit f3 = new Banana("Red Banana", "Red-Purple", 120, "Kerala Red", "3 Dozen");
		Fruit f4 = new Banana("Nendran Banana", "Yellow", 90, "Nendran Gold", "4 Dozen");
		Fruit f5 = new Banana("Green Banana", "Green", 50, "Farm Fresh", "5 Dozen");
		Fruit f6 = new Banana("Yelakki Banana", "Samll Yellow", 80, "Yelakki Fresh", "9 Dozen");
		Fruit f7 = new Banana("Lady Finger Banana", "Bright Yellow", 70, "Lady Finger", "10 Dozen");
		Fruit f8 = new Banana("Burro Banana", "Yellow-Green", 110, "Burro Farms", "8 Dozen");
		Fruit f9 = new Banana("Plantain Banana", "Green", 65, "Plantain King", "7 Dozen");
		Fruit f10 = new Banana("Blue Java Banana", "Blue Green", 150, "Blue Java", "11 Dozen");
		
		System.out.println("=========================================================================");

		System.out.println("==============f1 UPCASTING DETAILS================");
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
		
		Banana b1 = (Banana) f1;
		Banana b2 = (Banana) f2;
		Banana b3 = (Banana) f3;
		Banana b4 = (Banana) f4;
		Banana b5 = (Banana) f5;
		Banana b6 = (Banana) f6;
		Banana b7 = (Banana) f7;
		Banana b8 = (Banana) f8;
		Banana b9 = (Banana) f9;
		Banana b10 = (Banana) f10;
		
		System.out.println("===============b1 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b1.name);
		System.out.println("Color is: " +b1.color);
		System.out.println("Price is: " +b1.price);
		System.out.println("Brandname is: " +b1.brand);
		System.out.println("Quantity is: " +b1.quantity);
		
		System.out.println("===============b2 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b2.name);
		System.out.println("Color is: " +b2.color);
		System.out.println("Price is: " +b2.price);
		System.out.println("Brandname is: " +b2.brand);
		System.out.println("Quantity is: " +b2.quantity);
		
		System.out.println("===============b3 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b3.name);
		System.out.println("Color is: " +b3.color);
		System.out.println("Price is: " +b3.price);
		System.out.println("Brandname is: " +b3.brand);
		System.out.println("Quantity is: " +b3.quantity);
		
		System.out.println("===============b4 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b4.name);
		System.out.println("Color is: " +b4.color);
		System.out.println("Price is: " +b4.price);
		System.out.println("Brandname is: " +b4.brand);
		System.out.println("Quantity is: " +b4.quantity);
		
		System.out.println("===============b5 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b5.name);
		System.out.println("Color is: " +b5.color);
		System.out.println("Price is: " +b5.price);
		System.out.println("Brandname is: " +b5.brand);
		System.out.println("Quantity is: " +b5.quantity);
		
		System.out.println("===============b6 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b6.name);
		System.out.println("Color is: " +b6.color);
		System.out.println("Price is: " +b6.price);
		System.out.println("Brandname is: " +b6.brand);
		System.out.println("Quantity is: " +b6.quantity);
		
		System.out.println("===============b7 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b7.name);
		System.out.println("Color is: " +b7.color);
		System.out.println("Price is: " +b7.price);
		System.out.println("Brandname is: " +b7.brand);
		System.out.println("Quantity is: " +b7.quantity);
		
		System.out.println("===============b8 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b8.name);
		System.out.println("Color is: " +b8.color);
		System.out.println("Price is: " +b8.price);
		System.out.println("Brandname is: " +b8.brand);
		System.out.println("Quantity is: " +b8.quantity);
		
		System.out.println("===============b9 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b9.name);
		System.out.println("Color is: " +b9.color);
		System.out.println("Price is: " +b9.price);
		System.out.println("Brandname is: " +b9.brand);
		System.out.println("Quantity is: " +b9.quantity);
		
		System.out.println("===============b10 DOWNCASTING DETAILS================");
		System.out.println("Name is: " +b10.name);
		System.out.println("Color is: " +b10.color);
		System.out.println("Price is: " +b10.price);
		System.out.println("Brandname is: " +b10.brand);
		System.out.println("Quantity is: " +b10.quantity);
		
		System.out.println("DOWNCASTING PROGRAME ENDS");
	}

}
