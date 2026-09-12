package inheritancePrograming.ECommerce;

public class Mobile extends Electronics{
	
	    String model;
	    int ram;
	    boolean fiveG;
	    
	    Mobile(){
	    	
	    }

	    Mobile(String websiteName, String websiteLocation, int websiteId, String productName, int productId, double price, String brand, int warrantyYears, String model, int ram, boolean fiveG) {

	        super(websiteName, websiteLocation, websiteId, productName, productId, price, brand, warrantyYears);
	        this.model = model;
	        this.ram = ram;
	        this.fiveG = fiveG;
	    }
	    
	    @Override
	    public void service() {

	        System.out.println("Mobile " + productName
	                + " is available for online purchase from "
	                + websiteName + ".");
	    }

	    @Override
	    public String toString() {

	        return super.toString()+ "\nModel is: " + model + "\nRam is: " + ram + "\nFiveG is: " + fiveG +"\n=======================";
	    }
	

}
