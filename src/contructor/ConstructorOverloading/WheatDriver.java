package contructor.ConstructorOverloading;

public class WheatDriver {

	public static void main(String[] args) {

		System.out.println("=============================== Main Method Starts ================================");

		Wheat w1 = new Wheat();
		Wheat w2 = new Wheat("Sharbati");
		Wheat w3 = new Wheat(50);
		Wheat w4 = new Wheat(2500.0);
		Wheat w5 = new Wheat(100L);
		Wheat w6 = new Wheat(25, "Sharbati");
		Wheat w7 = new Wheat("Lokwan", 40);
		Wheat w8 = new Wheat(3000.0, "Premium");
		Wheat w9 = new Wheat("Standard", 2800.0);
		Wheat w10 = new Wheat(50, 25.5);
		Wheat w11 = new Wheat(30.5, 60);
		Wheat w12 = new Wheat(100, "Durum");
		Wheat w13 = new Wheat("Durum", 80);
		Wheat w14 = new Wheat(4500.0, "Organic");
		Wheat w15 = new Wheat("Organic", 5000.0);
		Wheat w16 = new Wheat("Sharbati", "Premium", 3500.0);
		Wheat w17 = new Wheat("Lokwan", 50, "Madhya Pradesh");
		Wheat w18 = new Wheat("Golden", "Punjab", 25.5);
		Wheat w19 = new Wheat(100, 3000.0, 50.0);
		Wheat w20 = new Wheat("Durum", "Premium", 4000.0);
		Wheat w21 = new Wheat("Kalyan", 75, "Haryana");
		Wheat w22 = new Wheat("Brown", "Rajasthan", 40.0);
		Wheat w23 = new Wheat(200, 4500.0, 100.0);
		Wheat w24 = new Wheat("Organic", "High Quality", 5500.0);
		Wheat w25 = new Wheat("Bansi", 100, "Maharashtra");
		Wheat w26 = new Wheat("Sharbati", "Premium", 3500.0, 100);
		Wheat w27 = new Wheat("Lokwan", 4200.0, "Madhya Pradesh", "Golden");
		Wheat w28 = new Wheat("Durum", "Premium", 5000.0, 150);
		Wheat w29 = new Wheat("Kalyan", 3800.0, "Haryana", "Brown");
		Wheat w30 = new Wheat("Bansi", "Standard", 3200.0, 200);
		Wheat w31 = new Wheat("Sharbati", "Premium", 3500.0, 100, "Madhya Pradesh");
		Wheat w32 = new Wheat("Lokwan", 4200.0, 150, "Golden", "Madhya Pradesh");
		Wheat w33 = new Wheat("Durum", "Organic", 5500.0, 75, "Haryana");
 		Wheat w34 = new Wheat("Kalyan", 3800.0, 200, "Brown", "Punjab");
		Wheat w35 = new Wheat("Bansi", "Premium", 4000.0, 125, "Rajasthan");
		Wheat w36 = new Wheat("Sharbati", "Premium", 3500.0, 100, "Golden", "Madhya Pradesh");
		Wheat w37 = new Wheat("Lokwan", "Standard", 4200.0, 150, "Brown", "Punjab");
		Wheat w38 = new Wheat("Durum", "Organic", 5500.0, 75, "Golden", "Haryana");
		Wheat w39 = new Wheat("Kalyan", "Premium", 3800.0, 200, "Brown", "Rajasthan");
		Wheat w40 = new Wheat("Bansi", "High Quality", 4000.0, 125, "Golden", "Maharashtra");
		Wheat w41 = new Wheat("Sharbati", "Premium", 3500.0, 100, "Golden", "Madhya Pradesh", 50.0);
		Wheat w42 = new Wheat("Lokwan", "Standard", 4200.0, 150, "Brown", "Punjab", 75.0);
		Wheat w43 = new Wheat("Durum", "Organic", 5500.0, 75, "Golden", "Haryana", 40.0);
		Wheat w44 = new Wheat("Kalyan", "Premium", 3800.0, 200, "Brown", "Rajasthan", 100.0);
		Wheat w45 = new Wheat("Bansi", "High Quality", 4000.0, 125, "Golden", "Maharashtra", 60.0);
		Wheat w46 = new Wheat("Malwa", "Premium", 4500.0, 80, "Golden", "Madhya Pradesh", 45.0);
		Wheat w47 = new Wheat("Sharbati", "Organic", 6000.0, 90, "Golden", "Punjab", 55.0);
		Wheat w48 = new Wheat("Lokwan", "Premium", 4800.0, 175, "Brown", "Rajasthan", 85.0);
		Wheat w49 = new Wheat("Durum", "High Quality", 6500.0, 60, "Golden", "Haryana", 35.0);
		Wheat w50 = new Wheat("Kalyan", "Organic", 7000.0, 250, "Brown", "Maharashtra", 120.0);

		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		System.out.println(w5);
		System.out.println(w6);
		System.out.println(w7);
		System.out.println(w8);
		System.out.println(w9);
		System.out.println(w10);
		System.out.println(w11);
		System.out.println(w12);
		System.out.println(w13);
		System.out.println(w14);
		System.out.println(w15);
		System.out.println(w16);
		System.out.println(w17);
		System.out.println(w18);
		System.out.println(w19);
		System.out.println(w20);
		System.out.println(w21);
		System.out.println(w22);
		System.out.println(w23);
		System.out.println(w24);
		System.out.println(w25);
		System.out.println(w26);
		System.out.println(w27);
		System.out.println(w28);
		System.out.println(w29);
		System.out.println(w30);
		System.out.println(w31);
		System.out.println(w32);
		System.out.println(w33);
		System.out.println(w34);
		System.out.println(w35);
		System.out.println(w36);
		System.out.println(w37);
		System.out.println(w38);
		System.out.println(w39);
		System.out.println(w40);
		System.out.println(w41);
		System.out.println(w42);
		System.out.println(w43);
		System.out.println(w44);
		System.out.println(w45);
		System.out.println(w46);
		System.out.println(w47);
		System.out.println(w48);
		System.out.println(w49);
		System.out.println(w50);

		System.out.println("======================================= Main Method Ends =======================================");

	}

}
