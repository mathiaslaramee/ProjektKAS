package application;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trip 
{
	private String tripName;
	private String place;
	private double tripPrice;
	private LocalDate dateForTrip;
	private ArrayList<Booking> companions;
	
	public Trip(String tripName, String place, double tripePrice, LocalDate dateForTrip,
			ArrayList<Booking> companion) {
		this.tripName = tripName;
		this.place = place;
		this.tripPrice = tripePrice;
		this.dateForTrip = dateForTrip;
		this.companions = new ArrayList<>();
	}
	
	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getTripPrice() {
		return tripPrice;
	}

	public void setTripPrice(double tripPrice) {
		this.tripPrice = tripPrice;
	}

	public LocalDate getDateForTrip() {
		return dateForTrip;
	}

	public void setDateForTrip(LocalDate dateForTrip) {
		this.dateForTrip = dateForTrip;
	}

	public ArrayList<Booking> getCompanion() {
		return new ArrayList<>(companions); 
	}
	
	public void addCompanion(Booking companion) {
		companions.add(companion);
	}
	
	public void removeCompanion(Booking companion) {
		companions.remove(companion);
	}
	

	

}
