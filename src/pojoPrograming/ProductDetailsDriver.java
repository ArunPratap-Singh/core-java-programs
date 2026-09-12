package pojoPrograming;

public class ProductDetailsDriver {

	public static void main(String[] args) {
		
		System.out.println("==================================Main Method Starts===================================");
		
		ProductDetails p1 = new ProductDetails("PROD101", "Laptop", 75000.00, 25, "Electronics", "Dell", "Dell Inspiron 15 Laptop", 10.00, 4.5, "Dell Technologies", "2 Years", "In Stock", "Black", 1.75, "Active" );
		ProductDetails p2 = new ProductDetails("PROD102", "Smartphone", 55000.00, 40, "Electronics", "Samsung", "Samsung Galaxy S24 Smartphone", 8.00, 4.6, "Samsung Electronics", "1 Year", "In Stock", "Black", 0.18, "Active");
		ProductDetails p3 = new ProductDetails("PROD103", "Television", 68000.00, 15, "Electronics", "Sony", "Sony Bravia 55 Inch Smart TV", 12.00, 4.7, "Sony Corporation", "2 Years", "In Stock", "Black", 14.50, "Active");
		ProductDetails p4 = new ProductDetails("PROD104", "Refrigerator", 48000.00, 20, "Home Appliances", "LG", "LG Double Door Refrigerator", 15.00, 4.4, "LG Electronics", "3 Years", "In Stock", "Silver", 62.00, "Active");
		ProductDetails p5 = new ProductDetails("PROD105", "Washing Machine", 42000.00, 18, "Home Appliances", "Whirlpool", "Whirlpool Fully Automatic Washing Machine", 10.00, 4.3, "Whirlpool Corporation", "2 Years", "In Stock", "Grey", 38.50, "Active");
		ProductDetails p6 = new ProductDetails("PROD106", "Headphones", 8500.00, 60, "Accessories", "Sony", "Sony Wireless Noise Cancelling Headphones", 20.00, 4.5, "Sony Corporation", "1 Year", "In Stock", "Blue", 0.25, "Active");
		ProductDetails p7 = new ProductDetails("PROD107", "Smart Watch", 12000.00, 35, "Wearables", "Apple", "Apple Watch Series Smart Watch", 5.00, 4.8, "Apple Inc.", "1 Year", "In Stock", "White", 0.05, "Active");
		ProductDetails p8 = new ProductDetails("PROD108", "Tablet", 32000.00, 28, "Electronics", "Lenovo", "Lenovo Android Tablet", 10.00, 4.2, "Lenovo Group", "1 Year", "In Stock", "Grey", 0.55, "Active");
		ProductDetails p9 = new ProductDetails("PROD109", "Air Conditioner", 58000.00, 12, "Home Appliances", "Voltas", "Voltas 1.5 Ton Split AC", 18.00, 4.4, "Voltas Limited", "5 Years", "In Stock", "White", 34.00, "Active");
		ProductDetails p10 = new ProductDetails("PROD110", "Digital Camera", 72000.00, 10, "Cameras", "Canon", "Canon Mirrorless Digital Camera", 7.00, 4.6, "Canon Inc.", "2 Years", "In Stock", "Black", 0.90, "Active");
		
				
		System.out.println("=========================Product Details 1=========================");

		System.out.println("Object Reference is: " + p1);
		System.out.println("Product ID is: " + p1.getProductID());
		System.out.println("Product Name is: " + p1.getProductName());
		System.out.println("Price is: " + p1.getPrice());
		System.out.println("Quantity is: " + p1.getQuantity());
		System.out.println("Category is: " + p1.getCategory());
		System.out.println("Brand is: " + p1.getBrand());
		System.out.println("Description is: " + p1.getDescription());
		System.out.println("Discount is: " + p1.getDiscount() + "%");
		System.out.println("Rating is: " + p1.getRating());
		System.out.println("Manufacturer is: " + p1.getManufacturer());
		System.out.println("Warranty is: " + p1.getWarranty());
		System.out.println("Stock Status is: " + p1.getStockStatus());
		System.out.println("Color is: " + p1.getColor());
		System.out.println("Weight is: " + p1.getWeight() + " kg");
		System.out.println("Product Status is: " + p1.getProductStatus());


		System.out.println("=========================Product Details 2=========================");

		System.out.println("Object Reference is: " + p2);
		System.out.println("Product ID is: " + p2.getProductID());
		System.out.println("Product Name is: " + p2.getProductName());
		System.out.println("Price is: " + p2.getPrice());
		System.out.println("Quantity is: " + p2.getQuantity());
		System.out.println("Category is: " + p2.getCategory());
		System.out.println("Brand is: " + p2.getBrand());
		System.out.println("Description is: " + p2.getDescription());
		System.out.println("Discount is: " + p2.getDiscount() + "%");
		System.out.println("Rating is: " + p2.getRating());
		System.out.println("Manufacturer is: " + p2.getManufacturer());
		System.out.println("Warranty is: " + p2.getWarranty());
		System.out.println("Stock Status is: " + p2.getStockStatus());
		System.out.println("Color is: " + p2.getColor());
		System.out.println("Weight is: " + p2.getWeight() + " kg");
		System.out.println("Product Status is: " + p2.getProductStatus());


		System.out.println("=========================Product Details 3=========================");

		System.out.println("Object Reference is: " + p3);
		System.out.println("Product ID is: " + p3.getProductID());
		System.out.println("Product Name is: " + p3.getProductName());
		System.out.println("Price is: " + p3.getPrice());
		System.out.println("Quantity is: " + p3.getQuantity());
		System.out.println("Category is: " + p3.getCategory());
		System.out.println("Brand is: " + p3.getBrand());
		System.out.println("Description is: " + p3.getDescription());
		System.out.println("Discount is: " + p3.getDiscount() + "%");
		System.out.println("Rating is: " + p3.getRating());
		System.out.println("Manufacturer is: " + p3.getManufacturer());
		System.out.println("Warranty is: " + p3.getWarranty());
		System.out.println("Stock Status is: " + p3.getStockStatus());
		System.out.println("Color is: " + p3.getColor());
		System.out.println("Weight is: " + p3.getWeight() + " kg");
		System.out.println("Product Status is: " + p3.getProductStatus());


		System.out.println("=========================Product Details 4=========================");

		System.out.println("Object Reference is: " + p4);
		System.out.println("Product ID is: " + p4.getProductID());
		System.out.println("Product Name is: " + p4.getProductName());
		System.out.println("Price is: " + p4.getPrice());
		System.out.println("Quantity is: " + p4.getQuantity());
		System.out.println("Category is: " + p4.getCategory());
		System.out.println("Brand is: " + p4.getBrand());
		System.out.println("Description is: " + p4.getDescription());
		System.out.println("Discount is: " + p4.getDiscount() + "%");
		System.out.println("Rating is: " + p4.getRating());
		System.out.println("Manufacturer is: " + p4.getManufacturer());
		System.out.println("Warranty is: " + p4.getWarranty());
		System.out.println("Stock Status is: " + p4.getStockStatus());
		System.out.println("Color is: " + p4.getColor());
		System.out.println("Weight is: " + p4.getWeight() + " kg");
		System.out.println("Product Status is: " + p4.getProductStatus());


		System.out.println("=========================Product Details 5=========================");

		System.out.println("Object Reference is: " + p5);
		System.out.println("Product ID is: " + p5.getProductID());
		System.out.println("Product Name is: " + p5.getProductName());
		System.out.println("Price is: " + p5.getPrice());
		System.out.println("Quantity is: " + p5.getQuantity());
		System.out.println("Category is: " + p5.getCategory());
		System.out.println("Brand is: " + p5.getBrand());
		System.out.println("Description is: " + p5.getDescription());
		System.out.println("Discount is: " + p5.getDiscount() + "%");
		System.out.println("Rating is: " + p5.getRating());
		System.out.println("Manufacturer is: " + p5.getManufacturer());
		System.out.println("Warranty is: " + p5.getWarranty());
		System.out.println("Stock Status is: " + p5.getStockStatus());
		System.out.println("Color is: " + p5.getColor());
		System.out.println("Weight is: " + p5.getWeight() + " kg");
		System.out.println("Product Status is: " + p5.getProductStatus());


		System.out.println("=========================Product Details 6=========================");

		System.out.println("Object Reference is: " + p6);
		System.out.println("Product ID is: " + p6.getProductID());
		System.out.println("Product Name is: " + p6.getProductName());
		System.out.println("Price is: " + p6.getPrice());
		System.out.println("Quantity is: " + p6.getQuantity());
		System.out.println("Category is: " + p6.getCategory());
		System.out.println("Brand is: " + p6.getBrand());
		System.out.println("Description is: " + p6.getDescription());
		System.out.println("Discount is: " + p6.getDiscount() + "%");
		System.out.println("Rating is: " + p6.getRating());
		System.out.println("Manufacturer is: " + p6.getManufacturer());
		System.out.println("Warranty is: " + p6.getWarranty());
		System.out.println("Stock Status is: " + p6.getStockStatus());
		System.out.println("Color is: " + p6.getColor());
		System.out.println("Weight is: " + p6.getWeight() + " kg");
		System.out.println("Product Status is: " + p6.getProductStatus());


		System.out.println("=========================Product Details 7=========================");

		System.out.println("Object Reference is: " + p7);
		System.out.println("Product ID is: " + p7.getProductID());
		System.out.println("Product Name is: " + p7.getProductName());
		System.out.println("Price is: " + p7.getPrice());
		System.out.println("Quantity is: " + p7.getQuantity());
		System.out.println("Category is: " + p7.getCategory());
		System.out.println("Brand is: " + p7.getBrand());
		System.out.println("Description is: " + p7.getDescription());
		System.out.println("Discount is: " + p7.getDiscount() + "%");
		System.out.println("Rating is: " + p7.getRating());
		System.out.println("Manufacturer is: " + p7.getManufacturer());
		System.out.println("Warranty is: " + p7.getWarranty());
		System.out.println("Stock Status is: " + p7.getStockStatus());
		System.out.println("Color is: " + p7.getColor());
		System.out.println("Weight is: " + p7.getWeight() + " kg");
		System.out.println("Product Status is: " + p7.getProductStatus());


		System.out.println("=========================Product Details 8=========================");

		System.out.println("Object Reference is: " + p8);
		System.out.println("Product ID is: " + p8.getProductID());
		System.out.println("Product Name is: " + p8.getProductName());
		System.out.println("Price is: " + p8.getPrice());
		System.out.println("Quantity is: " + p8.getQuantity());
		System.out.println("Category is: " + p8.getCategory());
		System.out.println("Brand is: " + p8.getBrand());
		System.out.println("Description is: " + p8.getDescription());
		System.out.println("Discount is: " + p8.getDiscount() + "%");
		System.out.println("Rating is: " + p8.getRating());
		System.out.println("Manufacturer is: " + p8.getManufacturer());
		System.out.println("Warranty is: " + p8.getWarranty());
		System.out.println("Stock Status is: " + p8.getStockStatus());
		System.out.println("Color is: " + p8.getColor());
		System.out.println("Weight is: " + p8.getWeight() + " kg");
		System.out.println("Product Status is: " + p8.getProductStatus());


		System.out.println("=========================Product Details 9=========================");

		System.out.println("Object Reference is: " + p9);
		System.out.println("Product ID is: " + p9.getProductID());
		System.out.println("Product Name is: " + p9.getProductName());
		System.out.println("Price is: " + p9.getPrice());
		System.out.println("Quantity is: " + p9.getQuantity());
		System.out.println("Category is: " + p9.getCategory());
		System.out.println("Brand is: " + p9.getBrand());
		System.out.println("Description is: " + p9.getDescription());
		System.out.println("Discount is: " + p9.getDiscount() + "%");
		System.out.println("Rating is: " + p9.getRating());
		System.out.println("Manufacturer is: " + p9.getManufacturer());
		System.out.println("Warranty is: " + p9.getWarranty());
		System.out.println("Stock Status is: " + p9.getStockStatus());
		System.out.println("Color is: " + p9.getColor());
		System.out.println("Weight is: " + p9.getWeight() + " kg");
		System.out.println("Product Status is: " + p9.getProductStatus());


		System.out.println("=========================Product Details 10=========================");

		System.out.println("Object Reference is: " + p10);
		System.out.println("Product ID is: " + p10.getProductID());
		System.out.println("Product Name is: " + p10.getProductName());
		System.out.println("Price is: " + p10.getPrice());
		System.out.println("Quantity is: " + p10.getQuantity());
		System.out.println("Category is: " + p10.getCategory());
		System.out.println("Brand is: " + p10.getBrand());
		System.out.println("Description is: " + p10.getDescription());
		System.out.println("Discount is: " + p10.getDiscount() + "%");
		System.out.println("Rating is: " + p10.getRating());
		System.out.println("Manufacturer is: " + p10.getManufacturer());
		System.out.println("Warranty is: " + p10.getWarranty());
		System.out.println("Stock Status is: " + p10.getStockStatus());
		System.out.println("Color is: " + p10.getColor());
		System.out.println("Weight is: " + p10.getWeight() + " kg");
		System.out.println("Product Status is: " + p10.getProductStatus());
		
		System.out.println("================================Main Method Ends===================================");

	}

}
