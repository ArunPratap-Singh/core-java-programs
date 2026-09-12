package inheritancePrograming.Product;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("===========================Main Method Starts==============================");
		
		ElectricalProduct e1 = new ElectricalProduct( "Laptop", 101, 75000.50, "Dell", "Computer", 2, true);
		ElectricalProduct e2 = new ElectricalProduct("Smartphone", 102, 45000.00, "Samsung", "Mobile", 1, true);
		ElectricalProduct e3 = new ElectricalProduct("Television", 103, 65000.75, "Sony", "Entertainment", 3, false);
		ElectricalProduct e4 = new ElectricalProduct("Refrigerator", 104, 55000.50, "LG", "Home Appliance", 2, false);
		ElectricalProduct e5 = new ElectricalProduct("Washing Machine", 105, 42000.25, "Whirlpool", "Home Appliance", 2, false);
		ElectricalProduct e6 = new ElectricalProduct("Air Conditioner", 106, 72000.00, "Daikin", "Cooling Appliance", 5, false);
		ElectricalProduct e7 = new ElectricalProduct("Tablet", 107, 38000.50, "Apple", "Computer", 1, true);
		ElectricalProduct e8 = new ElectricalProduct("Smart Watch", 108, 25000.00, "Apple", "Wearable", 1, true);
		ElectricalProduct e9 = new ElectricalProduct("Microwave Oven", 109, 18000.75, "Samsung", "Kitchen Appliance", 2, false);
		ElectricalProduct e10 = new ElectricalProduct("Printer", 110, 22000.50, "HP", "Computer Peripheral", 1, false);
		ElectricalProduct e11 = new ElectricalProduct("Bluetooth Speaker", 111, 8500.00, "JBL", "Audio Device", 1, true);
		ElectricalProduct e12 = new ElectricalProduct("Desktop Computer", 112, 85000.25, "HP", "Computer", 3, false);
		ElectricalProduct e13 = new ElectricalProduct("Vacuum Cleaner", 113, 15000.50, "Philips", "Home Appliance", 2, false);
		ElectricalProduct e14 = new ElectricalProduct("Digital Camera", 114, 55000.00, "Canon", "Camera", 2, true);
		ElectricalProduct e15 = new ElectricalProduct("Headphones", 115, 12000.75, "Sony", "Audio Device", 1, true);
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println(e9);
		System.out.println(e10);
		System.out.println(e11);
		System.out.println(e12);
		System.out.println(e13);
		System.out.println(e14);
		System.out.println(e15);
		
		System.out.println("================================Main Method Ends=======================================");

	}

}
