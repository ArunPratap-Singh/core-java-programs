package inheritanceProgramingMultilevel.Product;

public class Laptop extends Computer{
	
	    double screenSize;
	    int storage;
	    
	    Laptop(){
	    	
	    }

	    Laptop(int productId, String productName, String brand, double price, String processor, int ram, double screenSize, int storage) {

	        super(productId, productName, brand, price, processor, ram);
	        this.screenSize = screenSize;
	        this.storage = storage;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nScreenSize is: " + screenSize + " inches"+ "\nStorage is: " + storage + " GB";
	    }
	

}
