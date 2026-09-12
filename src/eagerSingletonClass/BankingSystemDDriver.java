package eagerSingletonClass;

public class BankingSystemDDriver {

	    public static void main(String[] args) {

	        BankingSystem b1 = BankingSystem.getBankingSystem();

	        BankingSystem b2 = BankingSystem.getBankingSystem();

	        BankingSystem b3 = BankingSystem.getBankingSystem();

	        System.out.println("===== BANK DETAILS =====");

	        b1.printInfo();
	        System.out.println("========");
	        b2.printInfo();
	        System.out.println("========");
	        b3.printInfo();
	        
	        System.out.println("=============After Change================");
	        b2.setBankName("ICICI Bank");
	        b2.setBranchName("Hazratganj Branch");
	        b2.setIfscCode("ABCD1234545IN");
	        
	        b2.printInfo();

	        System.out.println("===== BANKING OPERATIONS =====");

	        b1.deposit("10001", 5000);
	        b1.withdraw("10001", 1500);
	        b1.transfer("10001", "20001", 2000);
	        System.out.println("===================");
	        b2.deposit("10002", 50000);
	        b2.withdraw("10002", 15000);
	        b2.transfer("10002", "20002", 5000);
	        System.out.println("===================");
	        b3.deposit("10003", 15000);
	        b3.withdraw("10004", 500);
	        b3.transfer("10003", "20003", 3000);

	        System.out.println("===== SINGLETON VERIFICATION =====");

	        System.out.println("b1 == b2 : " + (b1 == b2));

	        System.out.println("b2 == b3 : " + (b2 == b3));

	        System.out.println("b1 == b3 : " + (b1 == b3));
	    
		

	}

}
