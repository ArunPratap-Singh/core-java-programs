package contructor.ConstructorCopy;

public class Student {
	
	String name;
	int age;
	String section;
	String schoolname;
	
	Student(){
		
	}
	
	Student(String name, int age, String section, String schoolname) {
		
		this.name = name;
		this.age = age;
		this.section = section;
		this.schoolname = schoolname;
	}
	
	Student(Student s){
		
		this.name = s.name;
		this.age = s.age;
		this.schoolname = s.schoolname;
		this.section = s.section;
	}
	
	public String toString() {
		
		return "Name is: " +name+"\nAge is: " +age+"\nSection is: " +section+"\nSchool Name is: " +schoolname+"\n====================="; 
	}
	

}
