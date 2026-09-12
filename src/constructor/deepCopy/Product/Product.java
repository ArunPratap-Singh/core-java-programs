package constructor.deepCopy.Product;

public class Product {
	
		String productName;
		String brand;
		int price;
		String color;
		Category c;

		Product() {

		}

		Product(String productName, String brand, int price, String color, Category c) {

			this.productName = productName;
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.c = c;

		}

		//deep copy
		Product(Product p) {

			this.productName = p.productName;
			this.brand = p.brand;
			this.price = p.price;
			this.color = p.color;
			this.c = new Category();
			this.c.categoryId = p.c.categoryId;
			this.c.categoryName = p.c.categoryName;
			this.c.categoryType = p.c.categoryType;
			this.c.department = p.c.department;
			this.c.description = p.c.description;
			this.c.numberOfProducts = p.c.numberOfProducts;

		}

		public String toString() {

			return "ProductName is: " + productName + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nC is: " + c + "\n========================";

		}

	

}
