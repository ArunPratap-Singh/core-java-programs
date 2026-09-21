package lamdaExpression.Square;

public class LamdsClass {

	public static void main(String[] args) {
		
		 Square square = (int number) -> number * number;

	     int result = square.calculate(5);

	     System.out.println("Square = " + result);

	}

}
