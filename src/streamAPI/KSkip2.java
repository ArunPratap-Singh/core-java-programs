package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KSkip2 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(12); l.add(12); l.add(23); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); 
		l.add(50); l.add(44); l.add(44); l.add(50);
		
		l.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));
		
		int k = 4;
		int x = l.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst().orElseThrow();
		System.out.println("\n"+x);

	}

}
