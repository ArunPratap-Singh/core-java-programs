package builderPattern;

public class Product {

    private String productName;
    private String brand;
    private double price;
    private String category;
    private int quantity;
    private String color;

    private Product() {
    	
    }

    private Product(String productName, String brand, double price, String category, int quantity, String color) {

        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.color = color;
    }

    private Product(Builder b) {
        
    	this(b.productName, b.brand, b.price, b.category, b.quantity, b.color);
    }

    @Override
    public String toString() {
        
    	return "Product [Product Name is: " + productName + ", Brand is: " + brand + ", Price is: " + price + ", Category is: " + category + ", Quantity is: " + quantity + ", Color is: " + color + "]";
    }

    static class Builder {

        private String productName;
        private String brand;
        private double price;
        private String category;
        private int quantity;
        private String color;

        public Builder setProductName(String productName) {
            
        	this.productName = productName;
            return this;
        }

        public Builder setBrand(String brand) {
            
        	this.brand = brand;
            return this;
        }

        public Builder setPrice(double price) {
            
        	this.price = price;
            return this;
        }

        public Builder setCategory(String category) {
            
        	this.category = category;
            return this;
        }

        public Builder setQuantity(int quantity) {
            
        	this.quantity = quantity;
            return this;
        }

        public Builder setColor(String color) {
            
        	this.color = color;
            return this;
        }

        public Product build() {
            
        	return new Product(this);
        }
    }
}



