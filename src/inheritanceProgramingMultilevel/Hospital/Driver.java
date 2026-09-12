package inheritanceProgramingMultilevel.Hospital;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("=================================Main Method Starts======================================");
		
		ChiefSurgeon c1 = new ChiefSurgeon("Apollo Hospital", "Lucknow", 101, "Dr. Arun Singh", 1001, 250000.50, "Cardiology", 15, "Heart Surgery", 500, "Senior Level", 12, "Cardiology Department", "Managing All Surgical Operations" );
		ChiefSurgeon c2 = new ChiefSurgeon("Fortis Hospital", "Delhi", 102, "Dr. Rahul Sharma", 1002, 275000.75, "Neurology", 18, "Brain Surgery", 650, "Senior Level", 15, "Neurology Department", "Managing Neurosurgical Operations");
		ChiefSurgeon c3 = new ChiefSurgeon("Max Hospital", "Mumbai", 103, "Dr. Priya Verma", 1003, 300000.00, "Orthopedics", 16, "Joint Replacement Surgery", 700, "Senior Level", 14, "Orthopedic Department", "Managing Orthopedic Surgical Operations");
		ChiefSurgeon c4 = new ChiefSurgeon("AIIMS Hospital", "New Delhi", 104, "Dr. Amit Kumar", 1004, 350000.50, "Cardiothoracic Surgery", 20, "Heart and Lung Surgery", 850, "Chief Level", 20, "Cardiothoracic Department", "Supervising Advanced Surgical Operations");
		ChiefSurgeon c5 = new ChiefSurgeon("Medanta Hospital", "Gurgaon", 105, "Dr. Sneha Kapoor", 1005, 280000.25, "General Surgery", 14, "Abdominal Surgery", 550, "Senior Level", 10, "General Surgery Department", "Managing General Surgical Procedures");
		ChiefSurgeon c6 = new ChiefSurgeon("Manipal Hospital", "Bangalore", 106, "Dr. Vikas Gupta", 1006, 320000.00, "Neurosurgery", 19, "Spinal Surgery", 750, "Chief Level", 18, "Neurosurgery Department", "Leading Neurosurgical Operations");
		ChiefSurgeon c7 = new ChiefSurgeon("Narayana Hospital", "Bangalore", 107, "Dr. Neha Singh", 1007, 290000.75, "Pediatric Surgery", 13, "Child Surgery", 480, "Senior Level", 11, "Pediatric Surgery Department", "Managing Pediatric Surgical Procedures");
		ChiefSurgeon c8 = new ChiefSurgeon("Kokilaben Hospital", "Mumbai", 108, "Dr. Rohan Mehta", 1008, 360000.50, "Oncology", 22, "Cancer Surgery", 900, "Chief Level", 25, "Oncology Department", "Managing Cancer Surgical Operations");
		ChiefSurgeon c9 = new ChiefSurgeon("Apollo Hospital", "Chennai", 109, "Dr. Anjali Gupta", 1009, 310000.00, "Gynecology", 17, "Gynecological Surgery", 620, "Senior Level", 13, "Gynecology Department", "Managing Women's Surgical Care");
		ChiefSurgeon c10 = new ChiefSurgeon("Ruby Hall Clinic", "Pune", 110, "Dr. Karan Malhotra", 1010, 340000.25, "Urology", 18, "Kidney Surgery", 680, "Senior Level", 16, "Urology Department", "Managing Urological Surgical Operations");
		ChiefSurgeon c11 = new ChiefSurgeon("Lilavati Hospital", "Mumbai", 111, "Dr. Pooja Sharma", 1011, 295000.50, "ENT", 15, "Ear Surgery", 520, "Senior Level", 10, "ENT Department", "Managing ENT Surgical Operations");
		ChiefSurgeon c12 = new ChiefSurgeon("Yashoda Hospital", "Hyderabad", 112, "Dr. Suresh Yadav", 1012, 380000.00, "Plastic Surgery", 21, "Reconstructive Surgery", 950, "Chief Level", 22, "Plastic Surgery Department", "Leading Reconstructive Surgical Operations");
		ChiefSurgeon c13 = new ChiefSurgeon("Sir Ganga Ram Hospital", "New Delhi", 113, "Dr. Kavita Singh", 1013, 305000.75, "Ophthalmology", 16, "Eye Surgery", 600, "Senior Level", 12, "Ophthalmology Department", "Managing Eye Surgical Operations");
		ChiefSurgeon c14 = new ChiefSurgeon("CMC Hospital", "Vellore", 114, "Dr. Manish Verma", 1014, 330000.50, "Gastroenterology", 19, "Liver Surgery", 780, "Chief Level", 17, "Gastroenterology Department", "Managing Gastrointestinal Surgical Operations");
		ChiefSurgeon c15 = new ChiefSurgeon("BLK Hospital", "New Delhi", 115, "Dr. Ritika Kapoor", 1015, 370000.25, "Transplant Surgery", 23, "Organ Transplant Surgery", 1000, "Chief Level", 24, "Transplant Surgery Department", "Leading Organ Transplant Surgical Operations");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		System.out.println(c13);
		System.out.println(c14);
		System.out.println(c15);
		
		System.out.println("======================================Main Method Ends========================================");
	    
	}
	
}
