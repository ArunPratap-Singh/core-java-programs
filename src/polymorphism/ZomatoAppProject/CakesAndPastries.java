package polymorphism.ZomatoAppProject;

public class CakesAndPastries extends FoodShop{
	
	String type;
	String typename;
	int price;
	
	CakesAndPastries(){
		
	}
	
	CakesAndPastries(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, String typename, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.typename = typename;
		this.price = price;
	}

	@Override
	public void eat() {
			
		System.out.println("It's My Favoraite");
		System.out.println("Its so Much Delicious");
		System.out.println("Its Tasty And Yummy");
		
	}

}
