package lazySingletonClass;

public class DatabaseConnectionDriver {

	public static void main(String[] args) {
		
		DatabaseConnection dc = DatabaseConnection.getInstance();
		DatabaseConnection dc1 = DatabaseConnection.getInstance();
		DatabaseConnection dc2 = DatabaseConnection.getInstance();
		
		dc.connect();
		dc.disconnect();
		dc.executeQuery("SELECT * from Employee");
		System.out.println("=======================");
		dc.connect();
		dc.disconnect();
		dc.executeQuery("SELECT * from Employee");
		System.out.println("=========================");
		dc.connect();
		dc.disconnect();
		dc.executeQuery("SELECT * from Employee");
		System.out.println("=========================");
		
		System.out.println(dc);
		System.out.println(dc1);
		System.out.println(dc2);
	
		System.out.println("=========================");
		
		System.out.println("dc == dc1: " +(dc == dc1));
		System.out.println("dc == dc1: " +(dc1 == dc2));
		System.out.println("dc == dc1: " +(dc2 == dc));

	}

}
