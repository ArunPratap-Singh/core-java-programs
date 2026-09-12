package encapsulationsPrograming;

public class Student {
	
	private String name;
	private int rollno;
	private String course;
	private int marks;
	private double percentage;
	
	Student(){
		
	}
	
	Student(String name, int rollno, String course, int marks, double percentage){
		
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.marks = marks;
		this.percentage = percentage;
	}
	
	public void setName(String name) {
		
		if(name.length()>2 && name.length()<100 && !name.isBlank() && name.matches("[A-Z a-z \s]+")) 
			this.name = name;
		else 
			System.out.println("Invalid Name Entered");
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int rollno) {
		if(rollno>0 && rollno<1000000) 
			this.rollno = rollno;
		else 
			System.out.println("Invalid RollNo");
		
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public void setCourse(String course) { 
		if(course.length()>2 && course.length()<=50 && !course.isBlank() && course.matches("[A-Z a-z \s]+")) 
			this.course = course;
		else 
			System.out.println("Course not available");
		
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setMarks(int marks) {
		if(marks>= 0 && marks<= 500) 
			this.marks = marks;
		else 
			System.out.println("Invalid Marks Entered");
		
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setPercentage(double percentage) {
		if(percentage>=10 && percentage<=101) 
			this.percentage = percentage;
		else 
			System.out.println("Invalid Percentage");
		
	}
	
	public double getPercentage() {
		return percentage;
	}

}
