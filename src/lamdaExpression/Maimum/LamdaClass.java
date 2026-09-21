package lamdaExpression.Maimum;

public class LamdaClass {

	public static void main(String[] args) {
		
		Maximum maximum = (int a, int b) -> a > b ? a : b;

        int result = maximum.findMax(25, 40);

        System.out.println("Maximum = " + result);

	}

}
