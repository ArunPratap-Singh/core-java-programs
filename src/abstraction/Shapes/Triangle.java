package abstraction.Shapes;

public class Triangle extends Shape {

	double side1;
	double side2;
	double side3;
	double height;
	double base;
	String triangleType;

	Triangle() {

	}

	Triangle(int shapeId, String shapeName, String color, String type, double side1, double side2, double side3,
			double base, double height, String triangleType) {

		super(shapeId, shapeName, color, type);

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.base = base;
		this.height = height;
		this.triangleType = triangleType;
	}

	
	@Override
	public double calculateArea() {

		return 0.5 * base * height;
	}

	
	@Override
	public double calculatePerimeter() {

		return side1 + side2 + side3;
	}

	
	@Override
	public String toString() {

		return "Triangle [shapeId=" + shapeId + ", shapeName=" + shapeName + ", color=" + color + ", type=" + type
				+ ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", base=" + base + ", height=" + height
				+ ", triangleType=" + triangleType + "]";
	}
}
