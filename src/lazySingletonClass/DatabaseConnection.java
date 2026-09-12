package lazySingletonClass;

public class DatabaseConnection {
	
	private static DatabaseConnection dc;
	
	private DatabaseConnection() {
		
	}
	
	public static DatabaseConnection getInstance() {
		
		if(dc == null) {
			dc = new DatabaseConnection();
		}
		
		return dc;
	}
	
	public void connect() {
        System.out.println("Database connected successfully");
    }

    public void disconnect() {
        System.out.println("Database disconnected successfully");
    }

    public void executeQuery(String query) {
        System.out.println("Executing Query: " + query);
    }    

}
