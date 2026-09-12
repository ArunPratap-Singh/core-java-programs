package lazySingletonClass;

public class AutomationLoggerDriver {

	public static void main(String[] args) {
		
	        AutomationLogger a1 = AutomationLogger.getAutomationLogger();

	        a1.info("Automation execution started");

	        a1.debug("Opening Chrome browser");

	        a1.success("Browser opened successfully");

	        System.out.println("============================================");
	        
	        AutomationLogger a2 = AutomationLogger.getAutomationLogger();

	        a2.info("Opening application URL");

	        a2.warning("Page loading is taking longer than expected");
	        
	        System.out.println("============================================");

	        AutomationLogger a3 = AutomationLogger.getAutomationLogger();

	        a3.error("Login button was not displayed");
	        
	        System.out.println("=============================================");

	        System.out.println("a1 == a2 : " + (a1 == a2));

	        System.out.println("a2 == a3 : " + (a2 == a3));

	        System.out.println("a1 == a3 : " + (a1 == a3));
		    
		

	}

}
