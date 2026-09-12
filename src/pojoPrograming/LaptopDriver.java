package pojoPrograming;

public class LaptopDriver {

	public static void main(String[] args) {
		
		System.out.println("===================================Main Method Starts=================================");
		
		LaptopDetails l1 = new LaptopDetails(101, "Dell", "Inspiron 15", 75000.0, 16, 512, "Intel Core i7", "Window 11", 15.6, "Intel Iris Xe", "Silver", 1.8, "54WH", 2, "Backlit Keyboard", "Business Laptop");
		LaptopDetails l2 = new LaptopDetails(102, "HP", "Pavilion 14", 68000.0, 16, 512, "Intel Core i5", "Windows 11", 14.0, "Intel UHD Graphics", "Gold", 1.5, "43WH", 1, "Standard Keyboard", "Home Laptop");
		LaptopDetails l3 = new LaptopDetails(103, "Lenovo", "IdeaPad Slim 5", 72000.0, 16, 1024, "AMD Ryzen 7", "Windows 11", 15.6, "AMD Radeon Graphics", "Grey", 1.7, "57WH", 2, "Backlit Keyboard", "Personal Laptop");
		LaptopDetails l4 = new LaptopDetails(104, "Asus", "Vivobook 16", 65000.0, 8, 512, "Intel Core i5", "Windows 11", 16.0, "Intel Iris Xe", "Blue", 1.9, "50WH", 1, "Chiclet Keyboard", "Student Laptop");
		LaptopDetails l5 = new LaptopDetails(105, "Acer", "Aspire 7", 78000.0, 16, 512, "AMD Ryzen 7", "Windows 11", 15.6, "NVIDIA RTX 3050", "Black", 2.1, "48WH", 2, "Backlit Keyboard", "Gaming Laptop");
		LaptopDetails l6 = new LaptopDetails(106, "Apple", "MacBook Air M3", 115000.0, 16, 512, "Apple M3", "macOS", 13.6, "Apple Integrated GPU", "Midnight", 1.2, "52WH", 1, "Magic Keyboard", "Ultrabook");
		LaptopDetails l7 = new LaptopDetails(107, "MSI", "Katana 15", 125000.0, 32, 1024, "Intel Core i7", "Windows 11", 15.6, "NVIDIA RTX 4060", "Black", 2.3, "53WH", 2, "RGB Backlit Keyboard", "Gaming Laptop");
		LaptopDetails l8 = new LaptopDetails(108, "Samsung", "Galaxy Book4", 85000.0, 16, 512, "Intel Core Ultra 5", "Windows 11", 15.6, "Intel Arc Graphics", "Grey", 1.6, "55WH", 1, "Backlit Keyboard", "Business Laptop");
		LaptopDetails l9 = new LaptopDetails(109, "Microsoft", "Surface Laptop 6", 140000.0, 16, 512, "Intel Core Ultra 7", "Windows 11", 13.5, "Intel Arc Graphics", "Platinum", 1.4, "47WH", 1, "Backlit Keyboard", "Premium Laptop");
		LaptopDetails l10 = new LaptopDetails(110, "Dell", "Alienware M16", 185000.0, 32, 1024, "Intel Core i9", "Windows 11", 16.0, "NVIDIA RTX 4070", "Dark Metallic Moon", 3.0, "86WH", 2, "RGB Mechanical Keyboard", "Gaming Laptop");
		
		
        System.out.println("================ Laptop Details 1 ================");

        System.out.println("Laptop ID: " + l1.getLaptopId());
        System.out.println("Brand: " + l1.getBrand());
        System.out.println("Model: " + l1.getModel());
        System.out.println("Price: " + l1.getPrice());
        System.out.println("RAM: " + l1.getRam() + "GB");
        System.out.println("Storage: " + l1.getStorage() + "GB");
        System.out.println("Processor: " + l1.getProcessor());
        System.out.println("Operating System: " + l1.getOperatingSystem());
        System.out.println("Screen Size: " + l1.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l1.getGraphicsCard());
        System.out.println("Color: " + l1.getColor());
        System.out.println("Weight: " + l1.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l1.getBatteryCapacity());
        System.out.println("Warranty: " + l1.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l1.getKeyboardType());
        System.out.println("Laptop Type: " + l1.getLaptopType());


        System.out.println("================ Laptop Details 2 ================");

        System.out.println("Laptop ID: " + l2.getLaptopId());
        System.out.println("Brand: " + l2.getBrand());
        System.out.println("Model: " + l2.getModel());
        System.out.println("Price: " + l2.getPrice());
        System.out.println("RAM: " + l2.getRam() + "GB");
        System.out.println("Storage: " + l2.getStorage() + "GB");
        System.out.println("Processor: " + l2.getProcessor());
        System.out.println("Operating System: " + l2.getOperatingSystem());
        System.out.println("Screen Size: " + l2.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l2.getGraphicsCard());
        System.out.println("Color: " + l2.getColor());
        System.out.println("Weight: " + l2.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l2.getBatteryCapacity());
        System.out.println("Warranty: " + l2.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l2.getKeyboardType());
        System.out.println("Laptop Type: " + l2.getLaptopType());


        System.out.println("================ Laptop Details 3 ================");

        System.out.println("Laptop ID: " + l3.getLaptopId());
        System.out.println("Brand: " + l3.getBrand());
        System.out.println("Model: " + l3.getModel());
        System.out.println("Price: " + l3.getPrice());
        System.out.println("RAM: " + l3.getRam() + "GB");
        System.out.println("Storage: " + l3.getStorage() + "GB");
        System.out.println("Processor: " + l3.getProcessor());
        System.out.println("Operating System: " + l3.getOperatingSystem());
        System.out.println("Screen Size: " + l3.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l3.getGraphicsCard());
        System.out.println("Color: " + l3.getColor());
        System.out.println("Weight: " + l3.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l3.getBatteryCapacity());
        System.out.println("Warranty: " + l3.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l3.getKeyboardType());
        System.out.println("Laptop Type: " + l3.getLaptopType());


        System.out.println("================ Laptop Details 4 ================");

        System.out.println("Laptop ID: " + l4.getLaptopId());
        System.out.println("Brand: " + l4.getBrand());
        System.out.println("Model: " + l4.getModel());
        System.out.println("Price: " + l4.getPrice());
        System.out.println("RAM: " + l4.getRam() + "GB");
        System.out.println("Storage: " + l4.getStorage() + "GB");
        System.out.println("Processor: " + l4.getProcessor());
        System.out.println("Operating System: " + l4.getOperatingSystem());
        System.out.println("Screen Size: " + l4.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l4.getGraphicsCard());
        System.out.println("Color: " + l4.getColor());
        System.out.println("Weight: " + l4.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l4.getBatteryCapacity());
        System.out.println("Warranty: " + l4.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l4.getKeyboardType());
        System.out.println("Laptop Type: " + l4.getLaptopType());


        System.out.println("================ Laptop Details 5 ================");

        System.out.println("Laptop ID: " + l5.getLaptopId());
        System.out.println("Brand: " + l5.getBrand());
        System.out.println("Model: " + l5.getModel());
        System.out.println("Price: " + l5.getPrice());
        System.out.println("RAM: " + l5.getRam() + "GB");
        System.out.println("Storage: " + l5.getStorage() + "GB");
        System.out.println("Processor: " + l5.getProcessor());
        System.out.println("Operating System: " + l5.getOperatingSystem());
        System.out.println("Screen Size: " + l5.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l5.getGraphicsCard());
        System.out.println("Color: " + l5.getColor());
        System.out.println("Weight: " + l5.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l5.getBatteryCapacity());
        System.out.println("Warranty: " + l5.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l5.getKeyboardType());
        System.out.println("Laptop Type: " + l5.getLaptopType());


        System.out.println("================ Laptop Details 6 ================");

        System.out.println("Laptop ID: " + l6.getLaptopId());
        System.out.println("Brand: " + l6.getBrand());
        System.out.println("Model: " + l6.getModel());
        System.out.println("Price: " + l6.getPrice());
        System.out.println("RAM: " + l6.getRam() + "GB");
        System.out.println("Storage: " + l6.getStorage() + "GB");
        System.out.println("Processor: " + l6.getProcessor());
        System.out.println("Operating System: " + l6.getOperatingSystem());
        System.out.println("Screen Size: " + l6.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l6.getGraphicsCard());
        System.out.println("Color: " + l6.getColor());
        System.out.println("Weight: " + l6.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l6.getBatteryCapacity());
        System.out.println("Warranty: " + l6.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l6.getKeyboardType());
        System.out.println("Laptop Type: " + l6.getLaptopType());


        System.out.println("================ Laptop Details 7 ================");

        System.out.println("Laptop ID: " + l7.getLaptopId());
        System.out.println("Brand: " + l7.getBrand());
        System.out.println("Model: " + l7.getModel());
        System.out.println("Price: " + l7.getPrice());
        System.out.println("RAM: " + l7.getRam() + "GB");
        System.out.println("Storage: " + l7.getStorage() + "GB");
        System.out.println("Processor: " + l7.getProcessor());
        System.out.println("Operating System: " + l7.getOperatingSystem());
        System.out.println("Screen Size: " + l7.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l7.getGraphicsCard());
        System.out.println("Color: " + l7.getColor());
        System.out.println("Weight: " + l7.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l7.getBatteryCapacity());
        System.out.println("Warranty: " + l7.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l7.getKeyboardType());
        System.out.println("Laptop Type: " + l7.getLaptopType());


        System.out.println("================ Laptop Details 8 ================");

        System.out.println("Laptop ID: " + l8.getLaptopId());
        System.out.println("Brand: " + l8.getBrand());
        System.out.println("Model: " + l8.getModel());
        System.out.println("Price: " + l8.getPrice());
        System.out.println("RAM: " + l8.getRam() + "GB");
        System.out.println("Storage: " + l8.getStorage() + "GB");
        System.out.println("Processor: " + l8.getProcessor());
        System.out.println("Operating System: " + l8.getOperatingSystem());
        System.out.println("Screen Size: " + l8.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l8.getGraphicsCard());
        System.out.println("Color: " + l8.getColor());
        System.out.println("Weight: " + l8.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l8.getBatteryCapacity());
        System.out.println("Warranty: " + l8.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l8.getKeyboardType());
        System.out.println("Laptop Type: " + l8.getLaptopType());


        System.out.println("================ Laptop Details 9 ================");

        System.out.println("Laptop ID: " + l9.getLaptopId());
        System.out.println("Brand: " + l9.getBrand());
        System.out.println("Model: " + l9.getModel());
        System.out.println("Price: " + l9.getPrice());
        System.out.println("RAM: " + l9.getRam() + "GB");
        System.out.println("Storage: " + l9.getStorage() + "GB");
        System.out.println("Processor: " + l9.getProcessor());
        System.out.println("Operating System: " + l9.getOperatingSystem());
        System.out.println("Screen Size: " + l9.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l9.getGraphicsCard());
        System.out.println("Color: " + l9.getColor());
        System.out.println("Weight: " + l9.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l9.getBatteryCapacity());
        System.out.println("Warranty: " + l9.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l9.getKeyboardType());
        System.out.println("Laptop Type: " + l9.getLaptopType());


        System.out.println("================ Laptop Details 10 ================");

        System.out.println("Laptop ID: " + l10.getLaptopId());
        System.out.println("Brand: " + l10.getBrand());
        System.out.println("Model: " + l10.getModel());
        System.out.println("Price: " + l10.getPrice());
        System.out.println("RAM: " + l10.getRam() + "GB");
        System.out.println("Storage: " + l10.getStorage() + "GB");
        System.out.println("Processor: " + l10.getProcessor());
        System.out.println("Operating System: " + l10.getOperatingSystem());
        System.out.println("Screen Size: " + l10.getScreenSize() + " inches");
        System.out.println("Graphics Card: " + l10.getGraphicsCard());
        System.out.println("Color: " + l10.getColor());
        System.out.println("Weight: " + l10.getWeight() + " kg");
        System.out.println("Battery Capacity: " + l10.getBatteryCapacity());
        System.out.println("Warranty: " + l10.getWarranty() + " Years");
        System.out.println("Keyboard Type: " + l10.getKeyboardType());
        System.out.println("Laptop Type: " + l10.getLaptopType());
        
        System.out.println("====================================Main Method Ends==========================================");
        
        
	}

}
