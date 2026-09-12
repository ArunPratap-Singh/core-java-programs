package contructor.ConstructorChaining;

public class Employ {
	
	String name;
	int age;
	String address;
	long mobilenumber;
	long adhaarnumber;
	double salary;
	String company;
	String post;
	
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
	
	Employ(){

	}

	Employ(String name){

		this.name = name;
	}

	Employ(String name, int age){

		this(name);
		this.age = age;
	}

	Employ(String name, int age, String address){

		this(name, age);
		this.address = address;
	}

	Employ(String name, int age, String address, long mobilenumber){

		this(name, age, address);
		this.mobilenumber = mobilenumber;
	}

	Employ(String name, int age, String address, long mobilenumber, long adhaarnumber){

		this(name, age, address, mobilenumber);
		this.adhaarnumber = adhaarnumber;
	}

	Employ(String name, int age, String address, long mobilenumber, long adhaarnumber, double salary){

		this(name, age, address, mobilenumber, adhaarnumber);
		this.salary = salary;
	}

	Employ(int age, String name, String address, long mobilenumber, long adhaarnumber, double salary, String company){

		this(name, age, address, mobilenumber, adhaarnumber, salary);
		this.company = company;
	}

	Employ(int age, String name, String address, long mobilenumber, long adhaarnumber, double salary, String company, String post){

		this(age, name, address, mobilenumber, adhaarnumber, salary, company);
		this.post = post;
	}

	
	public String toString(){

	return "Name is: " +name+"\tAge is: " +age+"\tAddress is: " +address+"\tMobilenumber is: " +mobilenumber+"\nAdhaarnumber is: " +adhaarnumber+"\tSalary is: " +salary+"\tCompany is: " +company+"\tPost is: " +post+"\n===============================";
	}

}
