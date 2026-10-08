package abstraction.Appliance;

public class ApplianceDriver {

	public static void main(String[] args) {

		Appliance ap1 = new Fan(102, "Ceiling Fan", "Orient", "Electric", 2999, "Brown", "Electricity", 70, "2 Years",
				"05-09-2026", 3, "Ceiling Fan", "Medium", 350, true, false);
		Appliance ap2 = new Fan(103, "Ceiling Fan", "Crompton", "Aeroquiet", 3499, "White", "Electricity", 75, "2 Years",
		        "10-09-2026", 3, "Ceiling Fan", "High", 380, true, true);
		Appliance ap3 = new Fan(104, "Table Fan", "Bajaj", "Maharaja", 2499, "Black", "Electricity", 60, "2 Years",
		        "15-08-2026", 3, "Table Fan", "High", 400, true, false);
		Appliance ap4 = new Fan(105, "Pedestal Fan", "Usha", "Mist Air", 3999, "Blue", "Electricity", 80, "2 Years",
		        "20-08-2026", 3, "Pedestal Fan", "Medium", 360, true, true);
		Appliance ap5 = new Fan(106, "Ceiling Fan", "Havells", "Stealth Air", 4299, "Silver", "Electricity", 72, "3 Years",
		        "25-08-2026", 4, "Ceiling Fan", "High", 390, true, true);
		Appliance ap6 = new Fan(107, "Table Fan", "Orient", "Wind Pro", 2199, "Grey", "Electricity", 55, "2 Years",
		        "01-09-2026", 3, "Table Fan", "Low", 330, false, false);
		Appliance ap7 = new Fan(108, "Ceiling Fan", "Atomberg", "Renesa", 4999, "Black", "Electricity", 45, "5 Years",
		        "05-09-2026", 3, "Ceiling Fan", "High", 360, true, true);
		Appliance ap8 = new Fan(109, "Pedestal Fan", "Crompton", "High Flo", 3799, "White", "Electricity", 85, "2 Years",
		        "10-09-2026", 3, "Pedestal Fan", "High", 420, true, false);
		Appliance ap9 = new Fan(110, "Ceiling Fan", "Bajaj", "Edge", 3199, "Brown", "Electricity", 68, "2 Years",
		        "15-09-2026", 4, "Ceiling Fan", "Medium", 370, true, true);
		Appliance ap10 = new Fan(111, "Table Fan", "Usha", "Turbo", 2299, "White", "Electricity", 58, "2 Years",
		        "20-09-2026", 3, "Table Fan", "High", 410, false, true);
		
		System.out.println(ap1);
		System.out.println("=====================");

		System.out.println(ap2);
		System.out.println("=====================");

		System.out.println(ap3);
		System.out.println("=====================");

		System.out.println(ap4);
		System.out.println("=====================");

		System.out.println(ap5);
		System.out.println("=====================");

		System.out.println(ap6);
		System.out.println("=====================");

		System.out.println(ap7);
		System.out.println("=====================");

		System.out.println(ap8);
		System.out.println("=====================");

		System.out.println(ap9);
		System.out.println("=====================");

		System.out.println(ap10);
		System.out.println("=====================");
		
		
		System.out.println("==================ap1 Details====================");
		ap1.turnOn();
		ap1.turnOff();
		ap1.displayPrice();
		((Fan) ap1).changeSpeed();

		System.out.println("==================ap2 Details====================");
		ap2.turnOn();
		ap2.turnOff();
		ap2.displayPrice();
		((Fan) ap2).changeSpeed();

		System.out.println("==================ap3 Details====================");
		ap3.turnOn();
		ap3.turnOff();
		ap3.displayPrice();
		((Fan) ap3).changeSpeed();

		System.out.println("==================ap4 Details====================");
		ap4.turnOn();
		ap4.turnOff();
		ap4.displayPrice();
		((Fan) ap4).changeSpeed();

		System.out.println("==================ap5 Details====================");
		ap5.turnOn();
		ap5.turnOff();
		ap5.displayPrice();
		((Fan) ap5).changeSpeed();

		System.out.println("==================ap6 Details====================");
		ap6.turnOn();
		ap6.turnOff();
		ap6.displayPrice();
		((Fan) ap6).changeSpeed();

		System.out.println("==================ap7 Details====================");
		ap7.turnOn();
		ap7.turnOff();
		ap7.displayPrice();
		((Fan) ap7).changeSpeed();

		System.out.println("==================ap8 Details====================");
		ap8.turnOn();
		ap8.turnOff();
		ap8.displayPrice();
		((Fan) ap8).changeSpeed();

		System.out.println("==================ap9 Details====================");
		ap9.turnOn();
		ap9.turnOff();
		ap9.displayPrice();
		((Fan) ap9).changeSpeed();

		System.out.println("==================ap10 Details====================");
		ap10.turnOn();
		ap10.turnOff();
		ap10.displayPrice();
		((Fan) ap10).changeSpeed();

		Appliance ap11 = new AC(202, "Split AC", "Daikin", "Inverter AC", 52999, "White", "Electricity", 1100, "5 Years",
		        "12-08-2026", 1.5, "Split AC", 23, "Inverter Cooling", "5 Star", true, true);
		Appliance ap12 = new AC(203, "Split AC", "LG", "DualCool", 45999, "White", "Electricity", 1200, "5 Years",
		        "15-08-2026", 1.5, "Split AC", 24, "Dual Inverter Cooling", "5 Star", true, true);
		Appliance ap13 = new AC(204, "Split AC", "Samsung", "WindFree", 57999, "Silver", "Electricity", 1150, "5 Years",
		        "20-08-2026", 1.5, "Split AC", 22, "WindFree Cooling", "5 Star", true, true);
		Appliance ap14 = new AC(205, "Split AC", "Voltas", "Adjustable Inverter", 41999, "White", "Electricity", 1300, "5 Years",
		        "25-08-2026", 1.5, "Split AC", 24, "Turbo Cooling", "4 Star", true, true);
		Appliance ap15 = new AC(206, "Split AC", "Panasonic", "CS Series", 48999, "White", "Electricity", 1180, "5 Years",
		        "28-08-2026", 1.5, "Split AC", 23, "Twin Cool Technology", "5 Star", true, true);
		Appliance ap16 = new AC(207, "Split AC", "Blue Star", "Inverter Split", 50999, "White", "Electricity", 1250, "5 Years",
		        "01-09-2026", 1.5, "Split AC", 21, "Turbo Cool", "5 Star", true, true);
		Appliance ap17 = new AC(208, "Window AC", "Carrier", "Flexicool", 38999, "White", "Electricity", 1400, "3 Years",
		        "05-09-2026", 1.5, "Window AC", 24, "Flexicool Technology", "3 Star", false, true);
		Appliance ap18 = new AC(209, "Split AC", "Hitachi", "Cooling Pro", 54999, "White", "Electricity", 1080, "5 Years",
		        "10-09-2026", 1.5, "Split AC", 22, "Expandable Inverter", "5 Star", true, true);
		Appliance ap19 = new AC(210, "Split AC", "Godrej", "Convertible AC", 43999, "Silver", "Electricity", 1220, "5 Years",
		        "15-09-2026", 1.5, "Split AC", 23, "Convertible Cooling", "4 Star", true, true);
		Appliance ap20 = new AC(211, "Split AC", "Haier", "Flexisave", 46999, "White", "Electricity", 1190, "5 Years",
		        "20-09-2026", 1.5, "Split AC", 24, "Flexi Cool Technology", "5 Star", true, true);
		
		System.out.println(ap11);
		System.out.println("=====================");

		System.out.println(ap12);
		System.out.println("=====================");

		System.out.println(ap13);
		System.out.println("=====================");

		System.out.println(ap14);
		System.out.println("=====================");

		System.out.println(ap15);
		System.out.println("=====================");

		System.out.println(ap16);
		System.out.println("=====================");

		System.out.println(ap17);
		System.out.println("=====================");

		System.out.println(ap18);
		System.out.println("=====================");

		System.out.println(ap19);
		System.out.println("=====================");

		System.out.println(ap20);
		System.out.println("=====================");
		
		
		System.out.println("==================ap11 Details====================");
		ap11.turnOn();
		ap11.turnOff();
		ap11.displayPrice();
		((AC) ap11).setTemperature(25);

		System.out.println("==================ap12 Details====================");
		ap12.turnOn();
		ap12.turnOff();
		ap12.displayPrice();
		((AC) ap12).setTemperature(24);

		System.out.println("==================ap13 Details====================");
		ap13.turnOn();
		ap13.turnOff();
		ap13.displayPrice();
		((AC) ap13).setTemperature(23);

		System.out.println("==================ap14 Details====================");
		ap14.turnOn();
		ap14.turnOff();
		ap14.displayPrice();
		((AC) ap14).setTemperature(26);

		System.out.println("==================ap15 Details====================");
		ap15.turnOn();
		ap15.turnOff();
		ap15.displayPrice();
		((AC) ap15).setTemperature(22);

		System.out.println("==================ap16 Details====================");
		ap16.turnOn();
		ap16.turnOff();
		ap16.displayPrice();
		((AC) ap16).setTemperature(24);

		System.out.println("==================ap17 Details====================");
		ap17.turnOn();
		ap17.turnOff();
		ap17.displayPrice();
		((AC) ap17).setTemperature(25);

		System.out.println("==================ap18 Details====================");
		ap18.turnOn();
		ap18.turnOff();
		ap18.displayPrice();
		((AC) ap18).setTemperature(21);

		System.out.println("==================ap19 Details====================");
		ap19.turnOn();
		ap19.turnOff();
		ap19.displayPrice();
		((AC) ap19).setTemperature(23);

		System.out.println("==================ap20 Details====================");
		ap20.turnOn();
		ap20.turnOff();
		ap20.displayPrice();
		((AC) ap20).setTemperature(24);

		Appliance ap21 = new WashingMachine(302, "Washing Machine", "Whirlpool", "FreshCare", 28999, "Grey",
		        "Electricity", 550, "3 Years", "18-07-2026", "Fully Automatic", 7.5, 1200, "Steel Drum", "Daily Wash",
		        true, false);
		Appliance ap22 = new WashingMachine(303, "Washing Machine", "Samsung", "EcoBubble", 32999, "Silver",
		        "Electricity", 500, "3 Years", "20-07-2026", "Fully Automatic", 8.0, 1400, "Diamond Drum", "Quick Wash",
		        true, true);
		Appliance ap23 = new WashingMachine(304, "Washing Machine", "LG", "TurboWash", 35999, "Black",
		        "Electricity", 520, "3 Years", "25-07-2026", "Fully Automatic", 8.5, 1400, "Stainless Steel", "Turbo Wash",
		        true, true);
		Appliance ap24 = new WashingMachine(305, "Washing Machine", "IFB", "Senorita Plus", 38999, "White",
		        "Electricity", 600, "4 Years", "30-07-2026", "Fully Automatic", 8.0, 1400, "Crescent Moon Drum", "Cotton Wash",
		        true, true);
		Appliance ap25 = new WashingMachine(306, "Washing Machine", "Bosch", "Serie 6", 42999, "Silver",
		        "Electricity", 580, "3 Years", "02-08-2026", "Fully Automatic", 9.0, 1400, "VarioDrum", "Anti Stain",
		        true, true);
		Appliance ap26 = new WashingMachine(307, "Washing Machine", "Godrej", "Eon Aqua", 27999, "Grey",
		        "Electricity", 540, "3 Years", "05-08-2026", "Fully Automatic", 7.0, 1200, "Steel Drum", "Daily Wash",
		        true, false);
		Appliance ap27 = new WashingMachine(308, "Washing Machine", "Panasonic", "NA Series", 31999, "White",
		        "Electricity", 560, "3 Years", "08-08-2026", "Fully Automatic", 7.5, 1200, "Stainless Steel", "Quick Wash",
		        true, true);
		Appliance ap28 = new WashingMachine(309, "Washing Machine", "Haier", "AquaFresh", 29999, "Blue",
		        "Electricity", 530, "3 Years", "12-08-2026", "Fully Automatic", 8.0, 1300, "Steel Drum", "Baby Care",
		        true, false);
		Appliance ap29 = new WashingMachine(310, "Washing Machine", "Crompton", "Aqua Plus", 25999, "White",
		        "Electricity", 510, "2 Years", "15-08-2026", "Semi Automatic", 7.0, 1000, "Plastic Drum", "Normal Wash",
		        false, false);
		Appliance ap30 = new WashingMachine(311, "Washing Machine", "Oppo", "WashPro", 33999, "Dark Grey",
		        "Electricity", 570, "3 Years", "20-08-2026", "Fully Automatic", 8.5, 1400, "Stainless Steel", "Allergy Care",
		        true, true);
		
		System.out.println(ap21);
		System.out.println("=====================");

		System.out.println(ap22);
		System.out.println("=====================");

		System.out.println(ap23);
		System.out.println("=====================");

		System.out.println(ap24);
		System.out.println("=====================");

		System.out.println(ap25);
		System.out.println("=====================");

		System.out.println(ap26);
		System.out.println("=====================");

		System.out.println(ap27);
		System.out.println("=====================");

		System.out.println(ap28);
		System.out.println("=====================");

		System.out.println(ap29);
		System.out.println("=====================");

		System.out.println(ap30);
		System.out.println("=====================");
		
		
		System.out.println("==================ap21 Details====================");
		ap21.turnOn();
		ap21.turnOff();
		ap21.displayPrice();
		((WashingMachine) ap21).startWashing();

		System.out.println("==================ap22 Details====================");
		ap22.turnOn();
		ap22.turnOff();
		ap22.displayPrice();
		((WashingMachine) ap22).startWashing();

		System.out.println("==================ap23 Details====================");
		ap23.turnOn();
		ap23.turnOff();
		ap23.displayPrice();
		((WashingMachine) ap23).startWashing();

		System.out.println("==================ap24 Details====================");
		ap24.turnOn();
		ap24.turnOff();
		ap24.displayPrice();
		((WashingMachine) ap24).startWashing();

		System.out.println("==================ap25 Details====================");
		ap25.turnOn();
		ap25.turnOff();
		ap25.displayPrice();
		((WashingMachine) ap25).startWashing();

		System.out.println("==================ap26 Details====================");
		ap26.turnOn();
		ap26.turnOff();
		ap26.displayPrice();
		((WashingMachine) ap26).startWashing();

		System.out.println("==================ap27 Details====================");
		ap27.turnOn();
		ap27.turnOff();
		ap27.displayPrice();
		((WashingMachine) ap27).startWashing();

		System.out.println("==================ap28 Details====================");
		ap28.turnOn();
		ap28.turnOff();
		ap28.displayPrice();
		((WashingMachine) ap28).startWashing();

		System.out.println("==================ap29 Details====================");
		ap29.turnOn();
		ap29.turnOff();
		ap29.displayPrice();
		((WashingMachine) ap29).startWashing();

		System.out.println("==================ap30 Details====================");
		ap30.turnOn();
		ap30.turnOff();
		ap30.displayPrice();
		((WashingMachine) ap30).startWashing();
	}

}
