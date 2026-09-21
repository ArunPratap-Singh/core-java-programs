package lamdaExpression.ReverseString;

public class LamdaClass {

	public static void main(String[] args) {
	
		 ReverseString reverse = str -> {

	            String revers = "";

	            for (int i = str.length() - 1; i >= 0; i--) {
	                revers = revers + str.charAt(i);
	            }

	            return revers;
	        };

	        String result = reverse.reverse("Java");

	        System.out.println("Original String = Java");
	        System.out.println("Reversed String = " + result);

	}

}
