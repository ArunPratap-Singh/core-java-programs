package lamdaExpression.Divide;

public class LamdaClass {

	public static void main(String[] args) {
	
		Division division = (a, b) -> a / b;

        double result = division.divide(20, 5);

        System.out.println("Division = " + result);

	}

}
