package polymorphism.ZomatoAppProject;

public class Namkeens extends FoodShop{
	
	String type;
	String typename;
	int price;
	
	Namkeens(){
		
	}
	
	Namkeens(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, String typename, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.typename = typename;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Eating Namkeen");
		System.out.println("Its Good And Tasty");
		System.out.println("It Is Very Much Delicious");
		System.out.println("Its Crunchy and Crispy Waooo.....");
	}
	
	
	

}
