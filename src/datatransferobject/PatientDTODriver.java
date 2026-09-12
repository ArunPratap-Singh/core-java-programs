package datatransferobject;

public class PatientDTODriver {

	public static void main(String[] args) {
		
		PatientDTO p1 = new PatientDTO();
		PatientDTO p2 = new PatientDTO();
		PatientDTO p3 = new PatientDTO();
		PatientDTO p4 = new PatientDTO();
		PatientDTO p5 = new PatientDTO();
		PatientDTO p6 = new PatientDTO();
		PatientDTO p7 = new PatientDTO();
		
		p1.setName("Mohan");	p1.setPatientID(100);	p1.setAge(21);	p1.setDisease("Tuberculosis");	p1.setAddress("Noida");
		p2.setName("Rohan");	p2.setPatientID(101);	p2.setAge(25);	p2.setDisease("Cataract");	p2.setAddress("Gaziabad");
		p3.setName("Sohan");	p3.setPatientID(102);	p3.setAge(22);	p3.setDisease("Bery Bery");	p3.setAddress("Meerut");
		p4.setName("Madan");	p4.setPatientID(103);	p4.setAge(29);	p4.setDisease("Scurvey");	p4.setAddress("Lucknow");
		p5.setName("Ram");	p5.setPatientID(104);	p5.setAge(27);	p5.setDisease("Cancer");	p5.setAddress("Delhi");
		p6.setName("Shyam");	p6.setPatientID(105);	p6.setAge(24);	p6.setDisease("Pnemonia");	p6.setAddress("Banglore");
		p7.setName("Arjun");	p7.setPatientID(106);	p7.setAge(26);	p7.setDisease("Fever");	p7.setAddress("Pune");
		
		System.out.println("=============================================================================================");
		
		System.out.println("================PatientDTO Details 1==================");
		System.out.println("Object reference is: " +p1);
		System.out.println("Name is: " +p1.getName());
		System.out.println("PatientID is: " +p1.getPatientID());
		System.out.println("Age is: " +p1.getAge());
		System.out.println("Disease is: " +p1.getDisease());
		System.out.println("Address is: " +p1.getAddress());
		System.out.println("=================================");
		System.out.println("================PatientDTO Details 2==================");
		System.out.println("Object reference is: " +p2);
		System.out.println("Name is: " +p2.getName());
		System.out.println("PatientID is: " +p2.getPatientID());
		System.out.println("Age is: " +p2.getAge());
		System.out.println("Disease is: " +p2.getDisease());
		System.out.println("Address is: " +p2.getAddress());
		System.out.println("=================================");
		System.out.println("================PatientDTO Details 3==================");
		System.out.println("Object reference is: " +p3);
		System.out.println("Name is: " +p3.getName());
		System.out.println("PatientID is: " +p3.getPatientID());
		System.out.println("Age is: " +p3.getAge());
		System.out.println("Disease is: " +p3.getDisease());
		System.out.println("Address is: " +p3.getAddress());
		System.out.println("=================================");
		System.out.println("================PatientDTO Details 4==================");
		System.out.println("Object reference is: " +p4);
		System.out.println("Name is: " +p4.getName());
		System.out.println("PatientID is: " +p4.getPatientID());
		System.out.println("Age is: " +p4.getAge());
		System.out.println("Disease is: " +p4.getDisease());
		System.out.println("Address is: " +p4.getAddress());
		System.out.println("=================================");
		System.out.println("================PatientDTO Details 5==================");
		System.out.println("Object reference is: " +p6);
		System.out.println("Name is: " +p6.getName());
		System.out.println("PatientID is: " +p6.getPatientID());
		System.out.println("Age is: " +p6.getAge());
		System.out.println("Disease is: " +p6.getDisease());
		System.out.println("Address is: " +p6.getAddress());
		System.out.println("=================================");
		System.out.println("================PatientDTO Details 7==================");
		System.out.println("Object reference is: " +p7);
		System.out.println("Name is: " +p7.getName());
		System.out.println("PatientID is: " +p7.getPatientID());
		System.out.println("Age is: " +p7.getAge());
		System.out.println("Disease is: " +p7.getDisease());
		System.out.println("Address is: " +p7.getAddress());
		System.out.println("=================================");
	}

}
