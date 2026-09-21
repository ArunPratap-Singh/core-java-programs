package lamdaExpression.Power;

public interface LamdaClass {
	
	public static void main(String[] args) {
		
		Power power = (int base, int exponent) -> {
			
			int pow = 1;
			
			for (int i = 1; i <= exponent; i++) {
				
				pow = pow * base;
			}
			return pow;
		};

	    double result = power.calculate(2, 5);

	    System.out.println("Power = " + result);
	}
	
	
}
