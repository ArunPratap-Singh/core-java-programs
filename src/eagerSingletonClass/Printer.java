package eagerSingletonClass;

public class Printer {
	
	private static Printer p = new Printer();
	
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		return p;
	}
	
	public void printDocument(String document) {
		
		System.out.println("Printing Document: " +document);
	}

}
