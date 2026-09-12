package staticNonStaticBloc;

public class Car {
	
	static int x = 56;
	{
		System.out.println("This is Non Static Block-1 Of Car ");
	}
	
	static{
		System.out.println("This is static block-1 of Car");
		
	}
	
	{
		System.out.println("This is Non-Static Block-2 Of Car");
	}

}
