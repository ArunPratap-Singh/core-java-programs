package lazySingletonClass;

public class ConfiguartionManager {
	
	    private static ConfiguartionManager cm;
	    
	    private String browser;
	    private String environment;
	    private String URL;
	    
	    private ConfiguartionManager() {
	    	
	    	browser = "Chrome";
	    	environment = "QA";
	    	URL = "https://example.com";
	    	
	    	System.out.println("ConfigurationManager Object Created");
	    	
	    }
	    
	    public static ConfiguartionManager getInstance() {
	    	
	    	if(cm == null) {
	    		cm = new ConfiguartionManager();
	    	}
	    	return cm;
	    }
	    
	    public void setBrowser(String browser) {
	    	this.browser = browser;
	    }
	    
	    public void setURL(String URL) {
	    	this.URL = URL;
	    }
	    
	    public void setEnvironment(String enviornment) {
	    	this.environment = enviornment;
	    }
	    
	    public String getBrowser() {
	    	return browser;
	    }
	    
	    public String getEnvironment() {
	        return environment;
	    }

	    public String getUrl() {
	        return URL;
	    }
	    
	    public void printConfiguration() {

	        System.out.println("Browser      : " + browser);
	        System.out.println("Environment  : " + environment);
	        System.out.println("URL          : " + URL);
	    }


}
