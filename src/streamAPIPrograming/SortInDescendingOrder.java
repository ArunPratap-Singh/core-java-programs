package streamAPIPrograming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortInDescendingOrder {

	//Sort numbers in descending order
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
	    
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(39); l.add(78); l.add(71);
		
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(90); l.add(65); l.add(35); l.add(54); l.add(100);
		
		l.stream().sorted((n1, n2)->n2-n1).forEach(n->System.out.print(n+" "));
		
		System.out.println("================");
		
		l.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));
		

	}

}
