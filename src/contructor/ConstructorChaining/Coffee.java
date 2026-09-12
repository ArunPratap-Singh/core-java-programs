package contructor.ConstructorChaining;

public class Coffee {
	
	    String beanName;
	    String roastLevel;
	    String aroma;
	    int cups;
	    double cost;
	    String preparation;
	    String strength;
	    String country;

	    Coffee(String beanName, String roastLevel, String aroma, int cups, double cost, String preparation, String strength, String country) {

	        this.beanName = beanName;
	        this.roastLevel = roastLevel;
	        this.aroma = aroma;
	        this.cups = cups;
	        this.cost = cost;
	        this.preparation = preparation;
	        this.strength = strength;
	        this.country = country;
	    }

	    Coffee() {
	    }

	    Coffee(String beanName) {
	        this.beanName = beanName;
	    }

	    Coffee(String beanName, String roastLevel) {
	        this(beanName);
	        this.roastLevel = roastLevel;
	    }

	    Coffee(String beanName, String roastLevel, String aroma) {
	        this(beanName, roastLevel);
	        this.aroma = aroma;
	    }

	    Coffee(String beanName, String roastLevel, String aroma, int cups) {
	        this(beanName, roastLevel, aroma);
	        this.cups = cups;
	    }

	    Coffee(String beanName, String roastLevel, String aroma, int cups, double cost) {
	        this(beanName, roastLevel, aroma, cups);
	        this.cost = cost;
	    }

	    Coffee(String beanName, String roastLevel, String aroma, int cups, double cost, String preparation) {
	        this(beanName, roastLevel, aroma, cups, cost);
	        this.preparation = preparation;
	    }

	    Coffee(String beanName, String roastLevel, String aroma, int cups, double cost, String preparation, String strength) {
	        this(beanName, roastLevel, aroma, cups, cost, preparation);
	        this.strength = strength;
	    }

	    Coffee(int cups, String beanName, String roastLevel, String aroma, double cost, String preparation, String strength, String country) {
	        this(beanName, roastLevel, aroma, cups, cost, preparation, strength);
	        this.country = country;
	    }

	    public String toString() {

	        return "Bean Name is: " + beanName + "\tRoast Level is: " + roastLevel + "\tAroma is: " + aroma + "\tCups is: " + cups + "\nCost is: " + cost + "\tPreparation is: " + preparation  + "\tStrength is: " + strength + "\tCountry is: " + country + "\n===============================================";
	    }
	

}
