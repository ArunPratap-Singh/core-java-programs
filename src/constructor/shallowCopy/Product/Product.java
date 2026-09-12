package constructor.shallowCopy.Product;

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

		Product(Product p) {

			this.productName = p.productName;
			this.brand = p.brand;
			this.price = p.price;
			this.color = p.color;
			this.c = p.c;

		}

		public String toString() {

			return "ProductName is: " + productName + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nC is: " + c + "\n========================";

		}

	

}
