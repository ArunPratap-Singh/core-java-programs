package polymorphism.BlinkitAppProject;

public class AttaRiceAndDaal extends Product{
	
	String AttaorRiceorDaal;
	String AttaorRiceorDaalName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	AttaRiceAndDaal(){
		
	}
	
	AttaRiceAndDaal(String Productgroupname, String AttaorRiceorDaal, String AttaorRiceorDaalName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.AttaorRiceorDaal = AttaorRiceorDaal;
		this.AttaorRiceorDaalName = AttaorRiceorDaalName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
				
	}
	
	public String toString() {
		
		return super.toString()+"AttaorRiceorDaal is: " +AttaorRiceorDaal+"\tAttaorRiceorDaalName is: " +AttaorRiceorDaalName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is:" +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
