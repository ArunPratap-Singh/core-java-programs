package task1Assignment;

public class Circle {
	
	double r;

	public void printDetails(){

	System.out.println("Radius is: " +r);

	}

	public void printArea(){

	double area = 3.14*(r*r);
	System.out.println("Area is: " +area);

	}

	public void printPerimeter(){

	double perimeter = 2*(3.14*r);
	System.out.println("Perimeter is: " +perimeter);
	
	}

}
