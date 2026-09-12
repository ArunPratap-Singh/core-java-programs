package staticNonStaticBloc;

public class Program6 {

	int x;
	public static void main(String[] args) {
		
		System.out.println("This Is Main Method");
		
		Program6 p = new Program6();
		Program6 p1 = new Program6();
		System.out.println("Obj1 x is: " +p.x);
		System.out.println("Obj2 x is: " +p1.x);
		System.out.println("========================");
		System.out.println("Car x is: " +Car.x);
		System.out.println("=============================");
		Car c1 = new Car();
		System.out.println("==============================");
		Car c2 = new Car();
	}
	
	{
		System.out.println("This is non static block of program6");
		x = 89;
	}

}
