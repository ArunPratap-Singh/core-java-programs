package lazySingletonClass;

public class ATMMachineDriver {

	public static void main(String[] args) {

		ATMMachine a1 = ATMMachine.getInstance();
		ATMMachine a2 = ATMMachine.getInstance();
		ATMMachine a3 = ATMMachine.getInstance();

		System.out.println("===== ATM DETAILS =====");

		a1.displayATMDetails();
		System.out.println("=======");
		a2.displayATMDetails();
		System.out.println("=======");
		a3.displayATMDetails();

		System.out.println("===== ATM OPERATIONS =====");

		a1.checkBalance("10001", 25000);
		a1.withdraw("10001", 25000, 5000);
		a1.deposit("10001", 20000, 3000);
		System.out.println("=========================");
		a2.checkBalance("10002", 25000);
		a2.withdraw("10002", 26000, 6000);
		a2.deposit("10002", 200000, 30000);
		System.out.println("=========================");
		a3.checkBalance("10003", 250000);
		a3.withdraw("10003", 305000, 50000);
		a3.deposit("10003", 300000, 30000);
		
		System.out.println("==========================");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println("===== SINGLETON VERIFICATION =====");
		System.out.println("a1 == a2 : " + (a1 == a2));
		System.out.println("a2 == a3 : " + (a2 == a3));
		System.out.println("a1 == a3 : " + (a1 == a3));

	}

}
