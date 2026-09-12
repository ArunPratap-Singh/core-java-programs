package project.DefaultorPrivateorstaticMethod;

public class Square implements TwoDShape {
	
	double side;
	
	Square(){
		
	}
	
	Square(double side){
		this.side = side;
	}
	
	@Override
	public void rotate() {
		System.out.println("Rotating Square");
	}
	
	@Override
	public double area() {
		return side*side;
	}
	
	@Override
	public double perimeter() {
		return 4*side;
	}
	@Override
	public String toString() {
		return "Square Side is: " +side;
	}

}
