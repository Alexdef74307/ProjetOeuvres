package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;
import persistance.*;

public class ServiceOeuvrevente {



	
	

private List<Oeuvrevente> consulterListeOeuvresventes(String mysql) throws MonException {
	String mySql = "select * from oeuvrevente"; 	
	List<Object> rs;
	List<Oeuvrevente> mesOeuvrevente = new ArrayList<Oeuvrevente>();
	int index = 0;
	try {
		DialogueBd unDialogueBd = DialogueBd.getInstance();
		rs = DialogueBd.lecture(mySql);
		ServiceProprietaire unServiceProprietaire = new ServiceProprietaire();
		while (index < rs.size()) {
			Oeuvrevente uneOeuvrevente = new Oeuvrevente();
			
			/*unA.setIdAdherent(Integer.parseInt(rs.get(index + 0).toString()));
			unA.setNomAdherent(rs.get(index + 1).toString());
			unA.setPrenomAdherent(rs.get(index + 2).toString());
			unA.setVilleAdherent(rs.get(index + 3).toString());*/
			unServiceProprietaire.getProprietaire();
			// On incrémente tous les 3 champs
			index = index + 5;
			mesOeuvrevente.add(uneOeuvrevente);
		}

		return mesOeuvrevente;
	} catch (Exception exc) {
		throw new MonException(exc.getMessage(), "systeme");
	}
}



}



