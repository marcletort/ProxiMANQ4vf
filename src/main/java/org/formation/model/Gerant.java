package org.formation.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
public class Gerant extends Banquier{
	
	@OneToMany(mappedBy="gerant", cascade={CascadeType.PERSIST})
	private List<Conseiller> listConseillers= new ArrayList<Conseiller>();

	public List<Conseiller> getListConseillers() {
		return listConseillers;
	}

	public void setListConseillers(List<Conseiller> listConseillers) {
		this.listConseillers = listConseillers;
	}

	

	public Gerant(String nom, String prenom, String login, String motDePasse, List<Conseiller> listConseillers) {
		super(nom, prenom, login, motDePasse);
		this.listConseillers = listConseillers;
	}

	public Gerant() {

	}

	
	
	
	

}
