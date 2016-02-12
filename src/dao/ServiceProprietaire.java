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
	


public Proprietaire getProprietaire(String idProprietaire) throws MonException
{
		List<Object> rs;
		String mySql = "select * from proprietaire where id_proprietaire = " + idProprietaire;
		Proprietaire unProprietaire = new Proprietaire();
		int index = 0;
		try {
			DialogueBd unDialogueBd = DialogueBd.getInstance();
			rs = DialogueBd.lecture(mySql);
			
			while (index < rs.size()) {
				
				unProprietaire.setIdProprietaire(Integer.parseInt(rs.get(index+0).toString()));
				unProprietaire.setNomProprietaire(rs.get(index +1).toString());
				unProprietaire.setPrenomProprietaire(rs.get(index +2).toString());
				index+=3;
				
			}
		} catch (Exception exc) {
			throw new MonException(exc.getMessage(), "systeme");
			}
	return unProprietaire;
	// TODO Auto-generated method stub
	
}
	
	
}
