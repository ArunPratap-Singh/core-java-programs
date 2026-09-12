package contructor.ConstructorCopy;

public class Employ {
	
	String name;
	int age;
	String address;
	long mobilenumber;
	long adhaarnumber;
	double salary;
	String company;
	String post;
	
	Employ(){
		
	}
	
	//Setters or Mutators
	Employ(String name, int age, String address, long mobilenumber, long adhaarnumber, double salary, String company, String post){
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.adhaarnumber = adhaarnumber;
		this.salary = salary;
		this.company = company;
		this.post = post;
	}
	
	Employ(Employ e){
		
		this.name = e.name;
		this.address = e.address;
		this.adhaarnumber = e.adhaarnumber;
		this.age = e.age;
		this.company = e.company;
		this.mobilenumber = e.mobilenumber;
		this.post = e.post;
		this.salary = e.salary;
	}
	
	//Getters or Accessors
	public String getDetails() {
		
		return "Name is: " +name+"\nAge is: " +age+"\nAddress is: " +address+"\nMobileNumber is: " +mobilenumber+"\nAdhaarNumber is: " +adhaarnumber+"\nSalary is: " +salary+"\nCompany is: " +company+"\nPost is: "+post+"\n=======================";
	}
	

}
