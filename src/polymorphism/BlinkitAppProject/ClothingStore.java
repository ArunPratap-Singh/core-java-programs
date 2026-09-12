package polymorphism.BlinkitAppProject;

public class ClothingStore extends Product{
	
	String Type;
	String Brandname;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	ClothingStore(){
		
	}
	
	ClothingStore(String Productgroupname, String Type, String Brandname, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.Type = Type;
		this.Brandname = Brandname;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"Type is: " +Type+"\tBrandname is: " +Brandname+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
