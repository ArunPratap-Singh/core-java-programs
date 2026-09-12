package inheritancePrograming.ECommerce;

public class Driver {

	public static void main(String[] args) {
		System.out.println("==============================Main Method Starts=========================");

		System.out.println("========== E-Commerce Hierarchical Inheritance ==========");

		System.out.println("=========================MOBILE OBJECT INITIALIZATION================================");

		Mobile m1 = new Mobile("Amazon", "India", 101, "iPhone", 1001, 75000.50, "Apple", 1, "iPhone 16", 8, true);
		Mobile m2 = new Mobile("Flipkart", "India", 102, "Galaxy", 1002, 65000.00, "Samsung", 2, "Galaxy S24", 12,true);
		Mobile m3 = new Mobile("Amazon", "USA", 103, "Pixel", 1003, 58000.75, "Google", 1, "Pixel 9", 8, true);
		Mobile m4 = new Mobile("Croma", "India", 104, "OnePlus", 1004, 45000.00, "OnePlus", 3, "OnePlus 13", 16, true);
		Mobile m5 = new Mobile("Reliance Digital", "India", 105, "Xiaomi", 1005, 28000.50, "Xiaomi", 2, "Xiaomi 15", 12,true);
		Mobile m6 = new Mobile("Amazon", "India", 106, "iPhone", 1006, 85000.00, "Apple", 1, "iPhone 16 Pro", 8, true);
		Mobile m7 = new Mobile("Flipkart", "India", 107, "Nothing", 1007, 35000.75, "Nothing", 4, "Nothing Phone 3", 12,false);
		Mobile m8 = new Mobile("Vijay Sales", "India", 108, "Moto", 1008, 22000.00, "Motorola", 2, "Moto Edge 60", 8,true);
		Mobile m9 = new Mobile("Amazon", "India", 109, "Realme", 1009, 18000.50, "Realme", 5, "Realme GT 7", 12, true);
		Mobile m10 = new Mobile("Croma", "India", 110, "Oppo", 1010, 32000.00, "Oppo", 3, "Oppo Reno 14", 8, false);
		Mobile m11 = new Mobile("Flipkart", "India", 111, "Vivo", 1011, 40000.25, "Vivo", 2, "Vivo X200", 16, true);
		Mobile m12 = new Mobile("Reliance Digital", "India", 112, "Samsung", 1012, 72000.00, "Samsung", 1,"Galaxy Z Flip", 8, true);
		Mobile m13 = new Mobile("Amazon", "India", 113, "iPhone", 1013, 95000.50, "Apple", 2, "iPhone 16 Pro Max", 16,true);
		Mobile m14 = new Mobile("Croma", "India", 114, "OnePlus", 1014, 55000.00, "OnePlus", 3, "OnePlus Open", 16,false);
		Mobile m15 = new Mobile("Flipkart", "India", 115, "Google Pixel", 1015, 68000.75, "Google", 1, "Pixel 9 Pro",12, true);

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

		System.out.println("===============================CLOTHING OBJECT INITIALIZATION====================================");

		Clothing c1 = new Clothing("Amazon", "India", 101, "T-Shirt", 2001, 1500.50, "Large", "Cotton");
		Clothing c2 = new Clothing("Flipkart", "India", 102, "Jeans", 2002, 2500.75, "Medium", "Denim");
		Clothing c3 = new Clothing("Myntra", "India", 103, "Shirt", 2003, 1800.00, "Large", "Cotton");
		Clothing c4 = new Clothing("Amazon", "India", 104, "Jacket", 2004, 4500.50, "XL", "Leather");
		Clothing c5 = new Clothing("Ajio", "India", 105, "Kurta", 2005, 2200.25, "Medium", "Silk");
		Clothing c6 = new Clothing("Myntra", "India", 106, "Hoodie", 2006, 2800.00, "Large", "Polyester");
		Clothing c7 = new Clothing("Flipkart", "India", 107, "Trousers", 2007, 1950.75, "32", "Cotton");
		Clothing c8 = new Clothing("Amazon", "India", 108, "Sweater", 2008, 3200.50, "Medium", "Wool");
		Clothing c9 = new Clothing("Ajio", "India", 109, "Saree", 2009, 5500.00, "Free Size", "Silk");
		Clothing c10 = new Clothing("Myntra", "India", 110, "Dress", 2010, 3800.25, "Small", "Rayon");
		Clothing c11 = new Clothing("Flipkart", "India", 111, "Shorts", 2011, 1200.50, "Large", "Cotton");
		Clothing c12 = new Clothing("Amazon", "India", 112, "Blazer", 2012, 6500.75, "XL", "Wool");
		Clothing c13 = new Clothing("Ajio", "India", 113, "Skirt", 2013, 2100.00, "Medium", "Denim");
		Clothing c14 = new Clothing("Myntra", "India", 114, "Track Pants", 2014, 1750.50, "Large", "Polyester");
		Clothing c15 = new Clothing("Amazon", "India", 115, "Kurti", 2015, 2400.25, "Small", "Cotton");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		System.out.println(c13);
		System.out.println(c14);
		System.out.println(c15);
		
		System.out.println("================================Main Method Ends====================================");
		
	}

}
