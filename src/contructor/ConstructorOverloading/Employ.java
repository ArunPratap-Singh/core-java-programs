package contructor.ConstructorOverloading;

public class Employ {
	
	String name;
	int age;
	double salary;
	String address;
	int id;
	long phonenumber;
	long adhaarnumber;
	
	Employ(){
		
	}
	
	Employ(String name, int age, double salary, String address, int id, long phonenumber, long adhaarnumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	Employ(String name){

		this.name = name;
	}

	Employ(int age, long adhaarnumber){
	
		this.age = age;
		this.adhaarnumber = adhaarnumber;
	}

	Employ(double salary, String address){

		this.salary = salary;
		this.address = address;
	}

	Employ(String address, double salary){

		this.address = address;
		this.salary = salary;
	}

	Employ(int id){

		this.id = id;
	}

	Employ(long phonenumber){

		this.phonenumber = phonenumber;
	}

	
	Employ(long adhaarnumber, double salary){

		this.adhaarnumber = adhaarnumber;
		this.salary = salary;		
	}
	
	Employ(int age, String name, double salary, String address, int id, long phonenumber, long adhaarnumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	Employ(String name, int age, String address, double salary, int id, long phonenumber, long adhaarnumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	Employ(String name, int age, double salary, String address, long phonenumber, int id, long adhaarnumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	Employ(String name, int age, double salary, int id, long adhaarnumber, String address, long phonenumber){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.phonenumber = phonenumber;
		this.adhaarnumber = adhaarnumber;
	}
	
	public String toString(){

		return "Name is: " +name+"\nAge is: " +age+"\nSalary is: " +salary+"\nAddress is: " +address+"\nId is: " +id+"\nPhonenumber is: " +phonenumber+"\nAdhaarnumber is: " +adhaarnumber+"\n=================";
	}

}
