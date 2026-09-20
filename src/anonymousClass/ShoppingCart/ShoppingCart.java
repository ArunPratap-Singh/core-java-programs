package anonymousClass.ShoppingCart;

public interface ShoppingCart {
	
	void addProduct(String productName, double price);

    void removeProduct(String productName);

    void calculateTotal();

    void applyDiscount(double discountPercentage);

}
