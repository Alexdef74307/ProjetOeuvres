package dao;

import java.util.ArrayList;
import java.util.List;

import meserreurs.MonException;
import metier.*;
import persistance.*;

public class ServiceProprietaire {

public String getProprietaireName(){
	
	return null;
}	
	
public Proprietaire getProprietaire(String idProprietaire) throws MonException{
	List<Proprietaire> p = get("select * from proprietaire where id_proprietaire = " + idProprietaire);
	return p.get(0);
}

public List<Proprietaire> getProprietaires() throws MonException{
	return get("select * from proprietaire");
}


private List<Proprietaire> get(String requete) throws MonException
{
		List<Object> rs;
		List<Proprietaire> proprietaires = new ArrayList<Proprietaire>();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(requete);
			
			while (index < rs.size()) {
			 	Proprietaire unProprietaire = new Proprietaire();
				unProprietaire.setIdProprietaire(Integer.parseInt(rs.get(index+0).toString()));
				unProprietaire.setNomProprietaire(rs.get(index +1).toString());
				unProprietaire.setPrenomProprietaire(rs.get(index +2).toString());
				proprietaires.add(unProprietaire);
				index+=3;
				
			}
		} catch (Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
			}
	return proprietaires;
	// TODO Auto-generated method stub
	
}
public void supprimerProprietaire(String idProprietaire) throws MonException {
	String mysql = "delete from proprietaire where id_proprietaire = " + idProprietaire;
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
