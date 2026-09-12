package constructor.deepCopy.Mobile;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		System.out.println("===========================Main Method Starts===============================");
		
		Mobile m1 = new Mobile("Galaxy S25", "Samsung", 75000, "Black", new Battery(101, "Lithium Ion", 5000, "Fast Charging", 3.85, "Samsung"));
		Mobile m2 = new Mobile("iPhone 16", "Apple", 80000, "White", new Battery(102, "Lithium Ion", 4500, "Fast Charging", 3.87, "Apple"));
		Mobile m3 = new Mobile("OnePlus 13", "OnePlus", 65000, "Blue", new Battery(103, "Lithium Polymer", 6000, "SuperVOOC", 3.85, "OnePlus"));
		Mobile m4 = new Mobile("Pixel 9", "Google", 70000, "Obsidian", new Battery(104, "Lithium Ion", 4700, "Fast Charging", 3.85, "Google"));
		Mobile m5 = new Mobile("Xiaomi 14", "Xiaomi", 55000, "Green", new Battery(105, "Lithium Polymer", 5000, "Turbo Charging", 3.87, "Xiaomi"));
		Mobile m6 = new Mobile("Redmi Note 14", "Redmi", 25000, "Black", new Battery(106, "Lithium Ion", 5500, "Fast Charging", 3.85, "Xiaomi"));
		Mobile m7 = new Mobile("Realme GT 6", "Realme", 40000, "Silver", new Battery(107, "Lithium Polymer", 5500, "Super Fast Charging", 3.85, "Realme"));
		Mobile m8 = new Mobile("Vivo V40", "Vivo", 35000, "Purple", new Battery(108, "Lithium Ion", 5500, "Flash Charging", 3.87, "Vivo"));
		Mobile m9 = new Mobile("Oppo Reno 12", "Oppo", 38000, "Gold", new Battery(109, "Lithium Polymer", 5000, "SuperVOOC", 3.85, "Oppo"));
		Mobile m10 = new Mobile("Nothing Phone 3", "Nothing", 45000, "White", new Battery(110, "Lithium Ion", 5200, "Fast Charging", 3.85, "Nothing"));

		Mobile m11 = new Mobile("Galaxy A55", "Samsung", 42000, "Navy", new Battery(111, "Lithium Ion", 5000, "Fast Charging", 3.85, "Samsung"));
		Mobile m12 = new Mobile("iPhone 15", "Apple", 65000, "Pink", new Battery(112, "Lithium Ion", 4383, "MagSafe Charging", 3.87, "Apple"));
		Mobile m13 = new Mobile("OnePlus 12", "OnePlus", 60000, "Emerald", new Battery(113, "Lithium Polymer", 5400, "SuperVOOC", 3.85, "OnePlus"));
		Mobile m14 = new Mobile("Pixel 8 Pro", "Google", 60000, "Blue", new Battery(114, "Lithium Ion", 5050, "Fast Charging", 3.85, "Google"));
		Mobile m15 = new Mobile("Xiaomi 13 Pro", "Xiaomi", 58000, "Ceramic White", new Battery(115, "Lithium Polymer", 4820, "Turbo Charging", 3.87, "Xiaomi"));
		Mobile m16 = new Mobile("Redmi Note 13", "Redmi", 22000, "Blue", new Battery(116, "Lithium Ion", 5000, "Fast Charging", 3.85, "Xiaomi"));
		Mobile m17 = new Mobile("Realme 12 Pro", "Realme", 30000, "Cream", new Battery(117, "Lithium Polymer", 5000, "Super Fast Charging", 3.85, "Realme"));
		Mobile m18 = new Mobile("Vivo X100", "Vivo", 55000, "Black", new Battery(118, "Lithium Ion", 5400, "Flash Charging", 3.87, "Vivo"));
		Mobile m19 = new Mobile("Oppo Find X7", "Oppo", 65000, "Blue", new Battery(119, "Lithium Polymer", 5000, "SuperVOOC", 3.85, "Oppo"));
		Mobile m20 = new Mobile("Nothing Phone 2", "Nothing", 35000, "Grey", new Battery(120, "Lithium Ion", 4700, "Fast Charging", 3.85, "Nothing"));

		Mobile m21 = new Mobile("Galaxy S24", "Samsung", 70000, "Violet", new Battery(121, "Lithium Ion", 4000, "Fast Charging", 3.85, "Samsung"));
		Mobile m22 = new Mobile("iPhone 14", "Apple", 55000, "Purple", new Battery(122, "Lithium Ion", 3279, "MagSafe Charging", 3.87, "Apple"));
		Mobile m23 = new Mobile("OnePlus Nord 4", "OnePlus", 30000, "Black", new Battery(123, "Lithium Polymer", 5500, "SuperVOOC", 3.85, "OnePlus"));
		Mobile m24 = new Mobile("Pixel 8", "Google", 50000, "Hazel", new Battery(124, "Lithium Ion", 4575, "Fast Charging", 3.85, "Google"));
		Mobile m25 = new Mobile("Xiaomi 14 Ultra", "Xiaomi", 90000, "Black", new Battery(125, "Lithium Polymer", 5000, "Turbo Charging", 3.87, "Xiaomi"));
		Mobile m26 = new Mobile("Redmi 13C", "Redmi", 12000, "Green", new Battery(126, "Lithium Ion", 5000, "Fast Charging", 3.85, "Xiaomi"));
		Mobile m27 = new Mobile("Realme Narzo 70", "Realme", 18000, "Blue", new Battery(127, "Lithium Polymer", 5000, "Fast Charging", 3.85, "Realme"));
		Mobile m28 = new Mobile("Vivo Y200", "Vivo", 24000, "Orange", new Battery(128, "Lithium Ion", 5000, "Flash Charging", 3.87, "Vivo"));
		Mobile m29 = new Mobile("Oppo A79", "Oppo", 22000, "Green", new Battery(129, "Lithium Polymer", 5000, "SuperVOOC", 3.85, "Oppo"));
		Mobile m30 = new Mobile("Nothing Phone 1", "Nothing", 28000, "Black", new Battery(130, "Lithium Ion", 4500, "Fast Charging", 3.85, "Nothing"));

		Mobile m31 = new Mobile("Galaxy M55", "Samsung", 30000, "Light Green", new Battery(131, "Lithium Ion", 5000, "Fast Charging", 3.85, "Samsung"));
		Mobile m32 = new Mobile("iPhone 13", "Apple", 45000, "Red", new Battery(132, "Lithium Ion", 3227, "MagSafe Charging", 3.87, "Apple"));
		Mobile m33 = new Mobile("OnePlus 11", "OnePlus", 55000, "Titan Black", new Battery(133, "Lithium Polymer", 5000, "SuperVOOC", 3.85, "OnePlus"));
		Mobile m34 = new Mobile("Pixel 7 Pro", "Google", 48000, "Snow", new Battery(134, "Lithium Ion", 5000, "Fast Charging", 3.85, "Google"));
		Mobile m35 = new Mobile("Xiaomi 12 Pro", "Xiaomi", 45000, "Blue", new Battery(135, "Lithium Polymer", 4600, "Turbo Charging", 3.87, "Xiaomi"));
		Mobile m36 = new Mobile("Redmi Note 12", "Redmi", 20000, "Ice Blue", new Battery(136, "Lithium Ion", 5000, "Fast Charging", 3.85, "Xiaomi"));
		Mobile m37 = new Mobile("Realme GT Neo", "Realme", 32000, "Black", new Battery(137, "Lithium Polymer", 5000, "Super Fast Charging", 3.85, "Realme"));
		Mobile m38 = new Mobile("Vivo V30", "Vivo", 32000, "Peacock Green", new Battery(138, "Lithium Ion", 5000, "Flash Charging", 3.87, "Vivo"));
		Mobile m39 = new Mobile("Oppo Reno 10", "Oppo", 35000, "Silver", new Battery(139, "Lithium Polymer", 5000, "SuperVOOC", 3.85, "Oppo"));
		Mobile m40 = new Mobile("Nothing Phone 2a", "Nothing", 25000, "Milk", new Battery(140, "Lithium Ion", 5000, "Fast Charging", 3.85, "Nothing"));

		Mobile m41 = new Mobile("Galaxy Z Flip 6", "Samsung", 110000, "Blue", new Battery(141, "Lithium Ion", 4000, "Fast Charging", 3.85, "Samsung"));
		Mobile m42 = new Mobile("iPhone 16 Pro", "Apple", 120000, "Titanium", new Battery(142, "Lithium Ion", 3582, "MagSafe Charging", 3.87, "Apple"));
		Mobile m43 = new Mobile("OnePlus Open", "OnePlus", 140000, "Voyager Black", new Battery(143, "Lithium Polymer", 4805, "SuperVOOC", 3.85, "OnePlus"));
		Mobile m44 = new Mobile("Pixel 9 Pro", "Google", 110000, "Porcelain", new Battery(144, "Lithium Ion", 4700, "Fast Charging", 3.85, "Google"));
		Mobile m45 = new Mobile("Xiaomi Mix Fold", "Xiaomi", 130000, "Black", new Battery(145, "Lithium Polymer", 5000, "Turbo Charging", 3.87, "Xiaomi"));
		Mobile m46 = new Mobile("Redmi K70", "Redmi", 40000, "White", new Battery(146, "Lithium Ion", 5000, "Fast Charging", 3.85, "Xiaomi"));
		Mobile m47 = new Mobile("Realme GT 5 Pro", "Realme", 55000, "Red", new Battery(147, "Lithium Polymer", 5400, "Super Fast Charging", 3.85, "Realme"));
		Mobile m48 = new Mobile("Vivo X90 Pro", "Vivo", 65000, "Black", new Battery(148, "Lithium Ion", 4870, "Flash Charging", 3.87, "Vivo"));
		Mobile m49 = new Mobile("Oppo Find N3", "Oppo", 140000, "Gold", new Battery(149, "Lithium Polymer", 4805, "SuperVOOC", 3.85, "Oppo"));
		Mobile m50 = new Mobile("Nothing Phone 3a", "Nothing", 35000, "White", new Battery(150, "Lithium Ion", 5000, "Fast Charging", 3.85, "Nothing"));
		Mobile m51 = new Mobile(m1);
		Mobile m52 = new Mobile(m2);
		Mobile m53 = new Mobile(m3);
		Mobile m54 = new Mobile(m4);
		Mobile m55 = new Mobile(m5);
		Mobile m56 = new Mobile(m6);
		Mobile m57 = new Mobile(m7);
		Mobile m58 = new Mobile(m8);
		Mobile m59 = new Mobile(m9);
		Mobile m60 = new Mobile(m10);

		Mobile m61 = new Mobile(m11);
		Mobile m62 = new Mobile(m12);
		Mobile m63 = new Mobile(m13);
		Mobile m64 = new Mobile(m14);
		Mobile m65 = new Mobile(m15);
		Mobile m66 = new Mobile(m16);
		Mobile m67 = new Mobile(m17);
		Mobile m68 = new Mobile(m18);
		Mobile m69 = new Mobile(m19);
		Mobile m70 = new Mobile(m20);

		Mobile m71 = new Mobile(m21);
		Mobile m72 = new Mobile(m22);
		Mobile m73 = new Mobile(m23);
		Mobile m74 = new Mobile(m24);
		Mobile m75 = new Mobile(m25);
		Mobile m76 = new Mobile(m26);
		Mobile m77 = new Mobile(m27);
		Mobile m78 = new Mobile(m28);
		Mobile m79 = new Mobile(m29);
		Mobile m80 = new Mobile(m30);

		Mobile m81 = new Mobile(m31);
		Mobile m82 = new Mobile(m32);
		Mobile m83 = new Mobile(m33);
		Mobile m84 = new Mobile(m34);
		Mobile m85 = new Mobile(m35);
		Mobile m86 = new Mobile(m36);
		Mobile m87 = new Mobile(m37);
		Mobile m88 = new Mobile(m38);
		Mobile m89 = new Mobile(m39);
		Mobile m90 = new Mobile(m40);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m7);
		System.out.println(m8);
		System.out.println(m9);
		System.out.println(m10);

		System.out.println(m11);
		System.out.println(m12);
		System.out.println(m13);
		System.out.println(m14);
		System.out.println(m15);
		System.out.println(m16);
		System.out.println(m17);
		System.out.println(m18);
		System.out.println(m19);
		System.out.println(m20);

		System.out.println(m21);
		System.out.println(m22);
		System.out.println(m23);
		System.out.println(m24);
		System.out.println(m25);
		System.out.println(m26);
		System.out.println(m27);
		System.out.println(m28);
		System.out.println(m29);
		System.out.println(m30);

		System.out.println(m31);
		System.out.println(m32);
		System.out.println(m33);
		System.out.println(m34);
		System.out.println(m35);
		System.out.println(m36);
		System.out.println(m37);
		System.out.println(m38);
		System.out.println(m39);
		System.out.println(m40);

		System.out.println(m41);
		System.out.println(m42);
		System.out.println(m43);
		System.out.println(m44);
		System.out.println(m45);
		System.out.println(m46);
		System.out.println(m47);
		System.out.println(m48);
		System.out.println(m49);
		System.out.println(m50);

		System.out.println(m51);
		System.out.println(m52);
		System.out.println(m53);
		System.out.println(m54);
		System.out.println(m55);
		System.out.println(m56);
		System.out.println(m57);
		System.out.println(m58);
		System.out.println(m59);
		System.out.println(m60);

		System.out.println(m61);
		System.out.println(m62);
		System.out.println(m63);
		System.out.println(m64);
		System.out.println(m65);
		System.out.println(m66);
		System.out.println(m67);
		System.out.println(m68);
		System.out.println(m69);
		System.out.println(m70);

		System.out.println(m71);
		System.out.println(m72);
		System.out.println(m73);
		System.out.println(m74);
		System.out.println(m75);
		System.out.println(m76);
		System.out.println(m77);
		System.out.println(m78);
		System.out.println(m79);
		System.out.println(m80);

		System.out.println(m81);
		System.out.println(m82);
		System.out.println(m83);
		System.out.println(m84);
		System.out.println(m85);
		System.out.println(m86);
		System.out.println(m87);
		System.out.println(m88);
		System.out.println(m89);
		System.out.println(m90);
		
		System.out.println("=================================Main Method Ends=====================================");
	}
	

}
