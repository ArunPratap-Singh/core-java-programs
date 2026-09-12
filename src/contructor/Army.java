package contructor;

public class Army {

	    String soldierName;
	    String rank;
	    String unit;
	    int serviceYears;

	    Army() {
	    }

	    Army(String soldierName, String rank, String unit, int serviceYears) {
	        this.soldierName = soldierName;
	        this.rank = rank;
	        this.unit = unit;
	        this.serviceYears = serviceYears;
	    }

	    public String toString() {
	        return "Soldier Name is: " +soldierName+ "\nRank is: " +rank+ "\nUnit is: " +unit+ "\nService Years are: " +serviceYears+ "\n==============================";
	    }
	

}
