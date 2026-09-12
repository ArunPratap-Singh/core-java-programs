package constructor.deepCopy.VendingMachine;

public class VendingMachine {
	
	    String machineName;
	    String brand;
	    int price;
	    String location;
	    Product p;

	    VendingMachine() {
	    }

	    VendingMachine(String machineName, String brand, int price, String location, Product p) {
	        this.machineName = machineName;
	        this.brand = brand;
	        this.price = price;
	        this.location = location;
	        this.p = p;
	    }

	    //Deep Copy
	    VendingMachine(VendingMachine v) {
	        this.machineName = v.machineName;
	        this.brand = v.brand;
	        this.price = v.price;
	        this.location = v.location;
	        this.p = new Product();
	        this.p.category = v.p.category;
	        this.p.manufacturer = v.p.manufacturer;
	        this.p.price = v.p.price;
	        this.p.productId = v.p.productId;
	        this.p.productName = v.p.productName;
	        this.p.weight = v.p.weight;
	    }

	    public String toString() {
	        return "MachineName is: " + machineName + "\nBrand is: " + brand + "\nPrice is: " + price + "\nLocation is: " + location + "\nP is: " + p + "\n========================";
	    }
	

}
