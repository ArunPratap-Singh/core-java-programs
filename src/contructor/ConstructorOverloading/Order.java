package contructor.ConstructorOverloading;

public class Order {
	
	    String item;
	    int orderId;
	    double price;
	    String status;

	    Order() {
	    	
	    }
	    

	    Order(String item) {
	        this.item = item;
	    }

	    Order(int orderId) {
	        this.orderId = orderId;
	    }

	    Order(double price) {
	        this.price = price;
	    }

	    Order(String item, int orderId) {
	        this.item = item;
	        this.orderId = orderId;
	    }

	    Order(int orderId, String item) {
	        this.orderId = orderId;
	        this.item = item;
	    }

	    Order(double price, String status) {
	        this.price = price;
	        this.status = status;
	    }

	    Order(String status, double price) {
	        this.status = status;
	        this.price = price;
	    }

	    Order(int orderId, double price) {
	        this.orderId = orderId;
	        this.price = price;
	    }

	    Order(double price, int orderId) {
	        this.price = price;
	        this.orderId = orderId;
	    }

	    Order(String item, int orderId, double price) {
	        this.item = item;
	        this.orderId = orderId;
	        this.price = price;
	    }

	    Order(String item, String status, double price) {
	        this.item = item;
	        this.status = status;
	        this.price = price;
	    }

	    Order(int orderId, double price, String status) {
	        this.orderId = orderId;
	        this.price = price;
	        this.status = status;
	    }

	    Order(double price, String item, String status) {
	        this.price = price;
	        this.item = item;
	        this.status = status;
	    }

	    Order(String item, int orderId, double price, String status) {

	        this.item = item;
	        this.orderId = orderId;
	        this.price = price;
	        this.status = status;
	    }

	    public String toString() {

	        return "Item is: " + item + "\nOrder Id is: " + orderId + "\nPrice is: " + price + "\nStatus is: " + status + "\n==============================";
	    }
	

}
