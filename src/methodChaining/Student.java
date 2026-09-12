package methodChaining;

public class Student {
	
	    private int rollNo;
	    private String name;
	    private String course;
	    private double percentage;
	    private String college;
	    
	    Student(){
	    	
	    }

	    public Student setRollNo(int rollNo) {

	        this.rollNo = rollNo;

	        return this;
	    }

	    public Student setName(String name) {

	        this.name = name;

	        return this;
	    }

	    public Student setCourse(String course) {

	        this.course = course;

	        return this;
	    }

	    public Student setPercentage(double percentage) {

	        this.percentage = percentage;

	        return this;
	    }

	    public Student setCollege(String college) {

	        this.college = college;

	        return this;
	    }

	    public Student printRollNo() {
	    	
	    	System.out.println("Roll No is: " +rollNo);
	    	return this;
	    }
	    
	    public Student printName() {
	    	
	    	System.out.println("Name is: " +name);
	    	return this;
	    }
	    
	    public Student printCourse() {
	    	
	    	System.out.println("Course is: " +course);
	    	return this;
	    }
	    
	    public Student printPercentage() {
	    	
	    	System.out.println("Percentage is: " +percentage);
	    	return this;
	    }
	    
	    public Student printCollege() {
	    	
	    	System.out.println("College is: " +college);
	    	return this;
	    }
	    
	    
	    
	

}
