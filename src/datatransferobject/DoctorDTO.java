package datatransferobject;

public class DoctorDTO {
	private String name;
	private int doctorid;
	private String specialization;
	private String hospitalname;
	private Double salary;
	
	DoctorDTO(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDoctorID(int doctorid) {
		this.doctorid = doctorid;
	}
	public int getDoctorID() {
		return doctorid;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setHospitalName(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getHospitalName() {
		return hospitalname;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
