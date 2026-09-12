package constructor.deepCopy.Laptop;

public class LaptopDriver {
	
	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Sarts==============================");
		
		Laptop l1 = new Laptop("Dell", "Dell Inspiron", 50000, "Grey", new Processor(101, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l2 = new Laptop("HP", "Pavilion", 55000, "Silver", new Processor(102, "Core i7", 12, "13th Generation", 4.9, "Intel"));
		Laptop l3 = new Laptop("Lenovo", "ThinkPad", 60000, "Black", new Processor(103, "Core i5", 10, "12th Generation", 4.4, "Intel"));
		Laptop l4 = new Laptop("Asus", "VivoBook", 45000, "Blue", new Processor(104, "Core i3", 6, "12th Generation", 4.1, "Intel"));
		Laptop l5 = new Laptop("Acer", "Aspire 5", 48000, "Silver", new Processor(105, "Ryzen 5", 6, "5000 Series", 4.2, "AMD"));

		Laptop l6 = new Laptop("Apple", "MacBook Air", 90000, "Grey", new Processor(106, "M1", 8, "1st Generation", 3.2, "Apple"));
		Laptop l7 = new Laptop("Dell", "Inspiron 15", 52000, "Black", new Processor(107, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l8 = new Laptop("HP", "Victus", 75000, "White", new Processor(108, "Ryzen 7", 8, "7000 Series", 4.5, "AMD"));
		Laptop l9 = new Laptop("Lenovo", "IdeaPad", 42000, "Grey", new Processor(109, "Core i3", 6, "11th Generation", 4.0, "Intel"));
		Laptop l10 = new Laptop("Asus", "ROG Strix", 120000, "Black", new Processor(110, "Core i9", 24, "14th Generation", 5.8, "Intel"));

		Laptop l11 = new Laptop("Acer", "Nitro 5", 80000, "Black", new Processor(111, "Core i7", 14, "12th Generation", 4.7, "Intel"));
		Laptop l12 = new Laptop("MSI", "Gaming GF63", 70000, "Black", new Processor(112, "Core i5", 12, "12th Generation", 4.5, "Intel"));
		Laptop l13 = new Laptop("Samsung", "Galaxy Book", 65000, "Silver", new Processor(113, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l14 = new Laptop("Microsoft", "Surface Laptop", 95000, "Platinum", new Processor(114, "Core i7", 12, "12th Generation", 4.8, "Intel"));
		Laptop l15 = new Laptop("LG", "Gram", 85000, "White", new Processor(115, "Core i7", 12, "13th Generation", 4.9, "Intel"));

		Laptop l16 = new Laptop("Dell", "Latitude", 72000, "Grey", new Processor(116, "Core i7", 12, "12th Generation", 4.8, "Intel"));
		Laptop l17 = new Laptop("HP", "EliteBook", 78000, "Silver", new Processor(117, "Core i7", 14, "13th Generation", 5.0, "Intel"));
		Laptop l18 = new Laptop("Lenovo", "Yoga", 68000, "Blue", new Processor(118, "Ryzen 5", 6, "7000 Series", 4.3, "AMD"));
		Laptop l19 = new Laptop("Asus", "ZenBook", 88000, "Blue", new Processor(119, "Core i7", 12, "13th Generation", 4.9, "Intel"));
		Laptop l20 = new Laptop("Acer", "Swift 3", 58000, "Silver", new Processor(120, "Core i5", 10, "12th Generation", 4.5, "Intel"));

		Laptop l21 = new Laptop("Apple", "MacBook Pro", 150000, "Space Grey", new Processor(121, "M2 Pro", 10, "2nd Generation", 3.5, "Apple"));
		Laptop l22 = new Laptop("Dell", "XPS 13", 110000, "Silver", new Processor(122, "Core i7", 12, "13th Generation", 5.0, "Intel"));
		Laptop l23 = new Laptop("HP", "Envy", 85000, "Black", new Processor(123, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l24 = new Laptop("Lenovo", "Legion 5", 105000, "Black", new Processor(124, "Ryzen 7", 8, "7000 Series", 4.7, "AMD"));
		Laptop l25 = new Laptop("Asus", "TUF Gaming", 90000, "Grey", new Processor(125, "Ryzen 7", 8, "5000 Series", 4.4, "AMD"));

		Laptop l26 = new Laptop("Acer", "Predator", 125000, "Black", new Processor(126, "Core i9", 24, "13th Generation", 5.6, "Intel"));
		Laptop l27 = new Laptop("MSI", "Katana", 95000, "Black", new Processor(127, "Core i7", 14, "13th Generation", 5.0, "Intel"));
		Laptop l28 = new Laptop("Samsung", "Galaxy Book 3", 90000, "Graphite", new Processor(128, "Core i7", 12, "13th Generation", 4.9, "Intel"));
		Laptop l29 = new Laptop("LG", "Ultra PC", 70000, "White", new Processor(129, "Core i5", 10, "12th Generation", 4.5, "Intel"));
		Laptop l30 = new Laptop("Microsoft", "Surface Pro", 100000, "Black", new Processor(130, "Core i5", 10, "12th Generation", 4.4, "Intel"));

		Laptop l31 = new Laptop("Dell", "Vostro", 58000, "Black", new Processor(131, "Core i5", 10, "12th Generation", 4.5, "Intel"));
		Laptop l32 = new Laptop("HP", "15s", 45000, "Natural Silver", new Processor(132, "Core i3", 6, "12th Generation", 4.1, "Intel"));
		Laptop l33 = new Laptop("Lenovo", "V15", 47000, "Black", new Processor(133, "Ryzen 3", 4, "5000 Series", 4.1, "AMD"));
		Laptop l34 = new Laptop("Asus", "ExpertBook", 62000, "Grey", new Processor(134, "Core i5", 10, "12th Generation", 4.5, "Intel"));
		Laptop l35 = new Laptop("Acer", "Extensa", 40000, "Black", new Processor(135, "Core i3", 6, "11th Generation", 4.0, "Intel"));

		Laptop l36 = new Laptop("Apple", "MacBook Air M2", 105000, "Midnight", new Processor(136, "M2", 8, "2nd Generation", 3.5, "Apple"));
		Laptop l37 = new Laptop("Dell", "G15", 95000, "Dark Grey", new Processor(137, "Core i7", 14, "13th Generation", 5.0, "Intel"));
		Laptop l38 = new Laptop("HP", "Omen", 115000, "Black", new Processor(138, "Ryzen 7", 8, "7000 Series", 4.7, "AMD"));
		Laptop l39 = new Laptop("Lenovo", "ThinkBook", 70000, "Grey", new Processor(139, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l40 = new Laptop("Asus", "Vivobook Pro", 85000, "Blue", new Processor(140, "Ryzen 7", 8, "6000 Series", 4.5, "AMD"));

		Laptop l41 = new Laptop("Acer", "Aspire 7", 65000, "Black", new Processor(141, "Ryzen 5", 6, "5000 Series", 4.2, "AMD"));
		Laptop l42 = new Laptop("MSI", "Modern 14", 60000, "Silver", new Processor(142, "Core i5", 10, "12th Generation", 4.5, "Intel"));
		Laptop l43 = new Laptop("Samsung", "Galaxy Book 2", 68000, "Silver", new Processor(143, "Core i5", 10, "12th Generation", 4.4, "Intel"));
		Laptop l44 = new Laptop("LG", "Gram 16", 100000, "White", new Processor(144, "Core i7", 12, "13th Generation", 4.9, "Intel"));
		Laptop l45 = new Laptop("Microsoft", "Surface Laptop 5", 115000, "Platinum", new Processor(145, "Core i7", 10, "12th Generation", 4.8, "Intel"));

		Laptop l46 = new Laptop("Dell", "Precision", 140000, "Grey", new Processor(146, "Core i9", 24, "13th Generation", 5.5, "Intel"));
		Laptop l47 = new Laptop("HP", "ProBook", 65000, "Silver", new Processor(147, "Core i5", 10, "13th Generation", 4.6, "Intel"));
		Laptop l48 = new Laptop("Lenovo", "IdeaPad Slim", 55000, "Grey", new Processor(148, "Ryzen 5", 6, "7000 Series", 4.3, "AMD"));
		Laptop l49 = new Laptop("Asus", "ROG Zephyrus", 135000, "White", new Processor(149, "Core i9", 24, "14th Generation", 5.8, "Intel"));
		Laptop l50 = new Laptop("Acer", "TravelMate", 60000, "Black", new Processor(150, "Core i5", 10, "12th Generation", 4.5, "Intel"));
		Laptop l51 = new Laptop(l1);
		Laptop l52 = new Laptop(l2);
		Laptop l53 = new Laptop(l3);
		Laptop l54 = new Laptop(l4);
		Laptop l55 = new Laptop(l5);
		Laptop l56 = new Laptop(l6);
		Laptop l57 = new Laptop(l7);
		Laptop l58 = new Laptop(l8);
		Laptop l59 = new Laptop(l9);
		Laptop l60 = new Laptop(l10);

		Laptop l61 = new Laptop(l11);
		Laptop l62 = new Laptop(l12);
		Laptop l63 = new Laptop(l13);
		Laptop l64 = new Laptop(l14);
		Laptop l65 = new Laptop(l15);
		Laptop l66 = new Laptop(l16);
		Laptop l67 = new Laptop(l17);
		Laptop l68 = new Laptop(l18);
		Laptop l69 = new Laptop(l19);
		Laptop l70 = new Laptop(l20);

		Laptop l71 = new Laptop(l21);
		Laptop l72 = new Laptop(l22);
		Laptop l73 = new Laptop(l23);
		Laptop l74 = new Laptop(l24);
		Laptop l75 = new Laptop(l25);
		Laptop l76 = new Laptop(l26);
		Laptop l77 = new Laptop(l27);
		Laptop l78 = new Laptop(l28);
		Laptop l79 = new Laptop(l29);
		Laptop l80 = new Laptop(l30);

		Laptop l81 = new Laptop(l31);
		Laptop l82 = new Laptop(l32);
		Laptop l83 = new Laptop(l33);
		Laptop l84 = new Laptop(l34);
		Laptop l85 = new Laptop(l35);
		Laptop l86 = new Laptop(l36);
		Laptop l87 = new Laptop(l37);
		Laptop l88 = new Laptop(l38);
		Laptop l89 = new Laptop(l39);
		Laptop l90 = new Laptop(l40);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6);
		System.out.println(l7);
		System.out.println(l8);
		System.out.println(l9);
		System.out.println(l10);

		System.out.println(l11);
		System.out.println(l12);
		System.out.println(l13);
		System.out.println(l14);
		System.out.println(l15);
		System.out.println(l16);
		System.out.println(l17);
		System.out.println(l18);
		System.out.println(l19);
		System.out.println(l20);

		System.out.println(l21);
		System.out.println(l22);
		System.out.println(l23);
		System.out.println(l24);
		System.out.println(l25);
		System.out.println(l26);
		System.out.println(l27);
		System.out.println(l28);
		System.out.println(l29);
		System.out.println(l30);

		System.out.println(l31);
		System.out.println(l32);
		System.out.println(l33);
		System.out.println(l34);
		System.out.println(l35);
		System.out.println(l36);
		System.out.println(l37);
		System.out.println(l38);
		System.out.println(l39);
		System.out.println(l40);

		System.out.println(l41);
		System.out.println(l42);
		System.out.println(l43);
		System.out.println(l44);
		System.out.println(l45);
		System.out.println(l46);
		System.out.println(l47);
		System.out.println(l48);
		System.out.println(l49);
		System.out.println(l50);

		System.out.println(l51);
		System.out.println(l52);
		System.out.println(l53);
		System.out.println(l54);
		System.out.println(l55);
		System.out.println(l56);
		System.out.println(l57);
		System.out.println(l58);
		System.out.println(l59);
		System.out.println(l60);

		System.out.println(l61);
		System.out.println(l62);
		System.out.println(l63);
		System.out.println(l64);
		System.out.println(l65);
		System.out.println(l66);
		System.out.println(l67);
		System.out.println(l68);
		System.out.println(l69);
		System.out.println(l70);

		System.out.println(l71);
		System.out.println(l72);
		System.out.println(l73);
		System.out.println(l74);
		System.out.println(l75);
		System.out.println(l76);
		System.out.println(l77);
		System.out.println(l78);
		System.out.println(l79);
		System.out.println(l80);

		System.out.println(l81);
		System.out.println(l82);
		System.out.println(l83);
		System.out.println(l84);
		System.out.println(l85);
		System.out.println(l86);
		System.out.println(l87);
		System.out.println(l88);
		System.out.println(l89);
		System.out.println(l90);
		System.out.println("==============================Main Method Ends==================================");
	}

}
