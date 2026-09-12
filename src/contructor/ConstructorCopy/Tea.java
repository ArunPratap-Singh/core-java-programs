package contructor.ConstructorCopy;

public class Tea {
	
    String name;
    String type;
    double price;

    Tea() {
    }

    Tea(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    Tea(Tea t){
    	
    	this.name = t.name;
    	this.price = t.price;
    	this.type = t.type;
    }

    public String toString() {
        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
    }
	

}
