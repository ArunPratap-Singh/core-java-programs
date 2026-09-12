package lazySingletonClass;

public class Printer {
	
	private static Printer p; //We can write null here also 
							  //we can write final also
	
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		
		if(p == null) {
			p = new Printer();
		}
		return p;
	}
	
	public void printDocument(String document) {
		
		System.out.println("Printing Document: " +document);
	}

}
