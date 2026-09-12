package task1Assignment;

public class Cuboid {
	
	double l;
	double b;
	double h;

	public void printDetails(){

	System.out.println("Length l: " +l);
	System.out.println("Breadth b: " +b);
	System.out.println("Height h: " +h);
	}

	public void printVolume(){

	double Volume = l*b*h;
	System.out.println("Volume is: " +Volume);
	}

	public void printLateralSurfaceArea(){

	double LateralSurfaceArea = 2*h*(l+b);
	System.out.println("LateralSurfaceArea is: " +LateralSurfaceArea);
	}

	public void printTotalSurfaceArea(){

	double TotalSurfaceArea = 2*(l*b+b*h+h*l);
	System.out.println("TotalSurfaceArea is: " +TotalSurfaceArea);
	}


}
