package org.paumard.model;

public class Address {

	private String libelle ;
	
	private Commune commune ;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}

	@Override
	public String toString() {
		return "Address [libelle=" + libelle + ", commune=" + commune + "]";
	}
}


//guyguihjkhu