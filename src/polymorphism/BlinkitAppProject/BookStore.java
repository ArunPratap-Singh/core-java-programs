package polymorphism.BlinkitAppProject;

public class BookStore extends Product{
	
	String TypeofBook;
	String NameofBook;
	int Price;
	int NumberofBooks;
	String Rating;
	String DeliveryTiming;
	
	BookStore(){
		
	}
	
	BookStore(String Productgroupname, String TypeofBook, String NameofBook, int Price, int NumberofBooks, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.TypeofBook = TypeofBook;
		this.NameofBook = NameofBook;
		this.Price = Price;
		this.NumberofBooks = NumberofBooks;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"TypeofBook is: " +TypeofBook+"\tNameofBook is: " +NameofBook+"\tPrice is: " +Price+"\tNumberofBooks is: " +NumberofBooks+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
