package lazySingletonClass;

public class Logger {
	
	private static Logger l = null;
	
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if(l == null) {
			l = new Logger();
		}
		
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
