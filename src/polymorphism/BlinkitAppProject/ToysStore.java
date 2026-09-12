package polymorphism.BlinkitAppProject;

public class ToysStore extends Product{
	
	String Type;
	String Typename;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	ToysStore(){
		
	}
	
	ToysStore(String Productgroupname, String Type, String Typename, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.Type = Type;
		this.Typename = Typename;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"Type is: " +Type+"\tTypename is: " +Typename+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
