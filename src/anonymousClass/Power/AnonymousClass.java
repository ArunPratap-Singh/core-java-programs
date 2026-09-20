package anonymousClass.Power;

public class AnonymousClass {

	public static void main(String[] args) {
		
		 Power calculator = new Power() {

	            @Override
	            public void calculatePower(int base, int power) {

	                int pow = 1;

	                for (int i = 1; i <= power; i++) {

	                    pow = pow * base;
	                }

	                System.out.println("Base       : " + base);
	                System.out.println("Power      : " + power);
	                System.out.println("Power is     : " + pow);
	            }
	     };

	        calculator.calculatePower(2, 5);

	        System.out.println("========");

	        calculator.calculatePower(3, 4);

	        System.out.println("========");

	        calculator.calculatePower(5, 3);
	    

	}

}
