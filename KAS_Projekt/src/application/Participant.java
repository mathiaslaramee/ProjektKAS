package application;

public class Participant {

	
	 private String name;
	 private int age;
	 private String city;
	 private String country;
	 private int phoneNumber;
	 private Hotel hotel;
	 
	 private String asjsadhjsadjsdajksadkjsjak;
	 
	 public Participant(String name, int age, String country, String city, int phonenumber)
	 {
		 this.name = name;
		 this.age = age;
		 this.country = country;
		 this.city = city;
		 this.phoneNumber = phonenumber;
	 }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	 
	 
	
}