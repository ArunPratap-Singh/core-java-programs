package lamdaExpression.EvenOdd;

public class LamdaClass {

	public static void main(String[] args) {
		
		 EvenOdd checkNumber = (int number) -> number % 2 == 0 ? "Even" : "Odd";

		 String result = checkNumber.check(15);

		 System.out.println("Number is: " + result);

	}

}
