package polymorphism.BlinkitAppProject;

public class ChipsAndNamkeen extends Product{
	
	String ChipsorNamkeen;
	String ChipsorNamkeenName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	ChipsAndNamkeen(){
		
	}
	
	ChipsAndNamkeen(String Productgroupname, String ChipsorNamkeen, String ChipsorNamkeenName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.ChipsorNamkeen = ChipsorNamkeen;
		this.ChipsorNamkeenName = ChipsorNamkeenName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"ChipsorNamkeen: " +ChipsorNamkeen+"\tChipsorNamkeenName is: " +ChipsorNamkeenName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	
	}

}
