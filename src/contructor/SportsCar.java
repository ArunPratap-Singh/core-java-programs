package contructor;

public class SportsCar {
	
    String name;
    String brand;
    double price;

    SportsCar() {
    	
    }

    SportsCar(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return "Name is: " +name+ "\nBrand is: " +brand+ "\nPrice is: " +price+ "\n==============================";
    }
	

}
