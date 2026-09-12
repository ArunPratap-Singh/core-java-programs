package pojo;

public class WaterBottlePojoDriver {

	public static void main(String[] args) {
		WaterBottlePojo b1 = new WaterBottlePojo("Bailley", 20, "Mineral Water", "2Liter", "Tata" );
		WaterBottlePojo b2 = new WaterBottlePojo("Aquafina", 20, "Mineral Water", "2Liter", "Tata");
		WaterBottlePojo b3 = new WaterBottlePojo("Bisleri", 20, "Mineral Water", "2Liter", "Tata");
		WaterBottlePojo b4 = new WaterBottlePojo("Ocean", 40, "Mineral Water", "1Liter", "Tata");
		WaterBottlePojo b5 = new WaterBottlePojo("Himalayan Sparkling Water", 111, "Mineral Water", "2Liter", "Himalaya");
		
		System.out.println("=============================================");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}

}
