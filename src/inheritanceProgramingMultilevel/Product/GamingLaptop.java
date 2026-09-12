package inheritanceProgramingMultilevel.Product;

public class GamingLaptop extends Laptop{
	
	    String graphicsCard;
	    int refreshRate;
	    
	    GamingLaptop(){
	    	
	    }

	    GamingLaptop(int productId, String productName, String brand, double price, String processor, int ram, double screenSize, int storage, String graphicsCard, int refreshRate) {

	        super(productId, productName, brand, price, processor, ram, screenSize, storage);
	        this.graphicsCard = graphicsCard;
	        this.refreshRate = refreshRate;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nGraphicsCard is: " + graphicsCard + "\nRefreshRate is: " + refreshRate + " Hz";
	    }
	

}
