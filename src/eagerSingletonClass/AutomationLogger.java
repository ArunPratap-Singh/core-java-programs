package eagerSingletonClass;

import java.time.LocalDateTime;

public class AutomationLogger {

	private static AutomationLogger al = new AutomationLogger();

	private AutomationLogger() {

		System.out.println("AutomationLogger Object Created");
	}

	public static AutomationLogger getAutomationLogger() {

		return al;
	}

	
	public void info(String message) {

		System.out.println(LocalDateTime.now() + " [INFO] " + message);
	}

	
	public void debug(String message) {

		System.out.println(LocalDateTime.now() + " [DEBUG] " + message);
	}

	
	public void warning(String message) {

		System.out.println(LocalDateTime.now() + " [WARNING] " + message);
	}

	
	public void error(String message) {

		System.out.println(LocalDateTime.now() + " [ERROR] " + message);
	}

	
	public void success(String message) {

		System.out.println(LocalDateTime.now() + " [SUCCESS] " + message);
	}

}
