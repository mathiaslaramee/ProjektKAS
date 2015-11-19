package application.service;

import java.time.LocalDate;
import java.util.ArrayList;

import application.model.Booking;
import application.model.CompanyPerson;
import application.model.Conference;
import application.model.Participant;
import application.model.Trip;

public class Service 
{
	
//------------------------------- Companion -------------------------------------
	public static void connectCompanionToTrip(Trip trip, Booking companion)
	{
		trip.addCompanion(companion);
		companion.setCompanion(trip);
	}

	
	public static void deleteCompanionFromTrip(Trip trip, Booking companion)
	{
		trip.removeCompanion(companion);
		companion.setCompanion(null);

	}
	
//------------------------------- Participants -------------------------------------
	public static Participant createParticiPant(String name, int age, String country, String city, int phonenumber)
	{
		Participant participant = new Participant(name, age, country, city, phonenumber);
		return participant;
	}
	
	public static void deleteParticiPantFromBooking(Participant participant, Booking booking)

	public static CompanyPerson createCompanyPerson(String name, int age, String country, String city, int phonenumber, String companyName)
	{
		CompanyPerson companyParticipant = new CompanyPerson(name, age, country, city, phonenumber, companyName);
		return companyParticipant;
		

	}

}
