package encapsulationsPrograming;

public class Book {
	
		private String title;
		private String author;
		private String isbn;
		private String publisher;
		private double price;


		Book(){
			
		}
		
		Book(String title, String author, String isbn, String publisher, double price) {

			this.title = title;
			this.author = author;
			this.isbn = isbn;
			this.publisher = publisher;
			this.price = price;
		}


		public void setTitle(String title) {

			if(title.length() > 2 && title.length() <= 100 && !title.isBlank() && title.matches("[A-Z a-z 0-9 \s]+"))

				this.title = title;

			else

				System.out.println("Wrong Title entered");
		}


		public String getTitle() {

			return title;
		}


		public void setAuthor(String author) {

			if(author.length() > 3 && author.length() <= 50 && !author.isBlank() && author.matches("[A-Z a-z \s]+"))

				this.author = author;

			else

				System.out.println("Wrong Author entered");
		}


		public String getAuthor() {

			return author;
		}


		public void setISBN(String isbn) {

			if(isbn.length() >= 5 && isbn.length() <= 20 && !isbn.isBlank() && isbn.matches("[A-Z a-z 0-9]+"))

				this.isbn = isbn;

			else

				System.out.println("Invalid ISBN");
		}


		public String getISBN() {

			return isbn;
		}


		public void setPublisher(String publisher) {

			if(publisher.length() > 2 && publisher.length() <= 50 && !publisher.isBlank() && publisher.matches("[A-Z a-z]+"))

				this.publisher = publisher;

			else

				System.out.println("Wrong Publisher");
		}


		public String getPublisher() {

			return publisher;
		}


		public void setPrice(double price) {

			if(price > 0)

				this.price = price;

			else

				System.out.println("Wrong Price");
		}


		public double getPrice() {

			return price;
		}

	

}
