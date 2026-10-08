package abstraction.Shapes;

public class Circle extends Shape {

	double radius;
	String borderStyle;
	String material;
	boolean filled;

	Circle() {

	}

	Circle(int shapeId, String shapeName, String color, String type, double radius, String borderStyle, String material, boolean filled) {

		super(shapeId, shapeName, color, type);

		this.radius = radius;
		this.borderStyle = borderStyle;
		this.material = material;
		this.filled = filled;
	}

	@Override
	public double calculateArea() {

		return Math.PI * radius * radius;
	}

	
	@Override
	public double calculatePerimeter() {

		return 2 * Math.PI * radius;
	}

	
	@Override
	public String toString() {

		return "Circle [shapeId=" + shapeId + ", shapeName=" + shapeName + ", color=" + color + ", type=" + type
				+ ", radius=" + radius + ", borderStyle=" + borderStyle + ", material=" + material + ", filled=" + filled + "]";
	}
}
