package contructor;

public class Trees {

	    String treeName;
	    String treeType;
	    int age;
	    double height;

	    Trees() {
	    }

	    Trees(String treeName, String treeType, int age, double height) {
	        this.treeName = treeName;
	        this.treeType = treeType;
	        this.age = age;
	        this.height = height;
	    }

	    public String toString() {
	        return "Tree Name is: " +treeName+ "\nTree Type is: " +treeType+ "\nAge is: " + age + " years"+"\nHeight is: " +height+ " meters"+"\n==============================";
	    }
	

}
