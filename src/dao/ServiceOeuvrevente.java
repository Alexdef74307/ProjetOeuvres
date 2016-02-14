package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;
import persistance.*;

public class ServiceOeuvreVente {



	
	

	public List<OeuvreVente> consulterListeOeuvresVentes() throws MonException {
		String mySql = "select * from oeuvrevente"; 	
		List<Object> rs;
		List<OeuvreVente> mesOeuvresVentes = new ArrayList<OeuvreVente>();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(mySql);
			ServiceProprietaire unServiceProprietaire = new ServiceProprietaire();
			String idProprietaire;
			while (index < rs.size()) {
				OeuvreVente uneOeuvreVente = new OeuvreVente();
				uneOeuvreVente.setIdOeuvreVente(Integer.parseInt(rs.get(+0).toString()));
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
	}
	public void supprimerOeuvreVente(String idOeuvreVente) throws MonException {
		String mysql = "delete from oeuvrevente where id_oeuvrevente = " + idOeuvreVente;
		supprimerOeuvresVentes(mysql);
	}
	
	private void supprimerOeuvresVentes(String mysql) throws MonException {
		try{
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			unDialogueBd.execute(mysql);
		}catch(Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
		}
		
	}



}



