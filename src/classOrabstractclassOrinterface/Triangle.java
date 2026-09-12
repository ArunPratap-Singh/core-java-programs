package classOrabstractclassOrinterface;

public class Triangle implements TwoDShape {
	
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
	public void resize() {
		
		System.out.println("Resize Triangle");
	}
	
	@Override
	public double area() {
		return 0.5*base*height;
	}
	@Override
	public double perimeter() {
		return side1+side2+side3;
	}
	
	public String toString() {
		return "Base is: " +base+"\tHeight is: " +height+"\tSide1 is: " +side1+"\tSide2 is: " +side2+"\tSide3 is: " +side3;
	}

}
