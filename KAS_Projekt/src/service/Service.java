package service;

import application.Booking;
import application.Trip;

public class Service 
{
	
	public static void connectCompanionToTrip(Trip companions, String companion)
	{
		companions.addCompanion(companion);
		
	}
	

}
