package pojo;

public class LaptopPojoDriver {

	public static void main(String[] args) {
		
		LaptopPojo l1 = new LaptopPojo("Lenovo", 50000, "5GB", "Silver");
		LaptopPojo l2 = new LaptopPojo("Dell", 60000, "8GB", "Grey");
		LaptopPojo l3 = new LaptopPojo("Asus", 65000, "12GB", "DarkGrey");
		LaptopPojo l4 = new LaptopPojo("HP", 45000, "4GB", "Blue");
		LaptopPojo l5 = new LaptopPojo("Motorola", 30000, "4GB", "SilverGrey");
		
		System.out.println("====================================");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);

	}

}
