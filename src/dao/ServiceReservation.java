package dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import meserreurs.MonException;
import metier.*;
import persistance.DialogueBd;

public class ServiceReservation {

	
	public List<Reservation> listerReservations() throws MonException{
		return get("select * from reservation");		
	}
	
	
	private List<Reservation> get(String request) throws MonException{
		List<Object> rs;
		List<Reservation> mesReservations = new ArrayList<Reservation>();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(request);
			ServiceAdherent unServiceAdherent = new ServiceAdherent();
			ServiceOeuvreVente unServiceOeuvreVente  = new ServiceOeuvreVente();
			int idAdherent;
			String idOeuvreVente;
			while (index < rs.size()) {
				Reservation uneReservation = new Reservation();
				idOeuvreVente = rs.get(index+0).toString();
				uneReservation.setOeuvreVente(unServiceOeuvreVente.consulterOeuvreVente(idOeuvreVente));
				idAdherent = Integer.parseInt(rs.get(index+1).toString());
				uneReservation.setAdherent(unServiceAdherent.consulterAdherent(idAdherent));
				uneReservation.setDate(Date.valueOf(rs.get(index+2).toString())); 
				uneReservation.setStatut(rs.get(index+3).toString());;
				index = index + 4;
				mesReservations.add(uneReservation);
			}
	
			return mesReservations;
		} catch (Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
		}		
	}

	
}
