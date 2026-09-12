package task2Assignment;

public class Rectangle {
	
	double l;
	double w;

	public String getDetails(){

		return "Length is: " +l+ "\tWidth is: " +w;
	}

	public double getArea(){

		return l*w;
	}

	public double getPerimeter(){

		return 2*(l+w);
	}


}
