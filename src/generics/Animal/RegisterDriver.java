package generics.Animal;

public class RegisterDriver {

	public static void main(String[] args) {
		
		Register<Integer, String> r1 = new Register<>(10, "Mohan");
		Register<Double, Integer> r2 = new Register<>(2.01457945613, 20);
		Register<Boolean, Float> r3 = new Register<>(true, 20.5645f);
		Register<String, Integer> r4=new Register<>("John", 2);
		Register<Double, String> r5=new Register<>(3.5, "Rohan");
		
		System.out.println(r1.getDetails());
		System.out.println(r1.getValue());
		System.out.println(r1.getKey());
		System.out.println("==================");
		System.out.println(r2.getDetails());
		System.out.println(r2.getKey());
		System.out.println(r2.getValue());
		System.out.println("==================");
		System.out.println(r3.getDetails());
		System.out.println(r3.getKey());
		System.out.println(r3.getValue());
		System.out.println("==================");
		System.out.println(r4.getDetails());
		System.out.println(r4.getKey());
		System.out.println(r4.getValue());
		System.out.println("==================");
		System.out.println(r5.getDetails());
		System.out.println(r5.getClass());
		System.out.println(r5.getKey());


	}

}
