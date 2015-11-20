package application.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Booking 
{
	private boolean speaker;;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private String companion;
	private Conference conference;
	private Participant participant;
	private ArrayList<Trip> trips;

	public Booking(boolean speaker, LocalDate arrivalDate, LocalDate departureDate, String companion,
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

	public String getCompanion() {
		return companion;
	}
	public void setCompanion(String companion) {
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
	public ArrayList<Trip> getTrips() {
		ArrayList<Trip> trips2 = new ArrayList<>(trips);
		return trips2;
	}
	
	
	public double totalConferenceCost(Hotel hotel, double conferenceCost, boolean companion)
	{
		
		long daysBetween = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		
		if(companion)
		{
			int sum = 0;
			for(int i = 0; i < this.getTrips().size(); i++)
			{
				sum += getTrips().get(i).getTripPrice();
			}
			
			return (hotel.getTwoPersonPrice() * daysBetween) + 
					(this.conference.getConferenceCost() * daysBetween) + sum;
			
		}
		
		else if (this.speaker == true)
		{
			if(companion == true)
			{
				return hotel.getTwoPersonPrice() * daysBetween;
			}
			
			return hotel.getOnePersonPrice() * daysBetween;
		}
		
		else 
		{
			return (hotel.getOnePersonPrice() * daysBetween) + (this.conference.getConferenceCost() * daysBetween);
		}
		
	}


}