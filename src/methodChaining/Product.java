package methodChaining;

public class Product {
	
	    private String productName;
	    private String brand;
	    private String category;
	    private String color;
	    private int price;
	    private int quantity;

	    // Setter methods

	    public Product setProductName(String productName) {
	        this.productName = productName;
	        return this;
	    }

	    public Product setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    public Product setCategory(String category) {
	        this.category = category;
	        return this;
	    }

	    public Product setColor(String color) {
	        this.color = color;
	        return this;
	    }

	    public Product setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public Product setQuantity(int quantity) {
	        this.quantity = quantity;
	        return this;
	    }

	    // Print methods

	    public Product printProductName() {
	        System.out.println("Product Name: " + productName);
	        return this;
	    }

	    public Product printBrand() {
	        System.out.println("Brand: " + brand);
	        return this;
	    }

	    public Product printCategory() {
	        System.out.println("Category: " + category);
	        return this;
	    }

	    public Product printColor() {
	        System.out.println("Color: " + color);
	        return this;
	    }

	    public Product printPrice() {
	        System.out.println("Price: " + price);
	        return this;
	    }

	    public Product printQuantity() {
	        System.out.println("Quantity: " + quantity);
	        return this;
	    }
	

}
