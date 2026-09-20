package anonymousClass.PrimeNumber;

public class AnonymousClass {

		    public static void main(String[] args) {

		        PrimeNumber checker = new PrimeNumber() {

		            @Override
		            public void checkPrime(int number) {

		                boolean isPrime = true;

		                if (number < 2) {

		                    isPrime = false;

		                } else {

		                    for (int i = 2; i <= number / 2; i++) {

		                        if (number % i == 0) {

		                            isPrime = false;
		                            break;
		                        }
		                    }
		                }

		                if (isPrime) {

		                    System.out.println(number + " is a Prime Number");

		                } else {

		                    System.out.println(number + " is Not a Prime Number");
		                }
		            }
		        };

		        checker.checkPrime(17);
		        checker.checkPrime(20);
		        checker.checkPrime(29);
		        checker.checkPrime(1);
		    }
		
	

}
