package encapsulationsPrograming;

public class MobilePhoneDriver {
	
	public static void main(String[] args) {
		
		System.out.println("============================Main Method Starts=============================");
		
		MobilePhone m1 = new MobilePhone("Samsung", "Galaxy S24", "Black", 8, 74999);
		MobilePhone m2 = new MobilePhone("Apple", "iPhone 15", "Blue", 8, 69999);
		MobilePhone m3 = new MobilePhone("OnePlus", "OnePlus 12", "Green", 12, 64999);
		MobilePhone m4 = new MobilePhone("Xiaomi", "Redmi Note 13", "Black", 8, 24999);
		MobilePhone m5 = new MobilePhone("Vivo", "Vivo V30", "Blue", 8, 33999);
		MobilePhone m6 = new MobilePhone("Oppo", "Reno 11", "White", 12, 35999);
		MobilePhone m7 = new MobilePhone("Realme", "GT 6", "Silver", 12, 40999);
		MobilePhone m8 = new MobilePhone("Motorola", "Edge 50", "Purple", 8, 29999);
		MobilePhone m9 = new MobilePhone("Google", "Pixel 8", "Black", 8, 54999);
		MobilePhone m10 = new MobilePhone("Nothing", "Phone 2", "White", 12, 44999);

		MobilePhone m11 = new MobilePhone("Samsung", "Galaxy A55", "Blue", 8, 38999);
		MobilePhone m12 = new MobilePhone("Apple", "iPhone 14", "Red", 6, 59999);
		MobilePhone m13 = new MobilePhone("OnePlus", "Nord CE 4", "Silver", 8, 24999);
		MobilePhone m14 = new MobilePhone("Xiaomi", "Redmi Note 13 Pro", "Purple", 8, 29999);
		MobilePhone m15 = new MobilePhone("Vivo", "Vivo V40", "Green", 12, 39999);
		MobilePhone m16 = new MobilePhone("Oppo", "F25 Pro", "Black", 8, 28999);
		MobilePhone m17 = new MobilePhone("Realme", "Narzo 70", "Blue", 8, 18999);
		MobilePhone m18 = new MobilePhone("Motorola", "Moto G85", "Grey", 8, 19999);
		MobilePhone m19 = new MobilePhone("Google", "Pixel 8a", "Blue", 8, 52999);
		MobilePhone m20 = new MobilePhone("Nothing", "Phone 2a", "Black", 8, 23999);

		MobilePhone m21 = new MobilePhone("Samsung", "Galaxy S23", "Green", 8, 64999);
		MobilePhone m22 = new MobilePhone("Apple", "iPhone 13", "Pink", 4, 49999);
		MobilePhone m23 = new MobilePhone("OnePlus", "OnePlus 11", "Black", 16, 56999);
		MobilePhone m24 = new MobilePhone("Xiaomi", "Xiaomi 14", "White", 12, 69999);
		MobilePhone m25 = new MobilePhone("Vivo", "Vivo X100", "Blue", 16, 63999);
		MobilePhone m26 = new MobilePhone("Oppo", "Find X7", "Green", 16, 59999);
		MobilePhone m27 = new MobilePhone("Realme", "GT Neo 6", "Silver", 12, 34999);
		MobilePhone m28 = new MobilePhone("Motorola", "Edge 40", "Black", 8, 29999);
		MobilePhone m29 = new MobilePhone("Google", "Pixel 7", "White", 8, 44999);
		MobilePhone m30 = new MobilePhone("Nothing", "Phone 1", "White", 8, 29999);

		MobilePhone m31 = new MobilePhone("Samsung", "Galaxy M34", "Blue", 6, 18999);
		MobilePhone m32 = new MobilePhone("Apple", "iPhone 15 Pro", "Titanium", 8, 129999);
		MobilePhone m33 = new MobilePhone("OnePlus", "Nord 3", "Green", 16, 33999);
		MobilePhone m34 = new MobilePhone("Xiaomi", "Poco X6", "Black", 12, 22999);
		MobilePhone m35 = new MobilePhone("Vivo", "Vivo T3", "Purple", 8, 19999);
		MobilePhone m36 = new MobilePhone("Oppo", "A79", "Green", 8, 17999);
		MobilePhone m37 = new MobilePhone("Realme", "Realme 12 Pro", "Beige", 8, 26999);
		MobilePhone m38 = new MobilePhone("Motorola", "Moto Edge 50 Pro", "Black", 12, 31999);
		MobilePhone m39 = new MobilePhone("Google", "Pixel 7a", "Charcoal", 8, 39999);
		MobilePhone m40 = new MobilePhone("Nothing", "Phone 3a", "White", 12, 27999);

		MobilePhone m41 = new MobilePhone("Samsung", "Galaxy Z Flip 5", "Cream", 8, 99999);
		MobilePhone m42 = new MobilePhone("Apple", "iPhone 15 Plus", "Yellow", 8, 79999);
		MobilePhone m43 = new MobilePhone("OnePlus", "Open", "Green", 16, 139999);
		MobilePhone m44 = new MobilePhone("Xiaomi", "Mix Fold 3", "Black", 16, 129999);
		MobilePhone m45 = new MobilePhone("Vivo", "X90 Pro", "Black", 12, 59999);
		MobilePhone m46 = new MobilePhone("Oppo", "Reno 12", "Gold", 12, 32999);
		MobilePhone m47 = new MobilePhone("Realme", "GT 5 Pro", "White", 16, 44999);
		MobilePhone m48 = new MobilePhone("Motorola", "Razr 50", "Orange", 12, 69999);
		MobilePhone m49 = new MobilePhone("Google", "Pixel 9", "Obsidian", 12, 79999);
		MobilePhone m50 = new MobilePhone("Nothing", "Phone 3", "Black", 12, 49999);
		
		System.out.println("========================MobilePhone 1 Details=======================");
		System.out.println("Object Reference is: " + m1);
		System.out.println("Brand is: " + m1.getBrand());
		System.out.println("Model is: " + m1.getModel());
		System.out.println("Color is: " + m1.getColor());
		System.out.println("RAM is: " + m1.getRam());
		System.out.println("Price is: " + m1.getPrice());
		
		System.out.println("========================MobilePhone 2 Details=======================");
		System.out.println("Object Reference is: " + m2);
		System.out.println("Brand is: " + m2.getBrand());
		System.out.println("Model is: " + m2.getModel());
		System.out.println("Color is: " + m2.getColor());
		System.out.println("RAM is: " + m2.getRam());
		System.out.println("Price is: " + m2.getPrice());

		System.out.println("========================MobilePhone 3 Details=======================");
		System.out.println("Object Reference is: " + m3);
		System.out.println("Brand is: " + m3.getBrand());
		System.out.println("Model is: " + m3.getModel());
		System.out.println("Color is: " + m3.getColor());
		System.out.println("RAM is: " + m3.getRam());
		System.out.println("Price is: " + m3.getPrice());

		System.out.println("========================MobilePhone 4 Details=======================");
		System.out.println("Object Reference is: " + m4);
		System.out.println("Brand is: " + m4.getBrand());
		System.out.println("Model is: " + m4.getModel());
		System.out.println("Color is: " + m4.getColor());
		System.out.println("RAM is: " + m4.getRam());
		System.out.println("Price is: " + m4.getPrice());

		System.out.println("========================MobilePhone 5 Details=======================");
		System.out.println("Object Reference is: " + m5);
		System.out.println("Brand is: " + m5.getBrand());
		System.out.println("Model is: " + m5.getModel());
		System.out.println("Color is: " + m5.getColor());
		System.out.println("RAM is: " + m5.getRam());
		System.out.println("Price is: " + m5.getPrice());

		System.out.println("========================MobilePhone 6 Details=======================");
		System.out.println("Object Reference is: " + m6);
		System.out.println("Brand is: " + m6.getBrand());
		System.out.println("Model is: " + m6.getModel());
		System.out.println("Color is: " + m6.getColor());
		System.out.println("RAM is: " + m6.getRam());
		System.out.println("Price is: " + m6.getPrice());

		System.out.println("========================MobilePhone 7 Details=======================");
		System.out.println("Object Reference is: " + m7);
		System.out.println("Brand is: " + m7.getBrand());
		System.out.println("Model is: " + m7.getModel());
		System.out.println("Color is: " + m7.getColor());
		System.out.println("RAM is: " + m7.getRam());
		System.out.println("Price is: " + m7.getPrice());

		System.out.println("========================MobilePhone 8 Details=======================");
		System.out.println("Object Reference is: " + m8);
		System.out.println("Brand is: " + m8.getBrand());
		System.out.println("Model is: " + m8.getModel());
		System.out.println("Color is: " + m8.getColor());
		System.out.println("RAM is: " + m8.getRam());
		System.out.println("Price is: " + m8.getPrice());

		System.out.println("========================MobilePhone 9 Details=======================");
		System.out.println("Object Reference is: " + m9);
		System.out.println("Brand is: " + m9.getBrand());
		System.out.println("Model is: " + m9.getModel());
		System.out.println("Color is: " + m9.getColor());
		System.out.println("RAM is: " + m9.getRam());
		System.out.println("Price is: " + m9.getPrice());

		System.out.println("========================MobilePhone 10 Details=======================");
		System.out.println("Object Reference is: " + m10);
		System.out.println("Brand is: " + m10.getBrand());
		System.out.println("Model is: " + m10.getModel());
		System.out.println("Color is: " + m10.getColor());
		System.out.println("RAM is: " + m10.getRam());
		System.out.println("Price is: " + m10.getPrice());

		System.out.println("========================MobilePhone 11 Details=======================");
		System.out.println("Object Reference is: " + m11);
		System.out.println("Brand is: " + m11.getBrand());
		System.out.println("Model is: " + m11.getModel());
		System.out.println("Color is: " + m11.getColor());
		System.out.println("RAM is: " + m11.getRam());
		System.out.println("Price is: " + m11.getPrice());

		System.out.println("========================MobilePhone 12 Details=======================");
		System.out.println("Object Reference is: " + m12);
		System.out.println("Brand is: " + m12.getBrand());
		System.out.println("Model is: " + m12.getModel());
		System.out.println("Color is: " + m12.getColor());
		System.out.println("RAM is: " + m12.getRam());
		System.out.println("Price is: " + m12.getPrice());

		System.out.println("========================MobilePhone 13 Details=======================");
		System.out.println("Object Reference is: " + m13);
		System.out.println("Brand is: " + m13.getBrand());
		System.out.println("Model is: " + m13.getModel());
		System.out.println("Color is: " + m13.getColor());
		System.out.println("RAM is: " + m13.getRam());
		System.out.println("Price is: " + m13.getPrice());

		System.out.println("========================MobilePhone 14 Details=======================");
		System.out.println("Object Reference is: " + m14);
		System.out.println("Brand is: " + m14.getBrand());
		System.out.println("Model is: " + m14.getModel());
		System.out.println("Color is: " + m14.getColor());
		System.out.println("RAM is: " + m14.getRam());
		System.out.println("Price is: " + m14.getPrice());

		System.out.println("========================MobilePhone 15 Details=======================");
		System.out.println("Object Reference is: " + m15);
		System.out.println("Brand is: " + m15.getBrand());
		System.out.println("Model is: " + m15.getModel());
		System.out.println("Color is: " + m15.getColor());
		System.out.println("RAM is: " + m15.getRam());
		System.out.println("Price is: " + m15.getPrice());

		System.out.println("========================MobilePhone 16 Details=======================");
		System.out.println("Object Reference is: " + m16);
		System.out.println("Brand is: " + m16.getBrand());
		System.out.println("Model is: " + m16.getModel());
		System.out.println("Color is: " + m16.getColor());
		System.out.println("RAM is: " + m16.getRam());
		System.out.println("Price is: " + m16.getPrice());

		System.out.println("========================MobilePhone 17 Details=======================");
		System.out.println("Object Reference is: " + m17);
		System.out.println("Brand is: " + m17.getBrand());
		System.out.println("Model is: " + m17.getModel());
		System.out.println("Color is: " + m17.getColor());
		System.out.println("RAM is: " + m17.getRam());
		System.out.println("Price is: " + m17.getPrice());

		System.out.println("========================MobilePhone 18 Details=======================");
		System.out.println("Object Reference is: " + m18);
		System.out.println("Brand is: " + m18.getBrand());
		System.out.println("Model is: " + m18.getModel());
		System.out.println("Color is: " + m18.getColor());
		System.out.println("RAM is: " + m18.getRam());
		System.out.println("Price is: " + m18.getPrice());

		System.out.println("========================MobilePhone 19 Details=======================");
		System.out.println("Object Reference is: " + m19);
		System.out.println("Brand is: " + m19.getBrand());
		System.out.println("Model is: " + m19.getModel());
		System.out.println("Color is: " + m19.getColor());
		System.out.println("RAM is: " + m19.getRam());
		System.out.println("Price is: " + m19.getPrice());

		System.out.println("========================MobilePhone 20 Details=======================");
		System.out.println("Object Reference is: " + m20);
		System.out.println("Brand is: " + m20.getBrand());
		System.out.println("Model is: " + m20.getModel());
		System.out.println("Color is: " + m20.getColor());
		System.out.println("RAM is: " + m20.getRam());
		System.out.println("Price is: " + m20.getPrice());

		System.out.println("========================MobilePhone 21 Details=======================");
		System.out.println("Object Reference is: " + m21);
		System.out.println("Brand is: " + m21.getBrand());
		System.out.println("Model is: " + m21.getModel());
		System.out.println("Color is: " + m21.getColor());
		System.out.println("RAM is: " + m21.getRam());
		System.out.println("Price is: " + m21.getPrice());

		System.out.println("========================MobilePhone 22 Details=======================");
		System.out.println("Object Reference is: " + m22);
		System.out.println("Brand is: " + m22.getBrand());
		System.out.println("Model is: " + m22.getModel());
		System.out.println("Color is: " + m22.getColor());
		System.out.println("RAM is: " + m22.getRam());
		System.out.println("Price is: " + m22.getPrice());

		System.out.println("========================MobilePhone 23 Details=======================");
		System.out.println("Object Reference is: " + m23);
		System.out.println("Brand is: " + m23.getBrand());
		System.out.println("Model is: " + m23.getModel());
		System.out.println("Color is: " + m23.getColor());
		System.out.println("RAM is: " + m23.getRam());
		System.out.println("Price is: " + m23.getPrice());

		System.out.println("========================MobilePhone 24 Details=======================");
		System.out.println("Object Reference is: " + m24);
		System.out.println("Brand is: " + m24.getBrand());
		System.out.println("Model is: " + m24.getModel());
		System.out.println("Color is: " + m24.getColor());
		System.out.println("RAM is: " + m24.getRam());
		System.out.println("Price is: " + m24.getPrice());

		System.out.println("========================MobilePhone 25 Details=======================");
		System.out.println("Object Reference is: " + m25);
		System.out.println("Brand is: " + m25.getBrand());
		System.out.println("Model is: " + m25.getModel());
		System.out.println("Color is: " + m25.getColor());
		System.out.println("RAM is: " + m25.getRam());
		System.out.println("Price is: " + m25.getPrice());

		System.out.println("========================MobilePhone 26 Details=======================");
		System.out.println("Object Reference is: " + m26);
		System.out.println("Brand is: " + m26.getBrand());
		System.out.println("Model is: " + m26.getModel());
		System.out.println("Color is: " + m26.getColor());
		System.out.println("RAM is: " + m26.getRam());
		System.out.println("Price is: " + m26.getPrice());

		System.out.println("========================MobilePhone 27 Details=======================");
		System.out.println("Object Reference is: " + m27);
		System.out.println("Brand is: " + m27.getBrand());
		System.out.println("Model is: " + m27.getModel());
		System.out.println("Color is: " + m27.getColor());
		System.out.println("RAM is: " + m27.getRam());
		System.out.println("Price is: " + m27.getPrice());

		System.out.println("========================MobilePhone 28 Details=======================");
		System.out.println("Object Reference is: " + m28);
		System.out.println("Brand is: " + m28.getBrand());
		System.out.println("Model is: " + m28.getModel());
		System.out.println("Color is: " + m28.getColor());
		System.out.println("RAM is: " + m28.getRam());
		System.out.println("Price is: " + m28.getPrice());

		System.out.println("========================MobilePhone 29 Details=======================");
		System.out.println("Object Reference is: " + m29);
		System.out.println("Brand is: " + m29.getBrand());
		System.out.println("Model is: " + m29.getModel());
		System.out.println("Color is: " + m29.getColor());
		System.out.println("RAM is: " + m29.getRam());
		System.out.println("Price is: " + m29.getPrice());

		System.out.println("========================MobilePhone 30 Details=======================");
		System.out.println("Object Reference is: " + m30);
		System.out.println("Brand is: " + m30.getBrand());
		System.out.println("Model is: " + m30.getModel());
		System.out.println("Color is: " + m30.getColor());
		System.out.println("RAM is: " + m30.getRam());
		System.out.println("Price is: " + m30.getPrice());

		System.out.println("========================MobilePhone 31 Details=======================");
		System.out.println("Object Reference is: " + m31);
		System.out.println("Brand is: " + m31.getBrand());
		System.out.println("Model is: " + m31.getModel());
		System.out.println("Color is: " + m31.getColor());
		System.out.println("RAM is: " + m31.getRam());
		System.out.println("Price is: " + m31.getPrice());

		System.out.println("========================MobilePhone 32 Details=======================");
		System.out.println("Object Reference is: " + m32);
		System.out.println("Brand is: " + m32.getBrand());
		System.out.println("Model is: " + m32.getModel());
		System.out.println("Color is: " + m32.getColor());
		System.out.println("RAM is: " + m32.getRam());
		System.out.println("Price is: " + m32.getPrice());

		System.out.println("========================MobilePhone 33 Details=======================");
		System.out.println("Object Reference is: " + m33);
		System.out.println("Brand is: " + m33.getBrand());
		System.out.println("Model is: " + m33.getModel());
		System.out.println("Color is: " + m33.getColor());
		System.out.println("RAM is: " + m33.getRam());
		System.out.println("Price is: " + m33.getPrice());

		System.out.println("========================MobilePhone 34 Details=======================");
		System.out.println("Object Reference is: " + m34);
		System.out.println("Brand is: " + m34.getBrand());
		System.out.println("Model is: " + m34.getModel());
		System.out.println("Color is: " + m34.getColor());
		System.out.println("RAM is: " + m34.getRam());
		System.out.println("Price is: " + m34.getPrice());

		System.out.println("========================MobilePhone 35 Details=======================");
		System.out.println("Object Reference is: " + m35);
		System.out.println("Brand is: " + m35.getBrand());
		System.out.println("Model is: " + m35.getModel());
		System.out.println("Color is: " + m35.getColor());
		System.out.println("RAM is: " + m35.getRam());
		System.out.println("Price is: " + m35.getPrice());

		System.out.println("========================MobilePhone 36 Details=======================");
		System.out.println("Object Reference is: " + m36);
		System.out.println("Brand is: " + m36.getBrand());
		System.out.println("Model is: " + m36.getModel());
		System.out.println("Color is: " + m36.getColor());
		System.out.println("RAM is: " + m36.getRam());
		System.out.println("Price is: " + m36.getPrice());

		System.out.println("========================MobilePhone 37 Details=======================");
		System.out.println("Object Reference is: " + m37);
		System.out.println("Brand is: " + m37.getBrand());
		System.out.println("Model is: " + m37.getModel());
		System.out.println("Color is: " + m37.getColor());
		System.out.println("RAM is: " + m37.getRam());
		System.out.println("Price is: " + m37.getPrice());

		System.out.println("========================MobilePhone 38 Details=======================");
		System.out.println("Object Reference is: " + m38);
		System.out.println("Brand is: " + m38.getBrand());
		System.out.println("Model is: " + m38.getModel());
		System.out.println("Color is: " + m38.getColor());
		System.out.println("RAM is: " + m38.getRam());
		System.out.println("Price is: " + m38.getPrice());

		System.out.println("========================MobilePhone 39 Details=======================");
		System.out.println("Object Reference is: " + m39);
		System.out.println("Brand is: " + m39.getBrand());
		System.out.println("Model is: " + m39.getModel());
		System.out.println("Color is: " + m39.getColor());
		System.out.println("RAM is: " + m39.getRam());
		System.out.println("Price is: " + m39.getPrice());

		System.out.println("========================MobilePhone 40 Details=======================");
		System.out.println("Object Reference is: " + m40);
		System.out.println("Brand is: " + m40.getBrand());
		System.out.println("Model is: " + m40.getModel());
		System.out.println("Color is: " + m40.getColor());
		System.out.println("RAM is: " + m40.getRam());
		System.out.println("Price is: " + m40.getPrice());

		System.out.println("========================MobilePhone 41 Details=======================");
		System.out.println("Object Reference is: " + m41);
		System.out.println("Brand is: " + m41.getBrand());
		System.out.println("Model is: " + m41.getModel());
		System.out.println("Color is: " + m41.getColor());
		System.out.println("RAM is: " + m41.getRam());
		System.out.println("Price is: " + m41.getPrice());

		System.out.println("========================MobilePhone 42 Details=======================");
		System.out.println("Object Reference is: " + m42);
		System.out.println("Brand is: " + m42.getBrand());
		System.out.println("Model is: " + m42.getModel());
		System.out.println("Color is: " + m42.getColor());
		System.out.println("RAM is: " + m42.getRam());
		System.out.println("Price is: " + m42.getPrice());

		System.out.println("========================MobilePhone 43 Details=======================");
		System.out.println("Object Reference is: " + m43);
		System.out.println("Brand is: " + m43.getBrand());
		System.out.println("Model is: " + m43.getModel());
		System.out.println("Color is: " + m43.getColor());
		System.out.println("RAM is: " + m43.getRam());
		System.out.println("Price is: " + m43.getPrice());

		System.out.println("========================MobilePhone 44 Details=======================");
		System.out.println("Object Reference is: " + m44);
		System.out.println("Brand is: " + m44.getBrand());
		System.out.println("Model is: " + m44.getModel());
		System.out.println("Color is: " + m44.getColor());
		System.out.println("RAM is: " + m44.getRam());
		System.out.println("Price is: " + m44.getPrice());

		System.out.println("========================MobilePhone 45 Details=======================");
		System.out.println("Object Reference is: " + m45);
		System.out.println("Brand is: " + m45.getBrand());
		System.out.println("Model is: " + m45.getModel());
		System.out.println("Color is: " + m45.getColor());
		System.out.println("RAM is: " + m45.getRam());
		System.out.println("Price is: " + m45.getPrice());

		System.out.println("========================MobilePhone 46 Details=======================");
		System.out.println("Object Reference is: " + m46);
		System.out.println("Brand is: " + m46.getBrand());
		System.out.println("Model is: " + m46.getModel());
		System.out.println("Color is: " + m46.getColor());
		System.out.println("RAM is: " + m46.getRam());
		System.out.println("Price is: " + m46.getPrice());

		System.out.println("========================MobilePhone 47 Details=======================");
		System.out.println("Object Reference is: " + m47);
		System.out.println("Brand is: " + m47.getBrand());
		System.out.println("Model is: " + m47.getModel());
		System.out.println("Color is: " + m47.getColor());
		System.out.println("RAM is: " + m47.getRam());
		System.out.println("Price is: " + m47.getPrice());

		System.out.println("========================MobilePhone 48 Details=======================");
		System.out.println("Object Reference is: " + m48);
		System.out.println("Brand is: " + m48.getBrand());
		System.out.println("Model is: " + m48.getModel());
		System.out.println("Color is: " + m48.getColor());
		System.out.println("RAM is: " + m48.getRam());
		System.out.println("Price is: " + m48.getPrice());

		System.out.println("========================MobilePhone 49 Details=======================");
		System.out.println("Object Reference is: " + m49);
		System.out.println("Brand is: " + m49.getBrand());
		System.out.println("Model is: " + m49.getModel());
		System.out.println("Color is: " + m49.getColor());
		System.out.println("RAM is: " + m49.getRam());
		System.out.println("Price is: " + m49.getPrice());

		System.out.println("========================MobilePhone 50 Details=======================");
		System.out.println("Object Reference is: " + m50);
		System.out.println("Brand is: " + m50.getBrand());
		System.out.println("Model is: " + m50.getModel());
		System.out.println("Color is: " + m50.getColor());
		System.out.println("RAM is: " + m50.getRam());
		System.out.println("Price is: " + m50.getPrice());
		
		System.out.println("===============================Main Method Ends=================================");
	}

}
