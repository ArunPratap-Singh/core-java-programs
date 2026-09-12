package polymorphism.BlinkitAppProject;

public class User {

	public static void main(String[] args) throws InterruptedException {
		
		BlinkitApp app = new BlinkitApp();
		
		Product p = app.placeOrder();
		
		System.out.println(app);

	}

}
