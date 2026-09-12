package encapsulation;

public class CustomerPanCard {
	
	private String pancardnumber;
	private String name;
	private String fathername;
	private String dateofbirth;
	
	CustomerPanCard(String pancardnumber, String name, String fathername, String dateofbirth){
		
		this.pancardnumber = pancardnumber;
		this.name = name;
		this.fathername = fathername;
		this.dateofbirth = dateofbirth;
	}
	
	public void setPanCardNumber(String pancardnumber) {
		if(pancardnumber.length()>3 && pancardnumber.length()<10 && !pancardnumber.isBlank() && pancardnumber.matches("[A-Z a-z 1-100 \s]+"))
			this.pancardnumber = pancardnumber;
		
		else 
			System.out.println("Invalid Pan Card Number");
	}
	public String getPanCardNumber() {
		return pancardnumber;
	}
	public void setName(String name) {
		if(name.length()>2 && name.length()<50 && !name.isBlank() && name.matches("[A-Z a-z 1-100]+"))
			this.name = name;
		
		else
			System.out.println("Invalid Name");
	}
	public String getName() {
		return name;
	}
	public void setFatherName(String fathername) {
		if(name.length()>2 && name.length()<=50 && !name.isBlank() && name.matches("[A-Z a-z 1-100]+"))
			this.fathername = fathername;
		
		else
			System.out.println();
	}
	public String getFathername() {
		return fathername;
	}
	public void setDateOfBirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDateOfBirth() {
		return dateofbirth;
	}
}
