package contructor.ConstructorChaining;

public class Product {
	
	    String productName;
	    int productId;
	    String category;
	    double price;
	    int quantity;
	    String brand;
	    String color;
	    String warranty;

	    Product(String productName, int productId, String category, double price, int quantity, String brand, String color, String warranty) {

	        this.productName = productName;
	        this.productId = productId;
	        this.category = category;
	        this.price = price;
	        this.quantity = quantity;
	        this.brand = brand;
	        this.color = color;
	        this.warranty = warranty;
	    }

	    Product() {
	    }

	    Product(String productName) {
	        this.productName = productName;
	    }

	    Product(String productName, int productId) {
	        this(productName);
	        this.productId = productId;
	    }

	    Product(String productName, int productId, String category) {
	        this(productName, productId);
	        this.category = category;
	    }

	    Product(String productName, int productId, String category, double price) {
	        this(productName, productId, category);
	        this.price = price;
	    }

	    Product(String productName, int productId, String category, double price, int quantity) {
	        this(productName, productId, category, price);
	        this.quantity = quantity;
	    }

	    Product(String productName, int productId, String category, double price, int quantity, String brand) {
	        this(productName, productId, category, price, quantity);
	        this.brand = brand;
	    }

	    Product(String productName, int productId, String category, double price, int quantity, String brand, String color) {
	        this(productName, productId, category, price, quantity, brand);
	        this.color = color;
	    }

	    Product(int productId, String productName, String category, double price, int quantity, String brand, String color, String warranty) {

	        this(productName, productId, category, price, quantity, brand, color);
	        this.warranty = warranty;
	    }

	    public String toString() {

	        return "Product Name is: " + productName + "\tProduct ID is: " + productId + "\tCategory is: " + category + "\nPrice is: " + price + "\tQuantity is: " + quantity + "\tBrand is: " + brand + "\nColor is: " + color  + "\tWarranty is: " + warranty + "\n===============================================";
	    }
	

}
