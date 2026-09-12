package classOrabstractclassOrinterface;

public class Rectangle implements TwoDShape {
	
	double l;
	double w;
	
	Rectangle(){
		
	}
	
	Rectangle(double l, double w){
		this.l = l;
		this.w = w;
	}
	@Override
	public void resize() {
		System.out.println("Resize Rectangle");
	}
	@Override
	public double area() {
		return l*w;
	}
	@Override
	public double perimeter() {
		return 2*(l+w);
	}
	
	public String toString() {
		return "Length is: " +l+"\tWidht is: " +w;
	}

}
