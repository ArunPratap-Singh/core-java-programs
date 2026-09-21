package lamdaExpression.Subtract;

public class LamdaClass {

	public static void main(String[] args) {
		
		Subtraction diff = (int a, int b) -> a - b;
		
		int result = diff.subtract(50, 20);
		
		System.out.println("Subtraction result is:  " +result);

	}

}
