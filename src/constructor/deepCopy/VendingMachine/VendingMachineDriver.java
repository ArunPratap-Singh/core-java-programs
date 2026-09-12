package constructor.deepCopy.VendingMachine;

public class VendingMachineDriver {

	public static void main(String[] args) {
		
		System.out.println("=======================================Main Method Starts==========================================");
		
		 VendingMachine v1 = new VendingMachine("VM001", "VendTech", 125000, "Lucknow Mall", new Product(101, "Cold Drink", 50, "Beverage", 0.50, "Coca Cola"));
		 VendingMachine v2 = new VendingMachine("VM002", "SnackPro", 135000, "Phoenix Mall", new Product(102, "Potato Chips", 40, "Snacks", 0.20, "Lays"));
		 VendingMachine v3 = new VendingMachine("VM003", "QuickVend", 145000, "Railway Station", new Product(103, "Orange Juice", 60, "Beverage", 0.50, "Real"));
		 VendingMachine v4 = new VendingMachine("VM004", "SmartVend", 155000, "Bus Stand", new Product(104, "Chocolate", 80, "Confectionery", 0.10, "Cadbury"));
		 VendingMachine v5 = new VendingMachine("VM005", "AutoVend", 165000, "Airport", new Product(105, "Mineral Water", 30, "Beverage", 1.00, "Bisleri"));
		 VendingMachine v6 = new VendingMachine("VM006", "VendMax", 175000, "Metro Station", new Product(106, "Biscuits", 25, "Snacks", 0.20, "Parle"));
		 VendingMachine v7 = new VendingMachine("VM007", "QuickSnack", 185000, "College Campus", new Product(107, "Cookies", 45, "Snacks", 0.30, "Sunfeast"));
		 VendingMachine v8 = new VendingMachine("VM008", "SmartSnack", 195000, "Hospital", new Product(108, "Energy Drink", 120, "Beverage", 0.50, "Red Bull"));
		 VendingMachine v9 = new VendingMachine("VM009", "EasyVend", 205000, "Office Complex", new Product(109, "Coffee Can", 90, "Beverage", 0.30, "Nescafe"));
		 VendingMachine v10 = new VendingMachine("VM010", "FoodVend", 215000, "Shopping Mall", new Product(110, "Sandwich", 100, "Food", 0.25, "FreshBite"));
		 VendingMachine v11 = new VendingMachine("VM011", "SnackKing", 225000, "University Campus", new Product(111, "Namkeen", 55, "Snacks", 0.25, "Haldiram"));
		 VendingMachine v12 = new VendingMachine("VM012", "CoolVend", 235000, "Hotel Lobby", new Product(112, "Apple Juice", 70, "Beverage", 0.50, "Tropicana"));
		 VendingMachine v13 = new VendingMachine("VM013", "FastVend", 245000, "Cinema Hall", new Product(113, "Popcorn", 100, "Snacks", 0.30, "PVR Foods"));
		 VendingMachine v14 = new VendingMachine("VM014", "MegaVend", 255000, "Corporate Office", new Product(114, "Green Tea", 65, "Beverage", 0.25, "Lipton"));
		 VendingMachine v15 = new VendingMachine("VM015", "SmartFood", 265000, "IT Park", new Product(115, "Protein Bar", 150, "Health Food", 0.10, "Yoga Bar"));
		 VendingMachine v16 = new VendingMachine("VM016", "AutoSnack", 275000, "College Hostel", new Product(116, "Samosa", 30, "Food", 0.15, "Haldiram"));
		 VendingMachine v17 = new VendingMachine("VM017", "QuickFood", 285000, "Railway Platform", new Product(117, "Fruit Juice", 55, "Beverage", 0.50, "Paper Boat"));
		 VendingMachine v18 = new VendingMachine("VM018", "VendExpress", 295000, "Metro Mall", new Product(118, "Muffin", 75, "Bakery", 0.15, "Monginis"));
		 VendingMachine v19 = new VendingMachine("VM019", "FoodExpress", 305000, "University Gate", new Product(119, "Donut", 60, "Bakery", 0.12, "Dunkin"));
		 VendingMachine v20 = new VendingMachine("VM020", "SnackExpress", 315000, "Bus Terminal", new Product(120, "Pretzels", 50, "Snacks", 0.15, "Bakers"));
		 VendingMachine v21 = new VendingMachine("VM021", "CoolMachine", 325000, "Airport Terminal", new Product(121, "Lemon Drink", 45, "Beverage", 0.50, "Sprite"));
		 VendingMachine v22 = new VendingMachine("VM022", "SmartMachine", 335000, "Hospital Block", new Product(122, "Milk Shake", 110, "Beverage", 0.40, "Amul"));
		 VendingMachine v23 = new VendingMachine("VM023", "EasyMachine", 345000, "Railway Station", new Product(123, "Ice Tea", 70, "Beverage", 0.50, "Nestea"));
		 VendingMachine v24 = new VendingMachine("VM024", "AutoFood", 355000, "Shopping Complex", new Product(124, "Cup Cake", 65, "Bakery", 0.10, "Monginis"));
		 VendingMachine v25 = new VendingMachine("VM025", "FoodMaster", 365000, "Corporate Park", new Product(125, "Veg Sandwich", 90, "Food", 0.25, "Subway"));
		 VendingMachine v26 = new VendingMachine("VM026", "SnackMaster", 375000, "College Library", new Product(126, "Nachos", 85, "Snacks", 0.20, "Doritos"));
		 VendingMachine v27 = new VendingMachine("VM027", "VendMaster", 385000, "Metro Station", new Product(127, "Peanut Bar", 40, "Snacks", 0.10, "Haldiram"));
		 VendingMachine v28 = new VendingMachine("VM028", "QuickMachine", 395000, "Sports Complex", new Product(128, "Sports Drink", 90, "Beverage", 0.50, "Gatorade"));
		 VendingMachine v29 = new VendingMachine("VM029", "SmartVendPro", 405000, "Gym Center", new Product(129, "Protein Shake", 180, "Health Food", 0.40, "MuscleBlaze"));
		 VendingMachine v30 = new VendingMachine("VM030", "MegaSnack", 415000, "Food Court", new Product(130, "French Fries", 100, "Food", 0.25, "McCain"));
		 VendingMachine v31 = new VendingMachine("VM031", "MegaFood", 425000, "Mall Entrance", new Product(131, "Burger", 150, "Food", 0.30, "Burger King"));
		 VendingMachine v32 = new VendingMachine("VM032", "FastSnack", 435000, "Cinema Entrance", new Product(132, "Nacho Chips", 90, "Snacks", 0.20, "Doritos"));
		 VendingMachine v33 = new VendingMachine("VM033", "CoolFood", 445000, "Hotel Lobby", new Product(133, "Chocolate Milk", 75, "Beverage", 0.25, "Amul"));
		 VendingMachine v34 = new VendingMachine("VM034", "AutoVendPro", 455000, "IT Company", new Product(134, "Granola Bar", 95, "Health Food", 0.10, "Kellogg's"));
		 VendingMachine v35 = new VendingMachine("VM035", "SmartVendPro", 465000, "Business Center", new Product(135, "Black Coffee", 80, "Beverage", 0.20, "Nescafe"));
		 VendingMachine v36 = new VendingMachine("VM036", "FoodPoint", 475000, "Railway Station", new Product(136, "Veg Puff", 35, "Bakery", 0.12, "Monginis"));
		 VendingMachine v37 = new VendingMachine("VM037", "SnackPoint", 485000, "Bus Station", new Product(137, "Salted Peanuts", 50, "Snacks", 0.15, "Haldiram"));
		 VendingMachine v38 = new VendingMachine("VM038", "VendPoint", 495000, "Airport Lounge", new Product(138, "Apple", 40, "Fruit", 0.20, "FreshFarm"));
		 VendingMachine v39 = new VendingMachine("VM039", "QuickPoint", 505000, "University Campus", new Product(139, "Banana", 30, "Fruit", 0.25, "FreshFarm"));
		 VendingMachine v40 = new VendingMachine("VM040", "EasyPoint", 515000, "Hospital Reception", new Product(140, "Orange", 35, "Fruit", 0.20, "FreshFarm"));
		 VendingMachine v41 = new VendingMachine("VM041", "SmartPoint", 525000, "Gym Reception", new Product(141, "Protein Cookie", 130, "Health Food", 0.12, "Yoga Bar"));
		 VendingMachine v42 = new VendingMachine("VM042", "FoodStation", 535000, "Metro Entrance", new Product(142, "Veg Roll", 70, "Food", 0.20, "FreshBite"));
		 VendingMachine v43 = new VendingMachine("VM043", "SnackStation", 545000, "Mall Food Court", new Product(143, "Cheese Balls", 60, "Snacks", 0.15, "Balaji"));
		 VendingMachine v44 = new VendingMachine("VM044", "VendStation", 555000, "Office Building", new Product(144, "Coconut Water", 60, "Beverage", 0.30, "Paper Boat"));
		 VendingMachine v45 = new VendingMachine("VM045", "AutoStation", 565000, "College Campus", new Product(145, "Masala Chips", 35, "Snacks", 0.20, "Balaji"));
		 VendingMachine v46 = new VendingMachine("VM046", "QuickVendPro", 575000, "Shopping Mall", new Product(146, "Cold Coffee", 100, "Beverage", 0.30, "Café Coffee Day"));
		 VendingMachine v47 = new VendingMachine("VM047", "MegaVendPro", 585000, "Cinema Hall", new Product(147, "Caramel Popcorn", 120, "Snacks", 0.30, "PVR Foods"));
		 VendingMachine v48 = new VendingMachine("VM048", "SmartFoodPro", 595000, "Corporate Office", new Product(148, "Energy Bar", 140, "Health Food", 0.10, "RiteBite"));
		 VendingMachine v49 = new VendingMachine("VM049", "FoodVendPro", 605000, "Airport Terminal", new Product(149, "Chicken Sandwich", 180, "Food", 0.30, "FreshBite"));
		 VendingMachine v50 = new VendingMachine("VM050", "VendTechPro", 615000, "Lucknow Metro", new Product(150, "Mango Juice", 65, "Beverage", 0.50, "Maaza"));
		 VendingMachine v51 = new VendingMachine(v1);
		 VendingMachine v52 = new VendingMachine(v2);
		 VendingMachine v53 = new VendingMachine(v3);
		 VendingMachine v54 = new VendingMachine(v4);
		 VendingMachine v55 = new VendingMachine(v5);
		 VendingMachine v56 = new VendingMachine(v6);
		 VendingMachine v57 = new VendingMachine(v7);
		 VendingMachine v58 = new VendingMachine(v8);
		 VendingMachine v59 = new VendingMachine(v9);
		 VendingMachine v60 = new VendingMachine(v10);

		 VendingMachine v61 = new VendingMachine(v11);
		 VendingMachine v62 = new VendingMachine(v12);
		 VendingMachine v63 = new VendingMachine(v13);
		 VendingMachine v64 = new VendingMachine(v14);
		 VendingMachine v65 = new VendingMachine(v15);
		 VendingMachine v66 = new VendingMachine(v16);
		 VendingMachine v67 = new VendingMachine(v17);
		 VendingMachine v68 = new VendingMachine(v18);
		 VendingMachine v69 = new VendingMachine(v19);
		 VendingMachine v70 = new VendingMachine(v20);

		 VendingMachine v71 = new VendingMachine(v21);
		 VendingMachine v72 = new VendingMachine(v22);
		 VendingMachine v73 = new VendingMachine(v23);
		 VendingMachine v74 = new VendingMachine(v24);
		 VendingMachine v75 = new VendingMachine(v25);
		 VendingMachine v76 = new VendingMachine(v26);
		 VendingMachine v77 = new VendingMachine(v27);
		 VendingMachine v78 = new VendingMachine(v28);
		 VendingMachine v79 = new VendingMachine(v29);
		 VendingMachine v80 = new VendingMachine(v30);

		 VendingMachine v81 = new VendingMachine(v31);
		 VendingMachine v82 = new VendingMachine(v32);
		 VendingMachine v83 = new VendingMachine(v33);
		 VendingMachine v84 = new VendingMachine(v34);
		 VendingMachine v85 = new VendingMachine(v35);
		 VendingMachine v86 = new VendingMachine(v36);
		 VendingMachine v87 = new VendingMachine(v37);
		 VendingMachine v88 = new VendingMachine(v38);
		 VendingMachine v89 = new VendingMachine(v39);
		 VendingMachine v90 = new VendingMachine(v40);
		 
		 System.out.println(v1);
		 System.out.println(v2);
		 System.out.println(v3);
		 System.out.println(v4);
		 System.out.println(v5);
		 System.out.println(v6);
		 System.out.println(v7);
		 System.out.println(v8);
		 System.out.println(v9);
		 System.out.println(v10);

		 System.out.println(v11);
		 System.out.println(v12);
		 System.out.println(v13);
		 System.out.println(v14);
		 System.out.println(v15);
		 System.out.println(v16);
		 System.out.println(v17);
		 System.out.println(v18);
		 System.out.println(v19);
		 System.out.println(v20);

		 System.out.println(v21);
		 System.out.println(v22);
		 System.out.println(v23);
		 System.out.println(v24);
		 System.out.println(v25);
		 System.out.println(v26);
		 System.out.println(v27);
		 System.out.println(v28);
		 System.out.println(v29);
		 System.out.println(v30);

		 System.out.println(v31);
		 System.out.println(v32);
		 System.out.println(v33);
		 System.out.println(v34);
		 System.out.println(v35);
		 System.out.println(v36);
		 System.out.println(v37);
		 System.out.println(v38);
		 System.out.println(v39);
		 System.out.println(v40);

		 System.out.println(v41);
		 System.out.println(v42);
		 System.out.println(v43);
		 System.out.println(v44);
		 System.out.println(v45);
		 System.out.println(v46);
		 System.out.println(v47);
		 System.out.println(v48);
		 System.out.println(v49);
		 System.out.println(v50);

		 System.out.println(v51);
		 System.out.println(v52);
		 System.out.println(v53);
		 System.out.println(v54);
		 System.out.println(v55);
		 System.out.println(v56);
		 System.out.println(v57);
		 System.out.println(v58);
		 System.out.println(v59);
		 System.out.println(v60);

		 System.out.println(v61);
		 System.out.println(v62);
		 System.out.println(v63);
		 System.out.println(v64);
		 System.out.println(v65);
		 System.out.println(v66);
		 System.out.println(v67);
		 System.out.println(v68);
		 System.out.println(v69);
		 System.out.println(v70);

		 System.out.println(v71);
		 System.out.println(v72);
		 System.out.println(v73);
		 System.out.println(v74);
		 System.out.println(v75);
		 System.out.println(v76);
		 System.out.println(v77);
		 System.out.println(v78);
		 System.out.println(v79);
		 System.out.println(v80);

		 System.out.println(v81);
		 System.out.println(v82);
		 System.out.println(v83);
		 System.out.println(v84);
		 System.out.println(v85);
		 System.out.println(v86);
		 System.out.println(v87);
		 System.out.println(v88);
		 System.out.println(v89);
		 System.out.println(v90);
		 
		 System.out.println("=========================================Main Method Ends==========================================");
		 
	}

}
