package constructor.shallowCopy.ShoppingCart;

public class ShoppingCartDriver {

	public static void main(String[] args) {
		
		System.out.println("=================================Main Method Starts==========================================");
		
		ShoppingCart s1 = new ShoppingCart("CART1001", "Mohan Singh", 75000, "Online", new Product(101, "Laptop", 75000, "Electronics", 2.50, "Dell" ));
		ShoppingCart s2 = new ShoppingCart("CART1002", "Rahul Sharma", 45000, "Offline", new Product(102, "Mobile", 45000, "Electronics", 0.50, "Samsung"));
		ShoppingCart s3 = new ShoppingCart("CART1003", "Amit Verma", 6500, "Online", new Product(103, "Shoes", 6500, "Footwear", 1.20, "Nike"));
		ShoppingCart s4 = new ShoppingCart("CART1004", "Priya Singh", 3500, "Online", new Product(104, "Watch", 3500, "Accessories", 0.30, "Titan"));
		ShoppingCart s5 = new ShoppingCart("CART1005", "Neha Gupta", 5500, "Offline", new Product(105, "Headphones", 5500, "Electronics", 0.40, "Boat"));
		ShoppingCart s6 = new ShoppingCart("CART1006", "Rohit Kumar", 25000, "Online", new Product(106, "Tablet", 25000, "Electronics", 0.60, "Lenovo"));
		ShoppingCart s7 = new ShoppingCart("CART1007", "Anjali Yadav", 1800, "Online", new Product(107, "Handbag", 1800, "Fashion", 0.70, "Lavie"));
		ShoppingCart s8 = new ShoppingCart("CART1008", "Vikas Singh", 12000, "Offline", new Product(108, "Camera", 12000, "Electronics", 0.80, "Canon"));
		ShoppingCart s9 = new ShoppingCart("CART1009", "Pooja Mishra", 2200, "Online", new Product(109, "Perfume", 2200, "Cosmetics", 0.25, "Fogg"));
		ShoppingCart s10 = new ShoppingCart("CART1010", "Suresh Kumar", 32000, "Online", new Product(110, "Television", 32000, "Electronics", 8.50, "Sony"));

		ShoppingCart s11 = new ShoppingCart("CART1011", "Kavita Sharma", 8500, "Offline", new Product(111, "Jacket", 8500, "Clothing", 1.50, "Puma"));
		ShoppingCart s12 = new ShoppingCart("CART1012", "Arun Verma", 1500, "Online", new Product(112, "Backpack", 1500, "Accessories", 0.90, "Skybags"));
		ShoppingCart s13 = new ShoppingCart("CART1013", "Ravi Singh", 28000, "Online", new Product(113, "Refrigerator", 28000, "Appliances", 45.00, "LG"));
		ShoppingCart s14 = new ShoppingCart("CART1014", "Sneha Gupta", 4200, "Offline", new Product(114, "Saree", 4200, "Clothing", 0.60, "Biba"));
		ShoppingCart s15 = new ShoppingCart("CART1015", "Manish Yadav", 9500, "Online", new Product(115, "Bicycle", 9500, "Sports", 12.50, "Hero"));
		ShoppingCart s16 = new ShoppingCart("CART1016", "Ritu Sharma", 1700, "Online", new Product(116, "Mixer Grinder", 1700, "Appliances", 3.20, "Bajaj"));
		ShoppingCart s17 = new ShoppingCart("CART1017", "Deepak Singh", 48000, "Offline", new Product(117, "Air Conditioner", 48000, "Appliances", 38.00, "Voltas"));
		ShoppingCart s18 = new ShoppingCart("CART1018", "Meena Verma", 6500, "Online", new Product(118, "Printer", 6500, "Electronics", 5.50, "HP"));
		ShoppingCart s19 = new ShoppingCart("CART1019", "Ajay Kumar", 7500, "Online", new Product(119, "Office Chair", 7500, "Furniture", 14.00, "Featherlite"));
		ShoppingCart s20 = new ShoppingCart("CART1020", "Nisha Singh", 2300, "Offline", new Product(120, "Keyboard", 2300, "Electronics", 0.75, "Logitech"));

		ShoppingCart s21 = new ShoppingCart("CART1021", "Vivek Sharma", 3800, "Online", new Product(121, "Smart Speaker", 3800, "Electronics", 1.80, "Amazon"));
		ShoppingCart s22 = new ShoppingCart("CART1022", "Komal Gupta", 12500, "Online", new Product(122, "Microwave", 12500, "Appliances", 11.50, "IFB"));
		ShoppingCart s23 = new ShoppingCart("CART1023", "Nitin Verma", 5500, "Offline", new Product(123, "Running Shoes", 5500, "Footwear", 1.10, "Adidas"));
		ShoppingCart s24 = new ShoppingCart("CART1024", "Swati Yadav", 1600, "Online", new Product(124, "Sunglasses", 1600, "Accessories", 0.20, "RayBan"));
		ShoppingCart s25 = new ShoppingCart("CART1025", "Karan Singh", 72000, "Online", new Product(125, "Gaming Laptop", 72000, "Electronics", 2.80, "Asus"));
		ShoppingCart s26 = new ShoppingCart("CART1026", "Shweta Mishra", 3400, "Offline", new Product(126, "Electric Kettle", 3400, "Appliances", 1.30, "Philips"));
		ShoppingCart s27 = new ShoppingCart("CART1027", "Gaurav Kumar", 15500, "Online", new Product(127, "Smartwatch", 15500, "Electronics", 0.45, "Apple"));
		ShoppingCart s28 = new ShoppingCart("CART1028", "Monika Sharma", 2600, "Online", new Product(128, "Denim Jeans", 2600, "Clothing", 0.80, "Levis"));
		ShoppingCart s29 = new ShoppingCart("CART1029", "Sachin Verma", 8900, "Offline", new Product(129, "Cricket Bat", 8900, "Sports", 1.20, "SS"));
		ShoppingCart s30 = new ShoppingCart("CART1030", "Rakesh Singh", 5200, "Online", new Product(130, "Study Table", 5200, "Furniture", 18.00, "Ikea"));

		ShoppingCart s31 = new ShoppingCart("CART1031", "Pallavi Gupta", 13500, "Online", new Product(131, "Air Cooler", 13500, "Appliances", 15.00, "Symphony"));
		ShoppingCart s32 = new ShoppingCart("CART1032", "Akash Yadav", 2900, "Offline", new Product(132, "Bluetooth Speaker", 2900, "Electronics", 1.00, "JBL"));
		ShoppingCart s33 = new ShoppingCart("CART1033", "Rashmi Singh", 6800, "Online", new Product(133, "Formal Shoes", 6800, "Footwear", 1.30, "Bata"));
		ShoppingCart s34 = new ShoppingCart("CART1034", "Varun Kumar", 11000, "Online", new Product(134, "Power Bank", 11000, "Electronics", 0.35, "Mi"));
		ShoppingCart s35 = new ShoppingCart("CART1035", "Shalini Sharma", 3600, "Offline", new Product(135, "Cotton Saree", 3600, "Clothing", 0.55, "Manyavar"));
		ShoppingCart s36 = new ShoppingCart("CART1036", "Abhishek Verma", 42000, "Online", new Product(136, "Washing Machine", 42000, "Appliances", 32.00, "Samsung"));
		ShoppingCart s37 = new ShoppingCart("CART1037", "Divya Gupta", 1900, "Online", new Product(137, "Water Bottle", 1900, "Home", 0.60, "Milton"));
		ShoppingCart s38 = new ShoppingCart("CART1038", "Harish Singh", 7800, "Offline", new Product(138, "Football", 7800, "Sports", 0.45, "Nivia"));
		ShoppingCart s39 = new ShoppingCart("CART1039", "Rekha Yadav", 3150, "Online", new Product(139, "Wall Clock", 3150, "Home", 1.10, "Ajanta"));
		ShoppingCart s40 = new ShoppingCart("CART1040", "Sunil Kumar", 18500, "Online", new Product(140, "Monitor", 18500, "Electronics", 4.50, "Acer"));

		ShoppingCart s41 = new ShoppingCart("CART1041", "Preeti Sharma", 2750, "Offline", new Product(141, "Hair Dryer", 2750, "Beauty", 0.80, "Philips"));
		ShoppingCart s42 = new ShoppingCart("CART1042", "Rajesh Verma", 6200, "Online", new Product(142, "Treadmill", 6200, "Fitness", 35.00, "Lifelong"));
		ShoppingCart s43 = new ShoppingCart("CART1043", "Sonia Singh", 14500, "Online", new Product(143, "Dining Chair", 14500, "Furniture", 8.50, "HomeTown"));
		ShoppingCart s44 = new ShoppingCart("CART1044", "Mohit Gupta", 950, "Offline", new Product(144, "Notebook", 950, "Stationery", 0.40, "Classmate"));
		ShoppingCart s45 = new ShoppingCart("CART1045", "Aarti Yadav", 55000, "Online", new Product(145, "Refrigerator", 55000, "Appliances", 55.00, "Whirlpool"));
		ShoppingCart s46 = new ShoppingCart("CART1046", "Sanjay Kumar", 1250, "Online", new Product(146, "Pen Set", 1250, "Stationery", 0.20, "Parker"));
		ShoppingCart s47 = new ShoppingCart("CART1047", "Renu Sharma", 8500, "Offline", new Product(147, "Makeup Kit", 8500, "Cosmetics", 1.40, "Lakme"));
		ShoppingCart s48 = new ShoppingCart("CART1048", "Tarun Singh", 33500, "Online", new Product(148, "Home Theater", 33500, "Electronics", 12.00, "Sony"));
		ShoppingCart s49 = new ShoppingCart("CART1049", "Geeta Verma", 2750, "Online", new Product(149, "Coffee Maker", 2750, "Appliances", 2.50, "Nescafe"));
		ShoppingCart s50 = new ShoppingCart("CART1050", "Vijay Kumar", 18500, "Offline", new Product(150, "Gaming Console", 18500, "Electronics", 3.20, "Sony"));
		ShoppingCart s51 = new ShoppingCart(s1);
		ShoppingCart s52 = new ShoppingCart(s2);
		ShoppingCart s53 = new ShoppingCart(s3);
		ShoppingCart s54 = new ShoppingCart(s4);
		ShoppingCart s55 = new ShoppingCart(s5);
		ShoppingCart s56 = new ShoppingCart(s6);
		ShoppingCart s57 = new ShoppingCart(s7);
		ShoppingCart s58 = new ShoppingCart(s8);
		ShoppingCart s59 = new ShoppingCart(s9);
		ShoppingCart s60 = new ShoppingCart(s10);

		ShoppingCart s61 = new ShoppingCart(s11);
		ShoppingCart s62 = new ShoppingCart(s12);
		ShoppingCart s63 = new ShoppingCart(s13);
		ShoppingCart s64 = new ShoppingCart(s14);
		ShoppingCart s65 = new ShoppingCart(s15);
		ShoppingCart s66 = new ShoppingCart(s16);
		ShoppingCart s67 = new ShoppingCart(s17);
		ShoppingCart s68 = new ShoppingCart(s18);
		ShoppingCart s69 = new ShoppingCart(s19);
		ShoppingCart s70 = new ShoppingCart(s20);

		ShoppingCart s71 = new ShoppingCart(s21);
		ShoppingCart s72 = new ShoppingCart(s22);
		ShoppingCart s73 = new ShoppingCart(s23);
		ShoppingCart s74 = new ShoppingCart(s24);
		ShoppingCart s75 = new ShoppingCart(s25);
		ShoppingCart s76 = new ShoppingCart(s26);
		ShoppingCart s77 = new ShoppingCart(s27);
		ShoppingCart s78 = new ShoppingCart(s28);
		ShoppingCart s79 = new ShoppingCart(s29);
		ShoppingCart s80 = new ShoppingCart(s30);

		ShoppingCart s81 = new ShoppingCart(s31);
		ShoppingCart s82 = new ShoppingCart(s32);
		ShoppingCart s83 = new ShoppingCart(s33);
		ShoppingCart s84 = new ShoppingCart(s34);
		ShoppingCart s85 = new ShoppingCart(s35);
		ShoppingCart s86 = new ShoppingCart(s36);
		ShoppingCart s87 = new ShoppingCart(s37);
		ShoppingCart s88 = new ShoppingCart(s38);
		ShoppingCart s89 = new ShoppingCart(s39);
		ShoppingCart s90 = new ShoppingCart(s40);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);

		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);
		System.out.println(s16);
		System.out.println(s17);
		System.out.println(s18);
		System.out.println(s19);
		System.out.println(s20);

		System.out.println(s21);
		System.out.println(s22);
		System.out.println(s23);
		System.out.println(s24);
		System.out.println(s25);
		System.out.println(s26);
		System.out.println(s27);
		System.out.println(s28);
		System.out.println(s29);
		System.out.println(s30);

		System.out.println(s31);
		System.out.println(s32);
		System.out.println(s33);
		System.out.println(s34);
		System.out.println(s35);
		System.out.println(s36);
		System.out.println(s37);
		System.out.println(s38);
		System.out.println(s39);
		System.out.println(s40);

		System.out.println(s41);
		System.out.println(s42);
		System.out.println(s43);
		System.out.println(s44);
		System.out.println(s45);
		System.out.println(s46);
		System.out.println(s47);
		System.out.println(s48);
		System.out.println(s49);
		System.out.println(s50);

		System.out.println(s51);
		System.out.println(s52);
		System.out.println(s53);
		System.out.println(s54);
		System.out.println(s55);
		System.out.println(s56);
		System.out.println(s57);
		System.out.println(s58);
		System.out.println(s59);
		System.out.println(s60);

		System.out.println(s61);
		System.out.println(s62);
		System.out.println(s63);
		System.out.println(s64);
		System.out.println(s65);
		System.out.println(s66);
		System.out.println(s67);
		System.out.println(s68);
		System.out.println(s69);
		System.out.println(s70);

		System.out.println(s71);
		System.out.println(s72);
		System.out.println(s73);
		System.out.println(s74);
		System.out.println(s75);
		System.out.println(s76);
		System.out.println(s77);
		System.out.println(s78);
		System.out.println(s79);
		System.out.println(s80);

		System.out.println(s81);
		System.out.println(s82);
		System.out.println(s83);
		System.out.println(s84);
		System.out.println(s85);
		System.out.println(s86);
		System.out.println(s87);
		System.out.println(s88);
		System.out.println(s89);
		System.out.println(s90);
		
		System.out.println("=====================================Main Method Ends======================================");
	}

}
