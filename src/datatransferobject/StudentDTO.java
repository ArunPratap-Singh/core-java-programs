package datatransferobject;

public class StudentDTO {
	
	private String name;
	private int rollnumber;
	private String subject;
	private int marks;
	private int studentid;
	private String address;
	
	StudentDTO(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRollNumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getRollNumber() {
		return rollnumber;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setStudentID(int studentid) {
		this.studentid = studentid;
	}
	public int getStudentID() {
		return studentid;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

}
