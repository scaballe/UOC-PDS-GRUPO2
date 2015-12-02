package edu.uoc.mije.carsharing.jsf;

import java.sql.Time;

import java.util.Collection;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.Id;

import edu.uoc.mije.carsharing.business.comms.CommunicationFacadeRemote;
import edu.uoc.mije.carsharing.business.tripadmin.TripAdminFacadeRemote;
import edu.uoc.mije.carsharing.integration.CityJPA;
import edu.uoc.mije.carsharing.integration.PassengerJPA;
import edu.uoc.mije.carsharing.integration.TripJPA;

@ManagedBean(name = "findAllPassengers")
@RequestScoped

public class FindAllPassengersBean {
	
	@EJB
	TripAdminFacadeRemote tripadminRemote; 
	
		
	Collection <PassengerJPA> listPassengers;
	
	int idTrip;

	public int getIdTrip() {
		return idTrip;
	}
	public void setIdTrip(int idTrip) {
		this.idTrip = idTrip;
	}
	
	
	public Collection<PassengerJPA> findAllPassengers(int tripId) throws Exception{  
	
	
		//Logger.getLogger("carsharing").info("findAllPassengers"+idTrip);
	
		listPassengers = tripadminRemote.findAllPassengers(idTrip);	
				
		return listPassengers;
			
		
	}
			
	
}
