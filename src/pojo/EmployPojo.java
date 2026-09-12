package pojo;

public class EmployPojo {
	private String name;
	private int age;
	private int id;
	private String address;
	private long adhaarnumber;
	private long mobilenumber;
	private String company;
	
	EmployPojo(String name, int age, int id, String address, long adhaarnumber, long mobilenumber, String company){
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
		this.adhaarnumber = adhaarnumber;
		this.mobilenumber = mobilenumber;
		this.company = company;
	}
	
	public String toString() {
		return "Name is: " +name+"\tAge is : " +age+"\tId is: " +id+"\tAddress is: " +address+"\tAdhaarnumberis: " +adhaarnumber+"\tMobilenumberis: " +mobilenumber+"\tCompany is: " +company;
	}

}
