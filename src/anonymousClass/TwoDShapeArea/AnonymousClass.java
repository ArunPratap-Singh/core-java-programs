package anonymousClass.TwoDShapeArea;



public class AnonymousClass {
	
	public static void main(String[] args) {
		
		TwoDShapeArea circle = new TwoDShapeArea() {
			
			@Override
			public void perimeter() {
				
				int r = 25;
				
				System.out.println("Area of circle is: " +Math.PI*r*r);
				
			}
			
			@Override
			public void area() {
				
				int r=  50;
				
				System.out.println("Perimeter of circle is: " +2*Math.PI*r);
				
			}
		};
		
		circle.perimeter();
		circle.area();
		
		TwoDShapeArea rectangle = new TwoDShapeArea() {
			
			@Override
			public void perimeter() {
				
				int l = 120;
				int w = 50;
				System.out.println("Perimeter of rectangle is: " +2*(l + w));
				
			}
			
			@Override
			public void area() {
				
				int l = 120;
				int w = 50;
				System.out.println("Area of rectangle is: " +l * w);
				
			}
		};
		
		rectangle.area();
		rectangle.perimeter();
		
		TwoDShapeArea square = new TwoDShapeArea() {
			
			@Override
			public void perimeter() {
				
				int a = 100;
				
				System.out.println("Perimeter of square is: " +4*a);
				
			}
			
			@Override
			public void area() {
				
				int a = 120;
				
				System.out.println("Area of square is: " +a*a);
				
			}
		};
		
		square.area();
		square.perimeter();
		
		TwoDShapeArea triangle = new TwoDShapeArea() {
			
			@Override
			public void perimeter() {
			
				int side1 = 50;
				int side2 = 60;
				int side3 = 20;
				
				System.out.println("Perimeter of triangle is: " +side1+side2+side3);
				
			}
			
			@Override
			public void area() {
				
				int base = 30;
				int height = 50;
				
				System.out.println("Area of traingle is: " +1.0/2*base*height);
				
			}
		};
		
		triangle.area();
		triangle.perimeter();
		
		
	}

}
