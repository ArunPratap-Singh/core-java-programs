package anonymousClassWithAndWithoutLamda;

public class Driver {

	public static void main(String[] args) {
		
		NumberOperation square = new Square();
		NumberOperation cube = new Cube();
		NumberOperation factorial = new Factorial();
		NumberOperation getdigit = new GetDigit();
		NumberOperation removedigit = new RemoveDigit();
		NumberOperation sumofdigit = new SumOfDigit();
		NumberOperation productofdigit = new ProductOfDigit();
		NumberOperation printrighttoleft = new PrintRightToLeft();
		
		square.get(25);
		square.get(15);
		
		cube.get(8);
		cube.get(10);
		
		factorial.get(5);
		factorial.get(10);
		
		getdigit.get(256);
		getdigit.get(65);
		
		removedigit.get(564);
		removedigit.get(565);
		
		sumofdigit.get(625);
		sumofdigit.get(6789);
		
		productofdigit.get(123);
		productofdigit.get(654);
		
		printrighttoleft.get(654);
		printrighttoleft.get(456);
		

	}

}
