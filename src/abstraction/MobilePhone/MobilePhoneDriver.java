package abstraction.MobilePhone;

public class MobilePhoneDriver {

	public static void main(String[] args) {

		MobilePhone m1 = new Samsung(101, "Samsung", "GalaxyS24", "Black", 79999, "Android", "Snapdragon", 12, 256,
				"5G", "50MP", "Dyanamic Amoled", 4000, "Fingerprint", true);
		MobilePhone m2 = new Samsung(102, "Samsung", "GalaxyS24Ultra", "Titanium Gray", 129999, "Android",
				"Snapdragon 8 Gen 3", 12, 512, "5G", "200MP", "Dynamic AMOLED 2X", 5000, "Fingerprint", true);
		MobilePhone m3 = new Samsung(103, "Samsung", "GalaxyS23", "Green", 69999, "Android", "Snapdragon 8 Gen 2", 8,
				256, "5G", "50MP", "Dynamic AMOLED", 3900, "Fingerprint", true);
		MobilePhone m4 = new Samsung(104, "Samsung", "GalaxyA55", "Blue", 44999, "Android", "Exynos 1480", 8, 128, "5G",
				"50MP", "Super AMOLED", 5000, "Fingerprint", false);
		MobilePhone m5 = new Samsung(105, "Samsung", "GalaxyA35", "Awesome Navy", 33999, "Android", "Exynos 1380", 8,
				128, "5G", "50MP", "Super AMOLED", 5000, "Fingerprint", false);
		MobilePhone m6 = new Samsung(106, "Samsung", "GalaxyS22", "Phantom Black", 59999, "Android",
				"Snapdragon 8 Gen 1", 8, 128, "5G", "50MP", "Dynamic AMOLED", 3700, "Fingerprint", true);
		MobilePhone m7 = new Samsung(107, "Samsung", "GalaxyNote20", "Mystic Bronze", 64999, "Android", "Exynos 990", 8,
				256, "5G", "64MP", "Super AMOLED Plus", 4300, "Fingerprint", true);
		MobilePhone m8 = new Samsung(108, "Samsung", "GalaxyZFlip5", "Lavender", 99999, "Android", "Snapdragon 8 Gen 2",
				8, 256, "5G", "12MP", "Dynamic AMOLED 2X", 3700, "Fingerprint", true);
		MobilePhone m9 = new Samsung(109, "Samsung", "GalaxyZFold5", "Icy Blue", 154999, "Android",
				"Snapdragon 8 Gen 2", 12, 512, "5G", "50MP", "Dynamic AMOLED 2X", 4400, "Fingerprint", true);
		MobilePhone m10 = new Samsung(110, "Samsung", "GalaxyM55", "Light Green", 32999, "Android",
				"Snapdragon 7 Gen 1", 8, 256, "5G", "50MP", "Super AMOLED Plus", 5000, "Fingerprint", true);
		
		System.out.println(m1);
		System.out.println("==================");
		System.out.println(m2);
		System.out.println("==================");
		System.out.println(m3);
		System.out.println("==================");
		System.out.println(m4);
		System.out.println("==================");
		System.out.println(m5);
		System.out.println("==================");
		System.out.println(m6);
		System.out.println("==================");
		System.out.println(m7);
		System.out.println("==================");
		System.out.println(m8);
		System.out.println("==================");
		System.out.println(m9);
		System.out.println("==================");
		System.out.println(m10);
		System.out.println("==================");
		
		System.out.println("====================m1 Details=======================");
		m1.makeCall();
		m1.sendMessage();
		m1.takePhoto();
		System.out.println("====================m2 Details=======================");
		m2.makeCall();
		m2.sendMessage();
		m2.takePhoto();
		System.out.println("====================m3 Details=======================");
		m3.makeCall();
		m3.sendMessage();
		m3.takePhoto();
		System.out.println("====================m4 Details=======================");
		m4.makeCall();
		m4.sendMessage();
		m4.takePhoto();
		System.out.println("====================m5 Details=======================");
		m5.makeCall();
		m5.sendMessage();
		m5.takePhoto();
		System.out.println("====================m6 Details=======================");
		m6.makeCall();
		m6.sendMessage();
		m6.takePhoto();
		System.out.println("====================m7 Details=======================");
		m7.makeCall();
		m7.sendMessage();
		m7.takePhoto();
		System.out.println("====================m8 Details=======================");
		m8.makeCall();
		m8.sendMessage();
		m8.takePhoto();
		System.out.println("====================m9 Details=======================");
		m9.makeCall();
		m9.sendMessage();
		m9.takePhoto();
		System.out.println("====================m10 Details=======================");
		m10.makeCall();
		m10.sendMessage();
		m10.takePhoto();

		MobilePhone m11 = new Apple(402, "Apple", "iPhone 16 Pro Max", "Natural Titanium", 144999, "iOS", "A18 Pro", 8,
				512, "5G", "48MP", "Super Retina XDR", 4685, "Face ID", true);
		MobilePhone m12 = new Apple(402, "Apple", "iPhone 16 Pro Max", "Natural Titanium", 144999, "iOS", "A18 Pro", 8,
				512, "5G", "48MP", "Super Retina XDR", 4685, "Face ID", true);
		MobilePhone m13 = new Apple(403, "Apple", "iPhone 16 Pro", "Desert Titanium", 119999, "iOS", "A18 Pro", 8, 256,
				"5G", "48MP", "Super Retina XDR", 3582, "Face ID", true);
		MobilePhone m14 = new Apple(404, "Apple", "iPhone 16 Plus", "Ultramarine", 89999, "iOS", "A18", 8, 256, "5G",
				"48MP", "Super Retina XDR", 4674, "Face ID", true);
		MobilePhone m15 = new Apple(405, "Apple", "iPhone 16", "Black", 79999, "iOS", "A18", 8, 128, "5G", "48MP",
				"Super Retina XDR", 3561, "Face ID", true);
		MobilePhone m16 = new Apple(406, "Apple", "iPhone 15 Pro Max", "Blue Titanium", 139999, "iOS", "A17 Pro", 8,
				512, "5G", "48MP", "Super Retina XDR", 4441, "Face ID", true);
		MobilePhone m17 = new Apple(407, "Apple", "iPhone 15 Plus", "Pink", 79999, "iOS", "A16 Bionic", 6, 128, "5G",
				"48MP", "Super Retina XDR", 4383, "Face ID", true);
		MobilePhone m18 = new Apple(408, "Apple", "iPhone 15", "Blue", 69999, "iOS", "A16 Bionic", 6, 128, "5G", "48MP",
				"Super Retina XDR", 3349, "Face ID", true);
		MobilePhone m19 = new Apple(409, "Apple", "iPhone 14 Pro Max", "Deep Purple", 129999, "iOS", "A16 Bionic", 6,
				256, "5G", "48MP", "Super Retina XDR", 4323, "Face ID", true);
		MobilePhone m20 = new Apple(410, "Apple", "iPhone 14", "Midnight", 59999, "iOS", "A15 Bionic", 6, 128, "5G",
				"12MP", "Super Retina XDR", 3279, "Face ID", true);
		
		System.out.println(m11);
		System.out.println("==================");
		System.out.println(m12);
		System.out.println("==================");
		System.out.println(m13);
		System.out.println("==================");
		System.out.println(m14);
		System.out.println("==================");
		System.out.println(m15);
		System.out.println("==================");
		System.out.println(m16);
		System.out.println("==================");
		System.out.println(m17);
		System.out.println("==================");
		System.out.println(m18);
		System.out.println("==================");
		System.out.println(m19);
		System.out.println("==================");
		System.out.println(m20);
		
		System.out.println("====================m11 Details=======================");
		m11.makeCall();
		m11.sendMessage();
		m11.takePhoto();
		System.out.println("====================m12 Details=======================");
		m12.makeCall();
		m12.sendMessage();
		m12.takePhoto();
		System.out.println("====================m13 Details=======================");
		m13.makeCall();
		m13.sendMessage();
		m13.takePhoto();
		System.out.println("====================m14 Details=======================");
		m14.makeCall();
		m14.sendMessage();
		m14.takePhoto();
		System.out.println("====================m15 Details=======================");
		m15.makeCall();
		m15.sendMessage();
		m15.takePhoto();
		System.out.println("====================m16 Details=======================");
		m16.makeCall();
		m16.sendMessage();
		m16.takePhoto();
		System.out.println("====================m17 Details=======================");
		m17.makeCall();
		m17.sendMessage();
		m17.takePhoto();
		System.out.println("====================m18 Details=======================");
		m18.makeCall();
		m18.sendMessage();
		m18.takePhoto();
		System.out.println("====================m19 Details=======================");
		m19.makeCall();
		m19.sendMessage();
		m19.takePhoto();
		System.out.println("====================m20 Details=======================");
		m20.makeCall();
		m20.sendMessage();
		m20.takePhoto();

		MobilePhone m21 = new OnePlus(403, "OnePlus", "OnePlus 13", "Midnight Black", 69999, "Android",
				"Snapdragon 8 Elite", 16, 512, "5G", "50MP", "LTPO AMOLED", 6000, "100W SUPERVOOC", true);
		MobilePhone m22 = new OnePlus(404, "OnePlus", "OnePlus 13R", "Nebula Noir", 42999, "Android",
				"Snapdragon 8 Gen 3", 12, 256, "5G", "50MP", "AMOLED", 6000, "80W SUPERVOOC", true);
		MobilePhone m23 = new OnePlus(405, "OnePlus", "OnePlus 12", "Silky Black", 64999, "Android",
				"Snapdragon 8 Gen 3", 12, 256, "5G", "50MP", "LTPO AMOLED", 5400, "100W SUPERVOOC", true);
		MobilePhone m24 = new OnePlus(406, "OnePlus", "OnePlus 12R", "Cool Blue", 39999, "Android",
				"Snapdragon 8 Gen 2", 16, 256, "5G", "50MP", "LTPO AMOLED", 5500, "100W SUPERVOOC", true);
		MobilePhone m25 = new OnePlus(407, "OnePlus", "OnePlus 11", "Titan Black", 56999, "Android",
				"Snapdragon 8 Gen 2", 16, 256, "5G", "50MP", "AMOLED", 5000, "100W SUPERVOOC", true);
		MobilePhone m26 = new OnePlus(408, "OnePlus", "OnePlus 11R", "Sonic Black", 39999, "Android",
				"Snapdragon 8+ Gen 1", 16, 256, "5G", "50MP", "Super Fluid AMOLED", 5000, "100W SUPERVOOC", true);
		MobilePhone m27 = new OnePlus(409, "OnePlus", "OnePlus 10 Pro", "Emerald Forest", 66999, "Android",
				"Snapdragon 8 Gen 1", 12, 256, "5G", "48MP", "LTPO AMOLED", 5000, "80W SUPERVOOC", true);
		MobilePhone m28 = new OnePlus(410, "OnePlus", "OnePlus 10T", "Moonstone Black", 49999, "Android",
				"Snapdragon 8+ Gen 1", 12, 256, "5G", "50MP", "Fluid AMOLED", 4800, "150W SUPERVOOC", true);
		MobilePhone m29 = new OnePlus(411, "OnePlus", "OnePlus 9 Pro", "Morning Mist", 64999, "Android",
				"Snapdragon 888", 12, 256, "5G", "48MP", "Fluid AMOLED", 4500, "65W Warp Charge", true);
		MobilePhone m30 = new OnePlus(412, "OnePlus", "OnePlus 9", "Winter Mist", 54999, "Android", "Snapdragon 888",
				12, 256, "5G", "48MP", "Fluid AMOLED", 4500, "65W Warp Charge", true);
		
		System.out.println(m21);
		System.out.println("==================");
		System.out.println(m22);
		System.out.println("==================");
		System.out.println(m23);
		System.out.println("==================");
		System.out.println(m24);
		System.out.println("==================");
		System.out.println(m25);
		System.out.println("==================");
		System.out.println(m26);
		System.out.println("==================");
		System.out.println(m27);
		System.out.println("==================");
		System.out.println(m28);
		System.out.println("==================");
		System.out.println(m29);
		System.out.println("==================");
		System.out.println(m30);
		
		System.out.println("====================m21 Details=======================");
		m21.makeCall();
		m21.sendMessage();
		m21.takePhoto();
		System.out.println("====================m22 Details=======================");
		m22.makeCall();
		m22.sendMessage();
		m22.takePhoto();
		System.out.println("====================m23 Details=======================");
		m23.makeCall();
		m23.sendMessage();
		m23.takePhoto();
		System.out.println("====================m24 Details=======================");
		m24.makeCall();
		m24.sendMessage();
		m24.takePhoto();
		System.out.println("====================m25 Details=======================");
		m25.makeCall();
		m25.sendMessage();
		m25.takePhoto();
		System.out.println("====================m26 Details=======================");
		m26.makeCall();
		m26.sendMessage();
		m26.takePhoto();
		System.out.println("====================m27 Details=======================");
		m27.makeCall();
		m27.sendMessage();
		m27.takePhoto();
		System.out.println("====================m28 Details=======================");
		m28.makeCall();
		m28.sendMessage();
		m28.takePhoto();
		System.out.println("====================m29 Details=======================");
		m29.makeCall();
		m29.sendMessage();
		m29.takePhoto();
		System.out.println("====================m30 Details=======================");
		m30.makeCall();
		m30.sendMessage();
		m30.takePhoto();

	}

}
