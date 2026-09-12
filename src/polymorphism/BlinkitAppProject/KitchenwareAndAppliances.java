package polymorphism.BlinkitAppProject;

public class KitchenwareAndAppliances extends Product{
	
	String KitchenwareOrAppliances;
	String KitchenwareOrAppliancesName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	KitchenwareAndAppliances(){
		
	}
	
	KitchenwareAndAppliances(String Productgroupname, String KitchenwareOrAppliances, String KitchenwareOrAppliancesName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.KitchenwareOrAppliances = KitchenwareOrAppliances;
		this.KitchenwareOrAppliancesName = KitchenwareOrAppliancesName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"KitchenwareOrAppliances: " +KitchenwareOrAppliances+"\tKitchenwareOrAppliancesName is: " +KitchenwareOrAppliancesName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
