package task1Assignment;

public class Multiplication {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		
		multiply(12, 55);
		multiply(11, 12);
		multiply(13, 15);
		multiply(15, 16);
		int a = 55;
		int b = 66;
		multiply(a, b);
		int c = 100;
		int d = 101;
		multiply(c, d);
		multiply(85, 95);
		multiply(201, 203);
		int e = 89;
		int f = 96;
		multiply(e, f);
		int g = 74;
		int h = 64;
		multiply(g, h);
		int i = 45;
		int j = 42;
		multiply(i, j);
		multiply(18, 99);
		multiply(197, 201);
		multiply(654, 785);
		multiply(845, 564);
		multiply(87, 22);
		multiply(25, 34);
		multiply(37, 47);
		int k = 75;
		int l = 38;
		multiply(k, l);
		int m = 4668;
		int n = 7856;
		multiply(m,n);
		int o = 56;
		int p = 68;
		multiply(o,p);
		
		System.out.println("Main Method Ends");

		
	}
	
	

	public static void multiply(int a, int b) {
	
	int product = a * b;
	
	System.out.println("Sum of " +a+ " and " +b+ " is: " +product);
}

}
