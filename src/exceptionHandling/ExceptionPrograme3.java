package exceptionHandling;

public class ExceptionPrograme3 {
	public static void main(String[] args) {
		try {
			int result = getBiggest(12, 12);
		System.out.println("Biggest number is: " +result);
		}catch (Exception e) {
			System.out.println("Message is: " +e.getMessage());
				//Further Action Code
		}
		System.out.println("Programe Ends");
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


