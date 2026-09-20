package anonymousClass.Calculator;

public class AnonymousClassDriver {

	public static void main(String[] args) {
		
        Calculator c = new Calculator() {

            @Override
            public void add(int a, int b) {
                System.out.println("Addition = " + (a + b));
            }

            @Override
            public void subtract(int a, int b) {
                System.out.println("Subtraction = " + (a - b));
            }

            @Override
            public void multiply(int a, int b) {
                System.out.println("Multiplication = " + (a * b));
            }

            @Override
            public void divide(int a, int b) {
                System.out.println("Division = " + (a / b));
            }
        };

        c.add(20, 10);
        System.out.println("================");

        c.subtract(20, 10);
        System.out.println("================");

        c.multiply(20, 10);
        System.out.println("================");

        c.divide(20, 10);
        System.out.println("================");
    


	}

}
