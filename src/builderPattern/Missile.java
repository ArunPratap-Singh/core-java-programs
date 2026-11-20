package builderPattern;

public class Missile {

    private String name;
    private String country;
    private String type;
    private String manufacturer;
    private double weight;
    private double range;

    private Missile() {

    }

    private Missile(String name, String country, String type, String manufacturer, double weight, double range) {

        this.name = name;
        this.country = country;
        this.type = type;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.range = range;

    }

    private Missile(Builder b) {
        
    	this(b.name, b.country, b.type, b.manufacturer, b.weight, b.range);
    }

    @Override
    public String toString() {
        
    	return "Missile [Name is: " + name + ", Country is: " + country + ", Type is: " + type + ", Manufacturer is: " + manufacturer + ", Weight is: " + weight + ", Range is: " + range + "]";
    }

    static class Builder {

        private String name;
        private String country;
        private String type;
        private String manufacturer;
        private double weight;
        private double range;

        public Builder setName(String name) {
            
        	this.name = name;
            return this;
        }

        public Builder setCountry(String country) {
           
        	this.country = country;
            return this;
        }

        public Builder setType(String type) {
           
        	this.type = type;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            
        	this.manufacturer = manufacturer;
            return this;
        }

        public Builder setWeight(double weight) {
            
        	this.weight = weight;
            return this;
        }

        public Builder setRange(double range) {
            
        	this.range = range;
            return this;
        }

        public Missile build() {
           
        	return new Missile(this);
        }

    }



}
