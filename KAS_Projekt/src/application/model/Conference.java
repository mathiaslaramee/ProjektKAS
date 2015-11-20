package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Conference {
	
	private String conferenceName;
	private String address;
	private double conferenceCost;
	private ArrayList<Hotel> hotels = new ArrayList<>();
	private ArrayList<Trip> trips = new ArrayList<>();
	private ArrayList<Booking> bookings = new ArrayList<>();
	
	public Conference(String name, String address)
	{
		this.conferenceName = name;
		this.address = address;
	}
	
	public Booking createBooking(boolean speaker, LocalDate arrivalDate, LocalDate departureDate, Trip companion,
			Conference conference, Participant participant, ArrayList<Trip> trips)
	{
		Booking booking = new Booking(speaker, arrivalDate, departureDate, companion, conference, participant, trips);
		bookings.add(booking);
		
		return booking;
	}
	
	public void deleteBooking(Booking booking)
	{
		bookings.remove(booking);
	}
	
	public ArrayList<Booking> getBookings()
	{
		return new ArrayList<Booking>(bookings);
	}
	
	public Trip createTrip(String tripName, String place, double tripePrice, LocalDate dateForTrip,
			ArrayList<Booking> companion)
	{
		Trip trip = new Trip(tripName, place, tripePrice, dateForTrip, companion);
		trips.add(trip);
		
		return trip;
	}
	
	public void deleteTrip(Trip trip)
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
		return address;
	}
	
	public void setAdress(String address) 
	{
		this.address = address;
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
