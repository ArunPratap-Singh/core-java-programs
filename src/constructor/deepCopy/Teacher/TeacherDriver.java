package constructor.deepCopy.Teacher;

public class TeacherDriver {
	
	public static void main(String[] args) {
		
		System.out.println("==================================Main Method Starts=====================================");
		
		Teacher t1 = new Teacher("Mohan", "Economics", 5, "P.hd In Economics", new School(101, "Army Public School", "Lucknow", 12000, "Public School", "Lucknow"));
		Teacher t2 = new Teacher("Sohan", "Mathematics", 8, "M.Ed", new School(102, "Delhi Public School", "Delhi", 15000, "Public School", "CBSE"));
		Teacher t3 = new Teacher("Ravi", "Physics", 10, "M.Sc Physics", new School(103, "City Montessori School", "Lucknow", 11000, "Private School", "ICSE"));
		Teacher t4 = new Teacher("Anita", "Chemistry", 7, "M.Sc Chemistry", new School(104, "St. Mary's School", "Kanpur", 9000, "Convent School", "ICSE"));
		Teacher t5 = new Teacher("Amit", "Biology", 6, "M.Sc Biology", new School(105, "St. Xavier's School", "Delhi", 13000, "Convent School", "CBSE"));

		Teacher t6 = new Teacher("Priya", "English", 9, "M.A English", new School(106, "Ryan International School", "Mumbai", 14000, "Private School", "CBSE"));
		Teacher t7 = new Teacher("Rahul", "History", 11, "M.A History", new School(107, "Modern School", "Delhi", 10000, "Public School", "CBSE"));
		Teacher t8 = new Teacher("Neha", "Geography", 4, "M.A Geography", new School(108, "La Martiniere College", "Lucknow", 8000, "Convent School", "ICSE"));
		Teacher t9 = new Teacher("Vikas", "Computer Science", 12, "M.Tech", new School(109, "Delhi International School", "Delhi", 12500, "International School", "CBSE"));
		Teacher t10 = new Teacher("Pooja", "Hindi", 5, "M.A Hindi", new School(110, "Seth Anandram Jaipuria School", "Kanpur", 9500, "Private School", "CBSE"));

		Teacher t11 = new Teacher("Karan", "Economics", 14, "Ph.D In Economics", new School(111, "St. Joseph's School", "Jaipur", 10500, "Convent School", "ICSE"));
		Teacher t12 = new Teacher("Sneha", "Mathematics", 6, "M.Sc Mathematics", new School(112, "Amity International School", "Noida", 13500, "Private School", "CBSE"));
		Teacher t13 = new Teacher("Manish", "Physics", 9, "M.Sc Physics", new School(113, "DPS Noida", "Noida", 14500, "Public School", "CBSE"));
		Teacher t14 = new Teacher("Ritu", "Chemistry", 8, "M.Sc Chemistry", new School(114, "Sacred Heart School", "Agra", 8500, "Convent School", "ICSE"));
		Teacher t15 = new Teacher("Sachin", "Biology", 13, "M.Sc Biology", new School(115, "Army Public School", "Meerut", 10000, "Public School", "CBSE"));

		Teacher t16 = new Teacher("Meena", "English", 7, "M.A English", new School(116, "Kendriya Vidyalaya", "Lucknow", 7500, "Government School", "CBSE"));
		Teacher t17 = new Teacher("Ashok", "History", 15, "M.A History", new School(117, "Kendriya Vidyalaya", "Delhi", 9000, "Government School", "CBSE"));
		Teacher t18 = new Teacher("Swati", "Geography", 5, "M.A Geography", new School(118, "Christ Church School", "Kanpur", 7000, "Convent School", "ICSE"));
		Teacher t19 = new Teacher("Deepak", "Computer Science", 10, "M.Tech Computer Science", new School(119, "Delhi Public School", "Jaipur", 15500, "Public School", "CBSE"));
		Teacher t20 = new Teacher("Kavita", "Hindi", 12, "M.A Hindi", new School(120, "St. Francis School", "Lucknow", 8200, "Convent School", "ICSE"));

		Teacher t21 = new Teacher("Raj", "Economics", 9, "M.A Economics", new School(121, "City Montessori School", "Lucknow", 16000, "Private School", "ICSE"));
		Teacher t22 = new Teacher("Nisha", "Mathematics", 11, "M.Sc Mathematics", new School(122, "Army Public School", "Delhi", 11500, "Public School", "CBSE"));
		Teacher t23 = new Teacher("Suresh", "Physics", 16, "M.Sc Physics", new School(123, "Jawahar Navodaya Vidyalaya", "Agra", 6500, "Government School", "CBSE"));
		Teacher t24 = new Teacher("Aarti", "Chemistry", 6, "M.Sc Chemistry", new School(124, "St. Mary's Convent School", "Meerut", 7800, "Convent School", "ICSE"));
		Teacher t25 = new Teacher("Vivek", "Biology", 10, "M.Sc Biology", new School(125, "Delhi Public School", "Agra", 13500, "Public School", "CBSE"));

		Teacher t26 = new Teacher("Shalini", "English", 8, "M.A English", new School(126, "Springfield School", "Lucknow", 9200, "Private School", "CBSE"));
		Teacher t27 = new Teacher("Arun", "History", 13, "M.A History", new School(127, "St. John's School", "Delhi", 8700, "Convent School", "ICSE"));
		Teacher t28 = new Teacher("Kajal", "Geography", 7, "M.A Geography", new School(128, "Ryan International School", "Noida", 12500, "Private School", "CBSE"));
		Teacher t29 = new Teacher("Rohit", "Computer Science", 15, "M.Tech", new School(129, "Amity International School", "Lucknow", 11800, "International School", "CBSE"));
		Teacher t30 = new Teacher("Simran", "Hindi", 9, "M.A Hindi", new School(130, "St. Xavier's School", "Mumbai", 11000, "Convent School", "ICSE"));

		Teacher t31 = new Teacher("Ramesh", "Economics", 17, "Ph.D In Economics", new School(131, "Army Public School", "Agra", 9800, "Public School", "CBSE"));
		Teacher t32 = new Teacher("Pallavi", "Mathematics", 10, "M.Ed", new School(132, "Delhi Public School", "Mumbai", 14500, "Public School", "CBSE"));
		Teacher t33 = new Teacher("Ajay", "Physics", 12, "M.Sc Physics", new School(133, "Kendriya Vidyalaya", "Kanpur", 6800, "Government School", "CBSE"));
		Teacher t34 = new Teacher("Rekha", "Chemistry", 14, "M.Sc Chemistry", new School(134, "St. Joseph's School", "Lucknow", 7600, "Convent School", "ICSE"));
		Teacher t35 = new Teacher("Naveen", "Biology", 8, "M.Sc Biology", new School(135, "City Montessori School", "Kanpur", 15000, "Private School", "ICSE"));

		Teacher t36 = new Teacher("Monika", "English", 6, "M.A English", new School(136, "Modern School", "Mumbai", 10800, "Public School", "CBSE"));
		Teacher t37 = new Teacher("Abhishek", "History", 11, "M.A History", new School(137, "Sainik School", "Lucknow", 6000, "Government School", "CBSE"));
		Teacher t38 = new Teacher("Tanya", "Geography", 5, "M.A Geography", new School(138, "Ryan International School", "Jaipur", 12800, "Private School", "CBSE"));
		Teacher t39 = new Teacher("Vijay", "Computer Science", 18, "M.Tech Computer Science", new School(139, "Delhi Public School", "Gurugram", 15500, "Public School", "CBSE"));
		Teacher t40 = new Teacher("Komal", "Hindi", 7, "M.A Hindi", new School(140, "St. Mary's School", "Delhi", 8900, "Convent School", "ICSE"));

		Teacher t41 = new Teacher("Rajesh", "Economics", 20, "Ph.D In Economics", new School(141, "Army Public School", "Pune", 10200, "Public School", "CBSE"));
		Teacher t42 = new Teacher("Divya", "Mathematics", 9, "M.Sc Mathematics", new School(142, "Amity International School", "Noida", 13200, "International School", "CBSE"));
		Teacher t43 = new Teacher("Mohan", "Physics", 13, "M.Sc Physics", new School(143, "Kendriya Vidyalaya", "Varanasi", 7200, "Government School", "CBSE"));
		Teacher t44 = new Teacher("Sunita", "Chemistry", 10, "M.Sc Chemistry", new School(144, "St. Xavier's School", "Pune", 11500, "Convent School", "ICSE"));
		Teacher t45 = new Teacher("Anil", "Biology", 15, "M.Sc Biology", new School(145, "Delhi Public School", "Varanasi", 14200, "Public School", "CBSE"));

		Teacher t46 = new Teacher("Radhika", "English", 12, "M.A English", new School(146, "City Montessori School", "Agra", 13800, "Private School", "ICSE"));
		Teacher t47 = new Teacher("Sanjay", "History", 16, "M.A History", new School(147, "Army Public School", "Jaipur", 9700, "Public School", "CBSE"));
		Teacher t48 = new Teacher("Preeti", "Geography", 8, "M.A Geography", new School(148, "Ryan International School", "Delhi", 12600, "Private School", "CBSE"));
		Teacher t49 = new Teacher("Manoj", "Computer Science", 14, "M.Tech", new School(149, "Modern School", "Lucknow", 11900, "Public School", "CBSE"));
		Teacher t50 = new Teacher("Shweta", "Hindi", 10, "M.A Hindi", new School(150, "St. Mary's School", "Kanpur", 9300, "Convent School", "ICSE"));
		Teacher t51 = new Teacher(t1);
		Teacher t52 = new Teacher(t2);
		Teacher t53 = new Teacher(t3);
		Teacher t54 = new Teacher(t4);
		Teacher t55 = new Teacher(t5);
		Teacher t56 = new Teacher(t6);
		Teacher t57 = new Teacher(t7);
		Teacher t58 = new Teacher(t8);
		Teacher t59 = new Teacher(t9);
		Teacher t60 = new Teacher(t10);

		Teacher t61 = new Teacher(t11);
		Teacher t62 = new Teacher(t12);
		Teacher t63 = new Teacher(t13);
		Teacher t64 = new Teacher(t14);
		Teacher t65 = new Teacher(t15);
		Teacher t66 = new Teacher(t16);
		Teacher t67 = new Teacher(t17);
		Teacher t68 = new Teacher(t18);
		Teacher t69 = new Teacher(t19);
		Teacher t70 = new Teacher(t20);

		Teacher t71 = new Teacher(t21);
		Teacher t72 = new Teacher(t22);
		Teacher t73 = new Teacher(t23);
		Teacher t74 = new Teacher(t24);
		Teacher t75 = new Teacher(t25);
		Teacher t76 = new Teacher(t26);
		Teacher t77 = new Teacher(t27);
		Teacher t78 = new Teacher(t28);
		Teacher t79 = new Teacher(t29);
		Teacher t80 = new Teacher(t30);

		Teacher t81 = new Teacher(t31);
		Teacher t82 = new Teacher(t32);
		Teacher t83 = new Teacher(t33);
		Teacher t84 = new Teacher(t34);
		Teacher t85 = new Teacher(t35);
		Teacher t86 = new Teacher(t36);
		Teacher t87 = new Teacher(t37);
		Teacher t88 = new Teacher(t38);
		Teacher t89 = new Teacher(t39);
		Teacher t90 = new Teacher(t40);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		System.out.println(t7);
		System.out.println(t8);
		System.out.println(t9);
		System.out.println(t10);

		System.out.println(t11);
		System.out.println(t12);
		System.out.println(t13);
		System.out.println(t14);
		System.out.println(t15);
		System.out.println(t16);
		System.out.println(t17);
		System.out.println(t18);
		System.out.println(t19);
		System.out.println(t20);

		System.out.println(t21);
		System.out.println(t22);
		System.out.println(t23);
		System.out.println(t24);
		System.out.println(t25);
		System.out.println(t26);
		System.out.println(t27);
		System.out.println(t28);
		System.out.println(t29);
		System.out.println(t30);

		System.out.println(t31);
		System.out.println(t32);
		System.out.println(t33);
		System.out.println(t34);
		System.out.println(t35);
		System.out.println(t36);
		System.out.println(t37);
		System.out.println(t38);
		System.out.println(t39);
		System.out.println(t40);

		System.out.println(t41);
		System.out.println(t42);
		System.out.println(t43);
		System.out.println(t44);
		System.out.println(t45);
		System.out.println(t46);
		System.out.println(t47);
		System.out.println(t48);
		System.out.println(t49);
		System.out.println(t50);

		System.out.println(t51);
		System.out.println(t52);
		System.out.println(t53);
		System.out.println(t54);
		System.out.println(t55);
		System.out.println(t56);
		System.out.println(t57);
		System.out.println(t58);
		System.out.println(t59);
		System.out.println(t60);

		System.out.println(t61);
		System.out.println(t62);
		System.out.println(t63);
		System.out.println(t64);
		System.out.println(t65);
		System.out.println(t66);
		System.out.println(t67);
		System.out.println(t68);
		System.out.println(t69);
		System.out.println(t70);

		System.out.println(t71);
		System.out.println(t72);
		System.out.println(t73);
		System.out.println(t74);
		System.out.println(t75);
		System.out.println(t76);
		System.out.println(t77);
		System.out.println(t78);
		System.out.println(t79);
		System.out.println(t80);

		System.out.println(t81);
		System.out.println(t82);
		System.out.println(t83);
		System.out.println(t84);
		System.out.println(t85);
		System.out.println(t86);
		System.out.println(t87);
		System.out.println(t88);
		System.out.println(t89);
		System.out.println(t90);
		
		System.out.println("==================================Main Method Ends=====================================");
		
	}

}
