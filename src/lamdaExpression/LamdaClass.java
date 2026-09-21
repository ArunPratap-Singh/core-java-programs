package lamdaExpression;

public class LamdaClass {
	
	public static void main(String[] args) {
		
		Greeting greeting = () -> System.out.println("Hello, Java");
		
		greeting .print();
	}

}
