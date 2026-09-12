package inheritancePrograming.ECommerce;

public class ECommerce {
	
	    String websiteName;
	    String websiteLocation;
	    int websiteId;
	    
	    ECommerce(){
	    	
	    }

	    ECommerce(String websiteName, String websiteLocation, int websiteId) {

	        this.websiteName = websiteName;
	        this.websiteLocation = websiteLocation;
	        this.websiteId = websiteId;
	    }

	    public void service() {

	        System.out.println(websiteName
	                + " provides online shopping services.");
	    }

	    @Override
	    public String toString() {

	        return "\nWebsiteName is: " + websiteName + "\nWebsiteLocation is: " + websiteLocation + "WebsiteId=" + websiteId;
	    }
	

}
