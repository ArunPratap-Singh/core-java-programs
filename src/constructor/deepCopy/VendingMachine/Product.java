package constructor.deepCopy.VendingMachine;

public class Product {
	
	    int productId;
	    String productName;
	    int price;
	    String category;
	    double weight;
	    String manufacturer;

	    Product() {
	    }

	    Product(int productId, String productName, int price, String category, double weight, String manufacturer) {

	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.category = category;
	        this.weight = weight;
	        this.manufacturer = manufacturer;
	    }

	    public String toString() {
	        return "ProductId is: " + productId + "\nProductName is: " + productName + "\nPrice is: " + price + "\nCategory is: " + category + "\nWeight is: " + weight + "\nManufacturer is: " + manufacturer;
	    }
	

}
