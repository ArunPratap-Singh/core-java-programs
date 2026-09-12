package polymorphism.ZomatoAppProject;

public class BuiscuitsAndCookies extends FoodShop{
	
	String type;
	String typename;
	int price;
	
	BuiscuitsAndCookies(){
		
	}
	
	BuiscuitsAndCookies(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, String typename, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.typename = typename;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Eating Cookies");
		System.out.println("Its Healthy");
		System.out.println("So Much Tasty");
		System.out.println("wAOOOOOO......");
		System.out.println("They Are Crunchy Also");
		
	}
	
	
	

}
