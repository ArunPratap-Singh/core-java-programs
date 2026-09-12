package encapsulationsPrograming;

public class BookDriver {

	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Starts================================");
		
		Book b1 = new Book("Java Programming", "James Gosling", "ISBN101", "Tech Publications", 850.50);
		Book b2 = new Book("Selenium WebDriver", "Rahul Sharma", "ISBN102", "Automation Books", 950.00);
		Book b3 = new Book("Python Basics", "Ravi Kumar", "ISBN103", "Learning House", 750.75);
		Book b4 = new Book("Advanced Java", "Robert Martin", "ISBN104", "Programming Press", 1200.00);
		Book b5 = new Book("SQL Complete Guide", "Amit Singh", "ISBN105", "Database House", 680.25);
		Book b6 = new Book("Manual Testing", "Suresh Verma", "ISBN106", "Testing Publications", 550.00);
		Book b7 = new Book("Automation Testing", "Ankit Sharma", "ISBN107", "Tech World", 1100.50);
		Book b8 = new Book("Java Selenium", "Vikas Gupta", "ISBN108", "Automation Press", 1350.00);
		Book b9 = new Book("OOP Concepts", "Karan Singh", "ISBN109", "Coding House", 900.75);
		Book b10 = new Book("Database Management", "Rohit Kumar", "ISBN110", "Knowledge Press", 780.00);

		Book b11 = new Book("Core Java", "Sachin Verma", "ISBN111", "Java Publications", 875.50);
		Book b12 = new Book("HTML and CSS", "Neha Sharma", "ISBN112", "Web Tech Press", 650.00);
		Book b13 = new Book("JavaScript Basics", "Amit Kumar", "ISBN113", "Web World", 725.25);
		Book b14 = new Book("React Programming", "Priya Singh", "ISBN114", "Frontend Press", 1050.00);
		Book b15 = new Book("Spring Boot", "Vivek Gupta", "ISBN115", "Backend Publications", 1250.75);
		Book b16 = new Book("Hibernate Framework", "Rakesh Sharma", "ISBN116", "Java World", 1150.00);
		Book b17 = new Book("C Programming", "Sanjay Kumar", "ISBN117", "Programming House", 580.50);
		Book b18 = new Book("C++ Programming", "Manoj Singh", "ISBN118", "Coding Publications", 720.00);
		Book b19 = new Book("Data Structures", "Arun Kumar", "ISBN119", "Computer Press", 950.50);
		Book b20 = new Book("Algorithms", "Deepak Verma", "ISBN120", "Tech Publications", 1050.00);

		Book b21 = new Book("Computer Networks", "Rajesh Kumar", "ISBN121", "Knowledge House", 890.75);
		Book b22 = new Book("Operating Systems", "Pankaj Singh", "ISBN122", "Academic Press", 920.00);
		Book b23 = new Book("Software Engineering", "Mohit Sharma", "ISBN123", "Engineering Publications", 780.50);
		Book b24 = new Book("Manual Testing Guide", "Nitin Gupta", "ISBN124", "Testing House", 625.00);
		Book b25 = new Book("Selenium Automation", "Vikas Sharma", "ISBN125", "Automation World", 1150.50);
		Book b26 = new Book("TestNG Framework", "Anil Kumar", "ISBN126", "Testing Press", 850.00);
		Book b27 = new Book("Maven Guide", "Rohit Sharma", "ISBN127", "Build Tools Press", 675.75);
		Book b28 = new Book("Jenkins Complete Guide", "Aakash Gupta", "ISBN128", "DevOps Publications", 990.00);
		Book b29 = new Book("Git and GitHub", "Kunal Singh", "ISBN129", "Developer House", 720.50);
		Book b30 = new Book("DevOps Fundamentals", "Rahul Verma", "ISBN130", "DevOps Press", 1100.00);

		Book b31 = new Book("Machine Learning", "Aman Kumar", "ISBN131", "AI Publications", 1350.75);
		Book b32 = new Book("Artificial Intelligence", "Pooja Sharma", "ISBN132", "Future Tech", 1450.00);
		Book b33 = new Book("Cloud Computing", "Vivek Singh", "ISBN133", "Cloud House", 1200.50);
		Book b34 = new Book("Cyber Security", "Abhishek Kumar", "ISBN134", "Security Press", 1300.00);
		Book b35 = new Book("Java Interview Questions", "Ravi Sharma", "ISBN135", "Career Publications", 650.75);
		Book b36 = new Book("Selenium Interview Guide", "Manish Gupta", "ISBN136", "Career House", 725.00);
		Book b37 = new Book("Programming Fundamentals", "Sohan Singh", "ISBN137", "Learning Press", 550.50);
		Book b38 = new Book("Object Oriented Programming", "Karan Kumar", "ISBN138", "Coding World", 875.00);
		Book b39 = new Book("Database Concepts", "Rajiv Sharma", "ISBN139", "Database Press", 790.25);
		Book b40 = new Book("Web Development", "Naveen Kumar", "ISBN140", "Web Publications", 980.00);

		Book b41 = new Book("Java Design Patterns", "Vishal Singh", "ISBN141", "Programming World", 1125.50);
		Book b42 = new Book("Clean Code", "Robert Martin", "ISBN142", "Software Press", 950.00);
		Book b43 = new Book("Effective Java", "Joshua Bloch", "ISBN143", "Pearson", 1050.75);
		Book b44 = new Book("Head First Java", "Kathy Sierra", "ISBN144", "Learning House", 875.00);
		Book b45 = new Book("Java Complete Reference", "Herbert Schildt", "ISBN145", "McGraw Hill", 1250.50);
		Book b46 = new Book("Testing Techniques", "Suresh Kumar", "ISBN146", "Testing Publications", 700.00);
		Book b47 = new Book("Automation Framework", "Ravi Gupta", "ISBN147", "Automation House", 1150.25);
		Book b48 = new Book("Java Projects", "Amit Sharma", "ISBN148", "Project Press", 925.00);
		Book b49 = new Book("Programming in Java", "Kishore Kumar", "ISBN149", "Tech World", 850.75);
		Book b50 = new Book("Advanced Selenium", "Vikas Kumar", "ISBN150", "Automation Publications", 1350.00);
		
		System.out.println("==============================Book 1 Details================================");
		System.out.println("Object Reference is: " + b1);
		System.out.println("Title is: " + b1.getTitle());
		System.out.println("Author is: " + b1.getAuthor());
		System.out.println("ISBN is: " + b1.getISBN());
		System.out.println("Publisher is: " + b1.getPublisher());
		System.out.println("Price is: " + b1.getPrice());
		
		System.out.println("==============================Book 2 Details================================");
		System.out.println("Object Reference is: " + b2);
		System.out.println("Title is: " + b2.getTitle());
		System.out.println("Author is: " + b2.getAuthor());
		System.out.println("ISBN is: " + b2.getISBN());
		System.out.println("Publisher is: " + b2.getPublisher());
		System.out.println("Price is: " + b2.getPrice());

		System.out.println("==============================Book 3 Details================================");
		System.out.println("Object Reference is: " + b3);
		System.out.println("Title is: " + b3.getTitle());
		System.out.println("Author is: " + b3.getAuthor());
		System.out.println("ISBN is: " + b3.getISBN());
		System.out.println("Publisher is: " + b3.getPublisher());
		System.out.println("Price is: " + b3.getPrice());

		System.out.println("==============================Book 4 Details================================");
		System.out.println("Object Reference is: " + b4);
		System.out.println("Title is: " + b4.getTitle());
		System.out.println("Author is: " + b4.getAuthor());
		System.out.println("ISBN is: " + b4.getISBN());
		System.out.println("Publisher is: " + b4.getPublisher());
		System.out.println("Price is: " + b4.getPrice());

		System.out.println("==============================Book 5 Details================================");
		System.out.println("Object Reference is: " + b5);
		System.out.println("Title is: " + b5.getTitle());
		System.out.println("Author is: " + b5.getAuthor());
		System.out.println("ISBN is: " + b5.getISBN());
		System.out.println("Publisher is: " + b5.getPublisher());
		System.out.println("Price is: " + b5.getPrice());

		System.out.println("==============================Book 6 Details================================");
		System.out.println("Object Reference is: " + b6);
		System.out.println("Title is: " + b6.getTitle());
		System.out.println("Author is: " + b6.getAuthor());
		System.out.println("ISBN is: " + b6.getISBN());
		System.out.println("Publisher is: " + b6.getPublisher());
		System.out.println("Price is: " + b6.getPrice());

		System.out.println("==============================Book 7 Details================================");
		System.out.println("Object Reference is: " + b7);
		System.out.println("Title is: " + b7.getTitle());
		System.out.println("Author is: " + b7.getAuthor());
		System.out.println("ISBN is: " + b7.getISBN());
		System.out.println("Publisher is: " + b7.getPublisher());
		System.out.println("Price is: " + b7.getPrice());

		System.out.println("==============================Book 8 Details================================");
		System.out.println("Object Reference is: " + b8);
		System.out.println("Title is: " + b8.getTitle());
		System.out.println("Author is: " + b8.getAuthor());
		System.out.println("ISBN is: " + b8.getISBN());
		System.out.println("Publisher is: " + b8.getPublisher());
		System.out.println("Price is: " + b8.getPrice());

		System.out.println("==============================Book 9 Details================================");
		System.out.println("Object Reference is: " + b9);
		System.out.println("Title is: " + b9.getTitle());
		System.out.println("Author is: " + b9.getAuthor());
		System.out.println("ISBN is: " + b9.getISBN());
		System.out.println("Publisher is: " + b9.getPublisher());
		System.out.println("Price is: " + b9.getPrice());

		System.out.println("==============================Book 10 Details================================");
		System.out.println("Object Reference is: " + b10);
		System.out.println("Title is: " + b10.getTitle());
		System.out.println("Author is: " + b10.getAuthor());
		System.out.println("ISBN is: " + b10.getISBN());
		System.out.println("Publisher is: " + b10.getPublisher());
		System.out.println("Price is: " + b10.getPrice());

		System.out.println("==============================Book 11 Details================================");
		System.out.println("Object Reference is: " + b11);
		System.out.println("Title is: " + b11.getTitle());
		System.out.println("Author is: " + b11.getAuthor());
		System.out.println("ISBN is: " + b11.getISBN());
		System.out.println("Publisher is: " + b11.getPublisher());
		System.out.println("Price is: " + b11.getPrice());

		System.out.println("==============================Book 12 Details================================");
		System.out.println("Object Reference is: " + b12);
		System.out.println("Title is: " + b12.getTitle());
		System.out.println("Author is: " + b12.getAuthor());
		System.out.println("ISBN is: " + b12.getISBN());
		System.out.println("Publisher is: " + b12.getPublisher());
		System.out.println("Price is: " + b12.getPrice());

		System.out.println("==============================Book 13 Details================================");
		System.out.println("Object Reference is: " + b13);
		System.out.println("Title is: " + b13.getTitle());
		System.out.println("Author is: " + b13.getAuthor());
		System.out.println("ISBN is: " + b13.getISBN());
		System.out.println("Publisher is: " + b13.getPublisher());
		System.out.println("Price is: " + b13.getPrice());

		System.out.println("==============================Book 14 Details================================");
		System.out.println("Object Reference is: " + b14);
		System.out.println("Title is: " + b14.getTitle());
		System.out.println("Author is: " + b14.getAuthor());
		System.out.println("ISBN is: " + b14.getISBN());
		System.out.println("Publisher is: " + b14.getPublisher());
		System.out.println("Price is: " + b14.getPrice());

		System.out.println("==============================Book 15 Details================================");
		System.out.println("Object Reference is: " + b15);
		System.out.println("Title is: " + b15.getTitle());
		System.out.println("Author is: " + b15.getAuthor());
		System.out.println("ISBN is: " + b15.getISBN());
		System.out.println("Publisher is: " + b15.getPublisher());
		System.out.println("Price is: " + b15.getPrice());

		System.out.println("==============================Book 16 Details================================");
		System.out.println("Object Reference is: " + b16);
		System.out.println("Title is: " + b16.getTitle());
		System.out.println("Author is: " + b16.getAuthor());
		System.out.println("ISBN is: " + b16.getISBN());
		System.out.println("Publisher is: " + b16.getPublisher());
		System.out.println("Price is: " + b16.getPrice());

		System.out.println("==============================Book 17 Details================================");
		System.out.println("Object Reference is: " + b17);
		System.out.println("Title is: " + b17.getTitle());
		System.out.println("Author is: " + b17.getAuthor());
		System.out.println("ISBN is: " + b17.getISBN());
		System.out.println("Publisher is: " + b17.getPublisher());
		System.out.println("Price is: " + b17.getPrice());

		System.out.println("==============================Book 18 Details================================");
		System.out.println("Object Reference is: " + b18);
		System.out.println("Title is: " + b18.getTitle());
		System.out.println("Author is: " + b18.getAuthor());
		System.out.println("ISBN is: " + b18.getISBN());
		System.out.println("Publisher is: " + b18.getPublisher());
		System.out.println("Price is: " + b18.getPrice());

		System.out.println("==============================Book 19 Details================================");
		System.out.println("Object Reference is: " + b19);
		System.out.println("Title is: " + b19.getTitle());
		System.out.println("Author is: " + b19.getAuthor());
		System.out.println("ISBN is: " + b19.getISBN());
		System.out.println("Publisher is: " + b19.getPublisher());
		System.out.println("Price is: " + b19.getPrice());

		System.out.println("==============================Book 20 Details================================");
		System.out.println("Object Reference is: " + b20);
		System.out.println("Title is: " + b20.getTitle());
		System.out.println("Author is: " + b20.getAuthor());
		System.out.println("ISBN is: " + b20.getISBN());
		System.out.println("Publisher is: " + b20.getPublisher());
		System.out.println("Price is: " + b20.getPrice());

		System.out.println("==============================Book 21 Details================================");
		System.out.println("Object Reference is: " + b21);
		System.out.println("Title is: " + b21.getTitle());
		System.out.println("Author is: " + b21.getAuthor());
		System.out.println("ISBN is: " + b21.getISBN());
		System.out.println("Publisher is: " + b21.getPublisher());
		System.out.println("Price is: " + b21.getPrice());

		System.out.println("==============================Book 22 Details================================");
		System.out.println("Object Reference is: " + b22);
		System.out.println("Title is: " + b22.getTitle());
		System.out.println("Author is: " + b22.getAuthor());
		System.out.println("ISBN is: " + b22.getISBN());
		System.out.println("Publisher is: " + b22.getPublisher());
		System.out.println("Price is: " + b22.getPrice());

		System.out.println("==============================Book 23 Details================================");
		System.out.println("Object Reference is: " + b23);
		System.out.println("Title is: " + b23.getTitle());
		System.out.println("Author is: " + b23.getAuthor());
		System.out.println("ISBN is: " + b23.getISBN());
		System.out.println("Publisher is: " + b23.getPublisher());
		System.out.println("Price is: " + b23.getPrice());

		System.out.println("==============================Book 24 Details================================");
		System.out.println("Object Reference is: " + b24);
		System.out.println("Title is: " + b24.getTitle());
		System.out.println("Author is: " + b24.getAuthor());
		System.out.println("ISBN is: " + b24.getISBN());
		System.out.println("Publisher is: " + b24.getPublisher());
		System.out.println("Price is: " + b24.getPrice());

		System.out.println("==============================Book 25 Details================================");
		System.out.println("Object Reference is: " + b25);
		System.out.println("Title is: " + b25.getTitle());
		System.out.println("Author is: " + b25.getAuthor());
		System.out.println("ISBN is: " + b25.getISBN());
		System.out.println("Publisher is: " + b25.getPublisher());
		System.out.println("Price is: " + b25.getPrice());

		System.out.println("==============================Book 26 Details================================");
		System.out.println("Object Reference is: " + b26);
		System.out.println("Title is: " + b26.getTitle());
		System.out.println("Author is: " + b26.getAuthor());
		System.out.println("ISBN is: " + b26.getISBN());
		System.out.println("Publisher is: " + b26.getPublisher());
		System.out.println("Price is: " + b26.getPrice());

		System.out.println("==============================Book 27 Details================================");
		System.out.println("Object Reference is: " + b27);
		System.out.println("Title is: " + b27.getTitle());
		System.out.println("Author is: " + b27.getAuthor());
		System.out.println("ISBN is: " + b27.getISBN());
		System.out.println("Publisher is: " + b27.getPublisher());
		System.out.println("Price is: " + b27.getPrice());

		System.out.println("==============================Book 28 Details================================");
		System.out.println("Object Reference is: " + b28);
		System.out.println("Title is: " + b28.getTitle());
		System.out.println("Author is: " + b28.getAuthor());
		System.out.println("ISBN is: " + b28.getISBN());
		System.out.println("Publisher is: " + b28.getPublisher());
		System.out.println("Price is: " + b28.getPrice());

		System.out.println("==============================Book 29 Details================================");
		System.out.println("Object Reference is: " + b29);
		System.out.println("Title is: " + b29.getTitle());
		System.out.println("Author is: " + b29.getAuthor());
		System.out.println("ISBN is: " + b29.getISBN());
		System.out.println("Publisher is: " + b29.getPublisher());
		System.out.println("Price is: " + b29.getPrice());

		System.out.println("==============================Book 30 Details================================");
		System.out.println("Object Reference is: " + b30);
		System.out.println("Title is: " + b30.getTitle());
		System.out.println("Author is: " + b30.getAuthor());
		System.out.println("ISBN is: " + b30.getISBN());
		System.out.println("Publisher is: " + b30.getPublisher());
		System.out.println("Price is: " + b30.getPrice());

		System.out.println("==============================Book 31 Details================================");
		System.out.println("Object Reference is: " + b31);
		System.out.println("Title is: " + b31.getTitle());
		System.out.println("Author is: " + b31.getAuthor());
		System.out.println("ISBN is: " + b31.getISBN());
		System.out.println("Publisher is: " + b31.getPublisher());
		System.out.println("Price is: " + b31.getPrice());

		System.out.println("==============================Book 32 Details================================");
		System.out.println("Object Reference is: " + b32);
		System.out.println("Title is: " + b32.getTitle());
		System.out.println("Author is: " + b32.getAuthor());
		System.out.println("ISBN is: " + b32.getISBN());
		System.out.println("Publisher is: " + b32.getPublisher());
		System.out.println("Price is: " + b32.getPrice());

		System.out.println("==============================Book 33 Details================================");
		System.out.println("Object Reference is: " + b33);
		System.out.println("Title is: " + b33.getTitle());
		System.out.println("Author is: " + b33.getAuthor());
		System.out.println("ISBN is: " + b33.getISBN());
		System.out.println("Publisher is: " + b33.getPublisher());
		System.out.println("Price is: " + b33.getPrice());

		System.out.println("==============================Book 34 Details================================");
		System.out.println("Object Reference is: " + b34);
		System.out.println("Title is: " + b34.getTitle());
		System.out.println("Author is: " + b34.getAuthor());
		System.out.println("ISBN is: " + b34.getISBN());
		System.out.println("Publisher is: " + b34.getPublisher());
		System.out.println("Price is: " + b34.getPrice());

		System.out.println("==============================Book 35 Details================================");
		System.out.println("Object Reference is: " + b35);
		System.out.println("Title is: " + b35.getTitle());
		System.out.println("Author is: " + b35.getAuthor());
		System.out.println("ISBN is: " + b35.getISBN());
		System.out.println("Publisher is: " + b35.getPublisher());
		System.out.println("Price is: " + b35.getPrice());

		System.out.println("==============================Book 36 Details================================");
		System.out.println("Object Reference is: " + b36);
		System.out.println("Title is: " + b36.getTitle());
		System.out.println("Author is: " + b36.getAuthor());
		System.out.println("ISBN is: " + b36.getISBN());
		System.out.println("Publisher is: " + b36.getPublisher());
		System.out.println("Price is: " + b36.getPrice());

		System.out.println("==============================Book 37 Details================================");
		System.out.println("Object Reference is: " + b37);
		System.out.println("Title is: " + b37.getTitle());
		System.out.println("Author is: " + b37.getAuthor());
		System.out.println("ISBN is: " + b37.getISBN());
		System.out.println("Publisher is: " + b37.getPublisher());
		System.out.println("Price is: " + b37.getPrice());

		System.out.println("==============================Book 38 Details================================");
		System.out.println("Object Reference is: " + b38);
		System.out.println("Title is: " + b38.getTitle());
		System.out.println("Author is: " + b38.getAuthor());
		System.out.println("ISBN is: " + b38.getISBN());
		System.out.println("Publisher is: " + b38.getPublisher());
		System.out.println("Price is: " + b38.getPrice());

		System.out.println("==============================Book 39 Details================================");
		System.out.println("Object Reference is: " + b39);
		System.out.println("Title is: " + b39.getTitle());
		System.out.println("Author is: " + b39.getAuthor());
		System.out.println("ISBN is: " + b39.getISBN());
		System.out.println("Publisher is: " + b39.getPublisher());
		System.out.println("Price is: " + b39.getPrice());

		System.out.println("==============================Book 40 Details================================");
		System.out.println("Object Reference is: " + b40);
		System.out.println("Title is: " + b40.getTitle());
		System.out.println("Author is: " + b40.getAuthor());
		System.out.println("ISBN is: " + b40.getISBN());
		System.out.println("Publisher is: " + b40.getPublisher());
		System.out.println("Price is: " + b40.getPrice());

		System.out.println("==============================Book 41 Details================================");
		System.out.println("Object Reference is: " + b41);
		System.out.println("Title is: " + b41.getTitle());
		System.out.println("Author is: " + b41.getAuthor());
		System.out.println("ISBN is: " + b41.getISBN());
		System.out.println("Publisher is: " + b41.getPublisher());
		System.out.println("Price is: " + b41.getPrice());

		System.out.println("==============================Book 42 Details================================");
		System.out.println("Object Reference is: " + b42);
		System.out.println("Title is: " + b42.getTitle());
		System.out.println("Author is: " + b42.getAuthor());
		System.out.println("ISBN is: " + b42.getISBN());
		System.out.println("Publisher is: " + b42.getPublisher());
		System.out.println("Price is: " + b42.getPrice());

		System.out.println("==============================Book 43 Details================================");
		System.out.println("Object Reference is: " + b43);
		System.out.println("Title is: " + b43.getTitle());
		System.out.println("Author is: " + b43.getAuthor());
		System.out.println("ISBN is: " + b43.getISBN());
		System.out.println("Publisher is: " + b43.getPublisher());
		System.out.println("Price is: " + b43.getPrice());

		System.out.println("==============================Book 44 Details================================");
		System.out.println("Object Reference is: " + b44);
		System.out.println("Title is: " + b44.getTitle());
		System.out.println("Author is: " + b44.getAuthor());
		System.out.println("ISBN is: " + b44.getISBN());
		System.out.println("Publisher is: " + b44.getPublisher());
		System.out.println("Price is: " + b44.getPrice());

		System.out.println("==============================Book 45 Details================================");
		System.out.println("Object Reference is: " + b45);
		System.out.println("Title is: " + b45.getTitle());
		System.out.println("Author is: " + b45.getAuthor());
		System.out.println("ISBN is: " + b45.getISBN());
		System.out.println("Publisher is: " + b45.getPublisher());
		System.out.println("Price is: " + b45.getPrice());

		System.out.println("==============================Book 46 Details================================");
		System.out.println("Object Reference is: " + b46);
		System.out.println("Title is: " + b46.getTitle());
		System.out.println("Author is: " + b46.getAuthor());
		System.out.println("ISBN is: " + b46.getISBN());
		System.out.println("Publisher is: " + b46.getPublisher());
		System.out.println("Price is: " + b46.getPrice());

		System.out.println("==============================Book 47 Details================================");
		System.out.println("Object Reference is: " + b47);
		System.out.println("Title is: " + b47.getTitle());
		System.out.println("Author is: " + b47.getAuthor());
		System.out.println("ISBN is: " + b47.getISBN());
		System.out.println("Publisher is: " + b47.getPublisher());
		System.out.println("Price is: " + b47.getPrice());

		System.out.println("==============================Book 48 Details================================");
		System.out.println("Object Reference is: " + b48);
		System.out.println("Title is: " + b48.getTitle());
		System.out.println("Author is: " + b48.getAuthor());
		System.out.println("ISBN is: " + b48.getISBN());
		System.out.println("Publisher is: " + b48.getPublisher());
		System.out.println("Price is: " + b48.getPrice());

		System.out.println("==============================Book 49 Details================================");
		System.out.println("Object Reference is: " + b49);
		System.out.println("Title is: " + b49.getTitle());
		System.out.println("Author is: " + b49.getAuthor());
		System.out.println("ISBN is: " + b49.getISBN());
		System.out.println("Publisher is: " + b49.getPublisher());
		System.out.println("Price is: " + b49.getPrice());

		System.out.println("==============================Book 50 Details================================");
		System.out.println("Object Reference is: " + b50);
		System.out.println("Title is: " + b50.getTitle());
		System.out.println("Author is: " + b50.getAuthor());
		System.out.println("ISBN is: " + b50.getISBN());
		System.out.println("Publisher is: " + b50.getPublisher());
		System.out.println("Price is: " + b50.getPrice());

		System.out.println("===============================Main Method Ends===================================");

	}

}
