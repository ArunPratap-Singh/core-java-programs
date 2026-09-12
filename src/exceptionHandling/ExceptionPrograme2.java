package exceptionHandling;

public class ExceptionPrograme2 {
	public static void main(String[] args) {
		int result = getBiggest(12, 12);
		System.out.println("Biggest number is: " +result);
		
	}
	public static int getBiggest(int a, int b) {
		if(a>b)
			return a;
		else if(b>a) 
			return b;
		
		
		
		//use Exception
		throw new RuntimeException("No biggest value is found");
		
	}

}


