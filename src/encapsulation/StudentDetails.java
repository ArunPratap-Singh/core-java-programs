package encapsulation;

public class StudentDetails {
	
	private String name;
	private int rollnumber;
	private String subject;
	private int marks;
	private double percentage;
	
	StudentDetails(String name, int rollnumber, String subject, int marks, double percentage){
		this.name = name;
		this.rollnumber = rollnumber;
		this.subject = subject;
		this.marks = marks;
		this.percentage = percentage;
		}
	
	public void setName(String name) {
		if(name.length()>2 && name.length()<100 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))
			this.name = name;
		
		else
			System.out.println("Wrong Name");
	}
	public String getName() {
		return name;
	}
	public void setRollNumber(int rollnumber) {
		if(rollnumber>3 && rollnumber<200000)
			this.rollnumber = rollnumber;
		
		else
			System.out.println("Invalid RollNumber");
	}
	public int getRollNumber() {
		return rollnumber;
	}
	public void setSubject(String subject) {
		if(subject.length()>2 && subject.length()<20 && !subject.isBlank() && subject.matches("[A-Z a-z \s]+"))
			this.subject = subject;
	
		else
			System.out.println("Wrong Subject Entered");
	}
	public String getSubject() {
		return subject;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<101)
			this.marks = marks;
		
		else
			System.out.println("Wrong marks");
	}
	public int getMarks() {
		return marks;
	}
	public void setPercentage(double percentage) {
		if(percentage>0.0 && percentage<101.0)
			this.percentage = percentage;
		
		else
			System.out.println("Invalid Percentage");
	}
	public double getPercentage() {
		return percentage;
	}

}
