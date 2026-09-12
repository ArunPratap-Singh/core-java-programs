package immutableClassProgram;

public final class Book {

	private final int bookId;
	private final String bookName;
	private final String author;
	private final String publisher;
	private final double price;
	private final String category;
	private final String language;

	Book(int bookId, String bookName, String author, String publisher, double price, String category, String language) {

		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.category = category;
		this.language = language;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String getLanguage() {
		return language;
	}

}
