package encapsulationsPrograming;

public class LibraryBook {
	
		private String title;
		private String author;
		private String bookID;
		private String category;
		private boolean availability;
		
		LibraryBook(){
			
		}

		LibraryBook(String title, String author, String bookID, String category, boolean availability) {

			this.title = title;
			this.author = author;
			this.bookID = bookID;
			this.category = category;
			this.availability = availability;
		}


		public void setTitle(String title) {

			if(title.length() > 2 && title.length() <= 100 && !title.isBlank() && title.matches("[A-Z a-z 0-9 \s]+"))

				this.title = title;

			else

				System.out.println("Wrong Book Title");
		}


		public String getTitle() {

			return title;
		}


		public void setAuthor(String author) {

			if(author.length() > 3 && author.length() <= 50 && !author.isBlank() && author.matches("[A-Z a-z .]+"))

				this.author = author;

			else

				System.out.println("Wrong Author Name");
		}


		public String getAuthor() {

			return author;
		}


		public void setBookID(String bookID) {

			if(bookID.length() > 3 && bookID.length() <= 20 && !bookID.isBlank() && bookID.matches("[A-Z a-z 0-9]+"))

				this.bookID = bookID;

			else

				System.out.println("Invalid Book ID");
		}


		public String getBookID() {

			return bookID;
		}


		public void setCategory(String category) {

			if(category.length() > 2 && category.length() <= 30 && !category.isBlank() && category.matches("[A-Z a-z]+"))

				this.category = category;

			else

				System.out.println("Wrong Category");
		}


		public String getCategory() {

			return category;
		}


		public void setAvailability(boolean availability) {

			this.availability = availability;
		}


		public boolean getAvailability() {

			return availability;
		}


		public void issueBook() {

			if(availability) {

				availability = false;

				System.out.println("Book Issued Successfully");

			}
			else {

				System.out.println("Book is Already Issued");
			}
		}


		public void returnBook() {

			if(!availability) {

				availability = true;

				System.out.println("Book Returned Successfully");

			}
			else {

				System.out.println("Book is Already Available");
			}
		}

	

}
