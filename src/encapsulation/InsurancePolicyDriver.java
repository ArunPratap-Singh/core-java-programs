package encapsulation;

public class InsurancePolicyDriver {

	public static void main(String[] args) {
		
		InsurancePolicy p1 = new InsurancePolicy("Health Secure Plan", "Mohan", "Rohan", "HP101", 12000.0, 12);
		InsurancePolicy p2 = new InsurancePolicy("Life Protected Plus", "Sohan", "Ajay", "LP202", 25000.0, 8);
		InsurancePolicy p3 = new InsurancePolicy("Car Shied Policy", "Ram", "Shyam", "CP303", 18000.0, 24);
		InsurancePolicy p4 = new InsurancePolicy("Family Care Insurance", "Shambhu", "Shiv", "FP404", 15000.0, 36);
		InsurancePolicy p5 = new InsurancePolicy("Travel Safe Plan", "Karan", "Arjun", "TP505", 5000.0, 24);
		InsurancePolicy p6 = new InsurancePolicy("Home Guard Policy", "Karan", "Tejaswani", "HG606", 22000, 48);
		InsurancePolicy p7 = new InsurancePolicy("Child Future Plan", "Elvish", "Rajat", "CF707", 25000, 5);
		InsurancePolicy p8 = new InsurancePolicy("Accident Cover Plan", "Samarth", "Abhishek", "AC808", 35000, 60);
		InsurancePolicy p9 = new InsurancePolicy("Senior Citizen Policy", "Kapil", "Krishna", "SC909", 56000, 72);
		InsurancePolicy p10 = new InsurancePolicy("Business Secure Policy", "Bhola", "Krishna", "BS010", 45000, 96);
		
		System.out.println("===============================================================================");
		
		System.out.println("=============Insurance Policy Details 1================");
		System.out.println("Object Reference is: " +p1);
		System.out.println("Policy Name is: " +p1.getPolicyname());
		System.out.println("Policy Holder Name is: " +p1.getPolicyHolderName());
		System.out.println("Agent Name is: " +p1.getAgentname());
		System.out.println("Policy Number is: " +p1.getPolicyNumber());
		System.out.println("Premium is: " +p1.getPremium());
		System.out.println("Policy Period is: " +p1.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 2================");
		System.out.println("Object Reference is: " +p2);
		System.out.println("Policy Name is: " +p2.getPolicyname());
		System.out.println("Policy Holder Name is: " +p2.getPolicyHolderName());
		System.out.println("Agent Name is: " +p2.getAgentname());
		System.out.println("Policy Number is: " +p2.getPolicyNumber());
		System.out.println("Premium is: " +p2.getPremium());
		System.out.println("Policy Period is: " +p2.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 3================");
		System.out.println("Object Reference is: " +p3);
		System.out.println("Policy Name is: " +p3.getPolicyname());
		System.out.println("Policy Holder Name is: " +p3.getPolicyHolderName());
		System.out.println("Agent Name is: " +p3.getAgentname());
		System.out.println("Policy Number is: " +p3.getPolicyNumber());
		System.out.println("Premium is: " +p3.getPremium());
		System.out.println("Policy Period is: " +p3.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 4================");
		System.out.println("Object Reference is: " +p4);
		System.out.println("Policy Name is: " +p4.getPolicyname());
		System.out.println("Policy Holder Name is: " +p4.getPolicyHolderName());
		System.out.println("Agent Name is: " +p4.getAgentname());
		System.out.println("Policy Number is: " +p4.getPolicyNumber());
		System.out.println("Premium is: " +p4.getPremium());
		System.out.println("Policy Period is: " +p4.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 5================");
		System.out.println("Object Reference is: " +p5);
		System.out.println("Policy Name is: " +p5.getPolicyname());
		System.out.println("Policy Holder Name is: " +p5.getPolicyHolderName());
		System.out.println("Agent Name is: " +p5.getAgentname());
		System.out.println("Policy Number is: " +p5.getPolicyNumber());
		System.out.println("Premium is: " +p5.getPremium());
		System.out.println("Policy Period is: " +p5.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 6================");
		System.out.println("Object Reference is: " +p6);
		System.out.println("Policy Name is: " +p6.getPolicyname());
		System.out.println("Policy Holder Name is: " +p6.getPolicyHolderName());
		System.out.println("Agent Name is: " +p6.getAgentname());
		System.out.println("Policy Number is: " +p6.getPolicyNumber());
		System.out.println("Premium is: " +p6.getPremium());
		System.out.println("Policy Period is: " +p6.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 7================");
		System.out.println("Object Reference is: " +p7);
		System.out.println("Policy Name is: " +p7.getPolicyname());
		System.out.println("Policy Holder Name is: " +p7.getPolicyHolderName());
		System.out.println("Agent Name is: " +p7.getAgentname());
		System.out.println("Policy Number is: " +p7.getPolicyNumber());
		System.out.println("Premium is: " +p7.getPremium());
		System.out.println("Policy Period is: " +p7.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 8================");
		System.out.println("Object Reference is: " +p8);
		System.out.println("Policy Name is: " +p8.getPolicyname());
		System.out.println("Policy Holder Name is: " +p8.getPolicyHolderName());
		System.out.println("Agent Name is: " +p8.getAgentname());
		System.out.println("Policy Number is: " +p8.getPolicyNumber());
		System.out.println("Premium is: " +p8.getPremium());
		System.out.println("Policy Period is: " +p8.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 9================");
		System.out.println("Object Reference is: " +p9);
		System.out.println("Policy Name is: " +p9.getPolicyname());
		System.out.println("Policy Holder Name is: " +p9.getPolicyHolderName());
		System.out.println("Agent Name is: " +p9.getAgentname());
		System.out.println("Policy Number is: " +p9.getPolicyNumber());
		System.out.println("Premium is: " +p9.getPremium());
		System.out.println("Policy Period is: " +p9.getPolicyPeriod());
		System.out.println("==============================================");
		System.out.println("=============Insurance Policy Details 10================");
		System.out.println("Object Reference is: " +p10);
		System.out.println("Policy Name is: " +p10.getPolicyname());
		System.out.println("Policy Holder Name is: " +p10.getPolicyHolderName());
		System.out.println("Agent Name is: " +p10.getAgentname());
		System.out.println("Policy Number is: " +p10.getPolicyNumber());
		System.out.println("Premium is: " +p10.getPremium());
		System.out.println("Policy Period is: " +p10.getPolicyPeriod());
		System.out.println("==============================================");
		

	}

}
