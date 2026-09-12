package polymorphism.ZomatoAppProject;

public class Platters extends FoodShop{
	
	String type;
	int price;
	
	Platters(){
		
	}
	
	Platters(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Platters are Costly but different varieties were available");
		System.out.println("But It's Yummy and Delicious");
		System.out.println("After Eating I Have No Words tO Explain i It's sos Deliciousss......");
		
		
	}

}
