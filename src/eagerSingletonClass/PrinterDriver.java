package eagerSingletonClass;

public class PrinterDriver {

	public static void main(String[] args) {
		
		System.out.println("====================Main Method Starts=====================");
		
		Printer p = Printer.getInstance();
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		
		p.printDocument("Invoice Document");
		p1.printDocument("Printer Document");
		p2.printDocument("Hardware Document");
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p == p1);
		System.out.println(p1 == p2);
		System.out.println(p2 == p);
		
		System.out.println("======================Main Method Ends=======================");

	}

}
