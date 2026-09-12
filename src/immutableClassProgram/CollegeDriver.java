package immutableClassProgram;

public class CollegeDriver {

	public static void main(String[] args) {

		College c1 = new College(101, "National PG College", "University of Lucknow", "Dr. Arun Kumar", "B.Sc, B.Com, B.A.", "Lucknow", 5000);
		College c2 = new College(102, "Lucknow University College", "University of Lucknow", "Dr. Rajesh Sharma", "B.A, B.Sc, B.Com", "Lucknow", 6500);
		College c3 = new College(103, "IIT Delhi", "IIT Delhi", "Dr. Ramesh Gupta", "B.Tech, M.Tech", "New Delhi", 12000);
		College c4 = new College(104, "Delhi University College", "University of Delhi", "Dr. Priya Singh", "B.A, B.Sc, B.Com", "Delhi", 8000);
		College c5 = new College(105, "Allahabad University College", "University of Allahabad", "Dr. Amit Verma", "B.A, B.Sc, B.Com", "Prayagraj", 7200);
		College c6 = new College(106, "Banaras Hindu University", "BHU", "Dr. Suresh Mishra", "B.A, B.Sc, B.Tech", "Varanasi", 15000);
		College c7 = new College(107, "Aligarh Muslim University", "AMU", "Dr. Imran Khan", "B.A, B.Sc, B.Tech", "Aligarh", 18000);
		College c8 = new College(108, "Christ University", "Christ University", "Dr. John Mathew", "BBA, BCA, MBA", "Bangalore", 14000);
		College c9 = new College(109, "Symbiosis College", "Symbiosis International University", "Dr. Neha Kapoor", "BBA, BCA, MBA", "Pune", 9000);
		College c10 = new College(110, "Amity University College", "Amity University", "Dr. Anil Sharma", "B.Tech, MBA, BCA", "Noida", 20000);
		College c11 = new College(111, "Galgotias College", "Galgotias University", "Dr. Pooja Agarwal", "B.Tech, BCA, MBA", "Greater Noida", 11000);
		College c12 = new College(112, "Manipal College", "Manipal University", "Dr. Vikram Rao", "B.Tech, MBBS, BBA", "Manipal", 16000);
		College c13 = new College(113, "Fergusson College", "Savitribai Phule Pune University", "Dr. Kavita Joshi", "B.A, B.Sc, B.Com", "Pune", 7000);
		College c14 = new College(114, "St. Xavier's College", "University of Mumbai", "Dr. Michael D'Souza", "B.A, B.Sc, B.Com", "Mumbai", 8500);
		College c15 = new College(115, "Hindu College", "University of Delhi", "Dr. Sanjay Mehta", "B.A, B.Sc, B.Com", "New Delhi", 6000);
		College c16 = new College(116, "Hansraj College", "University of Delhi", "Dr. Ritu Sharma", "B.Sc, B.Com, B.A.", "Delhi", 7500);
		College c17 = new College(117, "Kirori Mal College", "University of Delhi", "Dr. Manoj Tiwari", "B.A, B.Sc, B.Com", "Delhi", 6800);
		College c18 = new College(118, "Institute of Engineering and Technology", "Dr. A.P.J. Abdul Kalam Technical University", "Dr. Vivek Singh", "B.Tech, M.Tech, MBA", "Lucknow", 9500);
		College c19 = new College(119, "BBD University College", "Babu Banarasi Das University", "Dr. Rajiv Srivastava", "B.Tech, BCA, MBA", "Lucknow", 13000);
		College c20 = new College(120, "Integral University College", "Integral University", "Dr. Mohammad Khan", "B.Tech, BCA, MBA", "Lucknow", 14500);
		
				
		System.out.println("==========================College Details 1================================");
		System.out.println("ObjectReference is: " + c1);
		System.out.println("College Id is: " + c1.getCollegeId());
		System.out.println("College Name is: " + c1.getCollegeName());
		System.out.println("University is: " + c1.getUniversity());
		System.out.println("Principal Name is: " + c1.getPrincipalName());
		System.out.println("Course is: " + c1.getCourse());
		System.out.println("Location is: " + c1.getLocation());
		System.out.println("Student Count is: " + c1.getStudentCount());


		System.out.println("==========================College Details 2================================");
		System.out.println("ObjectReference is: " + c2);
		System.out.println("College Id is: " + c2.getCollegeId());
		System.out.println("College Name is: " + c2.getCollegeName());
		System.out.println("University is: " + c2.getUniversity());
		System.out.println("Principal Name is: " + c2.getPrincipalName());
		System.out.println("Course is: " + c2.getCourse());
		System.out.println("Location is: " + c2.getLocation());
		System.out.println("Student Count is: " + c2.getStudentCount());


		System.out.println("==========================College Details 3================================");
		System.out.println("ObjectReference is: " + c3);
		System.out.println("College Id is: " + c3.getCollegeId());
		System.out.println("College Name is: " + c3.getCollegeName());
		System.out.println("University is: " + c3.getUniversity());
		System.out.println("Principal Name is: " + c3.getPrincipalName());
		System.out.println("Course is: " + c3.getCourse());
		System.out.println("Location is: " + c3.getLocation());
		System.out.println("Student Count is: " + c3.getStudentCount());


		System.out.println("==========================College Details 4================================");
		System.out.println("ObjectReference is: " + c4);
		System.out.println("College Id is: " + c4.getCollegeId());
		System.out.println("College Name is: " + c4.getCollegeName());
		System.out.println("University is: " + c4.getUniversity());
		System.out.println("Principal Name is: " + c4.getPrincipalName());
		System.out.println("Course is: " + c4.getCourse());
		System.out.println("Location is: " + c4.getLocation());
		System.out.println("Student Count is: " + c4.getStudentCount());


		System.out.println("==========================College Details 5================================");
		System.out.println("ObjectReference is: " + c5);
		System.out.println("College Id is: " + c5.getCollegeId());
		System.out.println("College Name is: " + c5.getCollegeName());
		System.out.println("University is: " + c5.getUniversity());
		System.out.println("Principal Name is: " + c5.getPrincipalName());
		System.out.println("Course is: " + c5.getCourse());
		System.out.println("Location is: " + c5.getLocation());
		System.out.println("Student Count is: " + c5.getStudentCount());


		System.out.println("==========================College Details 6================================");
		System.out.println("ObjectReference is: " + c6);
		System.out.println("College Id is: " + c6.getCollegeId());
		System.out.println("College Name is: " + c6.getCollegeName());
		System.out.println("University is: " + c6.getUniversity());
		System.out.println("Principal Name is: " + c6.getPrincipalName());
		System.out.println("Course is: " + c6.getCourse());
		System.out.println("Location is: " + c6.getLocation());
		System.out.println("Student Count is: " + c6.getStudentCount());


		System.out.println("==========================College Details 7================================");
		System.out.println("ObjectReference is: " + c7);
		System.out.println("College Id is: " + c7.getCollegeId());
		System.out.println("College Name is: " + c7.getCollegeName());
		System.out.println("University is: " + c7.getUniversity());
		System.out.println("Principal Name is: " + c7.getPrincipalName());
		System.out.println("Course is: " + c7.getCourse());
		System.out.println("Location is: " + c7.getLocation());
		System.out.println("Student Count is: " + c7.getStudentCount());


		System.out.println("==========================College Details 8================================");
		System.out.println("ObjectReference is: " + c8);
		System.out.println("College Id is: " + c8.getCollegeId());
		System.out.println("College Name is: " + c8.getCollegeName());
		System.out.println("University is: " + c8.getUniversity());
		System.out.println("Principal Name is: " + c8.getPrincipalName());
		System.out.println("Course is: " + c8.getCourse());
		System.out.println("Location is: " + c8.getLocation());
		System.out.println("Student Count is: " + c8.getStudentCount());


		System.out.println("==========================College Details 9================================");
		System.out.println("ObjectReference is: " + c9);
		System.out.println("College Id is: " + c9.getCollegeId());
		System.out.println("College Name is: " + c9.getCollegeName());
		System.out.println("University is: " + c9.getUniversity());
		System.out.println("Principal Name is: " + c9.getPrincipalName());
		System.out.println("Course is: " + c9.getCourse());
		System.out.println("Location is: " + c9.getLocation());
		System.out.println("Student Count is: " + c9.getStudentCount());


		System.out.println("==========================College Details 10================================");
		System.out.println("ObjectReference is: " + c10);
		System.out.println("College Id is: " + c10.getCollegeId());
		System.out.println("College Name is: " + c10.getCollegeName());
		System.out.println("University is: " + c10.getUniversity());
		System.out.println("Principal Name is: " + c10.getPrincipalName());
		System.out.println("Course is: " + c10.getCourse());
		System.out.println("Location is: " + c10.getLocation());
		System.out.println("Student Count is: " + c10.getStudentCount());


		System.out.println("==========================College Details 11================================");
		System.out.println("ObjectReference is: " + c11);
		System.out.println("College Id is: " + c11.getCollegeId());
		System.out.println("College Name is: " + c11.getCollegeName());
		System.out.println("University is: " + c11.getUniversity());
		System.out.println("Principal Name is: " + c11.getPrincipalName());
		System.out.println("Course is: " + c11.getCourse());
		System.out.println("Location is: " + c11.getLocation());
		System.out.println("Student Count is: " + c11.getStudentCount());


		System.out.println("==========================College Details 12================================");
		System.out.println("ObjectReference is: " + c12);
		System.out.println("College Id is: " + c12.getCollegeId());
		System.out.println("College Name is: " + c12.getCollegeName());
		System.out.println("University is: " + c12.getUniversity());
		System.out.println("Principal Name is: " + c12.getPrincipalName());
		System.out.println("Course is: " + c12.getCourse());
		System.out.println("Location is: " + c12.getLocation());
		System.out.println("Student Count is: " + c12.getStudentCount());


		System.out.println("==========================College Details 13================================");
		System.out.println("ObjectReference is: " + c13);
		System.out.println("College Id is: " + c13.getCollegeId());
		System.out.println("College Name is: " + c13.getCollegeName());
		System.out.println("University is: " + c13.getUniversity());
		System.out.println("Principal Name is: " + c13.getPrincipalName());
		System.out.println("Course is: " + c13.getCourse());
		System.out.println("Location is: " + c13.getLocation());
		System.out.println("Student Count is: " + c13.getStudentCount());


		System.out.println("==========================College Details 14================================");
		System.out.println("ObjectReference is: " + c14);
		System.out.println("College Id is: " + c14.getCollegeId());
		System.out.println("College Name is: " + c14.getCollegeName());
		System.out.println("University is: " + c14.getUniversity());
		System.out.println("Principal Name is: " + c14.getPrincipalName());
		System.out.println("Course is: " + c14.getCourse());
		System.out.println("Location is: " + c14.getLocation());
		System.out.println("Student Count is: " + c14.getStudentCount());


		System.out.println("==========================College Details 15================================");
		System.out.println("ObjectReference is: " + c15);
		System.out.println("College Id is: " + c15.getCollegeId());
		System.out.println("College Name is: " + c15.getCollegeName());
		System.out.println("University is: " + c15.getUniversity());
		System.out.println("Principal Name is: " + c15.getPrincipalName());
		System.out.println("Course is: " + c15.getCourse());
		System.out.println("Location is: " + c15.getLocation());
		System.out.println("Student Count is: " + c15.getStudentCount());


		System.out.println("==========================College Details 16================================");
		System.out.println("ObjectReference is: " + c16);
		System.out.println("College Id is: " + c16.getCollegeId());
		System.out.println("College Name is: " + c16.getCollegeName());
		System.out.println("University is: " + c16.getUniversity());
		System.out.println("Principal Name is: " + c16.getPrincipalName());
		System.out.println("Course is: " + c16.getCourse());
		System.out.println("Location is: " + c16.getLocation());
		System.out.println("Student Count is: " + c16.getStudentCount());


		System.out.println("==========================College Details 17================================");
		System.out.println("ObjectReference is: " + c17);
		System.out.println("College Id is: " + c17.getCollegeId());
		System.out.println("College Name is: " + c17.getCollegeName());
		System.out.println("University is: " + c17.getUniversity());
		System.out.println("Principal Name is: " + c17.getPrincipalName());
		System.out.println("Course is: " + c17.getCourse());
		System.out.println("Location is: " + c17.getLocation());
		System.out.println("Student Count is: " + c17.getStudentCount());


		System.out.println("==========================College Details 18================================");
		System.out.println("ObjectReference is: " + c18);
		System.out.println("College Id is: " + c18.getCollegeId());
		System.out.println("College Name is: " + c18.getCollegeName());
		System.out.println("University is: " + c18.getUniversity());
		System.out.println("Principal Name is: " + c18.getPrincipalName());
		System.out.println("Course is: " + c18.getCourse());
		System.out.println("Location is: " + c18.getLocation());
		System.out.println("Student Count is: " + c18.getStudentCount());


		System.out.println("==========================College Details 19================================");
		System.out.println("ObjectReference is: " + c19);
		System.out.println("College Id is: " + c19.getCollegeId());
		System.out.println("College Name is: " + c19.getCollegeName());
		System.out.println("University is: " + c19.getUniversity());
		System.out.println("Principal Name is: " + c19.getPrincipalName());
		System.out.println("Course is: " + c19.getCourse());
		System.out.println("Location is: " + c19.getLocation());
		System.out.println("Student Count is: " + c19.getStudentCount());


		System.out.println("==========================College Details 20================================");
		System.out.println("ObjectReference is: " + c20);
		System.out.println("College Id is: " + c20.getCollegeId());
		System.out.println("College Name is: " + c20.getCollegeName());
		System.out.println("University is: " + c20.getUniversity());
		System.out.println("Principal Name is: " + c20.getPrincipalName());
		System.out.println("Course is: " + c20.getCourse());
		System.out.println("Location is: " + c20.getLocation());
		System.out.println("Student Count is: " + c20.getStudentCount());

	}

}
