package projects.FastFood;

public class HotDog extends FastFood{
	
	    String breadType;
	    String sausageType;
	    boolean isCheesy;

	    HotDog() {

	    }

	    HotDog(String name, double price, int quantity, String breadType, String sausageType, boolean isCheesy) {

	        super(name, price, quantity);
	        this.breadType = breadType;
	        this.sausageType = sausageType;
	        this.isCheesy = isCheesy;
	    }
	

}
