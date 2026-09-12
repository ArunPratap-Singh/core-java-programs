package upcastingdowncasting;

public class Train extends Vehicle{
	
	String enginetype;
	int numberofcoaches;
	String typeoftrain;
	String ACnonAC;
	
	Train(){
		
	}
	
	Train(String name, int price, int numberofwheels, String enginetype, int numberofcoaches, String typeoftrain, String ACnonAC){
		
		super(name, price, numberofwheels);
		this.enginetype = enginetype;
		this.numberofcoaches = numberofcoaches;
		this.typeoftrain = typeoftrain;
		this.ACnonAC = ACnonAC;
	}
	
	

}
