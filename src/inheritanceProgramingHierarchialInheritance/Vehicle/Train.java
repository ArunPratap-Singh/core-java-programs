package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Train extends Vehicle{
	
	    int numberOfCoaches;
	    String trainType;
	    
	    Train(){
	    	
	    }

	    Train(String brand, String model, int year, int numberOfCoaches, String trainType) {

	        super(brand, model, year);
	        this.numberOfCoaches = numberOfCoaches;
	        this.trainType = trainType;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nNumber Of Coaches is: " + numberOfCoaches + "\nTrain Type is: " + trainType+"\n=======================";
	    }
	

}
