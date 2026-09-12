package classOrabstractclassOrinterface;

public class Circle implements TwoDShape {
	
	double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	@Override
	public void resize() {
		
		System.out.println("Resize Circle");
	}
	
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}
	
	public String toString() {
		return "Radius is: " +r;
	}

}
