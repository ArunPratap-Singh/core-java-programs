package inheritancePrograming.Shape;

public class Shape {
	
	String shapeName;
    String color;
    double borderWidth;
    
    Shape(){
    	
    }

    Shape(String shapeName, String color, double borderWidth) {
 
        this.shapeName = shapeName;
        this.color = color;
        this.borderWidth = borderWidth;
    }
    
    @Override
    public String toString() {
    	return "ShapeName is: " +shapeName+"\nColor is: " +color+"\nBorderWidth is: " +borderWidth+"\n=======================";
    }

}
