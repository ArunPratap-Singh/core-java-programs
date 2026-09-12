package methodChaining;

public class SeleniumLoginPage {
	
	    private String pageName;
	    private String pageUrl;
	    private String usernameField;
	    private String passwordField;
	    private String loginButton;
	    private String forgotPasswordLink;
	    private String rememberMeCheckbox;
	    private String usernameLocator;
	    private String passwordLocator;
	    private String loginButtonLocator;
	    private String forgotPasswordLocator;
	    private String pageTitle;
	    private String browserName;
	    private String environment;
	    private int implicitWait;
	    private int explicitWait;
	    private String authenticationType;
	    private String loginStatus;
	    private String errorMessage;
	    private String dashboardUrl;
	    
	    //Setters

	    public SeleniumLoginPage setPageName(String pageName) {
	        this.pageName = pageName;
	        return this;
	    }

	    public SeleniumLoginPage setPageUrl(String pageUrl) {
	        this.pageUrl = pageUrl;
	        return this;
	    }

	    public SeleniumLoginPage setUsernameField(String usernameField) {
	        this.usernameField = usernameField;
	        return this;
	    }

	    public SeleniumLoginPage setPasswordField(String passwordField) {
	        this.passwordField = passwordField;
	        return this;
	    }

	    public SeleniumLoginPage setLoginButton(String loginButton) {
	        this.loginButton = loginButton;
	        return this;
	    }

	    public SeleniumLoginPage setForgotPasswordLink(String forgotPasswordLink) {
	        this.forgotPasswordLink = forgotPasswordLink;
	        return this;
	    }

	    public SeleniumLoginPage setRememberMeCheckbox(String rememberMeCheckbox) {
	        this.rememberMeCheckbox = rememberMeCheckbox;
	        return this;
	    }

	    public SeleniumLoginPage setUsernameLocator(String usernameLocator) {
	        this.usernameLocator = usernameLocator;
	        return this;
	    }

	    public SeleniumLoginPage setPasswordLocator(String passwordLocator) {
	        this.passwordLocator = passwordLocator;
	        return this;
	    }

	    public SeleniumLoginPage setLoginButtonLocator(String loginButtonLocator) {
	        this.loginButtonLocator = loginButtonLocator;
	        return this;
	    }

	    public SeleniumLoginPage setForgotPasswordLocator(String forgotPasswordLocator) {
	        this.forgotPasswordLocator = forgotPasswordLocator;
	        return this;
	    }

	    public SeleniumLoginPage setPageTitle(String pageTitle) {
	        this.pageTitle = pageTitle;
	        return this;
	    }

	    public SeleniumLoginPage setBrowserName(String browserName) {
	        this.browserName = browserName;
	        return this;
	    }

	    public SeleniumLoginPage setEnvironment(String environment) {
	        this.environment = environment;
	        return this;
	    }

	    public SeleniumLoginPage setImplicitWait(int implicitWait) {
	        this.implicitWait = implicitWait;
	        return this;
	    }

	    public SeleniumLoginPage setExplicitWait(int explicitWait) {
	        this.explicitWait = explicitWait;
	        return this;
	    }

	    public SeleniumLoginPage setAuthenticationType(String authenticationType) {
	        this.authenticationType = authenticationType;
	        return this;
	    }

	    public SeleniumLoginPage setLoginStatus(String loginStatus) {
	        this.loginStatus = loginStatus;
	        return this;
	    }

	    public SeleniumLoginPage setErrorMessage(String errorMessage) {
	        this.errorMessage = errorMessage;
	        return this;
	    }

	    public SeleniumLoginPage setDashboardUrl(String dashboardUrl) {
	        this.dashboardUrl = dashboardUrl;
	        return this;
	    }
	    
	    //Getters

	    public SeleniumLoginPage printPageName() {
	        System.out.println("Page Name: " + pageName);
	        return this;
	    }

	    public SeleniumLoginPage printPageUrl() {
	        System.out.println("Page URL: " + pageUrl);
	        return this;
	    }

	    public SeleniumLoginPage printUsernameField() {
	        System.out.println("Username Field: " + usernameField);
	        return this;
	    }

	    public SeleniumLoginPage printPasswordField() {
	        System.out.println("Password Field: " + passwordField);
	        return this;
	    }

	    public SeleniumLoginPage printLoginButton() {
	        System.out.println("Login Button: " + loginButton);
	        return this;
	    }

	    public SeleniumLoginPage printForgotPasswordLink() {
	        System.out.println("Forgot Password Link: " + forgotPasswordLink);
	        return this;
	    }

	    public SeleniumLoginPage printRememberMeCheckbox() {
	        System.out.println("Remember Me Checkbox: " + rememberMeCheckbox);
	        return this;
	    }

	    public SeleniumLoginPage printUsernameLocator() {
	        System.out.println("Username Locator: " + usernameLocator);
	        return this;
	    }

	    public SeleniumLoginPage printPasswordLocator() {
	        System.out.println("Password Locator: " + passwordLocator);
	        return this;
	    }

	    public SeleniumLoginPage printLoginButtonLocator() {
	        System.out.println("Login Button Locator: " + loginButtonLocator);
	        return this;
	    }

	    public SeleniumLoginPage printForgotPasswordLocator() {
	        System.out.println("Forgot Password Locator: " + forgotPasswordLocator);
	        return this;
	    }

	    public SeleniumLoginPage printPageTitle() {
	        System.out.println("Page Title: " + pageTitle);
	        return this;
	    }

	    public SeleniumLoginPage printBrowserName() {
	        System.out.println("Browser Name: " + browserName);
	        return this;
	    }

	    public SeleniumLoginPage printEnvironment() {
	        System.out.println("Environment: " + environment);
	        return this;
	    }

	    public SeleniumLoginPage printImplicitWait() {
	        System.out.println("Implicit Wait: " + implicitWait + " seconds");
	        return this;
	    }

	    public SeleniumLoginPage printExplicitWait() {
	        System.out.println("Explicit Wait: " + explicitWait + " seconds");
	        return this;
	    }

	    public SeleniumLoginPage printAuthenticationType() {
	        System.out.println("Authentication Type: " + authenticationType);
	        return this;
	    }

	    public SeleniumLoginPage printLoginStatus() {
	        System.out.println("Login Status: " + loginStatus);
	        return this;
	    }

	    public SeleniumLoginPage printErrorMessage() {
	        System.out.println("Error Message: " + errorMessage);
	        return this;
	    }

	    public SeleniumLoginPage printDashboardUrl() {
	        System.out.println("Dashboard URL: " + dashboardUrl);
	        return this;
	    }
	

}
