package lamdaExpression.UpperCase;

public class LamdaClass {

	public static void main(String[] args) {
		
		UpperCase upper = str -> str.toUpperCase();

        String result = upper.convert("java selenium");

        System.out.println("Uppercase String = " + result);

	}

}
