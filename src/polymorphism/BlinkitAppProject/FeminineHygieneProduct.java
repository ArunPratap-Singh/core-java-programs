package polymorphism.BlinkitAppProject;

public class FeminineHygieneProduct extends Product{
	
	String FeminineHygieneProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	String Size;
	
	FeminineHygieneProduct(){
		
	}
	
	FeminineHygieneProduct(String Productgroupname, String FeminineHygieneProductName, int Price, int Quantity, String Rating, String DeliveryTiming, String Size){
		
		super(Productgroupname);
		this.FeminineHygieneProductName = FeminineHygieneProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
		this.Size = Size;
	}
	
	public String toString() {
		return super.toString()+"FeminineHygieneProductName is: " +FeminineHygieneProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming+"\tSize is: " +Size;
	}


}
