package lamdaExpression.Add;

public class LamdaClass {

	public static void main(String[] args) {
	
		AddNumber number = (int a, int b) -> a + b;
			
			
			int result = number.add(10, 20);

	        System.out.println("Addition = " + result);
				

	}

}
