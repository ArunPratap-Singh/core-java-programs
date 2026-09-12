package staticNonStaticBloc;

public class Program4 {

	int x;
	public static void main(String[] args) {
		
		System.out.println("This is Main Method");
		Program4 p = new Program4();
		Program4 p1 = new Program4();
		System.out.println("Obj1 x is: " +p.x);
		System.out.println("Obj2 x is: " +p1.x);
		
		System.out.println("=======================");
		
		Car c1 = new Car();
		
		System.out.println("=======================");
		
		Car c2 = new Car();

	}
	
	{
		System.out.println("This is Non Static Block Of Program1 ");
		x = 20;
	}

}
