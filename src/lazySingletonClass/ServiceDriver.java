package lazySingletonClass;

public class ServiceDriver {

	public static void main(String[] args) {
	
		Service s = Service.getInstance();
		Service s1 = Service.getInstance();
		Service s2 = Service.getInstance();
		
		s.service();
		s1.service();
		s2.service();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s);

	}

}
