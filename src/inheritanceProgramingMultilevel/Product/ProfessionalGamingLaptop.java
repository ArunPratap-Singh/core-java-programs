package inheritanceProgramingMultilevel.Product;

public class ProfessionalGamingLaptop extends GamingLaptop{
	
	    String coolingSystem;
	    String keyboardType;
	    
	    ProfessionalGamingLaptop(){
	    	
	    }	

	    ProfessionalGamingLaptop(int productId, String productName, String brand, double price, String processor, int ram, double screenSize, int storage, String graphicsCard, int refreshRate, String coolingSystem, String keyboardType) {

	        super(productId, productName, brand, price, processor, ram, screenSize, storage, graphicsCard, refreshRate);
	        this.coolingSystem = coolingSystem;
	        this.keyboardType = keyboardType;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nCoolingSystem is: " + coolingSystem + "\nKeyboardType is: " + keyboardType;
	    }
	

}
