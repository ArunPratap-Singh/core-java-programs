package contructor.ConstructorOverloading;

public class RefridgeratorDriver {
	

	    public static void main(String[] args) {

	        System.out.println("====================================Main Method Starts====================================");

	        Refridgerator r1 = new Refridgerator();
	        Refridgerator r2 = new Refridgerator("LG");
	        Refridgerator r3 = new Refridgerator(250);
	        Refridgerator r4 = new Refridgerator(35000.0);
	        Refridgerator r5 = new Refridgerator('A');

	        Refridgerator r6 = new Refridgerator("Samsung", 300);
	        Refridgerator r7 = new Refridgerator(350, "Whirlpool");

	        Refridgerator r8 = new Refridgerator(40000.0, "Silver");
	        Refridgerator r9 = new Refridgerator("Black", 45000.0);

	        Refridgerator r10 = new Refridgerator(400, 50000.0);
	        Refridgerator r11 = new Refridgerator(55000.0, 450);

	        Refridgerator r12 = new Refridgerator("LG", 250, 40000.0);
	        Refridgerator r13 = new Refridgerator("Samsung", 45000.0, 300);
	        Refridgerator r14 = new Refridgerator(350, "Whirlpool", 50000.0);

	        Refridgerator r15 = new Refridgerator(400, 60000.0, "Silver");
	        Refridgerator r16 = new Refridgerator(65000.0, "Godrej", "Black");
	        Refridgerator r17 = new Refridgerator("Haier", "White", 55000.0);

	        Refridgerator r18 = new Refridgerator("LG", 250, 40000.0, "Silver");
	        Refridgerator r19 = new Refridgerator("Samsung", 300, 45000.0, "Black");
	        Refridgerator r20 = new Refridgerator("Whirlpool", 350, 50000.0, "White");

	        Refridgerator r21 = new Refridgerator("Godrej", 400, 55000.0, "Silver");
	        Refridgerator r22 = new Refridgerator("Haier", 250, 60000.0, "White");
	        Refridgerator r23 = new Refridgerator("Panasonic", 300, 65000.0, "Black");
	        Refridgerator r24 = new Refridgerator("Bosch", 350, 70000.0, "Silver");
	        Refridgerator r25 = new Refridgerator("Voltas", 400, 45000.0, "White");

	        Refridgerator r26 = new Refridgerator("LG", 450, 75000.0, "Black");
	        Refridgerator r27 = new Refridgerator("Samsung", 500, 85000.0, "Silver");
	        Refridgerator r28 = new Refridgerator("Whirlpool", 250, 48000.0, "White");
	        Refridgerator r29 = new Refridgerator("Godrej", 300, 52000.0, "Black");
	        Refridgerator r30 = new Refridgerator("Haier", 350, 58000.0, "Silver");

	        Refridgerator r31 = new Refridgerator("Panasonic", 400, 65000.0, "White");
	        Refridgerator r32 = new Refridgerator("Bosch", 450, 90000.0, "Black");
	        Refridgerator r33 = new Refridgerator("Voltas", 500, 70000.0, "Silver");
	        Refridgerator r34 = new Refridgerator("LG", 550, 95000.0, "White");
	        Refridgerator r35 = new Refridgerator("Samsung", 600, 100000.0, "Black");

	        Refridgerator r36 = new Refridgerator("Whirlpool", 250, 55000.0, "Silver");
	        Refridgerator r37 = new Refridgerator("Godrej", 300, 60000.0, "White");
	        Refridgerator r38 = new Refridgerator("Haier", 350, 65000.0, "Black");
	        Refridgerator r39 = new Refridgerator("Panasonic", 400, 70000.0, "Silver");
	        Refridgerator r40 = new Refridgerator("Bosch", 450, 85000.0, "White");

	        Refridgerator r41 = new Refridgerator("Voltas", 500, 75000.0, "Black");
	        Refridgerator r42 = new Refridgerator("LG", 550, 90000.0, "Silver");
	        Refridgerator r43 = new Refridgerator("Samsung", 600, 105000.0, "White");
	        Refridgerator r44 = new Refridgerator("Whirlpool", 300, 65000.0, "Black");
	        Refridgerator r45 = new Refridgerator("Godrej", 350, 70000.0, "Silver");

	        Refridgerator r46 = new Refridgerator("Haier", 400, 75000.0, "White");
	        Refridgerator r47 = new Refridgerator("Panasonic", 450, 80000.0, "Black");
	        Refridgerator r48 = new Refridgerator("Bosch", 500, 95000.0, "Silver");
	        Refridgerator r49 = new Refridgerator("Voltas", 550, 85000.0, "White");
	        Refridgerator r50 = new Refridgerator("LG", 600, 120000.0, "Black");

	        System.out.println(r1);
	        System.out.println(r2);
	        System.out.println(r3);
	        System.out.println(r4);
	        System.out.println(r5);
	        System.out.println(r6);
	        System.out.println(r7);
	        System.out.println(r8);
	        System.out.println(r9);
	        System.out.println(r10);
	        System.out.println(r11);
	        System.out.println(r12);
	        System.out.println(r13);
	        System.out.println(r14);
	        System.out.println(r15);
	        System.out.println(r16);
	        System.out.println(r17);
	        System.out.println(r18);
	        System.out.println(r19);
	        System.out.println(r20);
	        System.out.println(r21);
	        System.out.println(r22);
	        System.out.println(r23);
	        System.out.println(r24);
	        System.out.println(r25);
	        System.out.println(r26);
	        System.out.println(r27);
	        System.out.println(r28);
	        System.out.println(r29);
	        System.out.println(r30);
	        System.out.println(r31);
	        System.out.println(r32);
	        System.out.println(r33);
	        System.out.println(r34);
	        System.out.println(r35);
	        System.out.println(r36);
	        System.out.println(r37);
	        System.out.println(r38);
	        System.out.println(r39);
	        System.out.println(r40);
	        System.out.println(r41);
	        System.out.println(r42);
	        System.out.println(r43);
	        System.out.println(r44);
	        System.out.println(r45);
	        System.out.println(r46);
	        System.out.println(r47);
	        System.out.println(r48);
	        System.out.println(r49);
	        System.out.println(r50);

	        System.out.println("====================================Main Method Ends====================================");
	    
	}

}
