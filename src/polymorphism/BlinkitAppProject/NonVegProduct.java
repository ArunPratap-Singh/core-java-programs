package polymorphism.BlinkitAppProject;

public class NonVegProduct extends Product{
	
	String NonVegProductType;
	String NonVegProductTypeName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	NonVegProduct(){
		
	}
	
	NonVegProduct(String Productgroupname, String NonVegProductType, String NonVegProductTypeName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.NonVegProductType = NonVegProductType;
		this.NonVegProductTypeName = NonVegProductTypeName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"NonVegProductType: " +NonVegProductType+"\tNonVegProductTypeName is: " +NonVegProductTypeName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
