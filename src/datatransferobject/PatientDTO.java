package datatransferobject;

public class PatientDTO {
	
	private int patientid;
	private String name;
	private String disease;
	private int age;
	private String address;
	
	PatientDTO(){
		
	}
	
	public void setPatientID(int patientid) {
		this.patientid = patientid;
	}
	public int getPatientID() {
		return patientid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDisease() {
		return disease;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

}
