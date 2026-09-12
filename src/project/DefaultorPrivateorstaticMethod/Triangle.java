package project.DefaultorPrivateorstaticMethod;

public class Triangle implements TwoDShape{
	
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		
	}
	
	Triangle(double base, double height, double side1, double side2, double side3){
		
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public void rotate() {
		System.out.println("Rotating Triangle");
	}
	
	@Override
	public double area() {
		return 0.5*base*height;
	}
	
	@Override
	public double perimeter() {
		return side1+side2+side3;
	}
	@Override
	public String toString() {
		return "Triangle Base is: " +base+"\tTriangle Height is: " +height+"\tTraingle Side1: " +side1+"\tTriangle Side2 is: " +side2+"\tTriangle side3 is: " +side3;
	}

}
