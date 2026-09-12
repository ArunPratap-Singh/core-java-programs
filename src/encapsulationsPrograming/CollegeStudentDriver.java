package encapsulationsPrograming;

public class CollegeStudentDriver {

	public static void main(String[] args) {
		
		System.out.println("================================Main Method Starts==================================");
		
		CollegeStudent s1 = new CollegeStudent("Mohan", 101, "Java", "Lucknow University", 78.50);
		CollegeStudent s2 = new CollegeStudent("Rohan", 102, "Python", "Delhi University", 82.75);
		CollegeStudent s3 = new CollegeStudent("Sohan", 103, "C Programming", "Mumbai University", 69.50);
		CollegeStudent s4 = new CollegeStudent("Rahul", 104, "C++", "Pune University", 88.25);
		CollegeStudent s5 = new CollegeStudent("Amit", 105, "Java", "Banaras Hindu University", 76.80);
		CollegeStudent s6 = new CollegeStudent("Akash", 106, "Python", "Lucknow University", 91.40);
		CollegeStudent s7 = new CollegeStudent("Vikas", 107, "Data Science", "Delhi University", 84.60);
		CollegeStudent s8 = new CollegeStudent("Karan", 108, "Machine Learning", "Mumbai University", 79.25);
		CollegeStudent s9 = new CollegeStudent("Abhishek", 109, "Java", "Pune University", 73.50);
		CollegeStudent s10 = new CollegeStudent("Manoj", 110, "Cyber Security", "Lucknow University", 86.75);
		CollegeStudent s11 = new CollegeStudent("Suresh", 111, "Python", "Delhi University", 72.40);
		CollegeStudent s12 = new CollegeStudent("Ramesh", 112, "C++", "Mumbai University", 81.90);
		CollegeStudent s13 = new CollegeStudent("Deepak", 113, "JavaScript", "Pune University", 77.30);
		CollegeStudent s14 = new CollegeStudent("Ankit", 114, "Java", "Lucknow University", 89.50);
		CollegeStudent s15 = new CollegeStudent("Ravi", 115, "Data Science", "Delhi University", 68.75);
		CollegeStudent s16 = new CollegeStudent("Arjun", 116, "Python", "Mumbai University", 92.20);
		CollegeStudent s17 = new CollegeStudent("Vijay", 117, "Java", "Pune University", 85.60);
		CollegeStudent s18 = new CollegeStudent("Sumit", 118, "C Programming", "Lucknow University", 74.80);
		CollegeStudent s19 = new CollegeStudent("Nitin", 119, "Machine Learning", "Delhi University", 87.45);
		CollegeStudent s20 = new CollegeStudent("Raj", 120, "Cyber Security", "Mumbai University", 80.25);
		CollegeStudent s21 = new CollegeStudent("Pankaj", 121, "JavaScript", "Pune University", 71.60);
		CollegeStudent s22 = new CollegeStudent("Ashish", 122, "Java", "Lucknow University", 90.75);
		CollegeStudent s23 = new CollegeStudent("Gaurav", 123, "Python", "Delhi University", 83.50);
		CollegeStudent s24 = new CollegeStudent("Rohit", 124, "Data Science", "Mumbai University", 78.90);
		CollegeStudent s25 = new CollegeStudent("Shubham", 125, "C++", "Pune University", 75.40);
		CollegeStudent s26 = new CollegeStudent("Aditya", 126, "Java", "Lucknow University", 88.80);
		CollegeStudent s27 = new CollegeStudent("Harsh", 127, "Python", "Delhi University", 82.35);
		CollegeStudent s28 = new CollegeStudent("Varun", 128, "Cyber Security", "Mumbai University", 79.70);
		CollegeStudent s29 = new CollegeStudent("Tarun", 129, "Machine Learning", "Pune University", 91.25);
		CollegeStudent s30 = new CollegeStudent("Yash", 130, "JavaScript", "Lucknow University", 76.55);
		CollegeStudent s31 = new CollegeStudent("Ansh", 131, "Java", "Delhi University", 84.90);
		CollegeStudent s32 = new CollegeStudent("Nikhil", 132, "Python", "Mumbai University", 87.60);
		CollegeStudent s33 = new CollegeStudent("Prakash", 133, "C Programming", "Pune University", 70.25);
		CollegeStudent s34 = new CollegeStudent("Sanjay", 134, "Data Science", "Lucknow University", 89.75);
		CollegeStudent s35 = new CollegeStudent("Ajay", 135, "Java", "Delhi University", 81.50);
		CollegeStudent s36 = new CollegeStudent("Vivek", 136, "Machine Learning", "Mumbai University", 93.10);
		CollegeStudent s37 = new CollegeStudent("Dinesh", 137, "Python", "Pune University", 77.85);
		CollegeStudent s38 = new CollegeStudent("Rakesh", 138, "Cyber Security", "Lucknow University", 86.30);
		CollegeStudent s39 = new CollegeStudent("Sunil", 139, "JavaScript", "Delhi University", 73.90);
		CollegeStudent s40 = new CollegeStudent("Kapil", 140, "Java", "Mumbai University", 90.20);
		CollegeStudent s41 = new CollegeStudent("Lokesh", 141, "C++", "Pune University", 78.45);
		CollegeStudent s42 = new CollegeStudent("Pradeep", 142, "Python", "Lucknow University", 85.75);
		CollegeStudent s43 = new CollegeStudent("Hemant", 143, "Data Science", "Delhi University", 88.40);
		CollegeStudent s44 = new CollegeStudent("Aman", 144, "Java", "Mumbai University", 74.65);
		CollegeStudent s45 = new CollegeStudent("Sachin", 145, "Machine Learning", "Pune University", 92.50);
		CollegeStudent s46 = new CollegeStudent("Neeraj", 146, "Cyber Security", "Lucknow University", 80.80);
		CollegeStudent s47 = new CollegeStudent("Anil", 147, "Python", "Delhi University", 83.95);
		CollegeStudent s48 = new CollegeStudent("Vinay", 148, "JavaScript", "Mumbai University", 76.20);
		CollegeStudent s49 = new CollegeStudent("Mahesh", 149, "Java", "Pune University", 87.15);
		CollegeStudent s50 = new CollegeStudent("Rajat", 150, "Data Science", "Lucknow University", 91.80);
		
		System.out.println("================CollegeStudent Details 1================");
		System.out.println("Object Reference is: " + s1);
		System.out.println("Name is: " + s1.getName());
		System.out.println("Roll No is: " + s1.getRollNo());
		System.out.println("Course is: " + s1.getCourse());
		System.out.println("College is: " + s1.getCollege());
		System.out.println("Percentage is: " + s1.getPercentage());

		System.out.println("================CollegeStudent Details 2================");
		System.out.println("Object Reference is: " + s2);
		System.out.println("Name is: " + s2.getName());
		System.out.println("Roll No is: " + s2.getRollNo());
		System.out.println("Course is: " + s2.getCourse());
		System.out.println("College is: " + s2.getCollege());
		System.out.println("Percentage is: " + s2.getPercentage());

		System.out.println("================CollegeStudent Details 3================");
		System.out.println("Object Reference is: " + s3);
		System.out.println("Name is: " + s3.getName());
		System.out.println("Roll No is: " + s3.getRollNo());
		System.out.println("Course is: " + s3.getCourse());
		System.out.println("College is: " + s3.getCollege());
		System.out.println("Percentage is: " + s3.getPercentage());

		System.out.println("================CollegeStudent Details 4================");
		System.out.println("Object Reference is: " + s4);
		System.out.println("Name is: " + s4.getName());
		System.out.println("Roll No is: " + s4.getRollNo());
		System.out.println("Course is: " + s4.getCourse());
		System.out.println("College is: " + s4.getCollege());
		System.out.println("Percentage is: " + s4.getPercentage());

		System.out.println("================CollegeStudent Details 5================");
		System.out.println("Object Reference is: " + s5);
		System.out.println("Name is: " + s5.getName());
		System.out.println("Roll No is: " + s5.getRollNo());
		System.out.println("Course is: " + s5.getCourse());
		System.out.println("College is: " + s5.getCollege());
		System.out.println("Percentage is: " + s5.getPercentage());

		System.out.println("================CollegeStudent Details 6================");
		System.out.println("Object Reference is: " + s6);
		System.out.println("Name is: " + s6.getName());
		System.out.println("Roll No is: " + s6.getRollNo());
		System.out.println("Course is: " + s6.getCourse());
		System.out.println("College is: " + s6.getCollege());
		System.out.println("Percentage is: " + s6.getPercentage());

		System.out.println("================CollegeStudent Details 7================");
		System.out.println("Object Reference is: " + s7);
		System.out.println("Name is: " + s7.getName());
		System.out.println("Roll No is: " + s7.getRollNo());
		System.out.println("Course is: " + s7.getCourse());
		System.out.println("College is: " + s7.getCollege());
		System.out.println("Percentage is: " + s7.getPercentage());

		System.out.println("================CollegeStudent Details 8================");
		System.out.println("Object Reference is: " + s8);
		System.out.println("Name is: " + s8.getName());
		System.out.println("Roll No is: " + s8.getRollNo());
		System.out.println("Course is: " + s8.getCourse());
		System.out.println("College is: " + s8.getCollege());
		System.out.println("Percentage is: " + s8.getPercentage());

		System.out.println("================CollegeStudent Details 9================");
		System.out.println("Object Reference is: " + s9);
		System.out.println("Name is: " + s9.getName());
		System.out.println("Roll No is: " + s9.getRollNo());
		System.out.println("Course is: " + s9.getCourse());
		System.out.println("College is: " + s9.getCollege());
		System.out.println("Percentage is: " + s9.getPercentage());

		System.out.println("================CollegeStudent Details 10================");
		System.out.println("Object Reference is: " + s10);
		System.out.println("Name is: " + s10.getName());
		System.out.println("Roll No is: " + s10.getRollNo());
		System.out.println("Course is: " + s10.getCourse());
		System.out.println("College is: " + s10.getCollege());
		System.out.println("Percentage is: " + s10.getPercentage());

		System.out.println("================CollegeStudent Details 11================");
		System.out.println("Object Reference is: " + s11);
		System.out.println("Name is: " + s11.getName());
		System.out.println("Roll No is: " + s11.getRollNo());
		System.out.println("Course is: " + s11.getCourse());
		System.out.println("College is: " + s11.getCollege());
		System.out.println("Percentage is: " + s11.getPercentage());

		System.out.println("================CollegeStudent Details 12================");
		System.out.println("Object Reference is: " + s12);
		System.out.println("Name is: " + s12.getName());
		System.out.println("Roll No is: " + s12.getRollNo());
		System.out.println("Course is: " + s12.getCourse());
		System.out.println("College is: " + s12.getCollege());
		System.out.println("Percentage is: " + s12.getPercentage());

		System.out.println("================CollegeStudent Details 13================");
		System.out.println("Object Reference is: " + s13);
		System.out.println("Name is: " + s13.getName());
		System.out.println("Roll No is: " + s13.getRollNo());
		System.out.println("Course is: " + s13.getCourse());
		System.out.println("College is: " + s13.getCollege());
		System.out.println("Percentage is: " + s13.getPercentage());

		System.out.println("================CollegeStudent Details 14================");
		System.out.println("Object Reference is: " + s14);
		System.out.println("Name is: " + s14.getName());
		System.out.println("Roll No is: " + s14.getRollNo());
		System.out.println("Course is: " + s14.getCourse());
		System.out.println("College is: " + s14.getCollege());
		System.out.println("Percentage is: " + s14.getPercentage());

		System.out.println("================CollegeStudent Details 15================");
		System.out.println("Object Reference is: " + s15);
		System.out.println("Name is: " + s15.getName());
		System.out.println("Roll No is: " + s15.getRollNo());
		System.out.println("Course is: " + s15.getCourse());
		System.out.println("College is: " + s15.getCollege());
		System.out.println("Percentage is: " + s15.getPercentage());

		System.out.println("================CollegeStudent Details 16================");
		System.out.println("Object Reference is: " + s16);
		System.out.println("Name is: " + s16.getName());
		System.out.println("Roll No is: " + s16.getRollNo());
		System.out.println("Course is: " + s16.getCourse());
		System.out.println("College is: " + s16.getCollege());
		System.out.println("Percentage is: " + s16.getPercentage());

		System.out.println("================CollegeStudent Details 17================");
		System.out.println("Object Reference is: " + s17);
		System.out.println("Name is: " + s17.getName());
		System.out.println("Roll No is: " + s17.getRollNo());
		System.out.println("Course is: " + s17.getCourse());
		System.out.println("College is: " + s17.getCollege());
		System.out.println("Percentage is: " + s17.getPercentage());

		System.out.println("================CollegeStudent Details 18================");
		System.out.println("Object Reference is: " + s18);
		System.out.println("Name is: " + s18.getName());
		System.out.println("Roll No is: " + s18.getRollNo());
		System.out.println("Course is: " + s18.getCourse());
		System.out.println("College is: " + s18.getCollege());
		System.out.println("Percentage is: " + s18.getPercentage());

		System.out.println("================CollegeStudent Details 19================");
		System.out.println("Object Reference is: " + s19);
		System.out.println("Name is: " + s19.getName());
		System.out.println("Roll No is: " + s19.getRollNo());
		System.out.println("Course is: " + s19.getCourse());
		System.out.println("College is: " + s19.getCollege());
		System.out.println("Percentage is: " + s19.getPercentage());

		System.out.println("================CollegeStudent Details 20================");
		System.out.println("Object Reference is: " + s20);
		System.out.println("Name is: " + s20.getName());
		System.out.println("Roll No is: " + s20.getRollNo());
		System.out.println("Course is: " + s20.getCourse());
		System.out.println("College is: " + s20.getCollege());
		System.out.println("Percentage is: " + s20.getPercentage());

		System.out.println("================CollegeStudent Details 21================");
		System.out.println("Object Reference is: " + s21);
		System.out.println("Name is: " + s21.getName());
		System.out.println("Roll No is: " + s21.getRollNo());
		System.out.println("Course is: " + s21.getCourse());
		System.out.println("College is: " + s21.getCollege());
		System.out.println("Percentage is: " + s21.getPercentage());

		System.out.println("================CollegeStudent Details 22================");
		System.out.println("Object Reference is: " + s22);
		System.out.println("Name is: " + s22.getName());
		System.out.println("Roll No is: " + s22.getRollNo());
		System.out.println("Course is: " + s22.getCourse());
		System.out.println("College is: " + s22.getCollege());
		System.out.println("Percentage is: " + s22.getPercentage());

		System.out.println("================CollegeStudent Details 23================");
		System.out.println("Object Reference is: " + s23);
		System.out.println("Name is: " + s23.getName());
		System.out.println("Roll No is: " + s23.getRollNo());
		System.out.println("Course is: " + s23.getCourse());
		System.out.println("College is: " + s23.getCollege());
		System.out.println("Percentage is: " + s23.getPercentage());

		System.out.println("================CollegeStudent Details 24================");
		System.out.println("Object Reference is: " + s24);
		System.out.println("Name is: " + s24.getName());
		System.out.println("Roll No is: " + s24.getRollNo());
		System.out.println("Course is: " + s24.getCourse());
		System.out.println("College is: " + s24.getCollege());
		System.out.println("Percentage is: " + s24.getPercentage());

		System.out.println("================CollegeStudent Details 25================");
		System.out.println("Object Reference is: " + s25);
		System.out.println("Name is: " + s25.getName());
		System.out.println("Roll No is: " + s25.getRollNo());
		System.out.println("Course is: " + s25.getCourse());
		System.out.println("College is: " + s25.getCollege());
		System.out.println("Percentage is: " + s25.getPercentage());

		System.out.println("================CollegeStudent Details 26================");
		System.out.println("Object Reference is: " + s26);
		System.out.println("Name is: " + s26.getName());
		System.out.println("Roll No is: " + s26.getRollNo());
		System.out.println("Course is: " + s26.getCourse());
		System.out.println("College is: " + s26.getCollege());
		System.out.println("Percentage is: " + s26.getPercentage());

		System.out.println("================CollegeStudent Details 27================");
		System.out.println("Object Reference is: " + s27);
		System.out.println("Name is: " + s27.getName());
		System.out.println("Roll No is: " + s27.getRollNo());
		System.out.println("Course is: " + s27.getCourse());
		System.out.println("College is: " + s27.getCollege());
		System.out.println("Percentage is: " + s27.getPercentage());

		System.out.println("================CollegeStudent Details 28================");
		System.out.println("Object Reference is: " + s28);
		System.out.println("Name is: " + s28.getName());
		System.out.println("Roll No is: " + s28.getRollNo());
		System.out.println("Course is: " + s28.getCourse());
		System.out.println("College is: " + s28.getCollege());
		System.out.println("Percentage is: " + s28.getPercentage());

		System.out.println("================CollegeStudent Details 29================");
		System.out.println("Object Reference is: " + s29);
		System.out.println("Name is: " + s29.getName());
		System.out.println("Roll No is: " + s29.getRollNo());
		System.out.println("Course is: " + s29.getCourse());
		System.out.println("College is: " + s29.getCollege());
		System.out.println("Percentage is: " + s29.getPercentage());

		System.out.println("================CollegeStudent Details 30================");
		System.out.println("Object Reference is: " + s30);
		System.out.println("Name is: " + s30.getName());
		System.out.println("Roll No is: " + s30.getRollNo());
		System.out.println("Course is: " + s30.getCourse());
		System.out.println("College is: " + s30.getCollege());
		System.out.println("Percentage is: " + s30.getPercentage());

		System.out.println("================CollegeStudent Details 31================");
		System.out.println("Object Reference is: " + s31);
		System.out.println("Name is: " + s31.getName());
		System.out.println("Roll No is: " + s31.getRollNo());
		System.out.println("Course is: " + s31.getCourse());
		System.out.println("College is: " + s31.getCollege());
		System.out.println("Percentage is: " + s31.getPercentage());

		System.out.println("================CollegeStudent Details 32================");
		System.out.println("Object Reference is: " + s32);
		System.out.println("Name is: " + s32.getName());
		System.out.println("Roll No is: " + s32.getRollNo());
		System.out.println("Course is: " + s32.getCourse());
		System.out.println("College is: " + s32.getCollege());
		System.out.println("Percentage is: " + s32.getPercentage());

		System.out.println("================CollegeStudent Details 33================");
		System.out.println("Object Reference is: " + s33);
		System.out.println("Name is: " + s33.getName());
		System.out.println("Roll No is: " + s33.getRollNo());
		System.out.println("Course is: " + s33.getCourse());
		System.out.println("College is: " + s33.getCollege());
		System.out.println("Percentage is: " + s33.getPercentage());

		System.out.println("================CollegeStudent Details 34================");
		System.out.println("Object Reference is: " + s34);
		System.out.println("Name is: " + s34.getName());
		System.out.println("Roll No is: " + s34.getRollNo());
		System.out.println("Course is: " + s34.getCourse());
		System.out.println("College is: " + s34.getCollege());
		System.out.println("Percentage is: " + s34.getPercentage());

		System.out.println("================CollegeStudent Details 35================");
		System.out.println("Object Reference is: " + s35);
		System.out.println("Name is: " + s35.getName());
		System.out.println("Roll No is: " + s35.getRollNo());
		System.out.println("Course is: " + s35.getCourse());
		System.out.println("College is: " + s35.getCollege());
		System.out.println("Percentage is: " + s35.getPercentage());

		System.out.println("================CollegeStudent Details 36================");
		System.out.println("Object Reference is: " + s36);
		System.out.println("Name is: " + s36.getName());
		System.out.println("Roll No is: " + s36.getRollNo());
		System.out.println("Course is: " + s36.getCourse());
		System.out.println("College is: " + s36.getCollege());
		System.out.println("Percentage is: " + s36.getPercentage());

		System.out.println("================CollegeStudent Details 37================");
		System.out.println("Object Reference is: " + s37);
		System.out.println("Name is: " + s37.getName());
		System.out.println("Roll No is: " + s37.getRollNo());
		System.out.println("Course is: " + s37.getCourse());
		System.out.println("College is: " + s37.getCollege());
		System.out.println("Percentage is: " + s37.getPercentage());

		System.out.println("================CollegeStudent Details 38================");
		System.out.println("Object Reference is: " + s38);
		System.out.println("Name is: " + s38.getName());
		System.out.println("Roll No is: " + s38.getRollNo());
		System.out.println("Course is: " + s38.getCourse());
		System.out.println("College is: " + s38.getCollege());
		System.out.println("Percentage is: " + s38.getPercentage());

		System.out.println("================CollegeStudent Details 39================");
		System.out.println("Object Reference is: " + s39);
		System.out.println("Name is: " + s39.getName());
		System.out.println("Roll No is: " + s39.getRollNo());
		System.out.println("Course is: " + s39.getCourse());
		System.out.println("College is: " + s39.getCollege());
		System.out.println("Percentage is: " + s39.getPercentage());

		System.out.println("================CollegeStudent Details 40================");
		System.out.println("Object Reference is: " + s40);
		System.out.println("Name is: " + s40.getName());
		System.out.println("Roll No is: " + s40.getRollNo());
		System.out.println("Course is: " + s40.getCourse());
		System.out.println("College is: " + s40.getCollege());
		System.out.println("Percentage is: " + s40.getPercentage());

		System.out.println("================CollegeStudent Details 41================");
		System.out.println("Object Reference is: " + s41);
		System.out.println("Name is: " + s41.getName());
		System.out.println("Roll No is: " + s41.getRollNo());
		System.out.println("Course is: " + s41.getCourse());
		System.out.println("College is: " + s41.getCollege());
		System.out.println("Percentage is: " + s41.getPercentage());

		System.out.println("================CollegeStudent Details 42================");
		System.out.println("Object Reference is: " + s42);
		System.out.println("Name is: " + s42.getName());
		System.out.println("Roll No is: " + s42.getRollNo());
		System.out.println("Course is: " + s42.getCourse());
		System.out.println("College is: " + s42.getCollege());
		System.out.println("Percentage is: " + s42.getPercentage());

		System.out.println("================CollegeStudent Details 43================");
		System.out.println("Object Reference is: " + s43);
		System.out.println("Name is: " + s43.getName());
		System.out.println("Roll No is: " + s43.getRollNo());
		System.out.println("Course is: " + s43.getCourse());
		System.out.println("College is: " + s43.getCollege());
		System.out.println("Percentage is: " + s43.getPercentage());

		System.out.println("================CollegeStudent Details 44================");
		System.out.println("Object Reference is: " + s44);
		System.out.println("Name is: " + s44.getName());
		System.out.println("Roll No is: " + s44.getRollNo());
		System.out.println("Course is: " + s44.getCourse());
		System.out.println("College is: " + s44.getCollege());
		System.out.println("Percentage is: " + s44.getPercentage());

		System.out.println("================CollegeStudent Details 45================");
		System.out.println("Object Reference is: " + s45);
		System.out.println("Name is: " + s45.getName());
		System.out.println("Roll No is: " + s45.getRollNo());
		System.out.println("Course is: " + s45.getCourse());
		System.out.println("College is: " + s45.getCollege());
		System.out.println("Percentage is: " + s45.getPercentage());

		System.out.println("================CollegeStudent Details 46================");
		System.out.println("Object Reference is: " + s46);
		System.out.println("Name is: " + s46.getName());
		System.out.println("Roll No is: " + s46.getRollNo());
		System.out.println("Course is: " + s46.getCourse());
		System.out.println("College is: " + s46.getCollege());
		System.out.println("Percentage is: " + s46.getPercentage());

		System.out.println("================CollegeStudent Details 47================");
		System.out.println("Object Reference is: " + s47);
		System.out.println("Name is: " + s47.getName());
		System.out.println("Roll No is: " + s47.getRollNo());
		System.out.println("Course is: " + s47.getCourse());
		System.out.println("College is: " + s47.getCollege());
		System.out.println("Percentage is: " + s47.getPercentage());

		System.out.println("================CollegeStudent Details 48================");
		System.out.println("Object Reference is: " + s48);
		System.out.println("Name is: " + s48.getName());
		System.out.println("Roll No is: " + s48.getRollNo());
		System.out.println("Course is: " + s48.getCourse());
		System.out.println("College is: " + s48.getCollege());
		System.out.println("Percentage is: " + s48.getPercentage());

		System.out.println("================CollegeStudent Details 49================");
		System.out.println("Object Reference is: " + s49);
		System.out.println("Name is: " + s49.getName());
		System.out.println("Roll No is: " + s49.getRollNo());
		System.out.println("Course is: " + s49.getCourse());
		System.out.println("College is: " + s49.getCollege());
		System.out.println("Percentage is: " + s49.getPercentage());

		System.out.println("================CollegeStudent Details 50================");
		System.out.println("Object Reference is: " + s50);
		System.out.println("Name is: " + s50.getName());
		System.out.println("Roll No is: " + s50.getRollNo());
		System.out.println("Course is: " + s50.getCourse());
		System.out.println("College is: " + s50.getCollege());
		System.out.println("Percentage is: " + s50.getPercentage());
		
		System.out.println("=============================Main Method Ends=================================");


	}

}
