package lamdaExpression.Multiply;

public class LamdaClass {

	public static void main(String[] args) {
		
		Multiplication multiply = (int a, int b) -> a * b;
		
		double result = multiply.multiply(100, 200);
		
		System.out.println("Multiplication result is: " +result);

	}

}
