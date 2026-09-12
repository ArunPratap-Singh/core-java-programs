package pojoPrograming;

public class BookDetails {
	
		private String bookID;
		private String title;
		private String author;
		private double price;
		private int quantity;
		private String category;
		private String publisher;
		private String isbn;
		private String edition;
		private String language;
		private int pages;
		private double rating;
		private int publicationYear;
		private String availability;
		private String format;

		public BookDetails() {

		}


		public BookDetails(String bookID, String title, String author, double price, int quantity, String category, String publisher, String isbn, String edition, String language, int pages, double rating, int publicationYear, String availability, String format) {

			this.bookID = bookID;
			this.title = title;
			this.author = author;
			this.price = price;
			this.quantity = quantity;
			this.category = category;
			this.publisher = publisher;
			this.isbn = isbn;
			this.edition = edition;
			this.language = language;
			this.pages = pages;
			this.rating = rating;
			this.publicationYear = publicationYear;
			this.availability = availability;
			this.format = format;
		}


		public String getBookID() {

			return bookID;
		}


		public void setBookID(String bookID) {

			this.bookID = bookID;
		}


		public String getTitle() {

			return title;
		}


		public void setTitle(String title) {

			this.title = title;
		}


		public String getAuthor() {

			return author;
		}


		public void setAuthor(String author) {

			this.author = author;
		}


		public double getPrice() {

			return price;
		}


		public void setPrice(double price) {

			this.price = price;
		}


		public int getQuantity() {

			return quantity;
		}


		public void setQuantity(int quantity) {

			this.quantity = quantity;
		}


		public String getCategory() {

			return category;
		}


		public void setCategory(String category) {

			this.category = category;
		}


		public String getPublisher() {

			return publisher;
		}


		public void setPublisher(String publisher) {

			this.publisher = publisher;
		}


		public String getIsbn() {

			return isbn;
		}


		public void setIsbn(String isbn) {

			this.isbn = isbn;
		}


		public String getEdition() {

			return edition;
		}


		public void setEdition(String edition) {

			this.edition = edition;
		}


		public String getLanguage() {

			return language;
		}


		public void setLanguage(String language) {

			this.language = language;
		}


		public int getPages() {

			return pages;
		}


		public void setPages(int pages) {

			this.pages = pages;
		}


		public double getRating() {

			return rating;
		}


		public void setRating(double rating) {

			this.rating = rating;
		}


		public int getPublicationYear() {

			return publicationYear;
		}


		public void setPublicationYear(int publicationYear) {

			this.publicationYear = publicationYear;
		}


		public String getAvailability() {

			return availability;
		}


		public void setAvailability(String availability) {

			this.availability = availability;
		}


		public String getFormat() {

			return format;
		}


		public void setFormat(String format) {

			this.format = format;
		}

	

}
