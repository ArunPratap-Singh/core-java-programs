package streamAPIPrograming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLongestString {

	//Find the Second-Longest String
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
	    
		l.add("JAVA"); l.add("SELENIUM"); l.add("AUTOMATION"); l.add("TestNG"); l.add("PROGRAMMING"); l.add("PYTHON"); l.add("AI");
		
		String result = l.stream().sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		
		System.out.println("Second Longest String is: " +result);

	}

}
