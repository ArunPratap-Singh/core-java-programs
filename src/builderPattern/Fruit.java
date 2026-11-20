package builderPattern;

public class Fruit {

    private String name;
    private String color;
    private double price;
    private double weight;
    private String origin;
    private String taste;

    private Fruit() {

    }

    private Fruit(String name, String color, double price, double weight, String origin, String taste) {

        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.origin = origin;
        this.taste = taste;

    }

    private Fruit(Builder b) {
        
    	this(b.name, b.color, b.price, b.weight, b.origin, b.taste);
    }

    @Override
    public String toString() {
        
    	return "Fruit [Name is: " + name + ", Color is: " + color + ", Price is: " + price + ", Weight is: " + weight + ", Origin is: " + origin + ", Taste is: " + taste + "]";
    }

    static class Builder {

        private String name;
        private String color;
        private double price;
        private double weight;
        private String origin;
        private String taste;

        public Builder setName(String name) {
            
        	this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            
        	this.color = color;
            return this;
        }

        public Builder setPrice(double price) {
            
        	this.price = price;
            return this;
        }

        public Builder setWeight(double weight) {
            
        	this.weight = weight;
            return this;
        }

        public Builder setOrigin(String origin) {
            
        	this.origin = origin;
            return this;
        }

        public Builder setTaste(String taste) {
            
        	this.taste = taste;
            return this;
        }

        public Fruit build() {
            
        	return new Fruit(this);
        }

    }

}



