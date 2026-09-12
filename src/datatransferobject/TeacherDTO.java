package datatransferobject;

public class TeacherDTO {
	
	private String name;
	private int id;
	private String subject;
	private double salary;
	
	TeacherDTO(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
