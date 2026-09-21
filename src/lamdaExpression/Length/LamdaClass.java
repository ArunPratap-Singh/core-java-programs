package lamdaExpression.Length;

public class LamdaClass {

	public static void main(String[] args) {
		
		 StringLength length = (String str) -> str.length();

	     int result = length.findLength("Automation");

	     System.out.println("String Length = " + result);

	}

}
