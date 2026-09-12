package inheritancePrograming.ECommerce;

public class Electronics extends Product{
	
	    String brand;
	    int warrantyYears;
	    
	    Electronics(){
	    	
	    }

	    Electronics(String websiteName, String websiteLocation, int websiteId, String productName, int productId, double price, String brand, int warrantyYears) {

	        super(websiteName, websiteLocation, websiteId, productName, productId, price);
	        this.brand = brand;
	        this.warrantyYears = warrantyYears;
	    }

	    public void switchOn() {

	        System.out.println(productName
	                + " is an electronic product.");
	    }

	    @Override
	    public String toString() {

	        return super.toString()+ "\nBrand is: " + brand + "\nWarrantyYears is: " + warrantyYears;
	    }
	

}
