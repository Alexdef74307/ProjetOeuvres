package metier;

import java.io.Serializable;


/**
 * The persistent class for the oeuvrepret database table.
 * 
 */

public class OeuvrePret implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idOeuvrePret;
	private String titreOeuvrePret;
	private Proprietaire proprietaire;

	
	public OeuvrePret(int idOeuvrepret, String titreOeuvrepret, Proprietaire proprietaire) {
		super();
		this.idOeuvrePret = idOeuvrepret;
		this.titreOeuvrePret = titreOeuvrepret;
		this.proprietaire = proprietaire;
	}

	public OeuvrePret() {
	}

	public int getIdOeuvrePret() {
		return this.idOeuvrePret;
	}

	public void setIdOeuvrePret(int idOeuvrepret) {
		this.idOeuvrePret = idOeuvrepret;
	}

	public String getTitreOeuvrePret() {
		return this.titreOeuvrePret;
	}

	public void setTitreOeuvrePret(String titreOeuvrepret) {
		this.titreOeuvrePret = titreOeuvrepret;
	}

	public Proprietaire getProprietaire() {
		return this.proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

}