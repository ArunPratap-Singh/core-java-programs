package polymorphism.ZomatoAppProject;

public class User {

	public static void main(String[] args) throws InterruptedException {
		
		ZomatoApp z = new ZomatoApp();
		
		FoodShop fs = z.placeOrder();
		
		System.out.println("===============================================================");
		
		fs.eat();

	}

}
