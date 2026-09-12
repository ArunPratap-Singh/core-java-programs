package objCount;

public class Employ1 {
	
	String name;
	int age;
	double salary;
	
	Employ1(){
		
	}
	
	Employ1(String name, int age, double salary){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	static int count = 0;
	
	{
		count++;
		System.out.println("Employ Object " +count+ " is Created");
	}

}
