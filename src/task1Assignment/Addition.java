package task1Assignment;

public class Addition {
	
public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		
		add(12, 55);
		add(11, 12);
		add(13, 15);
		add(15, 16);
		int a = 55;
		int b = 66;
		add(a, b);
		int c = 100;
		int d = 101;
		add(c, d);
		add(85, 95);
		add(201, 203);
		int e = 89;
		int f = 96;
		add(e, f);
		int g = 74;
		int h = 64;
		add(g, h);
		int i = 45;
		int j = 42;
		add(i, j);
		add(18, 99);
		add(197, 201);
		add(654, 785);
		add(845, 564);
		add(87, 22);
		add(25, 34);
		add(37, 47);
		int k = 75;
		int l = 38;
		add(k, l);
		int m = 4668;
		int n = 7856;
		add(m,n);
		int o = 56;
		int p = 68;
		add(o,p);
		
		System.out.println("Main Method Ends");

	}
	
	public static void add(int a, int b) {
		
		int add = a +b;
		
		System.out.println("Sum of " +a+ " and " +b+ " is: " +add);
	}


}
