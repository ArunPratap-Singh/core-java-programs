package anonymousClass.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClass {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart() {

			List<String> products = new ArrayList<>();
			List<Double> prices = new ArrayList<>();

			double total = 0;

			@Override
			public void removeProduct(String productName) {

				int index = products.indexOf(productName);

				if (index != -1) {

					double price = prices.get(index);

					products.remove(index);
					prices.remove(index);

					total = total - price;

					System.out.println(productName + " removed from cart.");

				} else {

					System.out.println(productName + " not found in cart.");
				}

			}

			@Override
			public void calculateTotal() {
				
				System.out.println("Cart Total : Rs. " + total);

			}

			@Override
			public void applyDiscount(double discountPercentage) {
				
				if (discountPercentage > 0
                        && discountPercentage <= 100) {

                    double discountAmount =
                            total * discountPercentage / 100;

                    total = total - discountAmount;

                    System.out.println("Discount : "
                            + discountPercentage + "%");

                    System.out.println("Discount Amount : Rs. "
                            + discountAmount);

                    System.out.println("Final Total : Rs. "
                            + total);

                } else {

                    System.out.println("Invalid discount percentage.");
                }

			}

			@Override
			public void addProduct(String productName, double price) {

				if (price > 0) {

					products.add(productName);
					prices.add(price);

					total = total + price;

					System.out.println(productName + " added to cart of Price: Rs. " + price);

				} else {

					System.out.println("Invalid product price.");
				}

			}
		};
		
		cart.addProduct("Jeans", 2000);
		
		System.out.println("======================");
		
		cart.addProduct("Laptop", 50000);

        System.out.println("======================");

        cart.addProduct("Mouse", 1000);

        System.out.println("======================");

        cart.addProduct("Keyboard", 2000);

        System.out.println("=======================");

        cart.calculateTotal();

        System.out.println("=======================");

        cart.removeProduct("Mouse");

        System.out.println("=======================");

        cart.calculateTotal();

        System.out.println("========================");

        cart.applyDiscount(10);

	}

}
