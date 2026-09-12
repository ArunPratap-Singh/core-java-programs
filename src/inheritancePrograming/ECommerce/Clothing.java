package inheritancePrograming.ECommerce;

public class Clothing extends Product{
	
	    String size;
	    String material;
	    
	    Clothing(){
	    	
	    }

	    Clothing(String websiteName, String websiteLocation, int websiteId, String productName, int productId, double price, String size, String material) {

	        super(websiteName, websiteLocation, websiteId, productName, productId, price);
	        this.size = size;
	        this.material = material;
	    }

	    @Override
	    public void service() {

	        System.out.println(productName+ " clothing product is available on " + websiteName + ".");
	    }

	    @Override
	    public String toString() {

	        return super.toString()+ "\nSize is: " + size + "\nMaterial is: " + material + "\n==========================";
	    }
	

}
