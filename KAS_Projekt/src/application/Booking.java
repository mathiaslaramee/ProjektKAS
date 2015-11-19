package application;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking 
{
	private boolean foredragsholder;
	private LocalDate ankomstDato;
	private LocalDate afrejseDato;
	private String companions;
	private Conference conference;
	private Participant participant;
	private ArrayList<Trip> trips;
	
	
	public Booking(boolean foredragsholder, LocalDate ankomstDato, LocalDate afrejseDato, String companion,
			Conference conference, Participant participant, ArrayList<Trip> trips) 
	{
		this.foredragsholder = foredragsholder;
		this.ankomstDato = ankomstDato;
		this.afrejseDato = afrejseDato;
		this.companions = companion;
		this.conference = conference;
		this.participant = participant;
		this.trips = trips;
	}
	public boolean isForedragsholder() {
		return foredragsholder;
	}
	public void setForedragsholder(boolean foredragsholder) {
		this.foredragsholder = foredragsholder;
	}
	public LocalDate getAnkomstDato() {
		return ankomstDato;
	}

	public LocalDate getAfrejseDato() {
		return afrejseDato;
	}

	public String getCompanion() {
		return companions;
	}
	public void setCompanion(String ledsager) {
		this.companions = ledsager;
	}
	public Conference getConference() {
		return conference;
	}

	public Participant getParticipant() {
		return participant;
	}
	public ArrayList<Trip> getUdflugt() {
		ArrayList<Trip> trips2 = new ArrayList<>(trips);
		return trips2;
	}
	
	public double beregnTotalAfgift(Hotel hotel, Trip trips, double konferenceAfgift)
	{
		return 0;
	}

}
