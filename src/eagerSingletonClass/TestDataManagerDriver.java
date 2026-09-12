package eagerSingletonClass;

public class TestDataManagerDriver {

	public static void main(String[] args) {
		
		TestDataManager tdm = TestDataManager.getInsatnce();
		TestDataManager tdm1 = TestDataManager.getInsatnce();
		TestDataManager tdm2 = TestDataManager.getInsatnce();
		
		tdm.printInfo();
		System.out.println("========");
		tdm1.printInfo();
		System.out.println("========");
		tdm2.printInfo();
		
		tdm.setBrowser("Edge");
		tdm.setEnvironment("QC");
		tdm.setUsername("Arun");
		tdm.setPassword("Engineer");
		
		System.out.println("=================After Change=======================");
		
		System.out.println("=================Tdm Details==================");
		System.out.println("Browser is: " +tdm.getBrowser());
		System.out.println("Environment is: " +tdm.getEnvironment());
		System.out.println("Username is: " +tdm.getUsername());
		System.out.println("Password is: " +tdm.getPassword());
		
		System.out.println("=======================================");
		
		System.out.println(tdm);
		System.out.println(tdm1);
		System.out.println(tdm2);
		
		System.out.println("===== Singleton Verification =====");

        System.out.println("tdm == tdm1 : " + (tdm == tdm1));
        System.out.println("tdm1 == tdm2 : " + (tdm1 == tdm2));
        System.out.println("tdm2 == tdm : " + (tdm2 == tdm));

	}

}
