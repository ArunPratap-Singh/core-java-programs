package pojo;

public class WeopenPojoDriver {

	public static void main(String[] args) {
		
		WeopenPojo w1 = new WeopenPojo("Prithvi Missile", 500000, "3000km", 25.25);
		WeopenPojo w2 = new WeopenPojo("Agni Missile", 600000, "2000km", 30.0);
		WeopenPojo w3 = new WeopenPojo("Trishul Missile", 200000, "1500km", 10.50);
		WeopenPojo w4 = new WeopenPojo("Naag Missile", 500000, "1000km", 100.25);
		WeopenPojo w5 = new WeopenPojo("Akash", 300000, "4000km", 50.0);
		WeopenPojo w6 = new WeopenPojo("Greanade", 50000, "2km", 5.0);
		
		System.out.println("=========================================");
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
	}

}
