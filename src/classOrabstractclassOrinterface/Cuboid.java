package classOrabstractclassOrinterface;

public class Cuboid implements ThreeDShape {
	
		double l;
		double w;
		double h;
		
		Cuboid(){
			
		}
		
		Cuboid(double l, double w, double h){
			this.l = l;
			this.w = w;
			this.h = h;
		}
		@Override
		public void resize() {
			
			System.out.println("Resize Cuboid");
		}
		@Override
		public double volume() {
			return l*w*h;
		}
		@Override
		public double lateralSurfaceArea() {
			return 2*h*(l+w);
		}
		@Override
		public double totalSurfaceArea() {
			return 2*(l*w+w*h+h*l);
		}
		
		public String toString() {
			return "Length is: " +l+"\tWidth is: " +w+"\tHeight is : " +h;
		}
}
