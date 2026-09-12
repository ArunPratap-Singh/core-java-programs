package inheritancePrograming.Shape;

public class Circle extends Shape{
	
	double radius;
    String material;
        
    Circle(){
    	
    }
    
    Circle(String shapeName, String color, double borderWidth, double radius, String material){
    	
    	super(shapeName, color, borderWidth);
    	this.radius = radius;
        this.material = material;
        
    }
    
    @Override
    public String toString() {
    	return super.toString() +"Radius is: " +radius+"\nMaterial is: " +material+"\n============================";
    }

}
