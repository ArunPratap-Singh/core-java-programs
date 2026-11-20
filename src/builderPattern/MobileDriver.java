package builderPattern;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile.Builder().setBrand("Samsung").setModel("Galaxy S21").setPrice(799.99).setColor("Phantom Gray").setRam(8).setStorage(128).build();
		
		Mobile m2 = new Mobile.Builder().setBrand("Apple").setModel("iPhone 15").setPrice(79999.00).setColor("Black").setRam(6).setStorage(128).build();

		Mobile m3 = new Mobile.Builder().setBrand("OnePlus").setModel("OnePlus 12").setPrice(64999.00).setColor("Silky Black").setRam(12).setStorage(256).build();

		Mobile m4 = new Mobile.Builder().setBrand("Redmi").setModel("Note 13 Pro").setPrice(24999.00).setColor("Midnight Black").setRam(8).setStorage(256).build();

		Mobile m5 = new Mobile.Builder().setBrand("Vivo").setModel("V30").setPrice(33999.00).setColor("Peacock Green").setRam(8).setStorage(256).build();

		Mobile m6 = new Mobile.Builder().setBrand("Oppo").setModel("Reno 11").setPrice(29999.00).setColor("Rock Grey").setRam(8).setStorage(128).build();

		Mobile m7 = new Mobile.Builder().setBrand("Realme").setModel("12 Pro").setPrice(25999.00).setColor("Submarine Blue").setRam(8).setStorage(256).build();

		Mobile m8 = new Mobile.Builder().setBrand("Motorola").setModel("Edge 50").setPrice(27999.00).setColor("Koala Grey").setRam(12).setStorage(256).build();

		Mobile m9 = new Mobile.Builder().setBrand("Google").setModel("Pixel 8").setPrice(69999.00).setColor("Obsidian").setRam(8).setStorage(128).build();

		Mobile m10 = new Mobile.Builder().setBrand("Nothing").setModel("Phone 2").setPrice(44999.00).setColor("Dark Grey").setRam(12).setStorage(256).build();

		Mobile m11 = new Mobile.Builder().setBrand("Samsung").setModel("Galaxy A55").setPrice(39999.00).setColor("Awesome Navy").setRam(8).setStorage(256).build();

		Mobile m12 = new Mobile.Builder().setBrand("Apple").setModel("iPhone 14").setPrice(59999.00).setColor("Blue").setRam(6).setStorage(128).build();

		Mobile m13 = new Mobile.Builder().setBrand("OnePlus").setModel("Nord CE 4").setPrice(24999.00).setColor("Celadon Marble").setRam(8).setStorage(128).build();

		Mobile m14 = new Mobile.Builder().setBrand("Redmi").setModel("Note 12").setPrice(16999.00).setColor("Ice Blue").setRam(6).setStorage(128).build();

		Mobile m15 = new Mobile.Builder().setBrand("Vivo").setModel("Y200").setPrice(21999.00).setColor("Desert Gold").setRam(8).setStorage(128).build();

		Mobile m16 = new Mobile.Builder().setBrand("Oppo").setModel("A79").setPrice(19999.00).setColor("Mystery Black").setRam(8).setStorage(128).build();

		Mobile m17 = new Mobile.Builder().setBrand("Realme").setModel("Narzo 70").setPrice(15999.00).setColor("Ice Blue").setRam(6).setStorage(128).build();

		Mobile m18 = new Mobile.Builder().setBrand("Motorola").setModel("G64").setPrice(14999.00).setColor("Pearl Blue").setRam(8).setStorage(128).build();

		Mobile m19 = new Mobile.Builder().setBrand("Google").setModel("Pixel 7a").setPrice(43999.00).setColor("Charcoal").setRam(8).setStorage(128).build();

		Mobile m20 = new Mobile.Builder().setBrand("Nothing").setModel("Phone 2a").setPrice(23999.00).setColor("White").setRam(8).setStorage(128).build();
		
		System.out.println(m1);
		System.out.println("====================");

		System.out.println(m2);
		System.out.println("====================");

		System.out.println(m3);
		System.out.println("====================");

		System.out.println(m4);
		System.out.println("====================");

		System.out.println(m5);
		System.out.println("====================");

		System.out.println(m6);
		System.out.println("====================");

		System.out.println(m7);
		System.out.println("====================");

		System.out.println(m8);
		System.out.println("====================");

		System.out.println(m9);
		System.out.println("====================");

		System.out.println(m10);
		System.out.println("====================");

		System.out.println(m11);
		System.out.println("====================");

		System.out.println(m12);
		System.out.println("====================");

		System.out.println(m13);
		System.out.println("====================");

		System.out.println(m14);
		System.out.println("====================");

		System.out.println(m15);
		System.out.println("====================");

		System.out.println(m16);
		System.out.println("====================");

		System.out.println(m17);
		System.out.println("====================");

		System.out.println(m18);
		System.out.println("====================");

		System.out.println(m19);
		System.out.println("====================");

		System.out.println(m20);
		
	}

}
