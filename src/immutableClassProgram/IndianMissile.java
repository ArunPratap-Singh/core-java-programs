package immutableClassProgram;

public final class IndianMissile {
	
	private final String name;
	private final String type;
	private final String developedBy;
	private final double range;
	private final double speed;
	private final String country;
	
	IndianMissile(String name, String type, String developedBy, double range, double speed, String country){
		
		this.name = name;
		this.type = type;
		this.developedBy = developedBy;
		this.range = range;
		this.speed = speed;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getDevelopedBy() {
		return developedBy;
	}
	
	public double getRange() {
		return range;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public String getCountry() {
		return country;
	}
	
	

}
