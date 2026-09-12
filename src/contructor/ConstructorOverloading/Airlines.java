package contructor.ConstructorOverloading;

public class Airlines {

	    String name;
	    int code;
	    double price;
	    int capacity;
	    String destination;
	    String country;
	    int flights;

	    Airlines() {
	    }

	    Airlines(String name) {
	        this.name = name;
	    }

	    Airlines(int code) {
	        this.code = code;
	    }

	    Airlines(double price) {
	        this.price = price;
	    }

	    Airlines(long flights) {
	        this.flights = (int) flights;
	    }

	    Airlines(String name, int code) {
	        this.name = name;
	        this.code = code;
	    }

	    Airlines(int code, String name) {
	        this.code = code;
	        this.name = name;
	    }

	    Airlines(double price, String destination) {
	        this.price = price;
	        this.destination = destination;
	    }

	    Airlines(String destination, double price) {
	        this.destination = destination;
	        this.price = price;
	    }

	    Airlines(int code, double price) {
	        this.code = code;
	        this.price = price;
	    }

	    Airlines(double price, int code) {
	        this.price = price;
	        this.code = code;
	    }

	    Airlines(String name, int code, double price) {
	        this.name = name;
	        this.code = code;
	        this.price = price;
	    }

	    Airlines(String name, String destination, String country) {
	        this.name = name;
	        this.destination = destination;
	        this.country = country;
	    }

	    Airlines(int code, String destination, int capacity) {
	        this.code = code;
	        this.destination = destination;
	        this.capacity = capacity;
	    }

	    Airlines(double price, String destination, String country) {
	        this.price = price;
	        this.destination = destination;
	        this.country = country;
	    }

	    Airlines(String name, int code, double price, String destination) {
	        this.name = name;
	        this.code = code;
	        this.price = price;
	        this.destination = destination;
	    }

	    Airlines(String name, String country, String destination, int flights) {
	        this.name = name;
	        this.country = country;
	        this.destination = destination;
	        this.flights = flights;
	    }

	    Airlines(int code, double price, String country, int capacity) {
	        this.code = code;
	        this.price = price;
	        this.country = country;
	        this.capacity = capacity;
	    }

	    Airlines(String name, int code, double price, String destination, String country) {
	        this.name = name;
	        this.code = code;
	        this.price = price;
	        this.destination = destination;
	        this.country = country;
	    }

	    Airlines(String name, double price, int code, String destination, int flights) {
	        this.name = name;
	        this.price = price;
	        this.code = code;
	        this.destination = destination;
	        this.flights = flights;
	    }

	    Airlines(String name, int code, double price, String destination, String country, int capacity) {
	        this.name = name;
	        this.code = code;
	        this.price = price;
	        this.destination = destination;
	        this.country = country;
	        this.capacity = capacity;
	    }

	    Airlines(String name, int code, double price, String destination, String country, int capacity, int flights) {
	        this.name = name;
	        this.code = code;
	        this.price = price;
	        this.destination = destination;
	        this.country = country;
	        this.capacity = capacity;
	        this.flights = flights;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nCode is: " + code + "\nPrice is: " + price + "\nCapacity is: " + capacity + "\nDestination is: " + destination + "\nCountry is: " + country + "\nFlights are: " + flights + "\n==============================";
	    }
	

}
