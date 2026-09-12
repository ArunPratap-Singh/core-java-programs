package contructor.ConstructorChaining;

public class Army {
	
	    String soldierName;
	    int age;
	    String rank;
	    String regiment;
	    int serviceYears;
	    double salary;
	    String posting;
	    String weaponType;

	    Army(String soldierName, int age, String rank, String regiment, int serviceYears, double salary, String posting, String weaponType) {

	        this.soldierName = soldierName;
	        this.age = age;
	        this.rank = rank;
	        this.regiment = regiment;
	        this.serviceYears = serviceYears;
	        this.salary = salary;
	        this.posting = posting;
	        this.weaponType = weaponType;
	    }

	    Army() {
	    }

	    Army(String soldierName) {
	        this.soldierName = soldierName;
	    }

	    Army(String soldierName, int age) {
	        this(soldierName);
	        this.age = age;
	    }

	    Army(String soldierName, int age, String rank) {
	        this(soldierName, age);
	        this.rank = rank;
	    }

	    Army(String soldierName, int age, String rank, String regiment) {
	        this(soldierName, age, rank);
	        this.regiment = regiment;
	    }

	    Army(String soldierName, int age, String rank, String regiment, int serviceYears) {
	        this(soldierName, age, rank, regiment);
	        this.serviceYears = serviceYears;
	    }

	    Army(String soldierName, int age, String rank, String regiment, int serviceYears, double salary) {
	        this(soldierName, age, rank, regiment, serviceYears);
	        this.salary = salary;
	    }

	    Army(String soldierName, int age, String rank, String regiment, int serviceYears, double salary, String posting) {
	        this(soldierName, age, rank, regiment, serviceYears, salary);
	        this.posting = posting;
	    }

	    Army(int age, String soldierName, String rank, String regiment, int serviceYears, double salary, String posting, String weaponType) {
	        this(soldierName, age, rank, regiment, serviceYears, salary, posting);
	        this.weaponType = weaponType;
	    }

	    public String toString() {

	        return "Soldier Name is: " + soldierName + "\tAge is: " + age + "\tRank is: " + rank + "\tRegiment is: " + regiment + "\nService Years are: " + serviceYears + "\tSalary is: " + salary + "\tPosting is: " + posting + "\nWeapon Type is: " + weaponType + "\n===============================================";
	    }
	

}
