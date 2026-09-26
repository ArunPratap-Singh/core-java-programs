package streamAPIPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersGreaterThanAverage {

	//Numbers Greater Than the Average
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
	    
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(39); l.add(78); l.add(71);
		
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(90); l.add(65); l.add(35); l.add(54); l.add(100);
		
		double average = l.stream().mapToInt(n->n).average().getAsDouble();
		
		List<Integer> result = l.stream().filter(n->n>average).collect(Collectors.toList());
		
		System.out.println("Average of " +l+ " is: " +average);
		System.out.println("===================");
		System.out.println("Number Greater than " +average+" is: " +result);

	}

}
