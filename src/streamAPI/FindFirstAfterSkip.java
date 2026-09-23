package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAfterSkip {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(12); l.add(45); 
		
		int x = l.stream().skip(2).findFirst().orElse(0).intValue();
		
		System.out.println(x);
		
		

	}

}
