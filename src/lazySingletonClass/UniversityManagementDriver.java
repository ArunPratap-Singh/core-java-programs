package lazySingletonClass;

public class UniversityManagementDriver {

		    public static void main(String[] args) {

		        System.out.println("========== UNIVERSITY MANAGEMENT ==========");

		        UniversityManagement u1 = UniversityManagement.getInstance();
		        UniversityManagement u2 = UniversityManagement.getInstance();
		        UniversityManagement u3 = UniversityManagement.getInstance();

		        u1.displayUniversityDetails();
		        System.out.println("=============");
		        u2.displayUniversityDetails();
		        System.out.println("=============");
		        u3.displayUniversityDetails();
		        
		        System.out.println("==========================");
		        u1.setUniversityName("Lucknow University");
		        u1.setUniversityContact("98745661232");
		        u1.setUniversityAddress("Lucknow");
		        u1.setTotalStudents(30000);
		        u1.setTotalProfessors(600);
		        
		        System.out.println("=================== u1 Details After Change========================");
		        u1.displayUniversityDetails();

		        u1.addStudent("Rahul");
		        u1.addProfessor("Dr. Sharma");
		        u1.removeStudent("Kamal");
		        u1.removeProfessor("Dr.sumant");
		        

		        System.out.println("u1 == u2 : " + (u1 == u2));
		        System.out.println("u2 == u3 : " + (u2 == u3));
		        System.out.println("u1 == u3 : " + (u1 == u3));

		        System.out.println("=======================");
		        u2.removeStudent("Rahul");
		        u2.addStudent("Akash");

		        System.out.println("========================");

		        u3.displayUniversityDetails();
		    
		

	}

}
