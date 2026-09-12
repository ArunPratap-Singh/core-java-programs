package constructor.shallowCopy.Car;

public class CarDriver {

	public static void main(String[] args) {
		
		System.out.println("=============================Main Method Starts================================");
		
		Car c1 = new Car("Wagnor", "Maruti Suzuki", 500000, "White", new Engine(101, "Petrol Engine", 150, "Petrol", 2.0, "Honda"));
		Car c2 = new Car("Swift", "Maruti Suzuki", 600000, "Red", new Engine(102, "Petrol Engine", 120, "Petrol", 1.2, "Maruti"));
		Car c3 = new Car("Baleno", "Maruti Suzuki", 700000, "Blue", new Engine(103, "Petrol Engine", 119, "Petrol", 1.2, "Suzuki"));
		Car c4 = new Car("Alto", "Maruti Suzuki", 400000, "Silver", new Engine(104, "Petrol Engine", 100, "Petrol", 0.8, "Maruti"));
		Car c5 = new Car("Dzire", "Maruti Suzuki", 650000, "Black", new Engine(105, "Petrol Engine", 115, "Petrol", 1.2, "Suzuki"));

		Car c6 = new Car("Creta", "Hyundai", 1100000, "White", new Engine(106, "Petrol Engine", 160, "Petrol", 1.5, "Hyundai"));
		Car c7 = new Car("i20", "Hyundai", 800000, "Blue", new Engine(107, "Petrol Engine", 120, "Petrol", 1.2, "Hyundai"));
		Car c8 = new Car("Verna", "Hyundai", 1000000, "Red", new Engine(108, "Petrol Engine", 160, "Petrol", 1.5, "Hyundai"));
		Car c9 = new Car("Venue", "Hyundai", 900000, "Grey", new Engine(109, "Petrol Engine", 120, "Petrol", 1.2, "Hyundai"));
		Car c10 = new Car("Aura", "Hyundai", 700000, "White", new Engine(110, "Petrol Engine", 115, "Petrol", 1.2, "Hyundai"));

		Car c11 = new Car("Nexon", "Tata", 800000, "Blue", new Engine(111, "Petrol Engine", 120, "Petrol", 1.2, "Tata"));
		Car c12 = new Car("Punch", "Tata", 650000, "Red", new Engine(112, "Petrol Engine", 87, "Petrol", 1.2, "Tata"));
		Car c13 = new Car("Altroz", "Tata", 750000, "Black", new Engine(113, "Diesel Engine", 90, "Diesel", 1.5, "Tata"));
		Car c14 = new Car("Harrier", "Tata", 1500000, "White", new Engine(114, "Diesel Engine", 170, "Diesel", 2.0, "Tata"));
		Car c15 = new Car("Safari", "Tata", 1600000, "Silver", new Engine(115, "Diesel Engine", 170, "Diesel", 2.0, "Tata"));

		Car c16 = new Car("City", "Honda", 1200000, "White", new Engine(116, "Petrol Engine", 121, "Petrol", 1.5, "Honda"));
		Car c17 = new Car("Amaze", "Honda", 800000, "Red", new Engine(117, "Petrol Engine", 90, "Petrol", 1.2, "Honda"));
		Car c18 = new Car("Elevate", "Honda", 1100000, "Blue", new Engine(118, "Petrol Engine", 121, "Petrol", 1.5, "Honda"));
		Car c19 = new Car("Civic", "Honda", 1800000, "Black", new Engine(119, "Petrol Engine", 140, "Petrol", 1.8, "Honda"));
		Car c20 = new Car("Jazz", "Honda", 900000, "Silver", new Engine(120, "Petrol Engine", 100, "Petrol", 1.2, "Honda"));

		Car c21 = new Car("Fortuner", "Toyota", 3500000, "White", new Engine(121, "Diesel Engine", 204, "Diesel", 2.8, "Toyota"));
		Car c22 = new Car("Innova", "Toyota", 2500000, "Black", new Engine(122, "Diesel Engine", 150, "Diesel", 2.4, "Toyota"));
		Car c23 = new Car("Glanza", "Toyota", 750000, "Red", new Engine(123, "Petrol Engine", 90, "Petrol", 1.2, "Toyota"));
		Car c24 = new Car("Urban Cruiser", "Toyota", 1000000, "Blue", new Engine(124, "Petrol Engine", 105, "Petrol", 1.5, "Toyota"));
		Car c25 = new Car("Camry", "Toyota", 4500000, "Silver", new Engine(125, "Hybrid Engine", 178, "Petrol", 2.5, "Toyota"));

		Car c26 = new Car("XUV700", "Mahindra", 1400000, "White", new Engine(126, "Diesel Engine", 185, "Diesel", 2.2, "Mahindra"));
		Car c27 = new Car("Scorpio", "Mahindra", 1300000, "Black", new Engine(127, "Diesel Engine", 130, "Diesel", 2.2, "Mahindra"));
		Car c28 = new Car("Thar", "Mahindra", 1500000, "Red", new Engine(128, "Diesel Engine", 130, "Diesel", 2.2, "Mahindra"));
		Car c29 = new Car("Bolero", "Mahindra", 1000000, "White", new Engine(129, "Diesel Engine", 75, "Diesel", 1.5, "Mahindra"));
		Car c30 = new Car("XUV300", "Mahindra", 900000, "Blue", new Engine(130, "Petrol Engine", 110, "Petrol", 1.2, "Mahindra"));

		Car c31 = new Car("Kushaq", "Skoda", 1200000, "White", new Engine(131, "Petrol Engine", 115, "Petrol", 1.0, "Skoda"));
		Car c32 = new Car("Slavia", "Skoda", 1100000, "Red", new Engine(132, "Petrol Engine", 115, "Petrol", 1.0, "Skoda"));
		Car c33 = new Car("Kodiaq", "Skoda", 3800000, "Black", new Engine(133, "Petrol Engine", 190, "Petrol", 2.0, "Skoda"));
		Car c34 = new Car("Superb", "Skoda", 3500000, "Silver", new Engine(134, "Petrol Engine", 190, "Petrol", 2.0, "Skoda"));
		Car c35 = new Car("Octavia", "Skoda", 2800000, "Blue", new Engine(135, "Petrol Engine", 150, "Petrol", 1.5, "Skoda"));

		Car c36 = new Car("Taigun", "Volkswagen", 1200000, "White", new Engine(136, "Petrol Engine", 115, "Petrol", 1.0, "Volkswagen"));
		Car c37 = new Car("Virtus", "Volkswagen", 1100000, "Red", new Engine(137, "Petrol Engine", 115, "Petrol", 1.0, "Volkswagen"));
		Car c38 = new Car("Tiguan", "Volkswagen", 3500000, "Black", new Engine(138, "Petrol Engine", 190, "Petrol", 2.0, "Volkswagen"));
		Car c39 = new Car("Polo", "Volkswagen", 800000, "Blue", new Engine(139, "Petrol Engine", 110, "Petrol", 1.0, "Volkswagen"));
		Car c40 = new Car("Vento", "Volkswagen", 1000000, "Silver", new Engine(140, "Petrol Engine", 110, "Petrol", 1.0, "Volkswagen"));

		Car c41 = new Car("Seltos", "Kia", 1100000, "White", new Engine(141, "Petrol Engine", 115, "Petrol", 1.5, "Kia"));
		Car c42 = new Car("Sonet", "Kia", 800000, "Red", new Engine(142, "Petrol Engine", 120, "Petrol", 1.0, "Kia"));
		Car c43 = new Car("Carens", "Kia", 1000000, "Blue", new Engine(143, "Diesel Engine", 115, "Diesel", 1.5, "Kia"));
		Car c44 = new Car("EV6", "Kia", 6000000, "Black", new Engine(144, "Electric Engine", 229, "Electric", 0.0, "Kia"));
		Car c45 = new Car("Carnival", "Kia", 3000000, "Silver", new Engine(145, "Diesel Engine", 200, "Diesel", 2.2, "Kia"));

		Car c46 = new Car("Astor", "MG", 1100000, "White", new Engine(146, "Petrol Engine", 110, "Petrol", 1.5, "MG"));
		Car c47 = new Car("Hector", "MG", 1500000, "Black", new Engine(147, "Petrol Engine", 143, "Petrol", 1.5, "MG"));
		Car c48 = new Car("Gloster", "MG", 3500000, "Red", new Engine(148, "Diesel Engine", 215, "Diesel", 2.0, "MG"));
		Car c49 = new Car("ZS EV", "MG", 2300000, "Blue", new Engine(149, "Electric Engine", 177, "Electric", 0.0, "MG"));
		Car c50 = new Car("Comet", "MG", 800000, "Silver", new Engine(150, "Electric Engine", 42, "Electric", 0.0, "MG"));
		Car c51 = new Car(c1);
		Car c52 = new Car(c2);
		Car c53 = new Car(c3);
		Car c54 = new Car(c4);
		Car c55 = new Car(c5);
		Car c56 = new Car(c6);
		Car c57 = new Car(c7);
		Car c58 = new Car(c8);
		Car c59 = new Car(c9);
		Car c60 = new Car(c10);

		Car c61 = new Car(c11);
		Car c62 = new Car(c12);
		Car c63 = new Car(c13);
		Car c64 = new Car(c14);
		Car c65 = new Car(c15);
		Car c66 = new Car(c16);
		Car c67 = new Car(c17);
		Car c68 = new Car(c18);
		Car c69 = new Car(c19);
		Car c70 = new Car(c20);

		Car c71 = new Car(c21);
		Car c72 = new Car(c22);
		Car c73 = new Car(c23);
		Car c74 = new Car(c24);
		Car c75 = new Car(c25);
		Car c76 = new Car(c26);
		Car c77 = new Car(c27);
		Car c78 = new Car(c28);
		Car c79 = new Car(c29);
		Car c80 = new Car(c30);

		Car c81 = new Car(c31);
		Car c82 = new Car(c32);
		Car c83 = new Car(c33);
		Car c84 = new Car(c34);
		Car c85 = new Car(c35);
		Car c86 = new Car(c36);
		Car c87 = new Car(c37);
		Car c88 = new Car(c38);
		Car c89 = new Car(c39);
		Car c90 = new Car(c40);
		
		c10.price = 10001000;
		c10.e.engineNumber = 1000;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);

		System.out.println(c11);
		System.out.println(c12);
		System.out.println(c13);
		System.out.println(c14);
		System.out.println(c15);
		System.out.println(c16);
		System.out.println(c17);
		System.out.println(c18);
		System.out.println(c19);
		System.out.println(c20);

		System.out.println(c21);
		System.out.println(c22);
		System.out.println(c23);
		System.out.println(c24);
		System.out.println(c25);
		System.out.println(c26);
		System.out.println(c27);
		System.out.println(c28);
		System.out.println(c29);
		System.out.println(c30);

		System.out.println(c31);
		System.out.println(c32);
		System.out.println(c33);
		System.out.println(c34);
		System.out.println(c35);
		System.out.println(c36);
		System.out.println(c37);
		System.out.println(c38);
		System.out.println(c39);
		System.out.println(c40);

		System.out.println(c41);
		System.out.println(c42);
		System.out.println(c43);
		System.out.println(c44);
		System.out.println(c45);
		System.out.println(c46);
		System.out.println(c47);
		System.out.println(c48);
		System.out.println(c49);
		System.out.println(c50);

		System.out.println(c51);
		System.out.println(c52);
		System.out.println(c53);
		System.out.println(c54);
		System.out.println(c55);
		System.out.println(c56);
		System.out.println(c57);
		System.out.println(c58);
		System.out.println(c59);
		System.out.println(c60);

		System.out.println(c61);
		System.out.println(c62);
		System.out.println(c63);
		System.out.println(c64);
		System.out.println(c65);
		System.out.println(c66);
		System.out.println(c67);
		System.out.println(c68);
		System.out.println(c69);
		System.out.println(c70);

		System.out.println(c71);
		System.out.println(c72);
		System.out.println(c73);
		System.out.println(c74);
		System.out.println(c75);
		System.out.println(c76);
		System.out.println(c77);
		System.out.println(c78);
		System.out.println(c79);
		System.out.println(c80);

		System.out.println(c81);
		System.out.println(c82);
		System.out.println(c83);
		System.out.println(c84);
		System.out.println(c85);
		System.out.println(c86);
		System.out.println(c87);
		System.out.println(c88);
		System.out.println(c89);
		System.out.println(c90);
		
		System.out.println("=================================Main Method Ends======================================");

	}

}
