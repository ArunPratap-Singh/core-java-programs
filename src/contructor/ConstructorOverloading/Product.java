package contructor.ConstructorOverloading;

public class Product {
	
		String name;
	    int productId;
	    double price;
	    String category;
	    String brand;
	    String color;
	    int quantity;

	    Product() {
	    }

	    Product(String name) {
	        this.name = name;
	    }

	    Product(int productId) {
	        this.productId = productId;
	    }

	    Product(double price) {
	        this.price = price;
	    }

	    Product(long quantity) {
	        this.quantity = (int) quantity;
	    }

	    Product(String name, int productId) {
	        this.name = name;
	        this.productId = productId;
	    }

	    Product(int productId, String name) {
	        this.productId = productId;
	        this.name = name;
	    }

	    Product(double price, String category) {
	        this.price = price;
	        this.category = category;
	    }

	    Product(String category, double price) {
	        this.category = category;
	        this.price = price;
	    }

	    Product(int productId, double price) {
	        this.productId = productId;
	        this.price = price;
	    }

	    Product(double price, int productId) {
	        this.price = price;
	        this.productId = productId;
	    }

	    Product(String name, int productId, double price) {
	        this.name = name;
	        this.productId = productId;
	        this.price = price;
	    }

	    Product(String name, String category, String brand) {
	        this.name = name;
	        this.category = category;
	        this.brand = brand;
	    }

	    Product(int productId, String color, int quantity) {
	        this.productId = productId;
	        this.color = color;
	        this.quantity = quantity;
	    }

	    Product(double price, String category, String brand) {
	        this.price = price;
	        this.category = category;
	        this.brand = brand;
	    }

	    Product(String name, int productId, double price, String category) {

	        this.name = name;
	        this.productId = productId;
	        this.price = price;
	        this.category = category;
	    }

	    Product(String name, String brand, String color, int quantity) {

	        this.name = name;
	        this.brand = brand;
	        this.color = color;
	        this.quantity = quantity;
	    }

	    Product(int productId, double price, String category, String brand) {

	        this.productId = productId;
	        this.price = price;
	        this.category = category;
	        this.brand = brand;
	    }

	    Product(String name, int productId, double price, String category, String brand) {

	        this.name = name;
	        this.productId = productId;
	        this.price = price;
	        this.category = category;
	        this.brand = brand;
	    }

	    Product(String name, double price, int productId, String color, int quantity) {

	        this.name = name;
	        this.price = price;
	        this.productId = productId;
	        this.color = color;
	        this.quantity = quantity;
	    }

	    Product(String name, int productId, double price, String category, String brand, String color) {

	        this.name = name;
	        this.productId = productId;
	        this.price = price;
	        this.category = category;
	        this.brand = brand;
	        this.color = color;
	    }

	    Product(String name, int productId, double price, String category, String brand, String color, int quantity) {

	        this.name = name;
	        this.productId = productId;
	        this.price = price;
	        this.category = category;
	        this.brand = brand;
	        this.color = color;
	        this.quantity = quantity;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nProduct Id is: " + productId + "\nPrice is: " + price + "\nCategory is: " + category + "\nBrand is: " + brand + "\nColor is: " + color + "\nQuantity is: " + quantity + "\n==============================";
	    }
	

}
