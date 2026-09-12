package methodChaining;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();
		Employ e4 = new Employ();
		Employ e5 = new Employ();
		Employ e6 = new Employ();
		Employ e7 = new Employ();
		Employ e8 = new Employ();
		Employ e9 = new Employ();
		Employ e10 = new Employ();

        e1.setID(101).setName("Rahul").setDepartment("Automation Testing").setSalary(55000).setDesignation("Software Test Engineer");
        e2.setID(102).setName("Akash").setDepartment("Software Testing").setSalary(60000).setDesignation("Full Stack Developer");
        e3.setID(103).setName("Shambhu").setDepartment("Quality Testing").setSalary(70000).setDesignation("UA/UI Developer");
        e4.setID(104).setName("Shivani").setDepartment("Software Testing").setSalary(80000).setDesignation("Java Stack developer");
        e5.setID(105).setName("Arun").setDepartment("JavaFull Stack").setSalary(90000).setDesignation("Automation Test Engineer");
        e6.setID(106).setName("Manoj").setDepartment("Automation Testing").setSalary(500000).setDesignation("Automation Test Engineer");
        e7.setID(107).setName("Jitendra").setDepartment("Mern Full Stack").setSalary(600000).setDesignation("Automation Test Engineer");
        e8.setID(108).setName("Sachin").setDepartment("Python Full Stack").setSalary(700000).setDesignation("Automation Test Engineer");
        e9.setID(109).setName("Stuti").setDepartment("Software Testing").setSalary(800000).setDesignation("Automation Test Engineer");
        e10.setID(110).setName("Madan").setDepartment("Business Analyst").setSalary(900000).setDesignation("QA Engineer");
        
        e1.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("=========");
        e2.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e3.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e4.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e5.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e6.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e7.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e8.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e9.printName().printID().printSalary().printDepartment().printDesignation();
        System.out.println("==========");
        e10.printName().printID().printSalary().printDepartment().printDesignation();

	}

}
