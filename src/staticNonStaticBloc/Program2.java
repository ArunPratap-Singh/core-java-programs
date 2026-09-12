package staticNonStaticBloc;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("This Is Main Method");
		Program2 p = new Program2();
		Program2 p1 = new Program2();

	}
	
	{
		System.out.println("This Is Non Static Block Of Program2");
	}

}
