package lazySingletonClass;

public class TestDataManager {
	
	   	private static TestDataManager tdm;

	    private String username;
	    private String password;
	    private String browser;
	    private String environment;

	    
	    private TestDataManager() {

	        username = "admin";
	        password = "admin123";
	        browser = "Chrome";
	        environment = "QA";

	        System.out.println("TestDataManager Object Created");
	    }

	    public static TestDataManager getInsatnce() {
	    	
	    	if(tdm == null) {
	    		tdm = new TestDataManager();
	    	}

	        return tdm;
	    }

	    // Getters

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getBrowser() {
	        return browser;
	    }

	    public String getEnvironment() {
	        return environment;
	    }

	    // Setters

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setBrowser(String browser) {
	        this.browser = browser;
	    }

	    public void setEnvironment(String environment) {
	        this.environment = environment;
	    }

	    // printInfo test data

	    public void printInfo() {

	        System.out.println("Username    : " + username);
	        System.out.println("Password    : " + password);
	        System.out.println("Browser     : " + browser);
	        System.out.println("Environment : " + environment);
	    }
	 
	   
}
