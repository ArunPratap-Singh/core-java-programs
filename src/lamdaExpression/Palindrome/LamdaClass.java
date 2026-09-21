package lamdaExpression.Palindrome;

public class LamdaClass {

	public static void main(String[] args) {
		
		 Palindrome palindrome = str -> {

	            String reverse = "";

	            for (int i = str.length() - 1; i >= 0; i--) {
	                reverse = reverse + str.charAt(i);
	            }

	            return str.equalsIgnoreCase(reverse);
	        };

	        boolean result = palindrome.checkPalindrome("madam");

	        System.out.println("Is Palindrome: " + result);

	}

}
