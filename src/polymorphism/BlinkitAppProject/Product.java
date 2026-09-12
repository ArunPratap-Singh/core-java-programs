package polymorphism.BlinkitAppProject;

public class Product {
	
	String Productgroupname;
	
	Product(){
		
	}
	
	Product(String Productgroupname){
		
		this.Productgroupname = Productgroupname;
	}
	
	public String toString() {
		
		return "Productgroupname is: " +Productgroupname;
 	}
	

}
