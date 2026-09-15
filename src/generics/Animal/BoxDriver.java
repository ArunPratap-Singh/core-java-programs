package generics.Animal;

public class BoxDriver {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box<Integer> b2 = new Box<>(10);
		Box<String> b3 = new Box<>("Hello");
		Box<Double> b4 = new Box<>(10.0);
		Box<Boolean> b5 = new Box<>(true);
		Box<Float> b6 = new Box<>(2.06565F);
		
		System.out.println(b1.getDetials());
		System.out.println(b2.getDetials());
		System.out.println(b3.getT());
		System.out.println(b4.getT());
		System.out.println(b5.getDetials());
		System.out.println(b6.getDetials());
		

	}

}
