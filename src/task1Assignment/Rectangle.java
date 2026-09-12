package task1Assignment;

public class Rectangle {


	double l;
	double w;

	public void printDetails(){

	System.out.println("Length is: " +l);
	System.out.println("Width is: " +w);

	}

	public void printArea(){

	double area = l*w;
	System.out.println("Area is: " +area);

	}

	public void printPerimeter(){

	double perimeter = 2*(l+w);
	System.out.println("Perimeter is: " +perimeter);
	
	}	
		

	

}
