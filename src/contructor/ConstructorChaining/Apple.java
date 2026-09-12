package contructor.ConstructorChaining;

public class Apple {
	
	    String variety;
	    String color;
	    String taste;
	    double price;
	    int quantity;
	    String origin;
	    String season;
	    String grade;

	    Apple(String variety, String color, String taste, double price, int quantity, String origin, String season, String grade) {

	        this.variety = variety;
	        this.color = color;
	        this.taste = taste;
	        this.price = price;
	        this.quantity = quantity;
	        this.origin = origin;
	        this.season = season;
	        this.grade = grade;
	    }

	    Apple() {
	    }

	    Apple(String variety) {
	        this.variety = variety;
	    }

	    Apple(String variety, String color) {
	        this(variety);
	        this.color = color;
	    }

	    Apple(String variety, String color, String taste) {
	        this(variety, color);
	        this.taste = taste;
	    }

	    Apple(String variety, String color, String taste, double price) {
	        this(variety, color, taste);
	        this.price = price;
	    }

	    Apple(String variety, String color, String taste, double price, int quantity) {
	        this(variety, color, taste, price);
	        this.quantity = quantity;
	    }

	    Apple(String variety, String color, String taste, double price, int quantity, String origin) {
	        this(variety, color, taste, price, quantity);
	        this.origin = origin;
	    }

	    Apple(String variety, String color, String taste, double price, int quantity, String origin, String season) {
	        this(variety, color, taste, price, quantity, origin);
	        this.season = season;
	    }

	    Apple(int quantity, String variety, String color, String taste, double price, String origin, String season, String grade) {
	        this(variety, color, taste, price, quantity, origin, season);
	        this.grade = grade;
	    }

	    public String toString() {
	        return "Variety is: " + variety + "\tColor is: " + color + "\tTaste is: " + taste + "\nPrice is: " + price + "\tQuantity is: " + quantity + "\tOrigin is: " + origin + "\nSeason is: " + season + "\tGrade is: " + grade + "\n===============================================";
	    }
	

}
