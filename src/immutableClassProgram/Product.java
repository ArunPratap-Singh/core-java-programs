package immutableClassProgram;

public final class Product {
	
	    private final int productId;
	    private final String productName;
	    private final String category;
	    private final String brand;
	    private final double price;
	    private final String company;
	    private final String country;

	    Product(int productId, String productName, String category, String brand, double price, String company, String country) {

	        this.productId = productId;
	        this.productName = productName;
	        this.category = category;
	        this.brand = brand;
	        this.price = price;
	        this.company = company;
	        this.country = country;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getCompany() {
	        return company;
	    }

	    public String getCountry() {
	        return country;
	    }
	

}
