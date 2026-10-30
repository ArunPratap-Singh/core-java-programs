package collectionFrameworkProject;

import java.util.Comparator;
import java.util.List;

public class SortService {
	
	public static void sortOnSizeLowToHigh(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingInt((Shirt s)-> s.size));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnSizeHighToLow(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingInt((Shirt s)-> s.size).reversed());
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnPriceLowToHigh(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingDouble((Shirt s)-> s.price));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnPriceHighToLow(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingDouble((Shirt s) -> s.price).reversed());
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnBrandOnAscendingOrder(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparing((Shirt s) -> s.brand, String.CASE_INSENSITIVE_ORDER));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnBrandOnDescendingOrder(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparing((Shirt s) -> s.brand, String.CASE_INSENSITIVE_ORDER).reversed());
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnPriceLowToHighThenSizeLowToHigh(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparingInt((Shirt s) -> s.size));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnPriceLowToHighThenBrandAscending(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparingDouble((Shirt s) -> s.price).thenComparing((Shirt s) -> s.brand, String.CASE_INSENSITIVE_ORDER));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnBrandAscendingThenPriceLowToHigh(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparing((Shirt s) -> s.brand, String.CASE_INSENSITIVE_ORDER).thenComparingDouble((Shirt s) -> s.price));
		
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}
	
	public static void sortOnBrandDescendingThenPriceHighToLow(List<Shirt> shirts) {
		
		shirts.sort(Comparator.comparing((Shirt s) -> s.brand, String.CASE_INSENSITIVE_ORDER).reversed().thenComparing(Comparator.comparingDouble((Shirt s) -> s.price).reversed()));
			
			for(Shirt s : shirts) {
				System.out.println(s);
			}
	}

}
