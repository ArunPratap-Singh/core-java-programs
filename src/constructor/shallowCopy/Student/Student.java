package constructor.shallowCopy.Student;

public class Student {
	
	int id;
	String name;
	int  age;
	String section;
	Address a;
	
	Student(){
		
	}
	
	Student(int id, String name, int age, String section, Address a) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.section = section;
		this.a = a;
	}
	
	Student(Student a) {
		
		this.id = a.id;
		this.name = a.name;
		this.age = a.age;
		this.section = a.section;
		this.a = a.a;
	}
	
	public String toString() {
		return "Id is: " +id+"\nName is: " +name+"\nAge is: " +age+"\nSection is: " +section+"\nA is: " +a+"\n==========================";
	}
	
}
