package application;

public class CompanyPerson extends Participant {
	
	private String companyName;

	public CompanyPerson(String name, int age, String country, String city, int phonenumber, String companyName) {
		super(name, age, country, city, phonenumber);
		this.setCompanyName(companyName);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	
	
	
}