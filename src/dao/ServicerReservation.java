package dao;

import java.util.ArrayList;
import java.util.List;

import meserreurs.MonException;
import metier.*;
import persistance.DialogueBd;

public class ServicerReservation {

	
	
	private List<Reservation> get(String request) throws MonException{
		List<Object> rs;
		List<Reservation> mesReservation = new ArrayList<Reservation>();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(request);
			ServiceAdherent unServiceAdherent = new ServiceAdherent();
			ServiceOeuvreVente unServiceOeuvreVente  = new ServiceOeuvreVente();
			String idAdherent;
			String idOeuvreVente;
			while (index < rs.size()) {
				Reservation uneReservation = new Reservation();
				idOeuvreVente = rs.get(index+0).toString();
				uneReservation.setOeuvreVente(unServiceOeuvreVente.consulterOeuvreVente(idOeuvreVente));
				uneOeuvreVente.setTitreOeuvreVente(rs.get(index+1).toString());
				uneOeuvreVente.setEtatOeuvreVente(rs.get(index + 2).toString());
				uneOeuvreVente.setPrixOeuvreVente(Float.parseFloat(rs.get(index+3).toString()));
				idProprietaire = rs.get(index+4).toString();
				uneOeuvreVente.setProprietaire(unServiceProprietaire.getProprietaire(idProprietaire)); 
				index = index + 5;
				mesOeuvresVentes.add(uneOeuvreVente);
			}
	
			return mesOeuvresVentes;
		} catch (Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
		}
	
		return null;
	}

	
}
