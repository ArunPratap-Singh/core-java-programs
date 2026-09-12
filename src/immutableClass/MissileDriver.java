package immutableClass;

public class MissileDriver {

	public static void main(String[] args) {
		
		Missile m1 = new Missile("Prithvi", "5000km", 50000, 2);
		Missile m2 = new Missile("Agni", "6000km", 60000, 3);
		Missile m3 = new Missile("Trishul", "7000km", 70000, 4);
		Missile m4 = new Missile("Naag", "8000km", 80000, 3);
		Missile m5 = new Missile("Akash", "9000km", 90000, 4);
		Missile m6 = new Missile("Agni Prime", "2000km", 20000, 3);
		
		System.out.println("============Missile m1 Details===============");
		System.out.println("ObjectReference is: " +m1);
		System.out.println("Name is: " +m1.getName());
		System.out.println("Range is: " +m1.getRange());
		System.out.println("Price is: " +m1.getPrice());
		System.out.println("Stages is: " +m1.getStages());
		
		System.out.println("====================================================");
		
		System.out.println("============Missile m2 Details===============");
		System.out.println("ObjectReference is: " +m2);
		System.out.println("Name is: " +m2.getName());
		System.out.println("Range is: " +m2.getRange());
		System.out.println("Price is: " +m2.getPrice());
		System.out.println("Stages is: " +m2.getStages());
		
		System.out.println("========================================================");
		
		System.out.println("============Missile m3 Details===============");
		System.out.println("ObjectReference is: " +m3);
		System.out.println("Name is: " +m3.getName());
		System.out.println("Range is: " +m3.getRange());
		System.out.println("Price is: " +m3.getPrice());
		System.out.println("Stages is: " +m3.getStages());
		
		System.out.println("=========================================================");
		
		System.out.println("============Missile m4 Details===============");
		System.out.println("ObjectReference is: " +m4);
		System.out.println("Name is: " +m4.getName());
		System.out.println("Range is: " +m4.getRange());
		System.out.println("Price is: " +m4.getPrice());
		System.out.println("Stages is: " +m4.getStages());
		
		System.out.println("=========================================================");
		
		System.out.println("============Missile m5 Details===============");
		System.out.println("ObjectReference is: " +m5);
		System.out.println("Name is: " +m5.getName());
		System.out.println("Range is: " +m5.getRange());
		System.out.println("Price is: " +m5.getPrice());
		System.out.println("Stages is: " +m5.getStages());
		
		System.out.println("=========================================================");
		
		System.out.println("============Missile m6 Details===============");
		System.out.println("ObjectReference is: " +m6);
		System.out.println("Name is: " +m6.getName());
		System.out.println("Range is: " +m6.getRange());
		System.out.println("Price is: " +m6.getPrice());
		System.out.println("Stages is: " +m6.getStages());

	}

}
