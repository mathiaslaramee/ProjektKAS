package application;

import java.util.ArrayList;

public class Conference {
	
	private String conferenceName;
	private String adress;
	private double conferenceCost;
	private ArrayList<Hotel> hotels = new ArrayList<>();
	private ArrayList<Trip> trips = new ArrayList<>();
	private ArrayList<Booking> bookings = new ArrayList<>();
	
	public void addBooking(Booking booking)
	{
		bookings.add(booking);
	}
	
	public void removeBooking(Booking booking)
	{
		bookings.remove(booking);
	}
	
	public ArrayList<Booking> getBookings()
	{
		return new ArrayList<Booking>(bookings);
	}
	
	public void addTrip(Trip trip)
	{
		trips.add(trip);
	}
	
	public void removeTrip(Trip trip)
	{
		trips.remove(trip);
	}
	
	public ArrayList<Trip> getTrips()
	{
		return new ArrayList<Trip>(trips);
	}
	
	public void addHotel(Hotel hotel)
	{
		hotels.add(hotel);
	}
	
	public void removeHotel(Hotel hotel)
	{
		hotels.remove(hotel);
	}
	
	public ArrayList<Hotel> getHotels()
	{
		return new ArrayList<Hotel>(hotels);
	}
	
	public String getConferenceName() 
	{
		return conferenceName;
	}
	
	public void setConferenceName(String conferenceName)
	{
		this.conferenceName = conferenceName;
	}
	
	public String getAdress() 
	{
		return adress;
	}
	
	public void setAdress(String adress) 
	{
		this.adress = adress;
	}
	
	public double getConferenceCost() 
	{
		return conferenceCost;
	}
	
	public void setConferenceCost(double conferenceCost) 
	{
		this.conferenceCost = conferenceCost;
	}
	
	
	

}
