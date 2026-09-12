package polymorphism.BlinkitAppProject;

public class JewelleryStore extends Product{
	
	String JewelleryType;
	String Typename;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	JewelleryStore(){
		
	}
	
	JewelleryStore(String Productgroupname, String JewelleryType, String Typename, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.JewelleryType = JewelleryType;
		this.Typename = Typename;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"JewelleryType is: " +JewelleryType+"\tTypename is: " +Typename+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
