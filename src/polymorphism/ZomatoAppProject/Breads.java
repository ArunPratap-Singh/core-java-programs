package polymorphism.ZomatoAppProject;

public class Breads extends FoodShop{
	
	String breadname;
	int price;
	String stuffing;
	
	Breads(){
		
	}
	
	Breads(String name, String rating, String distance, boolean isFreeDelivery, String discount, String breadname, int price, String stuffing){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.breadname = breadname;
		this.price = price;
		this.stuffing = stuffing;
		
	}

	@Override
	public void eat() {
		
		System.out.println("Eating Breads");
		System.out.println("Quality is Good");
		
		
	}
	
	

}
