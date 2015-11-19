package application;

import java.time.LocalDate;
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
	public ArrayList<Trip> getTrip() {
		ArrayList<Trip> trips2 = new ArrayList<>(trips);
		return trips2;
	}
	
	
	public double totalConferenceCost(Hotel hotel, Trip trips, double konferenceAfgift)
	{
		return 0;
	}

}