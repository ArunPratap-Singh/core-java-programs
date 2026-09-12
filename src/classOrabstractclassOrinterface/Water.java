package classOrabstractclassOrinterface;

public abstract class Water {
	
		String brands;
		int price;
		double volume;
		String type;
		String source;
		
		Water(){
			
		}
		
		Water(String brands, int price, double volume, String type, String source){
			
			this.brands = brands;
			this.price = price;
			this.volume = volume;
			this.type = type;
			this.source = source;
		}
		
		public abstract void drink();
		
		public String toString() {
			
			return "Brand is: " +brands+"\tPrice is " +price+"\tVolume is: " +volume+"\tType is: " +type+"\tSource is: " +source;
		}
}
