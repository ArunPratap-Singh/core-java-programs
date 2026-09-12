package polymorphism.BlinkitAppProject;

public class TeaAndCoffeeAndMilkDrinks extends Product{
	
	String TeaorCoffeeorMilkDrinks;
	String TeaorCoffeeorMilkDrinksName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	TeaAndCoffeeAndMilkDrinks(){
		
	}
	
	TeaAndCoffeeAndMilkDrinks(String Productgroupname, String TeaorCoffeeorMilkDrinks, String TeaorCoffeeorMilkDrinksName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.TeaorCoffeeorMilkDrinks = TeaorCoffeeorMilkDrinks;
		this.TeaorCoffeeorMilkDrinksName = TeaorCoffeeorMilkDrinksName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"TeaorCoffeeorMilkDrinks: " +TeaorCoffeeorMilkDrinks+"\tTeaorCoffeeorMilkDrinksName is: " +TeaorCoffeeorMilkDrinksName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	
	}

}
