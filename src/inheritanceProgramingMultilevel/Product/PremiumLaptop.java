package inheritanceProgramingMultilevel.Product;

public class PremiumLaptop extends ProfessionalGamingLaptop{
	
	    String bodyMaterial;
	    double warrantyYears;
	    
	    PremiumLaptop(){
	    	
	    }	

	    PremiumLaptop(int productId, String productName, String brand, double price, String processor, int ram, double screenSize, int storage, String graphicsCard, int refreshRate, String coolingSystem, String keyboardType, String bodyMaterial, double warrantyYears) {

	        super(productId, productName, brand, price, processor, ram, screenSize, storage, graphicsCard, refreshRate, coolingSystem, keyboardType);
	        this.bodyMaterial = bodyMaterial;
	        this.warrantyYears = warrantyYears;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nBodyMaterial is: " + bodyMaterial + "\nWarrantyYears is: " + warrantyYears+"\n========================";
	    }
	

}
