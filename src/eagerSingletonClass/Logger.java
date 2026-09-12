package eagerSingletonClass;

public class Logger {
	
	private static Logger l = new Logger();
	
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		return l;
	}
	
	public void info(String message) {
		
		System.out.println("Info " +message);
	}
	
	public void error(String message) {
		
		System.out.println("Erro " +message);
	}
	
	public void warning(String message) {
		
		System.out.println("Warning " +message);
	}

}
