package streamAPI;

public class StringDistinct {

	public static void main(String[] args) {
		
		String s = "abcdabcced";
		
		s.chars().distinct().forEach(n->System.out.print((char)n+" "));

	}

}
