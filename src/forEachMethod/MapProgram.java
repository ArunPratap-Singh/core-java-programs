package forEachMethod;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap<>();
		
		m.put(12, "abc");
		m.put(23, "pqr");
		m.put(15, "ijk");
		m.put(22, "xyz");
		m.put(16, "mno");
		
		m.forEach((k,v) -> System.out.println(k+"\t"+v));

	}

}
