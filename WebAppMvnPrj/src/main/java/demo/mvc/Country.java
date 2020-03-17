package demo.mvc;

public class Country {
	String name;
	String climate;
	public Country(String name, String climate) {
		super();
		this.name = name;
		this.climate = climate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	
}
