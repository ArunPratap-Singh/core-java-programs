package lamdaExpression.LowerCase;

public class LamdaClass {

	public static void main(String[] args) {
		
		 LowerCase lower = str -> str.toLowerCase();

	     String result = lower.convert("JAVA SELENIUM");

	     System.out.println("Lowercase String = " + result);

	}

}
