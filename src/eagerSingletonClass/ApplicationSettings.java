package eagerSingletonClass;

public class ApplicationSettings {
	
	    private static ApplicationSettings as = new ApplicationSettings();

	    private String applicationName;
	    private String version;
	    private String environment;
	    private String language;
	    private boolean darkMode;
	    private int timeout;

	    private ApplicationSettings() {

	        applicationName = "My Application";
	        version = "1.0";
	        environment = "QA";
	        language = "English";
	        darkMode = false;
	        timeout = 30;

	        System.out.println("ApplicationSettings Object Created");
	    }

	    public static ApplicationSettings getInstance() {

	          return as;
	    }

	    // Getters

	    public String getApplicationName() {
	        return applicationName;
	    }

	    public String getVersion() {
	        return version;
	    }

	    public String getEnvironment() {
	        return environment;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public boolean isDarkMode() {
	        return darkMode;
	    }

	    public int getTimeout() {
	        return timeout;
	    }

	    // Setters

	    public void setApplicationName(String applicationName) {
	        this.applicationName = applicationName;
	    }

	    public void setVersion(String version) {
	        this.version = version;
	    }

	    public void setEnvironment(String environment) {
	        this.environment = environment;
	    }

	    public void setLanguage(String language) {
	        this.language = language;
	    }

	    public void setDarkMode(boolean darkMode) {
	        this.darkMode = darkMode;
	    }

	    public void setTimeout(int timeout) {
	        this.timeout = timeout;
	    }

	    // Display method

	    public void	printInfo() {

	        System.out.println("Application Name : " + applicationName);
	        System.out.println("Version          : " + version);
	        System.out.println("Environment      : " + environment);
	        System.out.println("Language         : " + language);
	        System.out.println("Dark Mode        : " + darkMode);
	        System.out.println("Timeout          : " + timeout + " seconds");
	    }
	

}
