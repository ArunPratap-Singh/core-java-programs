package weopen;

public class Driver1 {

	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		Gun g2 = new Gun("AK 47", 50000, 50.0, 150, "500meter");
		Gun g3 = new Gun("Remington700", 150000, 150.0, 300, "200yards");
		Gun g4 = new Gun("Barret M82", 80000, 110.0, 150, "100meter");
		Gun g5 = new Gun("AR 15", 5000, 10.0, 190, "500meter");
		Gun g6 = new Gun("AK 105", 56000, 60.0, 250, "600meter");
		Gun g7 = new Gun("AK 251", 59000, 50.0, 650, "900meter");
		
		System.out.println("=======================================");
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		System.out.println(g6);
		System.out.println(g7);
		

	}

}
