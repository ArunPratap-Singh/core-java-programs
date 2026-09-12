package encapsulation;

public class Employ {
	
	private String name;
	private int age;
	private double salary;
	private String address;
	private long phonenumber;
	private long adhaarnumber;
	
	Employ(String name, int age, double salary, String address, long phonenumber, long adhaarnumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	public void setName(String name) {
		if(name.length()>=2 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))
		
			this.name = name;
			
			else
				System.out.println("Invalid name entered");
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age>18 && age<60)
			this.age = age;
		else
			System.out.println("Invalid age entered");
	}
	public int getAge() {
		return age;
	}
	public void setSalary(double salary) {
		if(salary>=10000 && salary<=350000)
			this.salary = salary;
		else
			System.out.println("Invalid salary");
	}
	public double getSalary() {
		return salary;
	}
	public void setAddress(String address) {
		if(address.length()>3 && address.length()<100 && address.matches("[A-Z a-z 1-100 \s]+"))
			this.address = address;
		else
			System.out.println("Character not supported");
	}
	public String getAddress() {
		return address;
	}
	public void setPhoneNumber(long phonenumber) {
		if((phonenumber+"").length()==10)
			this.phonenumber = phonenumber;
		else
			System.out.println("Invalid phone number entered");
	}
	public long getPhoneNumber() {
		return phonenumber;
	}
	public void setAdhaarNumber(long adhaarnumber) {
		if(String.valueOf(adhaarnumber).length()==12)
			this.adhaarnumber = adhaarnumber;
	}
	public long getAdhaarNumber() {
		return adhaarnumber;
	}

}
