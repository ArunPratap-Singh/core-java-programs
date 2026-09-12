package upcastingdowncasting.fruit;

public class DriverOrange {
	
	public static void main(String[] args) {
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		Fruit f1 = new Orange("Navel Orange", "Bright Orange", 180, "California Navel", 1, "Sweet");
		Fruit f2 = new Orange("Valencia Orange", "Orange", 200, "Valencia fresh", 2, "Tangy");
		Fruit f3 = new Orange("Blood Orange", "Dark Red-Orange", 320, "Blood Citrus", 3, "Sweet");
		Fruit f4 = new Orange("Mandarin Orange", "Deep Morange", 220, "MandarinGold", 4, "Sour");
		Fruit f5 = new Orange("Clementine Orange", "Orange", 250, "Clementine Sweet", 5, "Tangy");
		Fruit f6 = new Orange("Tangerine Orange", "Reddish Orange", 240, "Tangerine Farms", 6, "Sour");
		Fruit f7 = new Orange("Nagpur Orange", "Bright Orange", 160, "Nagpur Fresh", 7, "Sweet");
		Fruit f8 = new Orange("Malta Orange", "Yellow-Orange", 190, "Malta Premium", 8, "Sour");
		Fruit f9 = new Orange("Bergamot Orange", "Green-Yellow", 350, "Bergamot Citrus", 9, "Sweet");
		Fruit f10 = new Orange("Serville Orange", "Dark Orange", 280, "Serville Gold", 10, "Tangy");
		
		System.out.println("============================================================================");
		
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
		
		Orange o1 = (Orange) f1;
		Orange o2 = (Orange) f2;
		Orange o3 = (Orange) f3;
		Orange o4 = (Orange) f4;
		Orange o5 = (Orange) f5;
		Orange o6 = (Orange) f6;
		Orange o7 = (Orange) f7;
		Orange o8 = (Orange) f8;
		Orange o9 = (Orange) f9;
		Orange o10 = (Orange) f10;
		
		System.out.println("=================o1 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o1.name);
		System.out.println("Color is: " +o1.color);
		System.out.println("Price is: " +o1.price);
		System.out.println("Brandname is: " +o1.brand);
		System.out.println("Quantity is: " +o1.quantity);
		System.out.println("Taste is: " +o1.taste);
		
		System.out.println("=================o2 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o2.name);
		System.out.println("Color is: " +o2.color);
		System.out.println("Price is: " +o2.price);
		System.out.println("Brandname is: " +o2.brand);
		System.out.println("Quantity is: " +o2.quantity);
		System.out.println("Taste is: " +o2.taste);
		
		System.out.println("=================o3 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o3.name);
		System.out.println("Color is: " +o3.color);
		System.out.println("Price is: " +o3.price);
		System.out.println("Brandname is: " +o3.brand);
		System.out.println("Quantity is: " +o3.quantity);
		System.out.println("Taste is: " +o3.taste);
		
		System.out.println("=================o4 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o4.name);
		System.out.println("Color is: " +o4.color);
		System.out.println("Price is: " +o4.price);
		System.out.println("Brandname is: " +o4.brand);
		System.out.println("Quantity is: " +o4.quantity);
		System.out.println("Taste is: " +o4.taste);
		
		System.out.println("=================o5 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o5.name);
		System.out.println("Color is: " +o5.color);
		System.out.println("Price is: " +o5.price);
		System.out.println("Brandname is: " +o5.brand);
		System.out.println("Quantity is: " +o5.quantity);
		System.out.println("Taste is: " +o5.taste);
		
		System.out.println("=================o6 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o6.name);
		System.out.println("Color is: " +o6.color);
		System.out.println("Price is: " +o6.price);
		System.out.println("Brandname is: " +o6.brand);
		System.out.println("Quantity is: " +o6.quantity);
		System.out.println("Taste is: " +o6.taste);
		
		System.out.println("=================o7 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o7.name);
		System.out.println("Color is: " +o7.color);
		System.out.println("Price is: " +o7.price);
		System.out.println("Brandname is: " +o7.brand);
		System.out.println("Quantity is: " +o7.quantity);
		System.out.println("Taste is: " +o7.taste);
		
		System.out.println("=================o8 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o8.name);
		System.out.println("Color is: " +o8.color);
		System.out.println("Price is: " +o8.price);
		System.out.println("Brandname is: " +o8.brand);
		System.out.println("Quantity is: " +o8.quantity);
		System.out.println("Taste is: " +o8.taste);
		
		System.out.println("=================o9 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o9.name);
		System.out.println("Color is: " +o9.color);
		System.out.println("Price is: " +o9.price);
		System.out.println("Brandname is: " +o9.brand);
		System.out.println("Quantity is: " +o9.quantity);
		System.out.println("Taste is: " +o9.taste);
		
		System.out.println("=================o10 DOWNCASTING DETAILS===================");
		System.out.println("Name is: " +o10.name);
		System.out.println("Color is: " +o10.color);
		System.out.println("Price is: " +o10.price);
		System.out.println("Brandname is: " +o10.brand);
		System.out.println("Quantity is: " +o10.quantity);
		System.out.println("Taste is: " +o10.taste);
		
		System.out.println("DOWNCASTING PROGARME ENDS");
	}

}
