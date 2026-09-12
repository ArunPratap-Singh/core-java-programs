package lazySingletonClass;

public class ConfiguartionManagerDriver {
	
	public static void main(String[] args) {
		
		ConfiguartionManager cm = ConfiguartionManager.getInstance();
		ConfiguartionManager cm1 = ConfiguartionManager.getInstance();
		ConfiguartionManager cm2 = ConfiguartionManager.getInstance();
		
		cm.printConfiguration();
		System.out.println("======");
		cm1.printConfiguration();
		System.out.println("=======");
		cm2.printConfiguration();
		
		
		System.out.println("================Before change===================");
		
		System.out.println("==============ConfiguartionManager cm details===============");
		System.out.println("ObjectReference is: " +cm);
		System.out.println("Browser is: " +cm.getBrowser());
		System.out.println("Environment is: " +cm.getEnvironment());
		System.out.println("URL is: " +cm.getUrl());
		
		
		cm.setBrowser("Edge");
		cm.setEnvironment("Production");
		cm.setURL("www.google.com");
		
		
		System.out.println("===================After Change====================");
		
		System.out.println("==============ConfiguartionManager cm details===============");
		System.out.println("ObjectReference is: " +cm);
		System.out.println("Browser is: " +cm.getBrowser());
		System.out.println("Environment is: " +cm.getEnvironment());
		System.out.println("URL is: " +cm.getUrl());
		
				
		
	}

}
