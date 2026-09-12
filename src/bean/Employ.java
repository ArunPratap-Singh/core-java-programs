package bean;

public class Employ {
	private String name;
	private int age;
	private int id;
	private String address;
	private long adhaarnumber;
	private long mobilenumber;
	private String company;
	
	Employ(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAdhaarnumber(long adhaarnumber) {
		this.adhaarnumber = adhaarnumber;
	}
	public long getAdhaarnumber() {
		return adhaarnumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}

}
