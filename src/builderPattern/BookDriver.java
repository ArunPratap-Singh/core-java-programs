package builderPattern;

public class BookDriver {
	
    public static void main(String[] args) {

        Book b1 = new Book.Builder().setTitle("The Alchemist").setAuthor("Paulo Coelho").setPrice(399.00).setPublisher("HarperCollins").setPages(208).setGenre("Fiction").build();

        Book b2 = new Book.Builder().setTitle("Wings of Fire").setAuthor("A.P.J. Abdul Kalam").setPrice(350.00).setPublisher("Universities Press").setPages(180).setGenre("Autobiography").build();

        Book b3 = new Book.Builder().setTitle("Rich Dad Poor Dad").setAuthor("Robert Kiyosaki").setPrice(450.00).setPublisher("Plata Publishing").setPages(336).setGenre("Finance").build();

        Book b4 = new Book.Builder().setTitle("Atomic Habits").setAuthor("James Clear").setPrice(550.00).setPublisher("Penguin").setPages(320).setGenre("Self Help").build();

        Book b5 = new Book.Builder().setTitle("The Power of Your Subconscious Mind").setAuthor("Joseph Murphy").setPrice(299.00).setPublisher("Prentice Hall").setPages(240).setGenre("Psychology").build();

        Book b6 = new Book.Builder().setTitle("Think and Grow Rich").setAuthor("Napoleon Hill").setPrice(399.00).setPublisher("The Ralston Society").setPages(320).setGenre("Self Help").build();

        Book b7 = new Book.Builder().setTitle("The 5 AM Club").setAuthor("Robin Sharma").setPrice(499.00).setPublisher("HarperCollins").setPages(336).setGenre("Personal Development").build();

        Book b8 = new Book.Builder().setTitle("Ikigai").setAuthor("Hector Garcia").setPrice(350.00).setPublisher("Penguin").setPages(208).setGenre("Lifestyle").build();

        Book b9 = new Book.Builder().setTitle("Deep Work").setAuthor("Cal Newport").setPrice(450.00).setPublisher("Grand Central Publishing").setPages(304).setGenre("Productivity").build();

        Book b10 = new Book.Builder().setTitle("The Psychology of Money").setAuthor("Morgan Housel").setPrice(399.00).setPublisher("Harriman House").setPages(256).setGenre("Finance").build();

        Book b11 = new Book.Builder().setTitle("Java: The Complete Reference").setAuthor("Herbert Schildt").setPrice(899.00).setPublisher("McGraw Hill").setPages(1248).setGenre("Programming").build();

        Book b12 = new Book.Builder().setTitle("Head First Java").setAuthor("Kathy Sierra").setPrice(750.00).setPublisher("O'Reilly Media").setPages(720).setGenre("Programming").build();

        Book b13 = new Book.Builder().setTitle("Effective Java").setAuthor("Joshua Bloch").setPrice(850.00).setPublisher("Addison-Wesley").setPages(416).setGenre("Programming").build();

        Book b14 = new Book.Builder().setTitle("Clean Code").setAuthor("Robert C. Martin").setPrice(950.00).setPublisher("Prentice Hall").setPages(464).setGenre("Software Engineering").build();

        Book b15 = new Book.Builder().setTitle("The Complete Reference SQL").setAuthor("James R. Groff").setPrice(799.00).setPublisher("McGraw Hill").setPages(1000).setGenre("Database").build();

        Book b16 = new Book.Builder().setTitle("Harry Potter and the Philosopher's Stone").setAuthor("J.K. Rowling").setPrice(499.00).setPublisher("Bloomsbury").setPages(352).setGenre("Fantasy").build();

        Book b17 = new Book.Builder().setTitle("The Jungle Book").setAuthor("Rudyard Kipling").setPrice(250.00).setPublisher("Macmillan").setPages(256).setGenre("Adventure").build();

        Book b18 = new Book.Builder().setTitle("The Great Gatsby").setAuthor("F. Scott Fitzgerald").setPrice(299.00).setPublisher("Scribner").setPages(180).setGenre("Classic Fiction").build();

        Book b19 = new Book.Builder().setTitle("Pride and Prejudice").setAuthor("Jane Austen").setPrice(320.00).setPublisher("Penguin Classics").setPages(432).setGenre("Romance").build();

        Book b20 = new Book.Builder().setTitle("The Hobbit").setAuthor("J.R.R. Tolkien").setPrice(599.00).setPublisher("HarperCollins").setPages(310).setGenre("Fantasy").build();

        System.out.println(b1);
        System.out.println("====================");

        System.out.println(b2);
        System.out.println("====================");

        System.out.println(b3);
        System.out.println("====================");

        System.out.println(b4);
        System.out.println("====================");

        System.out.println(b5);
        System.out.println("====================");

        System.out.println(b6);
        System.out.println("====================");

        System.out.println(b7);
        System.out.println("====================");

        System.out.println(b8);
        System.out.println("====================");

        System.out.println(b9);
        System.out.println("====================");

        System.out.println(b10);
        System.out.println("====================");

        System.out.println(b11);
        System.out.println("====================");

        System.out.println(b12);
        System.out.println("====================");

        System.out.println(b13);
        System.out.println("====================");

        System.out.println(b14);
        System.out.println("====================");

        System.out.println(b15);
        System.out.println("====================");

        System.out.println(b16);
        System.out.println("====================");

        System.out.println(b17);
        System.out.println("====================");

        System.out.println(b18);
        System.out.println("====================");

        System.out.println(b19);
        System.out.println("====================");

        System.out.println(b20);
        
    }
}



