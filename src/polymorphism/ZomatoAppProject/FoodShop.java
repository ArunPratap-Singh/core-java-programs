package polymorphism.ZomatoAppProject;

public abstract class FoodShop {
	
	String name;
	String rating;
	String distance;
	boolean isFreeDelivery;
	String discount;
	
	FoodShop(){
		
	}
	
	FoodShop(String name, String rating, String distance, boolean isFreeDelivery, String discount){
		
		this.name = name;
		this.rating = rating;
		this.distance = distance;
		this.isFreeDelivery = isFreeDelivery;
		this.discount = discount;
	}
	
	public abstract void eat();
	

}
