package lamdaExpression.Minimum;

public class LamdaClass {

	public static void main(String[] args) {
		
		Minimum minimum = (a, b) -> a < b ? a : b;

        int result = minimum.findMin(25, 15);

        System.out.println("Minimum = " + result);

	}

}
