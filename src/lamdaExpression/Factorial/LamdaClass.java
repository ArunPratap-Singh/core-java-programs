package lamdaExpression.Factorial;

public class LamdaClass {

	public static void main(String[] args) {
		
		 Factorial factorial = (int number) -> {

	            long fact = 1;

	            for (int i = 1; i <= number; i++) {
	                fact = fact * i;
	            }

	            return fact;
	        };

	        long result = factorial.calculate(5);

	        System.out.println("Factorial = " + result);

	}

}
