package streamAPIPrograming;

import java.util.ArrayList;
import java.util.List;

public class AllNumberDivisibleBy5 {

	//Find all numbers divisible by 5
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
	    
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(39); l.add(78); l.add(71);
		
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(90); l.add(65); l.add(35); l.add(54); l.add(100);
		
		l.stream().filter(n-> n%5==0).forEach(n->System.out.print(n+" "));

	}

}
