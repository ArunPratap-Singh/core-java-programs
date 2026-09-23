package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class DistinctSum {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(12); l.add(12); l.add(23); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(78); 
		l.add(50); l.add(44); l.add(44); l.add(50);
		
		int sum = l.stream().distinct().mapToInt(n->n).sum();
		
		int sum1 = l.stream().mapToInt(n->n).distinct().sum();
		
		System.out.println("Sum Of Distinct Numbers are: " +sum);
		System.out.println("==============");
		System.out.println("Sum Of Distinct Numbers are: " +sum1);
		
		

	}

}
