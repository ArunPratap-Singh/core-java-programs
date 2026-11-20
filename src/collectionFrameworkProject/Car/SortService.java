package collectionFrameworkProject.Car;

import java.util.Comparator;
import java.util.List;

public class SortService {
	
	public static void sortOnPriceLowToHigh(List<Car> cars) {
		
		cars.sort(Comparator.comparingDouble((Car c) -> c.price));
		for(Car c : cars) {
			
			System.out.println(c);
		}

	}
	
	public static void sortOnPriceHighToLow(List<Car> cars) {
		
		cars.sort(Comparator.comparingDouble((Car c) -> c.price).reversed());
		
		for(Car c : cars) {
			
			System.out.println(c);
		}
	}
	
	public static void sortOnYearNewToOld(List<Car> cars) {
		
		cars.sort(Comparator.comparingInt((Car c) -> c.manufacturingYear).reversed());
		
		for(Car c : cars) {
			System.out.println(c);
		}
	}
	
	public static void sortOnYearOldToNew(List<Car> cars) {
		
		cars.sort(Comparator.comparingInt((Car c) -> c.manufacturingYear));
		for(Car c : cars) {
			System.out.println(c);
		}
	}

}
