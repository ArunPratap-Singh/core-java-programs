package anonymousClass.Factorial;

public class anonymousClass {

	public static void main(String[] args) {
		
		Factorial factorial = new Factorial() {

            @Override
            public void calculateFactorial(int number) {

                int fact = 1;

                if (number < 0) {

                    System.out.println("Factorial is not defined for negative numbers");

                } else {

                    for (int i = 1; i <= number; i++) {

                        fact = fact * i;
                    }

                    System.out.println("Number    : " + number);
                    System.out.println("Factorial : " + fact);
                }
            }
        };

        factorial.calculateFactorial(5);
        System.out.println("=====");
        factorial.calculateFactorial(7);
        System.out.println("======");
        factorial.calculateFactorial(10);

	}

}
