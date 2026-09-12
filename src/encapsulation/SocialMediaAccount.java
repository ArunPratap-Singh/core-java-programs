package encapsulation;

public class SocialMediaAccount {
	
	private String username;
	private int password;
	private String name;
	private int numberoffollowers;
	private int following;
	private String monetized;
	private int numberofposts;
	
	SocialMediaAccount(String username, int password, String name, int numberoffollowers, int following, String monetized, int numberofposts){
		this.username = username;
		this.password = password;
		this.name = name;
		this.numberoffollowers = numberoffollowers;
		this.following = following;
		this.monetized = monetized;
		this.numberofposts = numberofposts;
	}
	
	public void setUsername(String username) {
		if(username.length()>3 && username.length()<50 && !username.isBlank() && username.matches("[A-Z a-z 1-100]+"))
			this.username = username;
		else
			System.out.println("Invalid Username");
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(int password) {
		if(password>2 && password>1000000)
			this.password = password;
		else
			System.out.println("Invalid password");
	}
	public int getPassword() {
		return password;
	}
	public void setName(String name) {
		if(name.length()>3 && name.length()<=50 && !name.isBlank() && name.matches("[A-Z a-z 1-100\s]+"))
			this.name = name;
		else
			System.out.println("Invallid name Entered");
	}
	public String getName() {
		return name;
	}
	public void setNumberOfFollowers(int numberoffollowers) {
		if(numberoffollowers>100)
			this.numberoffollowers = numberoffollowers;
	}
	public int getNumberOfFollowers() {
		return numberoffollowers;
	}
	public void setFollowing(int following) {
		if(following>10)
			this.following = following;
		else
			System.out.println("Invalid Number");
	}
	public int getFollowing() {
		return following;
	}
	public void setMonetized(String monetized) {
		this.monetized = monetized;
	}
	public String getMonetized() {
		return monetized;
	}
	public void setNumberOfPosts(int numberofposts) {
		if(numberofposts>10)
			this.numberofposts = numberofposts;
	}
	public int getNumberOfPosts() {
		return numberofposts;
	}

}
