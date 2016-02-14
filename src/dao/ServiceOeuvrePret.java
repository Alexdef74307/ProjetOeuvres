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
				uneOeuvrePret.setIdOeuvrePret(Integer.parseInt(rs.get(+0).toString()));
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
	/*public void supprimerOeuvreVente(String idOeuvreVente) throws MonException {
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
	
	
	
	}*/
}
