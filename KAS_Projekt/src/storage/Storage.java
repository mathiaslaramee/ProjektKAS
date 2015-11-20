package storage;

import java.util.ArrayList;

import application.model.Booking;
import application.model.Conference;
import application.model.ExtraService;
import application.model.Hotel;
import application.model.Participant;
import application.model.Trip;

public class Storage {
	
	private static ArrayList<Participant> participants = new ArrayList<>();
	private static ArrayList<Hotel> hotels = new ArrayList<>();
	private static ArrayList<Conference> conferences = new ArrayList<>();
	private static ArrayList<Booking> bookings = new ArrayList<>();
	private static ArrayList<ExtraService> services = new ArrayList<>();
	private static ArrayList<Trip> trips = new ArrayList<>();
	
	
	public static ArrayList<Trip> getTrips()
	{
		return new ArrayList<Trip>(trips);
	}
	
	public static void removeTrip(Trip trip)
	{
		trips.remove(trip);
	}
	
	public static void addTrip(Trip trip)
	{
		trips.add(trip);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------//
	
	public static ArrayList<ExtraService> getServices()
	{
		return new ArrayList<ExtraService>(services);
	}
	
	public static void removeService(ExtraService ExtraService)
	{
		services.remove(ExtraService);
	}
	
	public static void addService(ExtraService ExtraService)
	{
		services.add(ExtraService);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------//
	
	public static ArrayList<Booking> getBookings()
	{
		return new ArrayList<Booking>(bookings);
	}
	
	public static void removeBooking(Booking booking)
	{
		bookings.remove(booking);
	}
	
	public static void addBooking(Booking booking)
	{
		bookings.add(booking);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------//
	
	public static ArrayList<Participant> getParticipants()
	{
		return new ArrayList<Participant>(participants);
	}
	
	public static void removeParticipant(Participant participant)
	{
		participants.remove(participant);
	}
	
	public static void addParticipant(Participant participant)
	{
		participants.add(participant);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------//
	
	public static ArrayList<Hotel> getHotels()
	{
		return new ArrayList<Hotel>(hotels);
	}

	public static void removeHotel(Hotel hotel)
	{
		hotels.remove(hotel);
	}
	
	public static void addHotel(Hotel hotel)
	{
		hotels.add(hotel);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------//
	
	public static ArrayList<Conference> getConference()
	{
		return new ArrayList<Conference>(conferences);
	}
	
	public static void removeConference(Conference conference)
	{
		conferences.remove(conference);
	}
	
	public static void addConference(Conference conference)
	{
		conferences.add(conference);
	}
}
