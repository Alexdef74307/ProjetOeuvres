package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;
import persistance.*;

public class ServiceOeuvrevente {



	
	

public List<Oeuvrevente> consulterListeOeuvresventes() throws MonException {
	String mySql = "select * from oeuvrevente"; 	
	List<Object> rs;
	List<Oeuvrevente> mesOeuvrevente = new ArrayList<Oeuvrevente>();
	int index = 0;
	try {
		DialogueBd unDialogueBd = DialogueBd.getInstance();
		rs = DialogueBd.lecture(mySql);
		ServiceProprietaire unServiceProprietaire = new ServiceProprietaire();
		String idProprietaire;
		while (index < rs.size()) {
			Oeuvrevente uneOeuvreVente = new Oeuvrevente();
			uneOeuvreVente.setIdOeuvrevente(Integer.parseInt(rs.get(+0).toString()));
			uneOeuvreVente.setTitreOeuvrevente(rs.get(index+1).toString());
			uneOeuvreVente.setEtatOeuvrevente(rs.get(index + 2).toString());
			uneOeuvreVente.setPrixOeuvrevente(Float.parseFloat(rs.get(index+3).toString()));
			idProprietaire = rs.get(index+4).toString();
			uneOeuvreVente.setProprietaire(unServiceProprietaire.getProprietaire(idProprietaire)); 
			index = index + 5;
			mesOeuvrevente.add(uneOeuvreVente);
		}

		return mesOeuvrevente;
	} catch (Exception exc) {
		throw new MonException(exc.getMessage(), "systeme");
	}
}



}



