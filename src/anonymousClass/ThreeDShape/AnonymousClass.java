package anonymousClass.ThreeDShape;

public class AnonymousClass {

	public static void main(String[] args) {

		ThreeDShape cube = new ThreeDShape() {

			@Override
			public void volume() {

				int a = 50;
				System.out.println("Volume of cube is: " + a * a * a);

			}

			@Override
			public void totalSurfaceArea() {
				int a = 20;

				System.out.println("Total Surface Area of cube is: " + 6 * a);

			}

			@Override
			public void lateralSurfaceArea() {

				int a = 50;

				System.out.println("Lateral Syrface Area opf cube is: " + 4 * a);

			}
		};
		
		cube.volume();
		cube.totalSurfaceArea();
		cube.lateralSurfaceArea();
		
		System.out.println("===================================================================");

		ThreeDShape cuboid = new ThreeDShape() {

			@Override
			public void volume() {

				int l = 20;
				int b = 10;
				int h = 5;

				System.out.println("Volume of cuboid is: " + l * b * h);
			}

			@Override
			public void totalSurfaceArea() {

				int l = 20;
				int b = 10;
				int h = 5;

				System.out.println("Total Surface Area of cuboid is: " + 2 * (l * b + b * h + h * l));
			}

			@Override
			public void lateralSurfaceArea() {

				int l = 20;
				int b = 10;
				int h = 5;

				System.out.println("Lateral Surface Area of cuboid is: " + 2 * h * (l + b));
			}
		};
		
		cuboid.volume();
		cuboid.lateralSurfaceArea();
		cuboid.totalSurfaceArea();
		
		System.out.println("===================================================================");

		ThreeDShape cylinder = new ThreeDShape() {

			@Override
			public void volume() {

				double r = 7;
				double h = 10;

				System.out.println("Volume of cylinder is: " + Math.PI * r * r * h);
			}

			@Override
			public void totalSurfaceArea() {

				double r = 7;
				double h = 10;

				System.out.println("Total Surface Area of cylinder is: " + 2 * Math.PI * r * (r + h));
			}

			@Override
			public void lateralSurfaceArea() {

				double r = 7;
				double h = 10;

				System.out.println("Lateral Surface Area of cylinder is: " + 2 * Math.PI * r * h);
			}
		};
		
		cylinder.volume();
		cylinder.totalSurfaceArea();
		cylinder.lateralSurfaceArea();
		
		System.out.println("===================================================================");

		ThreeDShape sphere = new ThreeDShape() {

			@Override
			public void volume() {

				double r = 7;

				System.out.println("Volume of sphere is: " + (4.0 / 3.0) * Math.PI * r * r * r);
			}

			@Override
			public void totalSurfaceArea() {

				double r = 7;

				System.out.println("Total Surface Area of sphere is: " + 4 * Math.PI * r * r);
			}

			@Override
			public void lateralSurfaceArea() {

				double r = 7;

				System.out.println("Lateral Surface Area of sphere is: " + 4 * Math.PI * r * r);
			}
		};
		
		sphere.volume();
		sphere.totalSurfaceArea();
		sphere.lateralSurfaceArea();
		
		System.out.println("===================================================================");

		ThreeDShape hemisphere = new ThreeDShape() {

			@Override
			public void volume() {

				double r = 7;

				System.out.println("Volume of hemisphere is: " + (2.0 / 3.0) * Math.PI * r * r * r);
			}

			@Override
			public void totalSurfaceArea() {

				double r = 7;

				System.out.println("Total Surface Area of hemisphere is: " + 3 * Math.PI * r * r);
			}

			@Override
			public void lateralSurfaceArea() {

				double r = 7;

				System.out.println("Curved Surface Area of hemisphere is: " + 2 * Math.PI * r * r);
			}
		};
		
		hemisphere.volume();
		hemisphere.lateralSurfaceArea();
		hemisphere.totalSurfaceArea();
		
		System.out.println("===================================================================");

		ThreeDShape cone = new ThreeDShape() {

			@Override
			public void volume() {

				double r = 7;
				double h = 10;

				System.out.println("Volume of cone is: " + (1.0 / 3.0) * Math.PI * r * r * h);
			}

			@Override
			public void totalSurfaceArea() {

				double r = 7;
				double l = 12;

				System.out.println("Total Surface Area of cone is: " + Math.PI * r * (r + l));
			}

			@Override
			public void lateralSurfaceArea() {

				double r = 7;
				double l = 12;

				System.out.println("Lateral Surface Area of cone is: " + Math.PI * r * l);
			}
		};
		
		cone.volume();
		cone.totalSurfaceArea();
		cone.lateralSurfaceArea();

	}

}
