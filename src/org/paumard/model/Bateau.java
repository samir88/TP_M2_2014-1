package org.paumard.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bateau {

	private Long id ;
	
	private String nom ;
	
	private int tonnage ;
	
	private List<Marin> equipage ;
	
	
	public Bateau() {
		super();
	}

	public Bateau(String nom, int tonnage) {
		super();
		this.nom = nom;
		this.tonnage = tonnage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public void addMarin(Marin marin) {
		this.equipage.add(marin) ;
	}
	
	public void removeMarin(Marin marin) {
		this.equipage.remove(marin) ;
	}
	
	public Collection<Marin> getEquipage() {
		return new ArrayList<>(this.equipage) ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Bateau [id=" + id + ", nom=" + nom + ", tonnage=" + tonnage
				+ ", equipage=" + equipage + "]";
	}
}
