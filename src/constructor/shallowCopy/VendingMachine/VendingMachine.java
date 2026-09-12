package constructor.shallowCopy.VendingMachine;

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

	    VendingMachine(VendingMachine v) {
	        this.machineName = v.machineName;
	        this.brand = v.brand;
	        this.price = v.price;
	        this.location = v.location;
	        this.p = v.p;
	    }

	    public String toString() {
	        return "MachineName is: " + machineName + "\nBrand is: " + brand + "\nPrice is: " + price + "\nLocation is: " + location + "\nP is: " + p + "\n========================";
	    }
	

}
