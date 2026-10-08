package abstraction.Shapes;

public class Rectangle extends Shape {

	double length;
	double width;
	String borderStyle;
	String material;
	boolean filled;

	Rectangle() {

	}

	Rectangle(int shapeId, String shapeName, String color, String type, double length, double width, String borderStyle,
			String material, boolean filled) {

		super(shapeId, shapeName, color, type);

		this.length = length;
		this.width = width;
		this.borderStyle = borderStyle;
		this.material = material;
		this.filled = filled;
	}

	
	@Override
	public double calculateArea() {

		return length * width;
	}

	
	@Override
	public double calculatePerimeter() {

		return 2 * (length + width);
	}

	
	@Override
	public String toString() {

		return "Rectangle [shapeId=" + shapeId + ", shapeName=" + shapeName + ", color=" + color + ", type=" + type
				+ ", length=" + length + ", width=" + width + ", borderStyle=" + borderStyle + ", material=" + material
				+ ", filled=" + filled + "]";
	}
}
