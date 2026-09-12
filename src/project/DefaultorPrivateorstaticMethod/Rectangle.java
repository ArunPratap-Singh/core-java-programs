package project.DefaultorPrivateorstaticMethod;

public class Rectangle implements TwoDShape{
	
	double l;
	double w;
	
	Rectangle(){
		
	}
	
	Rectangle(double l, double w){
		this.l = l;
		this.w = w;
	}

	@Override
	public void rotate() {
		
		System.out.println("Rotating Rectangle");
	}

	@Override
	public double area() {
		
		return l*w;
	}

	@Override
	public double perimeter() {
		
		return 2*(l+w);
	}
	
	@Override
	public String toString() {
		return "Rectangle Length is: " +l+"\tRectangle Width is: " +w;
	}
	
	

}
