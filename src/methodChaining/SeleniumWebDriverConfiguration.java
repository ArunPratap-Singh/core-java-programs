package methodChaining;

public class SeleniumWebDriverConfiguration {
	

		private String browserName;
		private String browserVersion;
		private String operatingSystem;
		private String driverName;
		private String driverVersion;
		private String driverPath;
		private String baseUrl;
		private String environment;
		private String executionMode;
		private String headlessMode;
		private int implicitWait;
		private int explicitWait;
		private int pageLoadTimeout;
		private int scriptTimeout;
		private String windowSize;
		private String maximizeWindow;
		private String acceptInsecureCertificates;
		private String downloadDirectory;
		private String screenshotOnFailure;
		private String configurationStatus;

		// Setter Methods

		public SeleniumWebDriverConfiguration setBrowserName(String browserName) {
			this.browserName = browserName;
			return this;
		}

		public SeleniumWebDriverConfiguration setBrowserVersion(String browserVersion) {
			this.browserVersion = browserVersion;
			return this;
		}

		public SeleniumWebDriverConfiguration setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
			return this;
		}

		public SeleniumWebDriverConfiguration setDriverName(String driverName) {
			this.driverName = driverName;
			return this;
		}

		public SeleniumWebDriverConfiguration setDriverVersion(String driverVersion) {
			this.driverVersion = driverVersion;
			return this;
		}

		public SeleniumWebDriverConfiguration setDriverPath(String driverPath) {
			this.driverPath = driverPath;
			return this;
		}

		public SeleniumWebDriverConfiguration setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
			return this;
		}

		public SeleniumWebDriverConfiguration setEnvironment(String environment) {
			this.environment = environment;
			return this;
		}

		public SeleniumWebDriverConfiguration setExecutionMode(String executionMode) {
			this.executionMode = executionMode;
			return this;
		}

		public SeleniumWebDriverConfiguration setHeadlessMode(String headlessMode) {
			this.headlessMode = headlessMode;
			return this;
		}

		public SeleniumWebDriverConfiguration setImplicitWait(int implicitWait) {
			this.implicitWait = implicitWait;
			return this;
		}

		public SeleniumWebDriverConfiguration setExplicitWait(int explicitWait) {
			this.explicitWait = explicitWait;
			return this;
		}

		public SeleniumWebDriverConfiguration setPageLoadTimeout(int pageLoadTimeout) {
			this.pageLoadTimeout = pageLoadTimeout;
			return this;
		}

		public SeleniumWebDriverConfiguration setScriptTimeout(int scriptTimeout) {
			this.scriptTimeout = scriptTimeout;
			return this;
		}

		public SeleniumWebDriverConfiguration setWindowSize(String windowSize) {
			this.windowSize = windowSize;
			return this;
		}

		public SeleniumWebDriverConfiguration setMaximizeWindow(String maximizeWindow) {
			this.maximizeWindow = maximizeWindow;
			return this;
		}

		public SeleniumWebDriverConfiguration setAcceptInsecureCertificates(String acceptInsecureCertificates) {
			this.acceptInsecureCertificates = acceptInsecureCertificates;
			return this;
		}

		public SeleniumWebDriverConfiguration setDownloadDirectory(String downloadDirectory) {
			this.downloadDirectory = downloadDirectory;
			return this;
		}

		public SeleniumWebDriverConfiguration setScreenshotOnFailure(String screenshotOnFailure) {
			this.screenshotOnFailure = screenshotOnFailure;
			return this;
		}

		public SeleniumWebDriverConfiguration setConfigurationStatus(String configurationStatus) {
			this.configurationStatus = configurationStatus;
			return this;
		}

		// Print Methods

		public SeleniumWebDriverConfiguration printBrowserName() {
			System.out.println("Browser Name: " + browserName);
			return this;
		}

		public SeleniumWebDriverConfiguration printBrowserVersion() {
			System.out.println("Browser Version: " + browserVersion);
			return this;
		}

		public SeleniumWebDriverConfiguration printOperatingSystem() {
			System.out.println("Operating System: " + operatingSystem);
			return this;
		}

		public SeleniumWebDriverConfiguration printDriverName() {
			System.out.println("Driver Name: " + driverName);
			return this;
		}

		public SeleniumWebDriverConfiguration printDriverVersion() {
			System.out.println("Driver Version: " + driverVersion);
			return this;
		}

		public SeleniumWebDriverConfiguration printDriverPath() {
			System.out.println("Driver Path: " + driverPath);
			return this;
		}

		public SeleniumWebDriverConfiguration printBaseUrl() {
			System.out.println("Base URL: " + baseUrl);
			return this;
		}

		public SeleniumWebDriverConfiguration printEnvironment() {
			System.out.println("Environment: " + environment);
			return this;
		}

		public SeleniumWebDriverConfiguration printExecutionMode() {
			System.out.println("Execution Mode: " + executionMode);
			return this;
		}

		public SeleniumWebDriverConfiguration printHeadlessMode() {
			System.out.println("Headless Mode: " + headlessMode);
			return this;
		}

		public SeleniumWebDriverConfiguration printImplicitWait() {
			System.out.println("Implicit Wait: " + implicitWait + " seconds");
			return this;
		}

		public SeleniumWebDriverConfiguration printExplicitWait() {
			System.out.println("Explicit Wait: " + explicitWait + " seconds");
			return this;
		}

		public SeleniumWebDriverConfiguration printPageLoadTimeout() {
			System.out.println("Page Load Timeout: " + pageLoadTimeout + " seconds");
			return this;
		}

		public SeleniumWebDriverConfiguration printScriptTimeout() {
			System.out.println("Script Timeout: " + scriptTimeout + " seconds");
			return this;
		}

		public SeleniumWebDriverConfiguration printWindowSize() {
			System.out.println("Window Size: " + windowSize);
			return this;
		}

		public SeleniumWebDriverConfiguration printMaximizeWindow() {
			System.out.println("Maximize Window: " + maximizeWindow);
			return this;
		}

		public SeleniumWebDriverConfiguration printAcceptInsecureCertificates() {
			System.out.println("Accept Insecure Certificates: " + acceptInsecureCertificates);
			return this;
		}

		public SeleniumWebDriverConfiguration printDownloadDirectory() {
			System.out.println("Download Directory: " + downloadDirectory);
			return this;
		}

		public SeleniumWebDriverConfiguration printScreenshotOnFailure() {
			System.out.println("Screenshot On Failure: " + screenshotOnFailure);
			return this;
		}

		public SeleniumWebDriverConfiguration printConfigurationStatus() {
			System.out.println("Configuration Status: " + configurationStatus);
			return this;
		}
	

}
