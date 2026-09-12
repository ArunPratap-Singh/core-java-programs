package polymorphism.ZomatoAppProject;

public class Sweets extends FoodShop{
	
	String sweetname;
	int price;
	
	Sweets(){
		
	}
	
	Sweets(String name, String rating, String distance, boolean isFreeDelivery, String discount, String sweetname, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.sweetname = sweetname;
		this.price = price;
	}
	
	@Override
	public void eat() {
		
		System.out.println("Eating Sweet");
		System.out.println("Sweet is Tasty");
		System.out.println("It's So Delicious");
	}

}
