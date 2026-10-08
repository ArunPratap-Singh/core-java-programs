package abstraction.Shapes;

public abstract class Shape {

	int shapeId;
	String shapeName;
	String color;
	String type;

	Shape() {

	}

	Shape(int shapeId, String shapeName, String color, String type) {

		this.shapeId = shapeId;
		this.shapeName = shapeName;
		this.color = color;
		this.type = type;
	}

	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	@Override
	public String toString() {

		return "Shape [shapeId=" + shapeId + ", shapeName=" + shapeName + ", color=" + color + ", type=" + type + "]";
	}
}
