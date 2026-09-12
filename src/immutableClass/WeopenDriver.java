package immutableClass;

public class WeopenDriver {

	public static void main(String[] args) {
		Weopen w1 = new Weopen("Gun", 500000, 75.0);
		Weopen w2 = new Weopen("Bomb", 600000, 56.3);
		Weopen w3 = new Weopen("Pistol", 700000, 53.0);
		Weopen w4 = new Weopen("Rifle", 800000, 89.7);
		Weopen w5 = new Weopen("MMG", 300000, 78.9);
		Weopen w6 = new Weopen("Missile", 900000, 69.0);
		
		System.out.println("==========Weopen w1 Details===========");
		System.out.println("ObjectReference is: " +w1);
		System.out.println("Name is: " +w1.getName());
		System.out.println("Price is: " +w1.getPrice());
		System.out.println("Weight is: " +w1.getWeight());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Weopen w2 Details===========");
		System.out.println("ObjectReference is: " +w2);
		System.out.println("Name is: " +w2.getName());
		System.out.println("Price is: " +w2.getPrice());
		System.out.println("Weight is: " +w2.getWeight());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Weopen w3 Details===========");
		System.out.println("ObjectReference is: " +w3);
		System.out.println("Name is: " +w3.getName());
		System.out.println("Price is: " +w3.getPrice());
		System.out.println("Weight is: " +w3.getWeight());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Weopen w4 Details===========");
		System.out.println("ObjectReference is: " +w4);
		System.out.println("Name is: " +w4.getName());
		System.out.println("Price is: " +w4.getPrice());
		System.out.println("Weight is: " +w4.getWeight());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Weopen w5 Details===========");
		System.out.println("ObjectReference is: " +w5);
		System.out.println("Name is: " +w5.getName());
		System.out.println("Price is: " +w5.getPrice());
		System.out.println("Weight is: " +w5.getWeight());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Weopen w6 Details===========");
		System.out.println("ObjectReference is: " +w6);
		System.out.println("Name is: " +w6.getName());
		System.out.println("Price is: " +w6.getPrice());
		System.out.println("Weight is: " +w6.getWeight());

	}

}
