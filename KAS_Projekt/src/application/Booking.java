package application;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking 
{
	private boolean foredragsholder;
	private LocalDate ankomstDato;
	private LocalDate afrejseDato;
	private String ledsager;
	private Conference conference;
	private Participant participant;
	private ArrayList<Udflugt> udflugt;
	
	
	
	public Booking(boolean foredragsholder, LocalDate ankomstDato, LocalDate afrejseDato, String ledsager,
			Conference conference, Participant participant, ArrayList<Udflugt> udflugt) 
	{
		this.foredragsholder = foredragsholder;
		this.ankomstDato = ankomstDato;
		this.afrejseDato = afrejseDato;
		this.ledsager = ledsager;
		this.conference = conference;
		this.participant = participant;
		this.udflugt = udflugt;
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

	public String getLedsager() {
		return ledsager;
	}
	public void setLedsager(String ledsager) {
		this.ledsager = ledsager;
	}
	public Conference getConference() {
		return conference;
	}

	public Participant getParticipant() {
		return participant;
	}
	public ArrayList<Udflugt> getUdflugt() {
		return udflugt;
	}
	
	public double beregnTotalAfgift(Hotel hotel, Udflugt udflugt, double konferenceAfgift)
	{
		
	}

}
