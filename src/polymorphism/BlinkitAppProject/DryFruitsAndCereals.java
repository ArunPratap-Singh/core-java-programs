package polymorphism.BlinkitAppProject;

public class DryFruitsAndCereals extends Product{
	
	String DryFruitsOrCereals;
	String DryFruitsOrCerealsName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	DryFruitsAndCereals(){
		
	}
	
	DryFruitsAndCereals(String Productgroupname, String DryFruitsOrCereals, String DryFruitsOrCerealsName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.DryFruitsOrCereals = DryFruitsOrCereals;
		this.DryFruitsOrCerealsName = DryFruitsOrCerealsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"DryFruitsOrCereals: " +DryFruitsOrCereals+"\tDryFruitsOrCerealsName is: " +DryFruitsOrCerealsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
