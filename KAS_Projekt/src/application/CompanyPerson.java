package application;

public class CompanyPerson extends Participant {
	
	private String companyName;

	public CompanyPerson(String name, int age, String country, String city, int phonenumber, String companyName) {
		super(name, age, country, city, phonenumber);
		this.companyName = companyName;
	}

	
	
	
	
}