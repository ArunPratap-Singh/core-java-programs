package methodChaining;

public class AmazonProduct {
	
	    private String productName;
	    private String brand;
	    private String category;
	    private String color;
	    private int price;
	    private int quantity;

	    // Setter methods

	    public AmazonProduct setProductName(String productName) {
	        this.productName = productName;
	        return this;
	    }

	    public AmazonProduct setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    public AmazonProduct setCategory(String category) {
	        this.category = category;
	        return this;
	    }

	    public AmazonProduct setColor(String color) {
	        this.color = color;
	        return this;
	    }

	    public AmazonProduct setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public AmazonProduct setQuantity(int quantity) {
	        this.quantity = quantity;
	        return this;
	    }

	    // Print methods

	    public AmazonProduct printProductName() {
	        System.out.println("Product Name: " + productName);
	        return this;
	    }

	    public AmazonProduct printBrand() {
	        System.out.println("Brand: " + brand);
	        return this;
	    }

	    public AmazonProduct printCategory() {
	        System.out.println("Category: " + category);
	        return this;
	    }

	    public AmazonProduct printColor() {
	        System.out.println("Color: " + color);
	        return this;
	    }

	    public AmazonProduct printPrice() {
	        System.out.println("Price: " + price);
	        return this;
	    }

	    public AmazonProduct printQuantity() {
	        System.out.println("Quantity: " + quantity);
	        return this;
	    }
	

}
