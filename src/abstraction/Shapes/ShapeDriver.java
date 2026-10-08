package abstraction.Shapes;

public class ShapeDriver {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle(101, "Cicle", "Red", "2D Shape", 7.0, "Solid", "Metal", true);
		Shape s2 = new Circle(102, "Cicle", "Blue", "2D Shape", 5.0, "Dashed", "Plastic", false);
		Shape s3 = new Circle(103, "Cicle", "Green", "2D Shape", 10.0, "Dotted", "Wood", true);
		Shape s4 = new Circle(104, "Cicle", "Yellow", "2D Shape", 3.0, "Solid", "Glass", false);
		Shape s5 = new Circle(105, "Cicle", "Purple", "2D Shape", 8.0, "Dashed", "Stone", true);
		Shape s6 = new Circle(106, "Cicle", "Orange", "2D Shape", 6.0, "Dotted", "Rubber", false);
		Shape s7 = new Circle(107, "Cicle", "Pink", "2D Shape", 4.0, "Solid", "Fabric", true);
		Shape s8 = new Circle(108, "Cicle", "Brown", "2D Shape", 9.0, "Dashed", "Leather", false);
		Shape s9 = new Circle(109, "Cicle", "Gray", "2D Shape", 2.0, "Dotted", "Paper", true);
		Shape s10 = new Circle(110, "Cicle", "Black", "2D Shape", 1.0, "Solid", "Plastic", false);
		
		System.out.println(s1);
		System.out.println("===================");
		System.out.println(s2);
		System.out.println("===================");
		System.out.println(s3);
		System.out.println("===================");
		System.out.println(s4);
		System.out.println("===================");
		System.out.println(s5);
		System.out.println("===================");
		System.out.println(s6);
		System.out.println("===================");
		System.out.println(s7);
		System.out.println("===================");
		System.out.println(s8);
		System.out.println("===================");
		System.out.println(s9);
		System.out.println("===================");
		System.out.println(s10);
		
		System.out.println("==================s1 Details==================");
		System.out.println("Area of Circle: " + s1.calculateArea());
		System.out.println("Perimeter of Circle: " + s1.calculatePerimeter());
		
		System.out.println("==================s2 Details==================");
		System.out.println("Area of Circle: " + s2.calculateArea());
		System.out.println("Perimeter of Circle: " + s2.calculatePerimeter());
		
		System.out.println("==================s3 Details==================");
		System.out.println("Area of Circle: " + s3.calculateArea());
		System.out.println("Perimeter of Circle: " + s3.calculatePerimeter());
		
		System.out.println("==================s4 Details==================");
		System.out.println("Area of Circle: " + s4.calculateArea());
		System.out.println("Perimeter of Circle: " + s4.calculatePerimeter());
		
		System.out.println("==================s5 Details==================");
		System.out.println("Area of Circle: " + s5.calculateArea());
		System.out.println("Perimeter of Circle: " + s5.calculatePerimeter());
		
		System.out.println("==================s6 Details==================");
		System.out.println("Area of Circle: " + s6.calculateArea());
		System.out.println("Perimeter of Circle: " + s6.calculatePerimeter());
		
		System.out.println("==================s7 Details==================");
		System.out.println("Area of Circle: " + s7.calculateArea());
		System.out.println("Perimeter of Circle: " + s7.calculatePerimeter());
		
		System.out.println("==================s8 Details==================");
		System.out.println("Area of Circle: " + s8.calculateArea());
		System.out.println("Perimeter of Circle: " + s8.calculatePerimeter());
		
		System.out.println("==================s9 Details==================");
		System.out.println("Area of Circle: " + s9.calculateArea());
		System.out.println("Perimeter of Circle: " + s9.calculatePerimeter());
		
		System.out.println("==================s10 Details==================");
		System.out.println("Area of Circle: " + s10.calculateArea());
		System.out.println("Perimeter of Circle: " + s10.calculatePerimeter());
		
		System.out.println("===================================================================================");
		
		Shape s11 = new Rectangle(201, "Rectangle", "Red", "2D Shape", 7.0, 5.0, "Solid", "Metal", true);
		Shape s12 = new Rectangle(202, "Rectangle", "Blue", "2D Shape", 5.0, 3.0, "Dashed", "Plastic", false);
		Shape s13 = new Rectangle(203, "Rectangle", "Green", "2D Shape", 10.0, 8.0, "Dotted", "Wood", true);
		Shape s14 = new Rectangle(204, "Rectangle", "Yellow", "2D Shape", 3.0, 2.0, "Solid", "Glass", false);
		Shape s15 = new Rectangle(205, "Rectangle", "Purple", "2D Shape", 8.0, 6.0, "Dashed", "Stone", true);
		Shape s16 = new Rectangle(206, "Rectangle", "Orange", "2D Shape", 6.0, 4.0, "Dotted", "Rubber", false);
		Shape s17 = new Rectangle(207, "Rectangle", "Pink", "2D Shape", 4.0, 3.0, "Solid", "Fabric", true);
		Shape s18 = new Rectangle(208, "Rectangle", "Brown", "2D Shape", 9.0, 7.0, "Dashed", "Leather", false);
		Shape s19 = new Rectangle(209, "Rectangle", "Gray", "2D Shape", 2.0, 1.0, "Dotted", "Paper", true);
		Shape s20 = new Rectangle(210, "Rectangle", "Black", "2D Shape", 1.0, 0.5, "Solid", "Plastic", false);
		
		
		System.out.println(s11);
		System.out.println("===================");
		System.out.println(s12);
		System.out.println("===================");
		System.out.println(s13);
		System.out.println("===================");
		System.out.println(s14);
		System.out.println("===================");
		System.out.println(s15);
		System.out.println("===================");
		System.out.println(s16);
		System.out.println("===================");
		System.out.println(s17);
		System.out.println("===================");
		System.out.println(s18);
		System.out.println("===================");
		System.out.println(s19);
		System.out.println("===================");
		System.out.println(s20);
		
		System.out.println("==================s11 Details==================");
		System.out.println("Area of Rectangle: " + s11.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s11.calculatePerimeter());
		
		System.out.println("==================s12 Details==================");
		System.out.println("Area of Rectangle: " + s12.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s12.calculatePerimeter());
		
		System.out.println("==================s13 Details==================");
		System.out.println("Area of Rectangle: " + s13.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s13.calculatePerimeter());
		
		System.out.println("==================s14 Details==================");
		System.out.println("Area of Rectangle: " + s14.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s14.calculatePerimeter());
		
		System.out.println("==================s15 Details==================");
		System.out.println("Area of Rectangle: " + s15.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s15.calculatePerimeter());
		
		System.out.println("==================s16 Details==================");
		System.out.println("Area of Rectangle: " + s16.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s16.calculatePerimeter());
		
		System.out.println("==================s17 Details==================");
		System.out.println("Area of Rectangle: " + s17.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s17.calculatePerimeter());
		
		System.out.println("==================s18 Details==================");
		System.out.println("Area of Rectangle: " + s18.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s18.calculatePerimeter());
		
		System.out.println("==================s19 Details==================");
		System.out.println("Area of Rectangle: " + s19.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s19.calculatePerimeter());
		
		System.out.println("==================s20 Details==================");
		System.out.println("Area of Rectangle: " + s20.calculateArea());
		System.out.println("Perimeter of Rectangle: " + s20.calculatePerimeter());
		
		System.out.println("================================================================================");
		
		Shape s21 = new Triangle(301, "Triangle", "Red", "2D Shape", 5.0, 5.0, 6.0, 6.0, 4.0, "Isosceles");
		Shape s22 = new Triangle(302, "Triangle", "Blue", "2D Shape", 3.0, 4.0, 5.0, 4.0, 3.0, "Scalene");
		Shape s23 = new Triangle(303, "Triangle", "Green", "2D Shape", 6.0, 6.0, 6.0, 6.0, 5.0, "Equilateral");
		Shape s24 = new Triangle(304, "Triangle", "Yellow", "2D Shape", 4.0, 5.0, 6.0, 5.0, 4.0, "Scalene");
		Shape s25 = new Triangle(305, "Triangle", "Purple", "2D Shape", 5.0, 5.0, 5.0, 5.0, 4.0, "Equilateral");
		Shape s26 = new Triangle(306, "Triangle", "Orange", "2D Shape", 3.0, 4.0, 5.0, 4.0, 3.0, "Scalene");
		Shape s27 = new Triangle(307, "Triangle", "Pink", "2D Shape", 6.0, 6.0, 6.0, 6.0, 5.0, "Equilateral");
		Shape s28 = new Triangle(308, "Triangle", "Brown", "2D Shape", 4.0, 5.0, 6.0, 5.0, 4.0, "Scalene");
		Shape s29 = new Triangle(309, "Triangle", "Gray", "2D Shape", 5.0, 5.0, 5.0, 5.0, 4.0, "Equilateral");
		Shape s30 = new Triangle(310, "Triangle", "Black", "2D Shape", 3.0, 4.0, 5.0, 4.0, 3.0, "Scalene");

		System.out.println(s21);
		System.out.println("===================");
		System.out.println(s22);
		System.out.println("===================");
		System.out.println(s23);
		System.out.println("===================");
		System.out.println(s24);
		System.out.println("===================");
		System.out.println(s25);
		System.out.println("===================");
		System.out.println(s26);
		System.out.println("===================");
		System.out.println(s27);
		System.out.println("===================");
		System.out.println(s28);
		System.out.println("===================");
		System.out.println(s29);
		System.out.println("===================");
		System.out.println(s30);
		
		System.out.println("==================s21 Details==================");
		System.out.println("Area of Triangle: " + s21.calculateArea());
		System.out.println("Perimeter of Triangle: " + s21.calculatePerimeter());
		
		System.out.println("==================s22 Details==================");
		System.out.println("Area of Triangle: " + s22.calculateArea());
		System.out.println("Perimeter of Triangle: " + s22.calculatePerimeter());
		
		System.out.println("==================s23 Details==================");
		System.out.println("Area of Triangle: " + s23.calculateArea());
		System.out.println("Perimeter of Triangle: " + s23.calculatePerimeter());
		
		System.out.println("==================s24 Details==================");
		System.out.println("Area of Triangle: " + s24.calculateArea());
		System.out.println("Perimeter of Triangle: " + s24.calculatePerimeter());
		
		System.out.println("==================s25 Details==================");
		System.out.println("Area of Triangle: " + s25.calculateArea());
		System.out.println("Perimeter of Triangle: " + s25.calculatePerimeter());
		
		System.out.println("==================s26 Details==================");
		System.out.println("Area of Triangle: " + s26.calculateArea());
		System.out.println("Perimeter of Triangle: " + s26.calculatePerimeter());
		
		System.out.println("==================s27 Details==================");
		System.out.println("Area of Triangle: " + s27.calculateArea());
		System.out.println("Perimeter of Triangle: " + s27.calculatePerimeter());
		
		System.out.println("==================s28 Details==================");
		System.out.println("Area of Triangle: " + s28.calculateArea());
		System.out.println("Perimeter of Triangle: " + s28.calculatePerimeter());
		
		System.out.println("==================s29 Details==================");
		System.out.println("Area of Triangle: " + s29.calculateArea());
		System.out.println("Perimeter of Triangle: " + s29.calculatePerimeter());
		
		System.out.println("==================s30 Details==================");
		System.out.println("Area of Triangle: " + s30.calculateArea());
		System.out.println("Perimeter of Triangle: " + s30.calculatePerimeter());
	}

}
