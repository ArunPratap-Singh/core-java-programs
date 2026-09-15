package generics.Animal;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Animal> l = new ArrayList<>();
		l.add(new Dog());
		l.add(new Lion());
		
		List<Box<Integer>> b = new ArrayList<>();
		b.add(new Box<>(10));
		b.add(new Box<>(20));
		
		List<Box<Boolean>> bl = new ArrayList<>();
		bl.add(new Box<>(true));
		bl.add(new Box<>(false));
		
		List<PetAnimal> p = new ArrayList<>();
		List<Dog> d = new ArrayList<>();
		List<WildAnimal> w = new ArrayList<>();
		List<Lion> o = new ArrayList<>();
		
		Service.test(b);
		Service.test(bl);
		Service.test(o);
		Service.test(w);
		Service.test(p);
		Service.test(d);
		Service.test(l);
		System.out.println("=================");
		Service.giveFood(d);
		Service.giveFood(p);
		System.out.println("=================");
		Service.track(l);
		Service.track(w);

	}

}
