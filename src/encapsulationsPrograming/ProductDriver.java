package encapsulationsPrograming;

public class ProductDriver {

	public static void main(String[] args) {

		System.out.println("===============================Main Method Starts===================================");

		Product p1 = new Product("Laptop", "PROD101", "Electronics", "Dell", 75000);
		Product p2 = new Product("Mobile", "PROD102", "Electronics", "Samsung", 45000);
		Product p3 = new Product("Television", "PROD103", "Electronics", "Sony", 65000);
		Product p4 = new Product("Refrigerator", "PROD104", "Appliances", "LG", 55000);
		Product p5 = new Product("Washing Machine", "PROD105", "Appliances", "Whirlpool", 48000);
		Product p6 = new Product("Air Conditioner", "PROD106", "Appliances", "Voltas", 42000);
		Product p7 = new Product("Microwave Oven", "PROD107", "Appliances", "IFB", 18000);
		Product p8 = new Product("Headphones", "PROD108", "Electronics", "Boat", 2500);
		Product p9 = new Product("Smart Watch", "PROD109", "Electronics", "Noise", 3500);
		Product p10 = new Product("Tablet", "PROD110", "Electronics", "Lenovo", 28000);

		Product p11 = new Product("Keyboard", "PROD111", "Accessories", "Logitech", 1800);
		Product p12 = new Product("Mouse", "PROD112", "Accessories", "HP", 1200);
		Product p13 = new Product("Printer", "PROD113", "Electronics", "Canon", 15000);
		Product p14 = new Product("Monitor", "PROD114", "Electronics", "Acer", 22000);
		Product p15 = new Product("Camera", "PROD115", "Electronics", "Nikon", 55000);
		Product p16 = new Product("Speaker", "PROD116", "Electronics", "JBL", 8500);
		Product p17 = new Product("Power Bank", "PROD117", "Accessories", "MI", 1800);
		Product p18 = new Product("Pendrive", "PROD118", "Accessories", "SanDisk", 900);
		Product p19 = new Product("Hard Disk", "PROD119", "Storage", "Seagate", 6500);
		Product p20 = new Product("SSD", "PROD120", "Storage", "Samsung", 7500);

		Product p21 = new Product("Chair", "PROD121", "Furniture", "Godrej", 6500);
		Product p22 = new Product("Table", "PROD122", "Furniture", "Nilkamal", 8500);
		Product p23 = new Product("Sofa", "PROD123", "Furniture", "Urban Ladder", 45000);
		Product p24 = new Product("Bed", "PROD124", "Furniture", "Wakefit", 35000);
		Product p25 = new Product("Bookshelf", "PROD125", "Furniture", "IKEA", 12000);
		Product p26 = new Product("Shoes", "PROD126", "Fashion", "Nike", 7500);
		Product p27 = new Product("Shirt", "PROD127", "Fashion", "Peter England", 2200);
		Product p28 = new Product("Jeans", "PROD128", "Fashion", "Levis", 3500);
		Product p29 = new Product("Jacket", "PROD129", "Fashion", "Puma", 4800);
		Product p30 = new Product("Watch", "PROD130", "Fashion", "Titan", 6500);

		Product p31 = new Product("Backpack", "PROD131", "Accessories", "Wildcraft", 2500);
		Product p32 = new Product("Wallet", "PROD132", "Accessories", "Fossil", 4500);
		Product p33 = new Product("Belt", "PROD133", "Fashion", "Allen Solly", 1800);
		Product p34 = new Product("Sunglasses", "PROD134", "Fashion", "Ray-Ban", 9500);
		Product p35 = new Product("Mixer Grinder", "PROD135", "Appliances", "Philips", 5500);
		Product p36 = new Product("Electric Kettle", "PROD136", "Appliances", "Prestige", 1800);
		Product p37 = new Product("Iron", "PROD137", "Appliances", "Bajaj", 2200);
		Product p38 = new Product("Water Purifier", "PROD138", "Appliances", "Kent", 16000);
		Product p39 = new Product("Vacuum Cleaner", "PROD139", "Appliances", "Eureka Forbes", 12000);
		Product p40 = new Product("Room Heater", "PROD140", "Appliances", "Usha", 3500);

		Product p41 = new Product("Football", "PROD141", "Sports", "Nivia", 1500);
		Product p42 = new Product("Cricket Bat", "PROD142", "Sports", "SG", 4500);
		Product p43 = new Product("Badminton Racket", "PROD143", "Sports", "Yonex", 3200);
		Product p44 = new Product("Tennis Racket", "PROD144", "Sports", "Wilson", 8500);
		Product p45 = new Product("Cricket Ball", "PROD145", "Sports", "Kookaburra", 1200);
		Product p46 = new Product("Yoga Mat", "PROD146", "Fitness", "Strauss", 900);
		Product p47 = new Product("Dumbbells", "PROD147", "Fitness", "Kobo", 2500);
		Product p48 = new Product("Treadmill", "PROD148", "Fitness", "Lifelong", 35000);
		Product p49 = new Product("Cycle", "PROD149", "Sports", "Hero", 18000);
		Product p50 = new Product("Exercise Bike", "PROD150", "Fitness", "PowerMax", 22000);

		System.out.println("================================Product 1 Details=================================");
		System.out.println("Object Reference is: " + p1);
		System.out.println("Product Name is: " + p1.getProductName());
		System.out.println("Product ID is: " + p1.getProductID());
		System.out.println("Category is: " + p1.getCategory());
		System.out.println("Brand is: " + p1.getBrand());
		System.out.println("Price is: " + p1.getPrice());
		
		System.out.println("================================Product 1 Details=================================");
		System.out.println("Object Reference is: " + p1);
		System.out.println("Product Name is: " + p1.getProductName());
		System.out.println("Product ID is: " + p1.getProductID());
		System.out.println("Category is: " + p1.getCategory());
		System.out.println("Brand is: " + p1.getBrand());
		System.out.println("Price is: " + p1.getPrice());

		System.out.println("================================Product 2 Details=================================");
		System.out.println("Object Reference is: " + p2);
		System.out.println("Product Name is: " + p2.getProductName());
		System.out.println("Product ID is: " + p2.getProductID());
		System.out.println("Category is: " + p2.getCategory());
		System.out.println("Brand is: " + p2.getBrand());
		System.out.println("Price is: " + p2.getPrice());

		System.out.println("================================Product 3 Details=================================");
		System.out.println("Object Reference is: " + p3);
		System.out.println("Product Name is: " + p3.getProductName());
		System.out.println("Product ID is: " + p3.getProductID());
		System.out.println("Category is: " + p3.getCategory());
		System.out.println("Brand is: " + p3.getBrand());
		System.out.println("Price is: " + p3.getPrice());

		System.out.println("================================Product 4 Details=================================");
		System.out.println("Object Reference is: " + p4);
		System.out.println("Product Name is: " + p4.getProductName());
		System.out.println("Product ID is: " + p4.getProductID());
		System.out.println("Category is: " + p4.getCategory());
		System.out.println("Brand is: " + p4.getBrand());
		System.out.println("Price is: " + p4.getPrice());

		System.out.println("================================Product 5 Details=================================");
		System.out.println("Object Reference is: " + p5);
		System.out.println("Product Name is: " + p5.getProductName());
		System.out.println("Product ID is: " + p5.getProductID());
		System.out.println("Category is: " + p5.getCategory());
		System.out.println("Brand is: " + p5.getBrand());
		System.out.println("Price is: " + p5.getPrice());

		System.out.println("================================Product 6 Details=================================");
		System.out.println("Object Reference is: " + p6);
		System.out.println("Product Name is: " + p6.getProductName());
		System.out.println("Product ID is: " + p6.getProductID());
		System.out.println("Category is: " + p6.getCategory());
		System.out.println("Brand is: " + p6.getBrand());
		System.out.println("Price is: " + p6.getPrice());

		System.out.println("================================Product 7 Details=================================");
		System.out.println("Object Reference is: " + p7);
		System.out.println("Product Name is: " + p7.getProductName());
		System.out.println("Product ID is: " + p7.getProductID());
		System.out.println("Category is: " + p7.getCategory());
		System.out.println("Brand is: " + p7.getBrand());
		System.out.println("Price is: " + p7.getPrice());

		System.out.println("================================Product 8 Details=================================");
		System.out.println("Object Reference is: " + p8);
		System.out.println("Product Name is: " + p8.getProductName());
		System.out.println("Product ID is: " + p8.getProductID());
		System.out.println("Category is: " + p8.getCategory());
		System.out.println("Brand is: " + p8.getBrand());
		System.out.println("Price is: " + p8.getPrice());

		System.out.println("================================Product 9 Details=================================");
		System.out.println("Object Reference is: " + p9);
		System.out.println("Product Name is: " + p9.getProductName());
		System.out.println("Product ID is: " + p9.getProductID());
		System.out.println("Category is: " + p9.getCategory());
		System.out.println("Brand is: " + p9.getBrand());
		System.out.println("Price is: " + p9.getPrice());

		System.out.println("================================Product 10 Details=================================");
		System.out.println("Object Reference is: " + p10);
		System.out.println("Product Name is: " + p10.getProductName());
		System.out.println("Product ID is: " + p10.getProductID());
		System.out.println("Category is: " + p10.getCategory());
		System.out.println("Brand is: " + p10.getBrand());
		System.out.println("Price is: " + p10.getPrice());

		System.out.println("================================Product 11 Details=================================");
		System.out.println("Object Reference is: " + p11);
		System.out.println("Product Name is: " + p11.getProductName());
		System.out.println("Product ID is: " + p11.getProductID());
		System.out.println("Category is: " + p11.getCategory());
		System.out.println("Brand is: " + p11.getBrand());
		System.out.println("Price is: " + p11.getPrice());

		System.out.println("================================Product 12 Details=================================");
		System.out.println("Object Reference is: " + p12);
		System.out.println("Product Name is: " + p12.getProductName());
		System.out.println("Product ID is: " + p12.getProductID());
		System.out.println("Category is: " + p12.getCategory());
		System.out.println("Brand is: " + p12.getBrand());
		System.out.println("Price is: " + p12.getPrice());

		System.out.println("================================Product 13 Details=================================");
		System.out.println("Object Reference is: " + p13);
		System.out.println("Product Name is: " + p13.getProductName());
		System.out.println("Product ID is: " + p13.getProductID());
		System.out.println("Category is: " + p13.getCategory());
		System.out.println("Brand is: " + p13.getBrand());
		System.out.println("Price is: " + p13.getPrice());

		System.out.println("================================Product 14 Details=================================");
		System.out.println("Object Reference is: " + p14);
		System.out.println("Product Name is: " + p14.getProductName());
		System.out.println("Product ID is: " + p14.getProductID());
		System.out.println("Category is: " + p14.getCategory());
		System.out.println("Brand is: " + p14.getBrand());
		System.out.println("Price is: " + p14.getPrice());

		System.out.println("================================Product 15 Details=================================");
		System.out.println("Object Reference is: " + p15);
		System.out.println("Product Name is: " + p15.getProductName());
		System.out.println("Product ID is: " + p15.getProductID());
		System.out.println("Category is: " + p15.getCategory());
		System.out.println("Brand is: " + p15.getBrand());
		System.out.println("Price is: " + p15.getPrice());

		System.out.println("================================Product 16 Details=================================");
		System.out.println("Object Reference is: " + p16);
		System.out.println("Product Name is: " + p16.getProductName());
		System.out.println("Product ID is: " + p16.getProductID());
		System.out.println("Category is: " + p16.getCategory());
		System.out.println("Brand is: " + p16.getBrand());
		System.out.println("Price is: " + p16.getPrice());

		System.out.println("================================Product 17 Details=================================");
		System.out.println("Object Reference is: " + p17);
		System.out.println("Product Name is: " + p17.getProductName());
		System.out.println("Product ID is: " + p17.getProductID());
		System.out.println("Category is: " + p17.getCategory());
		System.out.println("Brand is: " + p17.getBrand());
		System.out.println("Price is: " + p17.getPrice());

		System.out.println("================================Product 18 Details=================================");
		System.out.println("Object Reference is: " + p18);
		System.out.println("Product Name is: " + p18.getProductName());
		System.out.println("Product ID is: " + p18.getProductID());
		System.out.println("Category is: " + p18.getCategory());
		System.out.println("Brand is: " + p18.getBrand());
		System.out.println("Price is: " + p18.getPrice());

		System.out.println("================================Product 19 Details=================================");
		System.out.println("Object Reference is: " + p19);
		System.out.println("Product Name is: " + p19.getProductName());
		System.out.println("Product ID is: " + p19.getProductID());
		System.out.println("Category is: " + p19.getCategory());
		System.out.println("Brand is: " + p19.getBrand());
		System.out.println("Price is: " + p19.getPrice());

		System.out.println("================================Product 20 Details=================================");
		System.out.println("Object Reference is: " + p20);
		System.out.println("Product Name is: " + p20.getProductName());
		System.out.println("Product ID is: " + p20.getProductID());
		System.out.println("Category is: " + p20.getCategory());
		System.out.println("Brand is: " + p20.getBrand());
		System.out.println("Price is: " + p20.getPrice());

		System.out.println("================================Product 21 Details=================================");
		System.out.println("Object Reference is: " + p21);
		System.out.println("Product Name is: " + p21.getProductName());
		System.out.println("Product ID is: " + p21.getProductID());
		System.out.println("Category is: " + p21.getCategory());
		System.out.println("Brand is: " + p21.getBrand());
		System.out.println("Price is: " + p21.getPrice());

		System.out.println("================================Product 22 Details=================================");
		System.out.println("Object Reference is: " + p22);
		System.out.println("Product Name is: " + p22.getProductName());
		System.out.println("Product ID is: " + p22.getProductID());
		System.out.println("Category is: " + p22.getCategory());
		System.out.println("Brand is: " + p22.getBrand());
		System.out.println("Price is: " + p22.getPrice());

		System.out.println("================================Product 23 Details=================================");
		System.out.println("Object Reference is: " + p23);
		System.out.println("Product Name is: " + p23.getProductName());
		System.out.println("Product ID is: " + p23.getProductID());
		System.out.println("Category is: " + p23.getCategory());
		System.out.println("Brand is: " + p23.getBrand());
		System.out.println("Price is: " + p23.getPrice());

		System.out.println("================================Product 24 Details=================================");
		System.out.println("Object Reference is: " + p24);
		System.out.println("Product Name is: " + p24.getProductName());
		System.out.println("Product ID is: " + p24.getProductID());
		System.out.println("Category is: " + p24.getCategory());
		System.out.println("Brand is: " + p24.getBrand());
		System.out.println("Price is: " + p24.getPrice());

		System.out.println("================================Product 25 Details=================================");
		System.out.println("Object Reference is: " + p25);
		System.out.println("Product Name is: " + p25.getProductName());
		System.out.println("Product ID is: " + p25.getProductID());
		System.out.println("Category is: " + p25.getCategory());
		System.out.println("Brand is: " + p25.getBrand());
		System.out.println("Price is: " + p25.getPrice());

		System.out.println("================================Product 26 Details=================================");
		System.out.println("Object Reference is: " + p26);
		System.out.println("Product Name is: " + p26.getProductName());
		System.out.println("Product ID is: " + p26.getProductID());
		System.out.println("Category is: " + p26.getCategory());
		System.out.println("Brand is: " + p26.getBrand());
		System.out.println("Price is: " + p26.getPrice());

		System.out.println("================================Product 27 Details=================================");
		System.out.println("Object Reference is: " + p27);
		System.out.println("Product Name is: " + p27.getProductName());
		System.out.println("Product ID is: " + p27.getProductID());
		System.out.println("Category is: " + p27.getCategory());
		System.out.println("Brand is: " + p27.getBrand());
		System.out.println("Price is: " + p27.getPrice());

		System.out.println("================================Product 28 Details=================================");
		System.out.println("Object Reference is: " + p28);
		System.out.println("Product Name is: " + p28.getProductName());
		System.out.println("Product ID is: " + p28.getProductID());
		System.out.println("Category is: " + p28.getCategory());
		System.out.println("Brand is: " + p28.getBrand());
		System.out.println("Price is: " + p28.getPrice());

		System.out.println("================================Product 29 Details=================================");
		System.out.println("Object Reference is: " + p29);
		System.out.println("Product Name is: " + p29.getProductName());
		System.out.println("Product ID is: " + p29.getProductID());
		System.out.println("Category is: " + p29.getCategory());
		System.out.println("Brand is: " + p29.getBrand());
		System.out.println("Price is: " + p29.getPrice());

		System.out.println("================================Product 30 Details=================================");
		System.out.println("Object Reference is: " + p30);
		System.out.println("Product Name is: " + p30.getProductName());
		System.out.println("Product ID is: " + p30.getProductID());
		System.out.println("Category is: " + p30.getCategory());
		System.out.println("Brand is: " + p30.getBrand());
		System.out.println("Price is: " + p30.getPrice());

		System.out.println("================================Product 31 Details=================================");
		System.out.println("Object Reference is: " + p31);
		System.out.println("Product Name is: " + p31.getProductName());
		System.out.println("Product ID is: " + p31.getProductID());
		System.out.println("Category is: " + p31.getCategory());
		System.out.println("Brand is: " + p31.getBrand());
		System.out.println("Price is: " + p31.getPrice());

		System.out.println("================================Product 32 Details=================================");
		System.out.println("Object Reference is: " + p32);
		System.out.println("Product Name is: " + p32.getProductName());
		System.out.println("Product ID is: " + p32.getProductID());
		System.out.println("Category is: " + p32.getCategory());
		System.out.println("Brand is: " + p32.getBrand());
		System.out.println("Price is: " + p32.getPrice());

		System.out.println("================================Product 33 Details=================================");
		System.out.println("Object Reference is: " + p33);
		System.out.println("Product Name is: " + p33.getProductName());
		System.out.println("Product ID is: " + p33.getProductID());
		System.out.println("Category is: " + p33.getCategory());
		System.out.println("Brand is: " + p33.getBrand());
		System.out.println("Price is: " + p33.getPrice());

		System.out.println("================================Product 34 Details=================================");
		System.out.println("Object Reference is: " + p34);
		System.out.println("Product Name is: " + p34.getProductName());
		System.out.println("Product ID is: " + p34.getProductID());
		System.out.println("Category is: " + p34.getCategory());
		System.out.println("Brand is: " + p34.getBrand());
		System.out.println("Price is: " + p34.getPrice());

		System.out.println("================================Product 35 Details=================================");
		System.out.println("Object Reference is: " + p35);
		System.out.println("Product Name is: " + p35.getProductName());
		System.out.println("Product ID is: " + p35.getProductID());
		System.out.println("Category is: " + p35.getCategory());
		System.out.println("Brand is: " + p35.getBrand());
		System.out.println("Price is: " + p35.getPrice());

		System.out.println("================================Product 36 Details=================================");
		System.out.println("Object Reference is: " + p36);
		System.out.println("Product Name is: " + p36.getProductName());
		System.out.println("Product ID is: " + p36.getProductID());
		System.out.println("Category is: " + p36.getCategory());
		System.out.println("Brand is: " + p36.getBrand());
		System.out.println("Price is: " + p36.getPrice());

		System.out.println("================================Product 37 Details=================================");
		System.out.println("Object Reference is: " + p37);
		System.out.println("Product Name is: " + p37.getProductName());
		System.out.println("Product ID is: " + p37.getProductID());
		System.out.println("Category is: " + p37.getCategory());
		System.out.println("Brand is: " + p37.getBrand());
		System.out.println("Price is: " + p37.getPrice());

		System.out.println("================================Product 38 Details=================================");
		System.out.println("Object Reference is: " + p38);
		System.out.println("Product Name is: " + p38.getProductName());
		System.out.println("Product ID is: " + p38.getProductID());
		System.out.println("Category is: " + p38.getCategory());
		System.out.println("Brand is: " + p38.getBrand());
		System.out.println("Price is: " + p38.getPrice());

		System.out.println("================================Product 39 Details=================================");
		System.out.println("Object Reference is: " + p39);
		System.out.println("Product Name is: " + p39.getProductName());
		System.out.println("Product ID is: " + p39.getProductID());
		System.out.println("Category is: " + p39.getCategory());
		System.out.println("Brand is: " + p39.getBrand());
		System.out.println("Price is: " + p39.getPrice());

		System.out.println("================================Product 40 Details=================================");
		System.out.println("Object Reference is: " + p40);
		System.out.println("Product Name is: " + p40.getProductName());
		System.out.println("Product ID is: " + p40.getProductID());
		System.out.println("Category is: " + p40.getCategory());
		System.out.println("Brand is: " + p40.getBrand());
		System.out.println("Price is: " + p40.getPrice());

		System.out.println("================================Product 41 Details=================================");
		System.out.println("Object Reference is: " + p41);
		System.out.println("Product Name is: " + p41.getProductName());
		System.out.println("Product ID is: " + p41.getProductID());
		System.out.println("Category is: " + p41.getCategory());
		System.out.println("Brand is: " + p41.getBrand());
		System.out.println("Price is: " + p41.getPrice());

		System.out.println("================================Product 42 Details=================================");
		System.out.println("Object Reference is: " + p42);
		System.out.println("Product Name is: " + p42.getProductName());
		System.out.println("Product ID is: " + p42.getProductID());
		System.out.println("Category is: " + p42.getCategory());
		System.out.println("Brand is: " + p42.getBrand());
		System.out.println("Price is: " + p42.getPrice());

		System.out.println("================================Product 43 Details=================================");
		System.out.println("Object Reference is: " + p43);
		System.out.println("Product Name is: " + p43.getProductName());
		System.out.println("Product ID is: " + p43.getProductID());
		System.out.println("Category is: " + p43.getCategory());
		System.out.println("Brand is: " + p43.getBrand());
		System.out.println("Price is: " + p43.getPrice());

		System.out.println("================================Product 44 Details=================================");
		System.out.println("Object Reference is: " + p44);
		System.out.println("Product Name is: " + p44.getProductName());
		System.out.println("Product ID is: " + p44.getProductID());
		System.out.println("Category is: " + p44.getCategory());
		System.out.println("Brand is: " + p44.getBrand());
		System.out.println("Price is: " + p44.getPrice());

		System.out.println("================================Product 45 Details=================================");
		System.out.println("Object Reference is: " + p45);
		System.out.println("Product Name is: " + p45.getProductName());
		System.out.println("Product ID is: " + p45.getProductID());
		System.out.println("Category is: " + p45.getCategory());
		System.out.println("Brand is: " + p45.getBrand());
		System.out.println("Price is: " + p45.getPrice());

		System.out.println("================================Product 46 Details=================================");
		System.out.println("Object Reference is: " + p46);
		System.out.println("Product Name is: " + p46.getProductName());
		System.out.println("Product ID is: " + p46.getProductID());
		System.out.println("Category is: " + p46.getCategory());
		System.out.println("Brand is: " + p46.getBrand());
		System.out.println("Price is: " + p46.getPrice());

		System.out.println("================================Product 47 Details=================================");
		System.out.println("Object Reference is: " + p47);
		System.out.println("Product Name is: " + p47.getProductName());
		System.out.println("Product ID is: " + p47.getProductID());
		System.out.println("Category is: " + p47.getCategory());
		System.out.println("Brand is: " + p47.getBrand());
		System.out.println("Price is: " + p47.getPrice());

		System.out.println("================================Product 48 Details=================================");
		System.out.println("Object Reference is: " + p48);
		System.out.println("Product Name is: " + p48.getProductName());
		System.out.println("Product ID is: " + p48.getProductID());
		System.out.println("Category is: " + p48.getCategory());
		System.out.println("Brand is: " + p48.getBrand());
		System.out.println("Price is: " + p48.getPrice());

		System.out.println("================================Product 49 Details=================================");
		System.out.println("Object Reference is: " + p49);
		System.out.println("Product Name is: " + p49.getProductName());
		System.out.println("Product ID is: " + p49.getProductID());
		System.out.println("Category is: " + p49.getCategory());
		System.out.println("Brand is: " + p49.getBrand());
		System.out.println("Price is: " + p49.getPrice());

		System.out.println("================================Product 50 Details=================================");
		System.out.println("Object Reference is: " + p50);
		System.out.println("Product Name is: " + p50.getProductName());
		System.out.println("Product ID is: " + p50.getProductID());
		System.out.println("Category is: " + p50.getCategory());
		System.out.println("Brand is: " + p50.getBrand());
		System.out.println("Price is: " + p50.getPrice());
		
		System.out.println("===============================Main Method Ends=====================================");

	}

}
