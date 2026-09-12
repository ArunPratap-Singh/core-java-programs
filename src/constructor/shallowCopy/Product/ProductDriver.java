package constructor.shallowCopy.Product;

public class ProductDriver {

	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Starts================================");
		
		Product p1 = new Product("Laptop", "Dell", 75000, "Grey", new Category(101, "Electronics", "Computer Department", 500, "Electronics Category", "Computer And Laptop Products"));
		Product p2 = new Product("Mobile", "Samsung", 45000, "Black", new Category(102, "Mobile Phones", "Communication Department", 350, "Mobile Category", "Smart Mobile Phones"));
		Product p3 = new Product("Television", "Sony", 65000, "Black", new Category(103, "Television", "Entertainment Department", 250, "TV Category", "Smart Television Products"));
		Product p4 = new Product("Refrigerator", "LG", 55000, "Silver", new Category(104, "Refrigerator", "Home Appliance Department", 200, "Appliance Category", "Home Refrigerator Products"));
		Product p5 = new Product("Washing Machine", "Whirlpool", 42000, "White", new Category(105, "Washing Machine", "Home Appliance Department", 180, "Appliance Category", "Automatic Washing Machines"));
		Product p6 = new Product("Air Conditioner", "Voltas", 48000, "White", new Category(106, "Air Conditioner", "Cooling Department", 150, "AC Category", "Home Cooling Products"));
		Product p7 = new Product("Microwave", "IFB", 18000, "Black", new Category(107, "Microwave", "Kitchen Department", 120, "Kitchen Category", "Microwave Oven Products"));
		Product p8 = new Product("Oven", "Bajaj", 15000, "Silver", new Category(108, "Oven", "Kitchen Department", 100, "Kitchen Category", "Electric Oven Products"));
		Product p9 = new Product("Headphones", "Boat", 2500, "Blue", new Category(109, "Headphones", "Audio Department", 600, "Audio Category", "Wireless Audio Products"));
		Product p10 = new Product("Speaker", "JBL", 8500, "Black", new Category(110, "Speakers", "Audio Department", 300, "Audio Category", "Bluetooth Speaker Products"));

		Product p11 = new Product("Tablet", "Lenovo", 32000, "Grey", new Category(111, "Tablets", "Computer Department", 220, "Tablet Category", "Android Tablet Products"));
		Product p12 = new Product("Monitor", "Acer", 18000, "Black", new Category(112, "Monitors", "Computer Department", 280, "Monitor Category", "Computer Monitor Products"));
		Product p13 = new Product("Keyboard", "Logitech", 2500, "Black", new Category(113, "Keyboard", "Computer Accessories", 450, "Accessory Category", "Computer Keyboard Products"));
		Product p14 = new Product("Mouse", "HP", 1200, "Black", new Category(114, "Mouse", "Computer Accessories", 500, "Accessory Category", "Computer Mouse Products"));
		Product p15 = new Product("Printer", "Canon", 15000, "White", new Category(115, "Printers", "Office Department", 170, "Office Category", "Office Printing Products"));
		Product p16 = new Product("Camera", "Nikon", 72000, "Black", new Category(116, "Cameras", "Photography Department", 130, "Camera Category", "Digital Camera Products"));
		Product p17 = new Product("Smart Watch", "Noise", 5000, "Black", new Category(117, "Smart Watches", "Wearable Department", 400, "Wearable Category", "Smart Watch Products"));
		Product p18 = new Product("Power Bank", "Mi", 1800, "Blue", new Category(118, "Power Banks", "Mobile Accessories", 550, "Accessory Category", "Portable Charging Products"));
		Product p19 = new Product("Router", "TP-Link", 3200, "White", new Category(119, "Routers", "Networking Department", 240, "Networking Category", "Internet Router Products"));
		Product p20 = new Product("Projector", "Epson", 45000, "White", new Category(120, "Projectors", "Office Department", 90, "Office Category", "Office Projector Products"));

		Product p21 = new Product("Laptop Bag", "American Tourister", 2500, "Black", new Category(121, "Laptop Bags", "Bags Department", 350, "Bag Category", "Laptop Carrying Bags"));
		Product p22 = new Product("Keyboard", "Dell", 1800, "White", new Category(122, "Computer Accessories", "Computer Department", 400, "Accessory Category", "Computer Accessories"));
		Product p23 = new Product("Earbuds", "Realme", 2200, "White", new Category(123, "Earbuds", "Audio Department", 700, "Audio Category", "Wireless Earbuds Products"));
		Product p24 = new Product("Mobile Charger", "Samsung", 1600, "Black", new Category(124, "Chargers", "Mobile Accessories", 650, "Accessory Category", "Mobile Charging Products"));
		Product p25 = new Product("Smart TV", "OnePlus", 52000, "Black", new Category(125, "Smart TV", "Entertainment Department", 210, "TV Category", "Smart Television Products"));
		Product p26 = new Product("AC", "Samsung", 58000, "White", new Category(126, "Air Conditioner", "Cooling Department", 140, "AC Category", "Split Air Conditioner Products"));
		Product p27 = new Product("Ceiling Fan", "Usha", 4500, "Brown", new Category(127, "Fans", "Home Appliance Department", 320, "Appliance Category", "Ceiling Fan Products"));
		Product p28 = new Product("Iron", "Philips", 2800, "Blue", new Category(128, "Iron", "Home Appliance Department", 280, "Appliance Category", "Electric Iron Products"));
		Product p29 = new Product("Mixer Grinder", "Prestige", 5500, "Red", new Category(129, "Mixer Grinder", "Kitchen Department", 190, "Kitchen Category", "Kitchen Mixer Products"));
		Product p30 = new Product("Coffee Maker", "Philips", 6500, "Black", new Category(130, "Coffee Maker", "Kitchen Department", 160, "Kitchen Category", "Coffee Making Products"));

		Product p31 = new Product("Refrigerator", "Samsung", 62000, "Black", new Category(131, "Refrigerators", "Home Appliance Department", 180, "Appliance Category", "Double Door Refrigerator Products"));
		Product p32 = new Product("Washing Machine", "LG", 46000, "Silver", new Category(132, "Washing Machines", "Home Appliance Department", 210, "Appliance Category", "Automatic Washing Products"));
		Product p33 = new Product("Television", "LG", 58000, "Grey", new Category(133, "Televisions", "Entertainment Department", 230, "TV Category", "LED Television Products"));
		Product p34 = new Product("Mobile", "OnePlus", 38000, "Green", new Category(134, "Smartphones", "Communication Department", 420, "Mobile Category", "Android Smartphone Products"));
		Product p35 = new Product("Laptop", "HP", 68000, "Blue", new Category(135, "Laptops", "Computer Department", 450, "Computer Category", "Business Laptop Products"));
		Product p36 = new Product("Desktop", "Lenovo", 55000, "Black", new Category(136, "Desktop Computers", "Computer Department", 300, "Computer Category", "Desktop Computer Products"));
		Product p37 = new Product("Printer", "HP", 12500, "White", new Category(137, "Printers", "Office Department", 220, "Office Category", "Office Printer Products"));
		Product p38 = new Product("Scanner", "Canon", 9500, "Black", new Category(138, "Scanners", "Office Department", 130, "Office Category", "Document Scanner Products"));
		Product p39 = new Product("Camera", "Canon", 68000, "Black", new Category(139, "Digital Cameras", "Photography Department", 150, "Camera Category", "Professional Camera Products"));
		Product p40 = new Product("Tripod", "Digitek", 3500, "Black", new Category(140, "Tripods", "Photography Department", 260, "Camera Accessories", "Camera Tripod Products"));

		Product p41 = new Product("Bluetooth Speaker", "Sony", 7500, "Red", new Category(141, "Speakers", "Audio Department", 330, "Audio Category", "Portable Bluetooth Speakers"));
		Product p42 = new Product("Headset", "JBL", 4500, "Blue", new Category(142, "Headsets", "Audio Department", 390, "Audio Category", "Wireless Headset Products"));
		Product p43 = new Product("Smart Watch", "Samsung", 22000, "Silver", new Category(143, "Smart Watches", "Wearable Department", 280, "Wearable Category", "Premium Smart Watches"));
		Product p44 = new Product("Fitness Band", "Mi", 3200, "Black", new Category(144, "Fitness Bands", "Wearable Department", 350, "Wearable Category", "Fitness Tracking Products"));
		Product p45 = new Product("Router", "D-Link", 2800, "White", new Category(145, "Network Devices", "Networking Department", 270, "Networking Category", "Wireless Networking Products"));
		Product p46 = new Product("Hard Disk", "Seagate", 6500, "Black", new Category(146, "Hard Disks", "Storage Department", 310, "Storage Category", "External Storage Products"));
		Product p47 = new Product("SSD", "Western Digital", 7500, "Black", new Category(147, "SSDs", "Storage Department", 280, "Storage Category", "Solid State Drive Products"));
		Product p48 = new Product("USB Drive", "SanDisk", 1200, "Red", new Category(148, "USB Drives", "Storage Department", 800, "Storage Category", "Portable Storage Products"));
		Product p49 = new Product("Power Bank", "Portronics", 2500, "Blue", new Category(149, "Power Banks", "Mobile Accessories", 500, "Accessory Category", "Portable Power Bank Products"));
		Product p50 = new Product("Mobile Cover", "Spigen", 1800, "Black", new Category(150, "Mobile Covers", "Mobile Accessories", 750, "Accessory Category", "Protective Mobile Covers"));

		Product p51 = new Product(p1);
		Product p52 = new Product(p2);
		Product p53 = new Product(p3);
		Product p54 = new Product(p4);
		Product p55 = new Product(p5);
		Product p56 = new Product(p6);
		Product p57 = new Product(p7);
		Product p58 = new Product(p8);
		Product p59 = new Product(p9);
		Product p60 = new Product(p10);

		Product p61 = new Product(p11);
		Product p62 = new Product(p12);
		Product p63 = new Product(p13);
		Product p64 = new Product(p14);
		Product p65 = new Product(p15);
		Product p66 = new Product(p16);
		Product p67 = new Product(p17);
		Product p68 = new Product(p18);
		Product p69 = new Product(p19);
		Product p70 = new Product(p20);

		Product p71 = new Product(p21);
		Product p72 = new Product(p22);
		Product p73 = new Product(p23);
		Product p74 = new Product(p24);
		Product p75 = new Product(p25);
		Product p76 = new Product(p26);
		Product p77 = new Product(p27);
		Product p78 = new Product(p28);
		Product p79 = new Product(p29);
		Product p80 = new Product(p30);

		Product p81 = new Product(p31);
		Product p82 = new Product(p32);
		Product p83 = new Product(p33);
		Product p84 = new Product(p34);
		Product p85 = new Product(p35);
		Product p86 = new Product(p36);
		Product p87 = new Product(p37);
		Product p88 = new Product(p38);
		Product p89 = new Product(p39);
		Product p90 = new Product(p40);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p10);

		System.out.println(p11);
		System.out.println(p12);
		System.out.println(p13);
		System.out.println(p14);
		System.out.println(p15);
		System.out.println(p16);
		System.out.println(p17);
		System.out.println(p18);
		System.out.println(p19);
		System.out.println(p20);

		System.out.println(p21);
		System.out.println(p22);
		System.out.println(p23);
		System.out.println(p24);
		System.out.println(p25);
		System.out.println(p26);
		System.out.println(p27);
		System.out.println(p28);
		System.out.println(p29);
		System.out.println(p30);

		System.out.println(p31);
		System.out.println(p32);
		System.out.println(p33);
		System.out.println(p34);
		System.out.println(p35);
		System.out.println(p36);
		System.out.println(p37);
		System.out.println(p38);
		System.out.println(p39);
		System.out.println(p40);

		System.out.println(p41);
		System.out.println(p42);
		System.out.println(p43);
		System.out.println(p44);
		System.out.println(p45);
		System.out.println(p46);
		System.out.println(p47);
		System.out.println(p48);
		System.out.println(p49);
		System.out.println(p50);

		System.out.println(p51);
		System.out.println(p52);
		System.out.println(p53);
		System.out.println(p54);
		System.out.println(p55);
		System.out.println(p56);
		System.out.println(p57);
		System.out.println(p58);
		System.out.println(p59);
		System.out.println(p60);

		System.out.println(p61);
		System.out.println(p62);
		System.out.println(p63);
		System.out.println(p64);
		System.out.println(p65);
		System.out.println(p66);
		System.out.println(p67);
		System.out.println(p68);
		System.out.println(p69);
		System.out.println(p70);

		System.out.println(p71);
		System.out.println(p72);
		System.out.println(p73);
		System.out.println(p74);
		System.out.println(p75);
		System.out.println(p76);
		System.out.println(p77);
		System.out.println(p78);
		System.out.println(p79);
		System.out.println(p80);

		System.out.println(p81);
		System.out.println(p82);
		System.out.println(p83);
		System.out.println(p84);
		System.out.println(p85);
		System.out.println(p86);
		System.out.println(p87);
		System.out.println(p88);
		System.out.println(p89);
		System.out.println(p90);
		
		System.out.println("==================================Main Method Ends===================================");
	}

}
