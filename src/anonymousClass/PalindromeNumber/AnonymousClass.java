package anonymousClass.PalindromeNumber;

public class AnonymousClass {

	public static void main(String[] args) {
		
		PalindromeNumber checker = new PalindromeNumber() {

		    @Override
		    public void checkNumberPalindrome(int number) {

		        int original = number;
		        int reverse = 0;

		        while (number > 0) {

		            int digit = number % 10;
		            reverse = reverse * 10 + digit;
		            number = number / 10;
		        }

		        if (original == reverse) {
		            System.out.println("Palindrome Number");
		        } else {
		            System.out.println("Not a Palindrome Number");
		        }
		    }

		    @Override
		    public void checkStringPalindrome(String text) {

		        String reverse = "";

		        for (int i = text.length() - 1; i >= 0; i--) {
		            reverse = reverse + text.charAt(i);
		        }

		        if (text.equalsIgnoreCase(reverse)) {
		            System.out.println("Palindrome String");
		        } else {
		            System.out.println("Not a Palindrome String");
		        }
		    }
		};
		
		System.out.println("========== NUMBER PALINDROME ==========");

        checker.checkNumberPalindrome(121);
        checker.checkNumberPalindrome(123);

        System.out.println("\n========== STRING PALINDROME ==========");

        checker.checkStringPalindrome("MADAM");
        checker.checkStringPalindrome("JAVA");

	}

}
