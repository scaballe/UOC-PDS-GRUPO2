package edu.uoc.mije.carsharing.integration;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="message")
public class MessageJPA implements Serializable{

	private static final long serialVersionUID = 1L;
	public MessageJPA(){
		super();
	}
	
	public MessageJPA(String subject, String body, DriverJPA driver, PassengerJPA passenger, TripJPA trip){		
		this.subject=subject;
		this.body=body;
		//this.driver=driver;
		//this.passenger=passenger;
		//this.trip=trip;
	}
	
	Integer id;
	String subject;	
	String body;
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	/*
	DriverJPA driver;
	public DriverJPA getDriver() {
		return driver;
	}
	public void setDriver(DriverJPA driver) {
		this.driver = driver;
	}
	
	PassengerJPA passenger;
	public PassengerJPA getPassenger() {
		return passenger;
	}
	public void setPassenger(PassengerJPA passenger) {
		this.passenger = passenger;
	}
	
	TripJPA trip;
	public TripJPA getTrip() {
		return trip;
	}
	public void setTrip(TripJPA trip) {
		this.trip = trip;
	}
*/
}