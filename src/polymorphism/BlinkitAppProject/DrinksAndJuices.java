package polymorphism.BlinkitAppProject;

public class DrinksAndJuices extends Product{
	
	String DrinksorJuices;
	String DrinksorJuicesName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	DrinksAndJuices(){
		
	}
	
	DrinksAndJuices(String Productgroupname, String DrinksorJuices, String DrinksorJuicesName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.DrinksorJuices = DrinksorJuices;
		this.DrinksorJuicesName = DrinksorJuicesName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"DrinksorJuices: " +DrinksorJuices+"\tDrinksorJuicesName is: " +DrinksorJuicesName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	
	}

}
