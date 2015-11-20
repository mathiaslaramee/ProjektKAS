package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking 
{
	private boolean speaker;;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private Trip companion;
	private Conference conference;
	private Participant participant;
	private ArrayList<Trip> trips;

	public Booking(boolean speaker, LocalDate arrivalDate, LocalDate departureDate, Trip companion,
			Conference conference, Participant participant, ArrayList<Trip> trips) 
	{
		this.speaker = speaker;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.companion = companion;
		this.conference = conference;
		this.participant = participant;
		this.trips = trips;
	}
	public boolean isSpeaker() {
		return speaker;
	}
	
	public void addTrip(Trip trip)
	{
		trips.add(trip);
	}
	
	public void removeTrip(Trip trip)
	{
		trips.remove(trip);
	}
	
	public void setSpeaker(boolean speaker) {
		this.speaker = speaker;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public Trip getCompanion() {
		return companion;
	}
	public void setTrip(Trip companion) {
		this.companion = companion;
	}
	public Conference getConference() {
		return conference;
	}

	public Participant getParticipant() {
		return participant;
	}
	
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public ArrayList<Trip> getTrip() {
		ArrayList<Trip> trips2 = new ArrayList<>(trips);
		return trips2;
	}
	
	
	public double totalConferenceCost(Hotel hotel, double conferenceCost, boolean companion)
	{
		
		if(companion == true)
		{
			return this.getCompanion().getTripPrice() + hotel.getTwoPersonPrice() + this.conference.getConferenceCost();	
		}
		
		else if (this.speaker == true)
		{
			if(companion == true)
			{
				return hotel.getTwoPersonPrice();
			}
			
			return hotel.getOnePersonPrice();
		}
		
		else 
		{
			return hotel.getOnePersonPrice() + this.conference.getConferenceCost();
		}
		
	}


}