package polymorphism.BlinkitAppProject;

public class StationeryAndGames extends Product{
	
	String StationeryorGames;
	String StationeryorGamesProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	StationeryAndGames(){
		
	}
	
	StationeryAndGames(String Productgroupname, String StationeryorGames, String StationeryorGamesProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.StationeryorGames = StationeryorGames;
		this.StationeryorGamesProductName = StationeryorGamesProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"StationeryorGames is: " +StationeryorGames+"\tStationeryorGamesProductName is: " +StationeryorGamesProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}


}
