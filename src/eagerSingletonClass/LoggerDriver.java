package eagerSingletonClass;

public class LoggerDriver {

	public static void main(String[] args) {
		
		Logger l = Logger.getInstance();
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		l.info("Application Started");
		l.error("Something Went Wrong");
		l.warning("This is Warning Message");
		System.out.println("===================");
		l1.info("Application Started");
		l1.error("Something Went Wrong");
		l1.warning("This is Warning Message");
		System.out.println("======================");
		l2.info("Application Started");
		l2.error("Something Went Wrong");
		l2.warning("This is Warning Message");
		System.out.println("=======================");
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("=========================");
		System.out.println(l == l1);
		System.out.println(l1 == l2);
		System.out.println(l2 == l);

	}

}
