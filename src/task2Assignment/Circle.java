package task2Assignment;

public class Circle {
	

	double r;

	public String getDetails(){

	return "Radius is: " +r;

	}

	public double getArea(){

	return Math.PI*r*r;

	}

	public double getPerimeter(){

	return 2*Math.PI*r;
	
	}


}
