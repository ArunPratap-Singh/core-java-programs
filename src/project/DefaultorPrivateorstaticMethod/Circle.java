package project.DefaultorPrivateorstaticMethod;

public class Circle implements TwoDShape{
	
	double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	@Override
	public void rotate() {
		System.out.println("Rotating Circle");
	}
	
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}
	
	@Override
	public String toString() {
		return "Circle Radius is: " +r;
	}
}
