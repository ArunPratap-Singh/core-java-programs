package inheritanceProgramingMultilevel.Product;

public class Computer extends ElectronicProduct{
	
	    String processor;
	    int ram;
	    
	    Computer(){
	    
	    }

	    Computer(int productId, String productName, String brand, double price, String processor, int ram) {

	        super(productId, productName, brand, price);
	        this.processor = processor;
	        this.ram = ram;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nProcessor is: " + processor + "\nRam is: " + ram + " GB";
	    }
	

}
