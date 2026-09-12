package inheritanceProgramingMultilevel.Product;

public class ElectronicProduct extends Product{
	
	    String brand;
	    double price;
	    
	    ElectronicProduct(){
	    	
	    }	

	    ElectronicProduct(int productId, String productName, String brand, double price) {

	        super(productId, productName);
	        this.brand = brand;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nBrand is: " + brand + "\nPrice is: " + price;
	    }
	

}
