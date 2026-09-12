package pojo;

public class ShirtPojoDriver {

	public static void main(String[] args) {
		ShirtPojo s1 = new ShirtPojo("Zara", 500, "Cotton", "Red", "42CM");
		ShirtPojo s2 = new ShirtPojo("LiveSmart", 700, "Cotton", "Yellow", "44CM");
		ShirtPojo s3 = new ShirtPojo("Puma", 500, "Cotton", "Orange", "46CM");
		ShirtPojo s4 = new ShirtPojo("Levis", 1000, "Cotton", "White", "42CM");
		ShirtPojo s5 = new ShirtPojo("US POLO", 700, "Linen", "Fluorescent Pink", "40CM");
		
		System.out.println("============================================");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}

}
