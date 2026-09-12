package encapsulationsPrograming;

public class Product {

	private String productName;
	private String productID;
	private String category;
	private String brand;
	private double price;
	
	Product(){
		
	}

	Product(String productName, String productID, String category, String brand, double price) {

		this.productName = productName;
		this.productID = productID;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}

	public void setProductName(String productName) {

		if (productName.length() > 3 && productName.length() <= 50 && !productName.isBlank() && productName.matches("[A-Z a-z 0-9 \s]+"))

			this.productName = productName;

		else

			System.out.println("Wrong Product Name entered");
	}

	public String getProductName() {

		return productName;
	}

	public void setProductID(String productID) {

		if (productID.length() > 3 && productID.length() <= 20 && !productID.isBlank() && productID.matches("[A-Z a-z 0-9]+"))

			this.productID = productID;

		else

			System.out.println("Invalid Product ID");
	}

	public String getProductID() {

		return productID;
	}

	public void setCategory(String category) {

		if (category.length() > 3 && category.length() <= 30 && !category.isBlank() && category.matches("[A-Z a-z \s]+"))

			this.category = category;

		else

			System.out.println("Wrong Category");
	}

	public String getCategory() {

		return category;
	}

	public void setBrand(String brand) {

		if (brand.length() > 2 && brand.length() <= 30 && !brand.isBlank() && brand.matches("[A-Z a-z 0-9 \s]+"))

			this.brand = brand;

		else

			System.out.println("Wrong Brand");
	}

	public String getBrand() {

		return brand;
	}

	public void setPrice(double price) {

		if (price > 0)

			this.price = price;

		else

			System.out.println("Wrong Price");
	}

	public double getPrice() {

		return price;
	}

}
