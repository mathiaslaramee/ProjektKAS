package application;

import java.util.ArrayList;

public class Hotel {
	
	private String hotelName;
	private double onePersonPrice;
	private double twoPersonPrice;
	private ArrayList<ExtraService> extraServices;
	private ArrayList<Participant> participants = new ArrayList<>();
	
	public Hotel(String hotelName, double twoPersonPrice, double onePersonPrice, ArrayList<ExtraService> list)
	{
		this.hotelName = hotelName;
		this.twoPersonPrice = twoPersonPrice;
		this.onePersonPrice = onePersonPrice;
		this.extraServices = list;
	}
	
	public ExtraService createService(double price, String name)
	{
		ExtraService service = new ExtraService(price, name);
		extraServices.add(service);
		
		return service;
	}
	
	public double totalHotelPrice()
	{
		return 0;
	}
	
	public void addParticipant(Participant participant)
	{
		participants.add(participant);
	}
	
	public void removeParticipant(Participant participant)
	{
		participants.remove(participant);
	}
	
	public void addService(ExtraService extraService)
	{
		extraServices.add(extraService);
	}
	
	public void removeService(ExtraService extraService)
	{
		extraServices.remove(extraService);
	}
	
	public ArrayList<ExtraService> getServices()
	{
		ArrayList<ExtraService> services2 = new ArrayList<>();
		return services2;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getOnePersonPrice() {
		return onePersonPrice;
	}

	public void setOnePersonPrice(double onePersonPrice) {
		this.onePersonPrice = onePersonPrice;
	}

	public double getTwoPersonPrice() {
		return twoPersonPrice;
	}

	public void setTwoPersonPrice(double twoPersonPrice) {
		this.twoPersonPrice = twoPersonPrice;
	}
	

}
