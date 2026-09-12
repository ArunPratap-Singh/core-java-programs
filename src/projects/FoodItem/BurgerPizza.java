package projects.FoodItem;

public class BurgerPizza extends FoodItems{
	
	    String size;
	    String topping;
	    boolean extraCheese;
	    
	    BurgerPizza(){
	    	
	    }

	    BurgerPizza(String name, double price, String restaurantName, String size, String topping, boolean extraCheese) {

	        super(name, price, restaurantName);

	        this.size = size;
	        this.topping = topping;
	        this.extraCheese = extraCheese;
	    }
	

}
