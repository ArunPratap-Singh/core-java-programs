package streamAPIPrograming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LargestDistinctNum {
	
	//largest distinct number
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
	    
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(35); l.add(54); l.add(39); l.add(39); l.add(78); l.add(71);
		
		l.add(12); l.add(23); l.add(45); l.add(20); l.add(30); l.add(90); l.add(65); l.add(35); l.add(54); l.add(100);
		
		int largestnumber = l.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get().intValue();
		
		System.out.println("LargestNumber in " +l+ " is: " +largestnumber);
	}

}
