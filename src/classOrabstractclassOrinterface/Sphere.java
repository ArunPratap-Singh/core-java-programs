package classOrabstractclassOrinterface;

public class Sphere implements ThreeDShape {
	
		double r;
		
		Sphere() {
			
		}
		
		Sphere(double r){
			this.r = r;
		}
		
		@Override
		public void resize() {
			
			System.out.println("Resize Sphere");
		}
		@Override
		public double volume() {
			return 4.0/3*Math.PI*r*r*r;
		}
		@Override
		public double lateralSurfaceArea() {
			return 4*Math.PI*r*r;
		}
		@Override
		public double totalSurfaceArea() {
			return 4*Math.PI*r*r;
		}
		
		public String toString() {
			return "Radius is: " +r;
		}
}
