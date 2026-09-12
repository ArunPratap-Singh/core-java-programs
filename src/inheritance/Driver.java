package inheritance;

public class Driver {

	public static void main(String[] args) {
		
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt("Zara", 1500, 1, 1234, "Red", "Cotton", "Half Sleeves", "xl");
		Shirt s3 = new Shirt("Puma", 500, 1, 1452, "Pink", "Cotton", "Full Sleeves", "xxl");
		Shirt s4 = new Shirt("LiveSmart", 3000, 2, 7894, "White", "Linen", "Half Sleeves", "l");
		Shirt s5 = new Shirt("Jockey", 4000, 2, 4569, "Orange", "Cotton", "Half Sleeves", "xxxl");
		Shirt s6 = new Shirt("Allen Solly", 5000, 2, 1259, "Blue", "Cotton", "Full Sleeves", "xl");
		Shirt s7 = new Shirt("Van Heusen", 12000, 5, 7811, "Yellow", "cotton", "Half Sleeves", "l");
		Shirt s8 = new Shirt("Peter England", 11000, 6, 7822, "Green", "Linen", "Full Sleeves", "xxl");
		
		System.out.println("======================================================================");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

	}

}
