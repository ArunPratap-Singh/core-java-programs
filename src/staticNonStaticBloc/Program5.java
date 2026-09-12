package staticNonStaticBloc;

public class Program5 {

	int x;
	public static void main(String[] args) {
		
		System.out.println("This Is Main Method");
		Program5 p = new Program5();
		Program5 p1 = new Program5();
		System.out.println("Obj1 x is: " +p.x);
		System.out.println("Obj2 x is: " +p1.x);

	}
	
	{
		System.out.println("This Is Non Static Block Of Program5");
		x=50;
	}

}
