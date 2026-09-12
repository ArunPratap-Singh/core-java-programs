package multiThreading;

public class Student extends Thread{
	
	String name;
	int age;
	String course;
	
	Student(){
		
	}
	
	Student(String name, int age, String course){
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void run() {
		studentInformation();
	}
	
	public void studentInformation() {
		System.out.println("Student Name is: "+name+" Age is:"+age+" course is: "+course);
	}

}
