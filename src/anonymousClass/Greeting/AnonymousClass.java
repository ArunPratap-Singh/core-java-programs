package anonymousClass.Greeting;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Greeting g = new Greeting() {
			
			@Override
			public void sayHello() {
				
				System.out.println("Hello! Welcome to Java Programing ");
				System.out.println("Hello welcome to DSA Programing");
				System.out.println("Thanks To Shambhu Sir for such greetings");
				
			}
		};
		
		g.sayHello();

	}

}
