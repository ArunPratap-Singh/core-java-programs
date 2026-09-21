package lamdaExpression.PositiveNegative;

public class LamdaClass {

	public static void main(String[] args) {
		
		 PositiveNegative check = number -> {
	            if (number > 0) {
	                return "Positive";
	            } else if (number < 0) {
	                return "Negative";
	            } else {
	                return "Zero";
	            }
	        };

	        String result = check.check(-10);

	        System.out.println("Number is: " + result);

	}

}
