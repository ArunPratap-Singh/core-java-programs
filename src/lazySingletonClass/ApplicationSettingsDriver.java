package lazySingletonClass;

public class ApplicationSettingsDriver {

	public static void main(String[] args) {
		
		        ApplicationSettings a1 = ApplicationSettings.getInstance();

		        ApplicationSettings a2 = ApplicationSettings.getInstance();

		        ApplicationSettings a3 = ApplicationSettings.getInstance();

		        a1.printInfo();
		        System.out.println("==========");
		        a2.printInfo();
		        System.out.println("==========");
		        a3.printInfo();
		        System.out.println("=============================");
		        
		        a2.setApplicationName("Banking Application");
		        a2.setVersion("2.0");
		        a2.setEnvironment("Production");
		        a2.setLanguage("Hindi");
		        a2.setDarkMode(true);
		        a2.setTimeout(60);

		        System.out.println("===== After Change =====");

		        System.out.println("==============Application Settings a2 Details================");
		        System.out.println("Object Reference is: " +a2);
		        System.out.println("Application Name is: " +a2.getApplicationName());
		        System.out.println("Version is: " +a2.getVersion());
		        System.out.println("Environment is: " +a2.getEnvironment());
		        System.out.println("Language is: " +a2.getLanguage());
		        System.out.println("Timeout is: " +a2.getTimeout());
		        System.out.println("Dark Mode is: " +a2.isDarkMode());
		        
		   		System.out.println("===== Singleton Verification =====");

		        System.out.println("a1 == a2 : " + (a1 == a2));
		        System.out.println("a2 == a3 : " + (a2 == a3));
		        System.out.println("a1 == a3 : " + (a1 == a3));
		    }
		

	

}
