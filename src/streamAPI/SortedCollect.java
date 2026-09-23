package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCollect {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(12); l.add(12); l.add(23); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); 
		l.add(50); l.add(44); l.add(44); l.add(50);
		
		List<Integer>sorted = l.stream().sorted().collect(Collectors.toList());
		l = l.stream().sorted().collect(Collectors.toList());
		
		System.out.println(l);
		System.out.println("=================");
		System.out.println("\n"+l);
		System.out.println("=================");
		System.out.println(sorted);

	}

}
