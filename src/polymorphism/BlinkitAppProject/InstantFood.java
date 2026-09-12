package polymorphism.BlinkitAppProject;

public class InstantFood extends Product{
	
	String InstantFoodName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	InstantFood(){
		
	}
	
	InstantFood(String Productgroupname, String InstantFoodName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.InstantFoodName = InstantFoodName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
		
	}
	
	public String toString() {
		return super.toString()+"InstantFoodName is: " +InstantFoodName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
