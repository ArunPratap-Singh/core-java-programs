package encapsulation;

public class CustomerVoterCard {
	
	private String voterid;
	private String name;
	private String dateofbirth;
	private int age;
	private String address;
	private String constituency;
	private int constituencynumber;
	
	CustomerVoterCard(String voterid, String name, String dateofbirth, int age, String address, String constituency, int constituencynumber){
		
		this.voterid = voterid;
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.age = age;
		this.address = address;
		this.constituency = constituency;
		this.constituencynumber = constituencynumber;
	}
	
	public void setVoterID(String voterid) {
		if(voterid.length()>3 && voterid.length()<15 && voterid.matches("[A-Z a-z \s 1-100]+"))
			this.voterid = voterid;
			else
				System.out.println("Invalid Voter Id");
	}
	public String getVoterID() {
		return voterid;
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
	public void setDateOfBirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDateOfBirth() {
		return dateofbirth;
	}
	public void setAge(int age) {
		if(age>18 && age<200)
			this.age = age;
		else 
			System.out.println("Invalid age Entered");
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		if(address.length()>3 && address.length()<200 && address.matches("[A-Z a-z 1-100]+"))
			this.address = address;
		else
			System.out.println("Wrong character Entered");
	}
	public String getAddress() {
		return address;
	}
	public void setConstituency(String constituency) {
		if(constituency.length()>3 && constituency.length()<50 && constituency.matches("[A-Z a-z \s]+"))
			this.constituency = constituency;
		else
			System.out.println("Wrong Constituency");
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituencyNumber(int constituencynumber) {
		if(constituencynumber>0 && constituencynumber<1000)
			this.constituencynumber = constituencynumber;
		else
			System.out.println("Wrong constituency entered");
	}
	public int getConstituencyNumber() {
		return constituencynumber;
	}
	

}
