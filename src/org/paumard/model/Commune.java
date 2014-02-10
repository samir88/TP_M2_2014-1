package org.paumard.model;

public class Commune {

	private Long id ;
	
	private String nom ;
	
	private String codePostal ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Commune [id=" + id + ", nom=" + nom + ", codePostal="
				+ codePostal + "]";
	}
}
