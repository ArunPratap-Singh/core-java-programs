package polymorphism.BlinkitAppProject;

public class MilkProducts extends Product{
	
	String MilkProductsType;
	String MilkProductsTypeName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	MilkProducts(){
		
	}
	
	MilkProducts(String Productgroupname, String MilkProductsType, String MilkProductsTypeName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.MilkProductsType = MilkProductsType;
		this.MilkProductsTypeName = MilkProductsTypeName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"MilkProductsType is: " +MilkProductsType+"\tMilkProductsTypeName is: " +MilkProductsTypeName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}


}
