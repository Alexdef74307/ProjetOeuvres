package metier;

import java.io.Serializable;


/**
 * The persistent class for the oeuvrevente database table.
 * 
 */

public class OeuvreVente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idOeuvreVente;
	private String etatOeuvreVente;
	private float prixOeuvreVente;
	private String titreOeuvreVente;
	private Proprietaire proprietaire;


	public OeuvreVente(int idOeuvrevente, String etatOeuvrevente, float prixOeuvrevente, String titreOeuvrevente,
			Proprietaire proprietaire) {
		super();
		this.idOeuvreVente = idOeuvrevente;
		this.etatOeuvreVente = etatOeuvrevente;
		this.prixOeuvreVente = prixOeuvrevente;
		this.titreOeuvreVente = titreOeuvrevente;
		this.proprietaire = proprietaire;
	}

	public OeuvreVente() {
	}

	public int getIdOeuvreVente() {
		return this.idOeuvreVente;
	}

	public void setIdOeuvreVente(int idOeuvrevente) {
		this.idOeuvreVente = idOeuvrevente;
	}

	public String getEtatOeuvreVente() {
		return this.etatOeuvreVente;
	}

	public void setEtatOeuvreVente(String etatOeuvrevente) {
		this.etatOeuvreVente = etatOeuvrevente;
	}

	public float getPrixOeuvreVente() {
		return this.prixOeuvreVente;
	}

	public void setPrixOeuvreVente(float prixOeuvrevente) {
		this.prixOeuvreVente = prixOeuvrevente;
	}
	
	public String getTitreOeuvreVente() {
		return this.titreOeuvreVente;
	}

	public void setTitreOeuvreVente(String titreOeuvrevente) {
		this.titreOeuvreVente = titreOeuvrevente;
	}

	public Proprietaire getProprietaire() {
		return this.proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
}