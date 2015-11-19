package service;

import application.Booking;
import application.Trip;

public class Service 
{
	
	public static void connectCompanionToTrip(Trip trip, Booking companion)
	{
		trip.addCompanion(companion);
		companion.setCompanion(trip);
	}
	
	public static void deleteCompanionFromTrip(Trip trip, Booking companion)
	{
		trip.removeCompanion(companion);
		companion.setCompanio(null);
	}
	

}
