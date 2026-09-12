package inheritancePrograming.Product;

public class Product {
	
	String productName;
    int productId;
    double price;
    String brand;
    
    Product(){
    	
    }

    Product(String productName, int productId, double price, String brand) {

        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.brand = brand;
    }
    @Override
    public String toString() {
    	return "ProductName is: " +productName+"\nProductID is: " +productId+"\nPrice is: " +price+"\nBrand is: " +brand+"\n========================";
    }

}
