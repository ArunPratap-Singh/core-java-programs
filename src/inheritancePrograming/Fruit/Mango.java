package inheritancePrograming.Fruit;

public class Mango extends Fruit{
	
	    String variety;
	    String season;
	    boolean isSeedless;

	    public Mango(String name, String color, double price, String taste, int quantity, String variety, String season, boolean isSeedless) {

	        super(name, color, price, taste, quantity);
	        this.variety = variety;
	        this.season = season;
	        this.isSeedless = isSeedless;
	    }

	    @Override
	    public String toString() {
	    	return super.toString()+"\nVariety is; " +variety+"\nSeason is: " +season+"\nisSeedless is: " +isSeedless+"\n======================";
	}

}
