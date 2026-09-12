package pojoPrograming;

public class BookDetailsDriver {

	public static void main(String[] args) {
		
		System.out.println("===================================Main Method Starts=======================================");

		BookDetails b1 = new BookDetails("BOOK101", "Java Programming", "James Gosling", 850.00, 25, "Programming", "Tech Publications", "9781234567890", "5th Edition", "English", 620, 4.7, 2025, "Available", "Paperback");
		BookDetails b2 = new BookDetails("BOOK102", "Python Programming", "Mark Lutz", 950.00, 30, "Programming", "OReilly Media", "9781234567891", "4th Edition", "English", 700, 4.6, 2024, "Available", "Hardcover");
		BookDetails b3 = new BookDetails("BOOK103", "Clean Code", "Robert C. Martin", 1200.00, 20, "Software Engineering", "Pearson", "9781234567892", "1st Edition", "English", 464, 4.8, 2023, "Available", "Paperback");
		BookDetails b4 = new BookDetails("BOOK104", "Effective Java", "Joshua Bloch", 1100.00, 18, "Java", "Addison-Wesley", "9781234567893", "3rd Edition", "English", 416, 4.9, 2022, "Available", "Hardcover");
		BookDetails b5 = new BookDetails("BOOK105", "The Complete JavaScript", "David Flanagan", 980.00, 22, "Web Development", "OReilly Media", "9781234567894", "7th Edition", "English", 700, 4.5, 2024, "Available", "Paperback");
		BookDetails b6 = new BookDetails("BOOK106", "Head First Design Patterns", "Eric Freeman", 1350.00, 15, "Design Patterns", "OReilly Media", "9781234567895", "2nd Edition", "English", 694, 4.7, 2023, "Available", "Hardcover");
		BookDetails b7 = new BookDetails("BOOK107", "Introduction to Algorithms", "Thomas H. Cormen", 1800.00, 12, "Algorithms", "MIT Press", "9781234567896", "4th Edition", "English", 1312, 4.9, 2022, "Available", "Hardcover");
		BookDetails b8 = new BookDetails("BOOK108", "Database System Concepts", "Abraham Silberschatz", 1450.00, 16, "Database", "McGraw Hill", "9781234567897", "7th Edition", "English", 1376, 4.6, 2021, "Available", "Hardcover");
		BookDetails b9 = new BookDetails("BOOK109", "Computer Networks", "Andrew S. Tanenbaum", 1250.00, 24, "Networking", "Pearson", "9781234567898", "6th Edition", "English", 960, 4.5, 2023, "Available", "Paperback");
		BookDetails b10 = new BookDetails("BOOK110", "Artificial Intelligence", "Stuart Russell", 1600.00, 10, "Artificial Intelligence", "Pearson", "9781234567899", "4th Edition", "English", 1152, 4.8, 2024, "Available", "Hardcover");
		
		
		System.out.println("=========================Book Details 1=========================");

		System.out.println("Object Reference is: " + b1);
		System.out.println("Book ID is: " + b1.getBookID());
		System.out.println("Title is: " + b1.getTitle());
		System.out.println("Author is: " + b1.getAuthor());
		System.out.println("Price is: " + b1.getPrice());
		System.out.println("Quantity is: " + b1.getQuantity());
		System.out.println("Category is: " + b1.getCategory());
		System.out.println("Publisher is: " + b1.getPublisher());
		System.out.println("ISBN is: " + b1.getIsbn());
		System.out.println("Edition is: " + b1.getEdition());
		System.out.println("Language is: " + b1.getLanguage());
		System.out.println("Pages are: " + b1.getPages());
		System.out.println("Rating is: " + b1.getRating());
		System.out.println("Publication Year is: " + b1.getPublicationYear());
		System.out.println("Availability is: " + b1.getAvailability());
		System.out.println("Format is: " + b1.getFormat());


		System.out.println("=========================Book Details 2=========================");

		System.out.println("Object Reference is: " + b2);
		System.out.println("Book ID is: " + b2.getBookID());
		System.out.println("Title is: " + b2.getTitle());
		System.out.println("Author is: " + b2.getAuthor());
		System.out.println("Price is: " + b2.getPrice());
		System.out.println("Quantity is: " + b2.getQuantity());
		System.out.println("Category is: " + b2.getCategory());
		System.out.println("Publisher is: " + b2.getPublisher());
		System.out.println("ISBN is: " + b2.getIsbn());
		System.out.println("Edition is: " + b2.getEdition());
		System.out.println("Language is: " + b2.getLanguage());
		System.out.println("Pages are: " + b2.getPages());
		System.out.println("Rating is: " + b2.getRating());
		System.out.println("Publication Year is: " + b2.getPublicationYear());
		System.out.println("Availability is: " + b2.getAvailability());
		System.out.println("Format is: " + b2.getFormat());


		System.out.println("=========================Book Details 3=========================");

		System.out.println("Object Reference is: " + b3);
		System.out.println("Book ID is: " + b3.getBookID());
		System.out.println("Title is: " + b3.getTitle());
		System.out.println("Author is: " + b3.getAuthor());
		System.out.println("Price is: " + b3.getPrice());
		System.out.println("Quantity is: " + b3.getQuantity());
		System.out.println("Category is: " + b3.getCategory());
		System.out.println("Publisher is: " + b3.getPublisher());
		System.out.println("ISBN is: " + b3.getIsbn());
		System.out.println("Edition is: " + b3.getEdition());
		System.out.println("Language is: " + b3.getLanguage());
		System.out.println("Pages are: " + b3.getPages());
		System.out.println("Rating is: " + b3.getRating());
		System.out.println("Publication Year is: " + b3.getPublicationYear());
		System.out.println("Availability is: " + b3.getAvailability());
		System.out.println("Format is: " + b3.getFormat());


		System.out.println("=========================Book Details 4=========================");

		System.out.println("Object Reference is: " + b4);
		System.out.println("Book ID is: " + b4.getBookID());
		System.out.println("Title is: " + b4.getTitle());
		System.out.println("Author is: " + b4.getAuthor());
		System.out.println("Price is: " + b4.getPrice());
		System.out.println("Quantity is: " + b4.getQuantity());
		System.out.println("Category is: " + b4.getCategory());
		System.out.println("Publisher is: " + b4.getPublisher());
		System.out.println("ISBN is: " + b4.getIsbn());
		System.out.println("Edition is: " + b4.getEdition());
		System.out.println("Language is: " + b4.getLanguage());
		System.out.println("Pages are: " + b4.getPages());
		System.out.println("Rating is: " + b4.getRating());
		System.out.println("Publication Year is: " + b4.getPublicationYear());
		System.out.println("Availability is: " + b4.getAvailability());
		System.out.println("Format is: " + b4.getFormat());


		System.out.println("=========================Book Details 5=========================");

		System.out.println("Object Reference is: " + b5);
		System.out.println("Book ID is: " + b5.getBookID());
		System.out.println("Title is: " + b5.getTitle());
		System.out.println("Author is: " + b5.getAuthor());
		System.out.println("Price is: " + b5.getPrice());
		System.out.println("Quantity is: " + b5.getQuantity());
		System.out.println("Category is: " + b5.getCategory());
		System.out.println("Publisher is: " + b5.getPublisher());
		System.out.println("ISBN is: " + b5.getIsbn());
		System.out.println("Edition is: " + b5.getEdition());
		System.out.println("Language is: " + b5.getLanguage());
		System.out.println("Pages are: " + b5.getPages());
		System.out.println("Rating is: " + b5.getRating());
		System.out.println("Publication Year is: " + b5.getPublicationYear());
		System.out.println("Availability is: " + b5.getAvailability());
		System.out.println("Format is: " + b5.getFormat());


		System.out.println("=========================Book Details 6=========================");

		System.out.println("Object Reference is: " + b6);
		System.out.println("Book ID is: " + b6.getBookID());
		System.out.println("Title is: " + b6.getTitle());
		System.out.println("Author is: " + b6.getAuthor());
		System.out.println("Price is: " + b6.getPrice());
		System.out.println("Quantity is: " + b6.getQuantity());
		System.out.println("Category is: " + b6.getCategory());
		System.out.println("Publisher is: " + b6.getPublisher());
		System.out.println("ISBN is: " + b6.getIsbn());
		System.out.println("Edition is: " + b6.getEdition());
		System.out.println("Language is: " + b6.getLanguage());
		System.out.println("Pages are: " + b6.getPages());
		System.out.println("Rating is: " + b6.getRating());
		System.out.println("Publication Year is: " + b6.getPublicationYear());
		System.out.println("Availability is: " + b6.getAvailability());
		System.out.println("Format is: " + b6.getFormat());


		System.out.println("=========================Book Details 7=========================");

		System.out.println("Object Reference is: " + b7);
		System.out.println("Book ID is: " + b7.getBookID());
		System.out.println("Title is: " + b7.getTitle());
		System.out.println("Author is: " + b7.getAuthor());
		System.out.println("Price is: " + b7.getPrice());
		System.out.println("Quantity is: " + b7.getQuantity());
		System.out.println("Category is: " + b7.getCategory());
		System.out.println("Publisher is: " + b7.getPublisher());
		System.out.println("ISBN is: " + b7.getIsbn());
		System.out.println("Edition is: " + b7.getEdition());
		System.out.println("Language is: " + b7.getLanguage());
		System.out.println("Pages are: " + b7.getPages());
		System.out.println("Rating is: " + b7.getRating());
		System.out.println("Publication Year is: " + b7.getPublicationYear());
		System.out.println("Availability is: " + b7.getAvailability());
		System.out.println("Format is: " + b7.getFormat());


		System.out.println("=========================Book Details 8=========================");

		System.out.println("Object Reference is: " + b8);
		System.out.println("Book ID is: " + b8.getBookID());
		System.out.println("Title is: " + b8.getTitle());
		System.out.println("Author is: " + b8.getAuthor());
		System.out.println("Price is: " + b8.getPrice());
		System.out.println("Quantity is: " + b8.getQuantity());
		System.out.println("Category is: " + b8.getCategory());
		System.out.println("Publisher is: " + b8.getPublisher());
		System.out.println("ISBN is: " + b8.getIsbn());
		System.out.println("Edition is: " + b8.getEdition());
		System.out.println("Language is: " + b8.getLanguage());
		System.out.println("Pages are: " + b8.getPages());
		System.out.println("Rating is: " + b8.getRating());
		System.out.println("Publication Year is: " + b8.getPublicationYear());
		System.out.println("Availability is: " + b8.getAvailability());
		System.out.println("Format is: " + b8.getFormat());


		System.out.println("=========================Book Details 9=========================");

		System.out.println("Object Reference is: " + b9);
		System.out.println("Book ID is: " + b9.getBookID());
		System.out.println("Title is: " + b9.getTitle());
		System.out.println("Author is: " + b9.getAuthor());
		System.out.println("Price is: " + b9.getPrice());
		System.out.println("Quantity is: " + b9.getQuantity());
		System.out.println("Category is: " + b9.getCategory());
		System.out.println("Publisher is: " + b9.getPublisher());
		System.out.println("ISBN is: " + b9.getIsbn());
		System.out.println("Edition is: " + b9.getEdition());
		System.out.println("Language is: " + b9.getLanguage());
		System.out.println("Pages are: " + b9.getPages());
		System.out.println("Rating is: " + b9.getRating());
		System.out.println("Publication Year is: " + b9.getPublicationYear());
		System.out.println("Availability is: " + b9.getAvailability());
		System.out.println("Format is: " + b9.getFormat());


		System.out.println("=========================Book Details 10=========================");

		System.out.println("Object Reference is: " + b10);
		System.out.println("Book ID is: " + b10.getBookID());
		System.out.println("Title is: " + b10.getTitle());
		System.out.println("Author is: " + b10.getAuthor());
		System.out.println("Price is: " + b10.getPrice());
		System.out.println("Quantity is: " + b10.getQuantity());
		System.out.println("Category is: " + b10.getCategory());
		System.out.println("Publisher is: " + b10.getPublisher());
		System.out.println("ISBN is: " + b10.getIsbn());
		System.out.println("Edition is: " + b10.getEdition());
		System.out.println("Language is: " + b10.getLanguage());
		System.out.println("Pages are: " + b10.getPages());
		System.out.println("Rating is: " + b10.getRating());
		System.out.println("Publication Year is: " + b10.getPublicationYear());
		System.out.println("Availability is: " + b10.getAvailability());
		System.out.println("Format is: " + b10.getFormat());
		
		System.out.println("=========================================Main Method Ends=========================================");

	}

}
