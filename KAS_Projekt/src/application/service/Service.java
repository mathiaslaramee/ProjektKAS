package application.service;

import java.util.ArrayList;

import application.model.Booking;
import application.model.CompanyPerson;
import application.model.Conference;
import application.model.ExtraService;
import application.model.Hotel;
import application.model.Participant;
import application.model.Trip;
import storage.Storage;

public class Service 
{
	
//------------------------------- Companion -------------------------------------
	public static void connectCompanionToTrip(Trip trip, Booking companion)
	{
		trip.addCompanion(companion);
		companion.setTrip(trip);
	} 

	
	public static void deleteCompanionFromTrip(Trip trip, Booking companion)
	{
		trip.removeCompanion(companion);
		companion.setTrip(null);
	}
	
//------------------------------- Participants -------------------------------------
	public static Participant createParticiPant(String name, int age, String country, String city, int phonenumber)
	{
		Participant participant = new Participant(name, age, country, city, phonenumber);
		Storage.addParticipant(participant);
		return participant;
	}
	
	public static void deleteParticipant(Participant participant)
	{
		for(Booking booking: Storage.getBookings())
		{
			booking.setParticipant(null);
		}
	}
	
	public static ArrayList<Participant> getParticipant()
	{
		return Storage.getParticipants();
	}
	
	public static void updateParticipant(Participant participant, String name, int age, String country, String city, int phonenumber)
	{
		participant.setName(name);
		participant.setAge(age);
		participant.setCountry(country);
		participant.setCity(city);
		participant.setPhoneNumber(phonenumber);
	}
	
	public static void removeParticiPantFromBooking(Participant participant, Booking booking)
	{
		if(participant != null)
		{
			booking.setParticipant(null);
		}
	}

	public static CompanyPerson createCompanyPerson(String name, int age, String country, String city, int phonenumber, String companyName)
	{
		CompanyPerson companyParticipant = new CompanyPerson(name, age, country, city, phonenumber, companyName);
		return companyParticipant;

	}
	
	public static ArrayList<Booking> getBookings()
	{
		return Storage.getBookings();
	}
	
//------------------------------- Conference -------------------------------------
	
	public static Conference createConference(String name, String address)
	{
		Conference conference = new Conference(name, address);
		Storage.addConference(conference);
		return conference;
	}
	
	public static ArrayList<Conference> getConferences()
	{
		return Storage.getConference();
	}
	
	public static void updateConference(Conference conference, String name, String address)
	{
		conference.setAdress(address);
		conference.setConferenceName(name);
	}
	
	public static void deleteConferene(Conference conference)
	{
		Storage.removeConference(conference);
	}
	
//------------------------------- Hotels -------------------------------------	
	
	public static Hotel createHotel(String hotelName, double twoPersonPrice, double onePersonPrice, ArrayList<ExtraService> list)
	{
		Hotel hotel = new Hotel(hotelName, twoPersonPrice, onePersonPrice, list);
		Storage.addHotel(hotel);
		return hotel;
	}
	
	public static ArrayList<Hotel> getHotels()
	{
		return Storage.getHotels();
	}
	
	public void connectParticipantToHotel(Hotel hotel, Participant participant)
	{
		Hotel oldHotel = participant.getHotel();
		if(oldHotel != null)
		{
			oldHotel.removeParticipant(participant);
		}
		participant.setHotel(hotel);
		hotel.addParticipant(participant);
		
	}
	
	public void removeParticipantFromHotel(Participant participant)
	{
		Hotel hotel = participant.getHotel();
		if(hotel != null)
		{
			hotel.removeParticipant(participant);
			participant.setHotel(null);
		}
		
	}
	

}
