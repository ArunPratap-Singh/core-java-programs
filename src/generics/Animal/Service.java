package generics.Animal;

import java.util.List;

public class Service {
	
	//unbound
	
	public static void test(List<?> l) {
		System.out.println("Test Method Called");
	}
	
	//upperbound
	public static void giveFood(List<? extends PetAnimal> l) {
		System.out.println("Give Food Method Called");
	}
	//lowerbound
	public static void track(List<? super WildAnimal> l) {
		System.out.println("Track method Called");
	}

}
