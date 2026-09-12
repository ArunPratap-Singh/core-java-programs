package contructor.ConstructorChaining;

public class TrainDriver {

	public static void main(String[] args) {

		System.out.println("=====================================Main Method Starts======================================");

		Train t1 = new Train("Rajdhani Express", 12951, "Delhi", "Mumbai", 18, 2500.0, "04:55 PM", "Superfast");
		Train t2 = new Train();
		Train t3 = new Train("Shatabdi Express");
		Train t4 = new Train("Duronto Express", 12245);
		Train t5 = new Train("Garib Rath", 12909, "Bandra");
		Train t6 = new Train("Vande Bharat", 22436, "Delhi", "Varanasi");
		Train t7 = new Train("Tejas Express", 22119, "Mumbai", "Karmali", 16);
		Train t8 = new Train("Humsafar Express", 12595, "Bangalore", "New Delhi", 20, 1800.0);
		Train t9 = new Train(12001, "Shatabdi Express", "Bhopal", "New Delhi", 16, 2200.0, "06:00 AM", "Superfast");
		Train t10 = new Train(12952, "Rajdhani Express", "Mumbai", "New Delhi", 18, 2800.0, "05:30 PM", "Premium");
		Train t11 = new Train("Karnataka Express", 12627, "New Delhi", "Bangalore", 22, 2100.0, "09:15 PM", "Superfast");
		Train t12 = new Train("Tamil Nadu Express", 12621, "New Delhi", "Chennai", 24, 2300.0, "10:30 PM", "Superfast");
		Train t13 = new Train("Kerala Express", 12625, "New Delhi", "Thiruvananthapuram", 24, 2400.0, "11:00 AM", "Superfast");
		Train t14 = new Train("Goa Express", 12779, "New Delhi", "Goa", 20, 1900.0, "03:00 PM", "Express");
		Train t15 = new Train("Punjab Mail", 12137, "Mumbai", "Firozpur", 22, 1600.0, "07:40 PM", "Express");
		Train t16 = new Train("Golden Temple Mail", 12903, "Mumbai", "Amritsar", 22, 1700.0, "06:55 PM", "Express");
		Train t17 = new Train("Mewar Express", 12963, "Nizamuddin", "Udaipur", 20, 1400.0, "07:30 PM", "Express");
		Train t18 = new Train("Ala Hazrat Express", 14311, "Bareilly", "Bhuj", 18, 1300.0, "08:00 AM", "Express");
		Train t19 = new Train("Avadh Assam Express", 15909, "Dibrugarh", "Lalgarh", 24, 1800.0, "09:30 AM", "Express");
		Train t20 = new Train("Brahmaputra Mail", 15657, "Delhi", "Kamakhya", 22, 1750.0, "05:00 PM", "Express");
		Train t21 = new Train("Magadh Express", 20802, "New Delhi", "Patna", 20, 1500.0, "07:20 AM", "Superfast");
		Train t22 = new Train("Sampoorna Kranti", 12394, "New Delhi", "Rajendra Nagar", 20, 1700.0, "05:30 PM", "Superfast");
		Train t23 = new Train("Poorva Express", 12304, "New Delhi", "Howrah", 22, 1900.0, "08:10 AM", "Superfast");
		Train t24 = new Train("Howrah Rajdhani", 12302, "New Delhi", "Howrah", 18, 3000.0, "04:55 PM", "Premium");
		Train t25 = new Train("Sealdah Rajdhani", 12314, "New Delhi", "Sealdah", 18, 3100.0, "04:25 PM", "Premium");
		Train t26 = new Train("Bikaner Intercity", 12458, "Delhi", "Bikaner", 16, 1200.0, "06:15 AM", "Intercity");
		Train t27 = new Train("Ajmer Shatabdi", 12015, "New Delhi", "Ajmer", 16, 2000.0, "06:05 AM", "Shatabdi");
		Train t28 = new Train("Amritsar Shatabdi", 12029, "New Delhi", "Amritsar", 16, 2100.0, "07:20 AM", "Shatabdi");
		Train t29 = new Train("Lucknow Shatabdi", 12004, "New Delhi", "Lucknow", 16, 2200.0, "06:10 AM", "Shatabdi");
		Train t30 = new Train("Kanpur Shatabdi", 12033, "New Delhi", "Kanpur", 14, 1800.0, "06:00 AM", "Shatabdi");
		Train t31 = new Train("Vande Bharat Express", 22435, "Varanasi", "New Delhi", 16, 2500.0, "03:00 PM", "Semi High Speed");
		Train t32 = new Train("Vande Bharat Express", 20977, "Chandigarh", "New Delhi", 16, 2300.0, "05:30 PM", "Semi High Speed");
		Train t33 = new Train("Tejas Express", 82901, "Mumbai", "Ahmedabad", 14, 1600.0, "06:40 AM", "Premium");
		Train t34 = new Train("Garib Rath", 12910, "Delhi", "Mumbai", 20, 1000.0, "08:30 PM", "Economy");
		Train t35 = new Train("Duronto Express", 12246, "Mumbai", "New Delhi", 20, 2000.0, "11:00 PM", "Superfast");
		Train t36 = new Train("Humsafar Express", 12596, "New Delhi", "Bangalore", 20, 1900.0, "09:00 PM", "Express");
		Train t37 = new Train("Antyodaya Express", 12317, "Kolkata", "Amritsar", 22, 900.0, "07:00 PM", "Economy");
		Train t38 = new Train("Jan Shatabdi", 12024, "New Delhi", "Dehradun", 16, 1100.0, "06:45 AM", "Jan Shatabdi");
		Train t39 = new Train("Intercity Express", 14206, "Delhi", "Lucknow", 18, 1000.0, "05:30 AM", "Intercity");
		Train t40 = new Train(22436, "Vande Bharat Express", "New Delhi", "Varanasi", 16, 2600.0, "06:00 AM", "Semi High Speed");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		System.out.println(t7);
		System.out.println(t8);
		System.out.println(t9);
		System.out.println(t10);

		System.out.println(t11);
		System.out.println(t12);
		System.out.println(t13);
		System.out.println(t14);
		System.out.println(t15);
		System.out.println(t16);
		System.out.println(t17);
		System.out.println(t18);
		System.out.println(t19);
		System.out.println(t20);

		System.out.println(t21);
		System.out.println(t22);
		System.out.println(t23);
		System.out.println(t24);
		System.out.println(t25);
		System.out.println(t26);
		System.out.println(t27);
		System.out.println(t28);
		System.out.println(t29);
		System.out.println(t30);

		System.out.println(t31);
		System.out.println(t32);
		System.out.println(t33);
		System.out.println(t34);
		System.out.println(t35);
		System.out.println(t36);
		System.out.println(t37);
		System.out.println(t38);
		System.out.println(t39);
		System.out.println(t40);
		
		System.out.println("===================================Main Method Ends========================================");

	}
}
