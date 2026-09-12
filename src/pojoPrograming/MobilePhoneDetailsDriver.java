package pojoPrograming;

public class MobilePhoneDetailsDriver {

	public static void main(String[] args) {
		
		System.out.println("===============================Main Method Starts==================================");

		MobilePhoneDetails m1 = new MobilePhoneDetails("MOB101", "Samsung", "Galaxy S24", 74999.00, 8, 256, "Black", "Android", 4000, "50MP", "Snapdragon 8 Gen 3", 6.20, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m2 = new MobilePhoneDetails("MOB102", "Apple", "iPhone 15", 69999.00, 8, 256, "Blue", "iOS", 3349, "48MP", "A16 Bionic", 6.10, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m3 = new MobilePhoneDetails("MOB103", "OnePlus", "OnePlus 12", 64999.00, 12, 256, "Emerald Green", "Android", 5400, "50MP", "Snapdragon 8 Gen 3", 6.82, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m4 = new MobilePhoneDetails("MOB104", "Google", "Pixel 9", 79999.00, 12, 256, "Obsidian", "Android", 4700, "50MP", "Google Tensor G4", 6.30, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m5 = new MobilePhoneDetails("MOB105", "Xiaomi", "Xiaomi 14", 59999.00, 12, 512, "White", "Android", 4610, "50MP", "Snapdragon 8 Gen 3", 6.36, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m6 = new MobilePhoneDetails("MOB106", "Vivo", "Vivo X100", 69999.00, 16, 512, "Blue", "Android", 5400, "50MP", "Dimensity 9300", 6.78, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m7 = new MobilePhoneDetails("MOB107", "Oppo", "Oppo Find X8", 74999.00, 12, 256, "Black", "Android", 5630, "50MP", "Dimensity 9400", 6.59, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m8 = new MobilePhoneDetails("MOB108", "Realme", "GT 6", 40999.00, 12, 256, "Razor Green", "Android", 5500, "50MP", "Snapdragon 8s Gen 3", 6.78, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m9 = new MobilePhoneDetails("MOB109", "Motorola", "Edge 50 Pro", 39999.00, 12, 256, "Luxe Lavender", "Android", 4500, "50MP", "Snapdragon 7 Gen 3", 6.70, "1 Year", "In Stock", "5G", "Active");
		MobilePhoneDetails m10 = new MobilePhoneDetails("MOB110", "Samsung", "Galaxy A55", 42999.00, 8, 256, "Awesome Navy", "Android", 5000, "50MP", "Exynos 1480", 6.60, "1 Year", "In Stock", "5G", "Active");
		
		
		System.out.println("=========================Mobile Phone Details=========================");
		System.out.println("Object Reference is: " + m1);
		System.out.println("Mobile ID is: " + m1.getMobileID());
		System.out.println("Brand is: " + m1.getBrand());
		System.out.println("Model is: " + m1.getModel());
		System.out.println("Price is: " + m1.getPrice());
		System.out.println("RAM is: " + m1.getRam() + " GB");
		System.out.println("Storage is: " + m1.getStorage() + " GB");
		System.out.println("Color is: " + m1.getColor());
		System.out.println("Operating System is: " + m1.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m1.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m1.getCamera());
		System.out.println("Processor is: " + m1.getProcessor());
		System.out.println("Display Size is: " + m1.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m1.getWarranty());
		System.out.println("Availability is: " + m1.getAvailability());
		System.out.println("Network Type is: " + m1.getNetworkType());
		System.out.println("Mobile Status is: " + m1.getMobileStatus());
		
		System.out.println("=========================Mobile Phone Details 1=========================");

		System.out.println("Object Reference is: " + m1);
		System.out.println("Mobile ID is: " + m1.getMobileID());
		System.out.println("Brand is: " + m1.getBrand());
		System.out.println("Model is: " + m1.getModel());
		System.out.println("Price is: " + m1.getPrice());
		System.out.println("RAM is: " + m1.getRam() + " GB");
		System.out.println("Storage is: " + m1.getStorage() + " GB");
		System.out.println("Color is: " + m1.getColor());
		System.out.println("Operating System is: " + m1.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m1.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m1.getCamera());
		System.out.println("Processor is: " + m1.getProcessor());
		System.out.println("Display Size is: " + m1.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m1.getWarranty());
		System.out.println("Availability is: " + m1.getAvailability());
		System.out.println("Network Type is: " + m1.getNetworkType());
		System.out.println("Mobile Status is: " + m1.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 2=========================");

		System.out.println("Object Reference is: " + m2);
		System.out.println("Mobile ID is: " + m2.getMobileID());
		System.out.println("Brand is: " + m2.getBrand());
		System.out.println("Model is: " + m2.getModel());
		System.out.println("Price is: " + m2.getPrice());
		System.out.println("RAM is: " + m2.getRam() + " GB");
		System.out.println("Storage is: " + m2.getStorage() + " GB");
		System.out.println("Color is: " + m2.getColor());
		System.out.println("Operating System is: " + m2.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m2.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m2.getCamera());
		System.out.println("Processor is: " + m2.getProcessor());
		System.out.println("Display Size is: " + m2.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m2.getWarranty());
		System.out.println("Availability is: " + m2.getAvailability());
		System.out.println("Network Type is: " + m2.getNetworkType());
		System.out.println("Mobile Status is: " + m2.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 3=========================");

		System.out.println("Object Reference is: " + m3);
		System.out.println("Mobile ID is: " + m3.getMobileID());
		System.out.println("Brand is: " + m3.getBrand());
		System.out.println("Model is: " + m3.getModel());
		System.out.println("Price is: " + m3.getPrice());
		System.out.println("RAM is: " + m3.getRam() + " GB");
		System.out.println("Storage is: " + m3.getStorage() + " GB");
		System.out.println("Color is: " + m3.getColor());
		System.out.println("Operating System is: " + m3.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m3.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m3.getCamera());
		System.out.println("Processor is: " + m3.getProcessor());
		System.out.println("Display Size is: " + m3.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m3.getWarranty());
		System.out.println("Availability is: " + m3.getAvailability());
		System.out.println("Network Type is: " + m3.getNetworkType());
		System.out.println("Mobile Status is: " + m3.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 4=========================");

		System.out.println("Object Reference is: " + m4);
		System.out.println("Mobile ID is: " + m4.getMobileID());
		System.out.println("Brand is: " + m4.getBrand());
		System.out.println("Model is: " + m4.getModel());
		System.out.println("Price is: " + m4.getPrice());
		System.out.println("RAM is: " + m4.getRam() + " GB");
		System.out.println("Storage is: " + m4.getStorage() + " GB");
		System.out.println("Color is: " + m4.getColor());
		System.out.println("Operating System is: " + m4.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m4.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m4.getCamera());
		System.out.println("Processor is: " + m4.getProcessor());
		System.out.println("Display Size is: " + m4.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m4.getWarranty());
		System.out.println("Availability is: " + m4.getAvailability());
		System.out.println("Network Type is: " + m4.getNetworkType());
		System.out.println("Mobile Status is: " + m4.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 5=========================");

		System.out.println("Object Reference is: " + m5);
		System.out.println("Mobile ID is: " + m5.getMobileID());
		System.out.println("Brand is: " + m5.getBrand());
		System.out.println("Model is: " + m5.getModel());
		System.out.println("Price is: " + m5.getPrice());
		System.out.println("RAM is: " + m5.getRam() + " GB");
		System.out.println("Storage is: " + m5.getStorage() + " GB");
		System.out.println("Color is: " + m5.getColor());
		System.out.println("Operating System is: " + m5.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m5.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m5.getCamera());
		System.out.println("Processor is: " + m5.getProcessor());
		System.out.println("Display Size is: " + m5.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m5.getWarranty());
		System.out.println("Availability is: " + m5.getAvailability());
		System.out.println("Network Type is: " + m5.getNetworkType());
		System.out.println("Mobile Status is: " + m5.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 6=========================");

		System.out.println("Object Reference is: " + m6);
		System.out.println("Mobile ID is: " + m6.getMobileID());
		System.out.println("Brand is: " + m6.getBrand());
		System.out.println("Model is: " + m6.getModel());
		System.out.println("Price is: " + m6.getPrice());
		System.out.println("RAM is: " + m6.getRam() + " GB");
		System.out.println("Storage is: " + m6.getStorage() + " GB");
		System.out.println("Color is: " + m6.getColor());
		System.out.println("Operating System is: " + m6.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m6.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m6.getCamera());
		System.out.println("Processor is: " + m6.getProcessor());
		System.out.println("Display Size is: " + m6.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m6.getWarranty());
		System.out.println("Availability is: " + m6.getAvailability());
		System.out.println("Network Type is: " + m6.getNetworkType());
		System.out.println("Mobile Status is: " + m6.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 7=========================");

		System.out.println("Object Reference is: " + m7);
		System.out.println("Mobile ID is: " + m7.getMobileID());
		System.out.println("Brand is: " + m7.getBrand());
		System.out.println("Model is: " + m7.getModel());
		System.out.println("Price is: " + m7.getPrice());
		System.out.println("RAM is: " + m7.getRam() + " GB");
		System.out.println("Storage is: " + m7.getStorage() + " GB");
		System.out.println("Color is: " + m7.getColor());
		System.out.println("Operating System is: " + m7.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m7.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m7.getCamera());
		System.out.println("Processor is: " + m7.getProcessor());
		System.out.println("Display Size is: " + m7.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m7.getWarranty());
		System.out.println("Availability is: " + m7.getAvailability());
		System.out.println("Network Type is: " + m7.getNetworkType());
		System.out.println("Mobile Status is: " + m7.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 8=========================");

		System.out.println("Object Reference is: " + m8);
		System.out.println("Mobile ID is: " + m8.getMobileID());
		System.out.println("Brand is: " + m8.getBrand());
		System.out.println("Model is: " + m8.getModel());
		System.out.println("Price is: " + m8.getPrice());
		System.out.println("RAM is: " + m8.getRam() + " GB");
		System.out.println("Storage is: " + m8.getStorage() + " GB");
		System.out.println("Color is: " + m8.getColor());
		System.out.println("Operating System is: " + m8.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m8.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m8.getCamera());
		System.out.println("Processor is: " + m8.getProcessor());
		System.out.println("Display Size is: " + m8.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m8.getWarranty());
		System.out.println("Availability is: " + m8.getAvailability());
		System.out.println("Network Type is: " + m8.getNetworkType());
		System.out.println("Mobile Status is: " + m8.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 9=========================");

		System.out.println("Object Reference is: " + m9);
		System.out.println("Mobile ID is: " + m9.getMobileID());
		System.out.println("Brand is: " + m9.getBrand());
		System.out.println("Model is: " + m9.getModel());
		System.out.println("Price is: " + m9.getPrice());
		System.out.println("RAM is: " + m9.getRam() + " GB");
		System.out.println("Storage is: " + m9.getStorage() + " GB");
		System.out.println("Color is: " + m9.getColor());
		System.out.println("Operating System is: " + m9.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m9.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m9.getCamera());
		System.out.println("Processor is: " + m9.getProcessor());
		System.out.println("Display Size is: " + m9.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m9.getWarranty());
		System.out.println("Availability is: " + m9.getAvailability());
		System.out.println("Network Type is: " + m9.getNetworkType());
		System.out.println("Mobile Status is: " + m9.getMobileStatus());


		System.out.println("=========================Mobile Phone Details 10=========================");

		System.out.println("Object Reference is: " + m10);
		System.out.println("Mobile ID is: " + m10.getMobileID());
		System.out.println("Brand is: " + m10.getBrand());
		System.out.println("Model is: " + m10.getModel());
		System.out.println("Price is: " + m10.getPrice());
		System.out.println("RAM is: " + m10.getRam() + " GB");
		System.out.println("Storage is: " + m10.getStorage() + " GB");
		System.out.println("Color is: " + m10.getColor());
		System.out.println("Operating System is: " + m10.getOperatingSystem());
		System.out.println("Battery Capacity is: " + m10.getBatteryCapacity() + " mAh");
		System.out.println("Camera is: " + m10.getCamera());
		System.out.println("Processor is: " + m10.getProcessor());
		System.out.println("Display Size is: " + m10.getDisplaySize() + " inches");
		System.out.println("Warranty is: " + m10.getWarranty());
		System.out.println("Availability is: " + m10.getAvailability());
		System.out.println("Network Type is: " + m10.getNetworkType());
		System.out.println("Mobile Status is: " + m10.getMobileStatus());
		
		System.out.println("=====================================Main Method Ends==========================================");
		
		
	}

}
