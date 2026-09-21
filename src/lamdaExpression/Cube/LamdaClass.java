package lamdaExpression.Cube;

public class LamdaClass {

	public static void main(String[] args) {
		
		Cube cube = (int number) -> number * number * number;

        int result = cube.calculate(4);

        System.out.println("Cube = " + result);

	}

}
