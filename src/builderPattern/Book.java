package builderPattern;

public class Book {

    private String title;
    private String author;
    private double price;
    private String publisher;
    private int pages;
    private String genre;

    private Book() {
    	
    }

    private Book(String title, String author, double price, String publisher, int pages, String genre) {
        
    	this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
    }

    private Book(Builder b) {
       
    	this(b.title, b.author, b.price, b.publisher, b.pages, b.genre);
    }

    @Override
    public String toString() {
        
    	return "Book [Title is: " + title + ", Author is: " + author + ", Price is: " + price + ", Publisher is: " + publisher + ", Pages is: " + pages + ", Genre is: " + genre + "]";
    }

    static class Builder {

        private String title;
        private String author;
        private double price;
        private String publisher;
        private int pages;
        private String genre;

        public Builder setTitle(String title) {
           
        	this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            
        	this.author = author;
            return this;
        }

        public Builder setPrice(double price) {
            
        	this.price = price;
            return this;
        }

        public Builder setPublisher(String publisher) {
            
        	this.publisher = publisher;
            return this;
        }

        public Builder setPages(int pages) {
            
        	this.pages = pages;
            return this;
        }

        public Builder setGenre(String genre) {
            
        	this.genre = genre;
            return this;
        }

        public Book build() {
            
        	return new Book(this);
        }
    }
}



