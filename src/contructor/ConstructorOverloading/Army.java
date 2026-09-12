package contructor.ConstructorOverloading;

public class Army {
	
	    String name;
	    int id;
	    double salary;
	    String rank;

	    Army() {
	    	
	    }
	    
	    Army(String name) {
	        this.name = name;
	    }

	    Army(int id) {
	        this.id = id;
	    }

	    Army(double salary) {
	        this.salary = salary;
	    }

	    Army(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    Army(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    Army(double salary, String rank) {
	        this.salary = salary;
	        this.rank = rank;
	    }

	    Army(String rank, double salary) {
	        this.rank = rank;
	        this.salary = salary;
	    }

	    Army(int id, double salary) {
	        this.id = id;
	        this.salary = salary;
	    }

	    Army(double salary, int id) {
	        this.salary = salary;
	        this.id = id;
	    }

	    Army(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    Army(String name, String rank, double salary) {
	        this.name = name;
	        this.rank = rank;
	        this.salary = salary;
	    }

	    Army(int id, double salary, String rank) {
	        this.id = id;
	        this.salary = salary;
	        this.rank = rank;
	    }

	    Army(double salary, String name, String rank) {
	        this.salary = salary;
	        this.name = name;
	        this.rank = rank;
	    }

	    Army(String name, int id, double salary, String rank) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	        this.rank = rank;
	    }


	    public String toString() {

	        return "Name is: " + name + "\nId is: " + id + "\nSalary is: " + salary + "\nRank is: " + rank + "\n==============================";
	    }
	

}
