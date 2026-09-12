package pojoPrograming;

public class StudentManagement {
	
	private int studentID;
	private String studentName;
	private int age;
	private double marks;
	private String course;
	private String college;
	private String email;
	private long contact;
	private String address;
	private String gender;
	private int semester;
	private String grade;
	
	StudentManagement(){
		
	}
	
	StudentManagement(int studentID, String studentName, int age, double marks, String course, String college, String email, long contact, String address, String gender, int semester, String grade){
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.age = age;
		this.marks = marks;
		this.course = course;
		this.college = college;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.gender = gender;
		this.semester = semester;
		this.grade = grade;
		
	}
	
	public void setID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {

		return age;
	}


	public void setAge(int age) {

		this.age = age;
	}


	public double getMarks() {

		return marks;
	}


	public void setMarks(double marks) {

		this.marks = marks;
	}


	public String getCourse() {

		return course;
	}


	public void setCourse(String course) {

		this.course = course;
	}


	public String getCollege() {

		return college;
	}


	public void setCollege(String college) {

		this.college = college;
	}


	public String getEmail() {

		return email;
	}


	public void setEmail(String email) {

		this.email = email;
	}


	public long getContact() {

		return contact;
	}


	public void setContact(long contact) {

		this.contact = contact;
	}


	public String getAddress() {

		return address;
	}


	public void setAddress(String address) {

		this.address = address;
	}


	public String getGender() {

		return gender;
	}


	public void setGender(String gender) {

		this.gender = gender;
	}


	public int getSemester() {

		return semester;
	}


	public void setSemester(int semester) {

		this.semester = semester;
	}


	public String getGrade() {

		return grade;
	}


	public void setGrade(String grade) {

		this.grade = grade;
	}


	
}
