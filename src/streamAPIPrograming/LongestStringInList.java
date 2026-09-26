package streamAPIPrograming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestStringInList {

	//Find the Longest String in a List
	public static void main(String[] args) {
	
		List<String> l = new ArrayList<>();
	    
		l.add("JAVA"); l.add("SELENIUM"); l.add("AUTOMATION"); l.add("TestNG"); l.add("PROGRAMMING"); l.add("PYTHON"); l.add("AI");
		
		String result = l.stream().max(Comparator.comparing(String::length)).orElse("");
		
		System.out.println("Longest String is: " +result);
		
		System.out.println("=======================");
		
		String min = l.stream().min(Comparator.comparing(String::length)).orElse("");
		
		System.out.println("Shortest String is: " +min);

	}

}
