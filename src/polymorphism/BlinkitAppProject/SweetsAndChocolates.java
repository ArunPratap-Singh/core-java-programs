package polymorphism.BlinkitAppProject;

public class SweetsAndChocolates extends Product{
	
	String SweetsorChocolates;
	String SweetsorChocolatesName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	SweetsAndChocolates(){
		
	}
	
	SweetsAndChocolates(String Productgroupname, String SweetsorChocolates, String SweetsorChocolatesName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.SweetsorChocolates = SweetsorChocolates;
		this.SweetsorChocolatesName = SweetsorChocolatesName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"SweetsorChocolates: " +SweetsorChocolates+"\tSweetsorChocolatesName is: " +SweetsorChocolatesName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	
	}

}
