package application.model;

public class ExtraService {
	
	private double price;
	private String name;
	
	public ExtraService(double price, String name)
	{
		this.setPrice(price);
		this.setName(name);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
