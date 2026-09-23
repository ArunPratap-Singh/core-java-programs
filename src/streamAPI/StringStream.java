package streamAPI;

public class StringStream {

	public static void main(String[] args) {
	
		String s = "abcdabcced";
		
		s.chars().forEach(n->System.out.print((char)n+" "));

	}

}
