package contructor.ConstructorChaining;

public class GulabJamun {
	
	    String name;
	    int quantity;
	    double price;
	    String size;
	    String flavor;
	    String syrupType;
	    String shopName;
	    String packingType;

	    GulabJamun(String name, int quantity, double price, String size, String flavor, String syrupType, String shopName, String packingType) {

	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	        this.size = size;
	        this.flavor = flavor;
	        this.syrupType = syrupType;
	        this.shopName = shopName;
	        this.packingType = packingType;
	    }

	    GulabJamun() {
	    }

	    GulabJamun(String name) {
	        this.name = name;
	    }

	    GulabJamun(String name, int quantity) {
	        this(name);
	        this.quantity = quantity;
	    }

	    GulabJamun(String name, int quantity, double price) {
	        this(name, quantity);
	        this.price = price;
	    }

	    GulabJamun(String name, int quantity, double price, String size) {
	        this(name, quantity, price);
	        this.size = size;
	    }

	    GulabJamun(String name, int quantity, double price, String size, String flavor) {
	        this(name, quantity, price, size);
	        this.flavor = flavor;
	    }

	    GulabJamun(String name, int quantity, double price, String size, String flavor, String syrupType) {
	        this(name, quantity, price, size, flavor);
	        this.syrupType = syrupType;
	    }

	    GulabJamun(String name, int quantity, double price, String size, String flavor, String syrupType, String shopName) {
	        this(name, quantity, price, size, flavor, syrupType);
	        this.shopName = shopName;
	    }

	    GulabJamun(int quantity, String name, double price, String size, String flavor, String syrupType, String shopName, String packingType) {

	        this(name, quantity, price, size, flavor, syrupType, shopName);
	        this.packingType = packingType;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tQuantity is: " + quantity + "\tPrice is: " + price + "\nSize is: " + size + "\tFlavor is: " + flavor + "\tSyrup Type is: " + syrupType + "\nShop Name is: " + shopName + "\tPacking Type is: " + packingType + "\n===============================================";
	    }
	

}
