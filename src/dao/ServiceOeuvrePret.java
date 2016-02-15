package dao;

import java.util.ArrayList;
import java.util.List;

import meserreurs.MonException;
import metier.*;
import persistance.DialogueBd;

public class ServiceOeuvrePret {
	
	

	public List<OeuvrePret> consulterListeOeuvresPrets() throws MonException {
		String mySql = "select * from oeuvrepret"; 	
		List<Object> rs;
		List<OeuvrePret> mesOeuvresPrets = new ArrayList<OeuvrePret>();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(mySql);
			ServiceProprietaire unServiceProprietaire = new ServiceProprietaire();
			String idProprietaire;
			while (index < rs.size()) {
				OeuvrePret uneOeuvrePret = new OeuvrePret();
				uneOeuvrePret.setIdOeuvrePret(Integer.parseInt(rs.get(index+0).toString()));
				uneOeuvrePret.setTitreOeuvrePret(rs.get(index+1).toString());
				idProprietaire = rs.get(index+2).toString();
				uneOeuvrePret.setProprietaire(unServiceProprietaire.getProprietaire(idProprietaire)); 
				index = index + 3;
				mesOeuvresPrets.add(uneOeuvrePret);
			}
	
			return mesOeuvresPrets;
		} catch (Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
		}
	}
	
	
	public void supprimerOeuvrePret(String idOeuvrePret) throws MonException {
		String mysql = "delete from oeuvrepret where id_oeuvrepret = " + idOeuvrePret;
		delete(mysql);
	}
	
	private void delete(String mysql) throws MonException {
		try{
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			unDialogueBd.execute(mysql);
		}catch(Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
		}
	
	
	
	}
}
