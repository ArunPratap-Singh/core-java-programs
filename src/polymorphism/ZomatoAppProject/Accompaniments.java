package polymorphism.ZomatoAppProject;

public class Accompaniments extends FoodShop{

	String Accompanimentsname;
	int price;
	
	Accompaniments(){
		
	}
	
	Accompaniments(String name, String rating, String distance, boolean isFreeDelivery, String discount, String Accompanimentsname, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.Accompanimentsname = Accompanimentsname;
		this.price = price;
	}
	
	@Override
	public void eat() {
		System.out.println("Eating it");
		System.out.println("Its Tasty and Healthy");
	}
	
}
