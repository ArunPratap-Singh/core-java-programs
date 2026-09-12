package constructor.deepCopy.Employ;

public class Address {
	String city;
	int pin;
	String state;
	
	Address(){
		
	}
	
	Address(String city, int pin, String state){
		this.city = city;
		this.pin = pin;
		this.state = state;
	}
	public String toString() {
		return "City is: " +city+"\tPin is: " +pin+"\tState is: " +state;
	}


}
