package staticNonStaticBloc;

public class Program3 {

	int x;
	public static void main(String[] args) {
		
		System.out.println("This is Main Method");
		Program3 p = new Program3();
		Program3 p1 = new Program3();

	}
	
	{
		System.out.println("This is non static block of program3");
		x = 20;
	}

}
