package org.formation.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private double montant;
	private LocalDate dateOuverture;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="client_id")
	private Client client;
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Compte(double montant, LocalDate dateOuverture) {
		super();
		this.montant = montant;
		this.dateOuverture = dateOuverture;
	}
	public Compte() {
		super();
	}
	
	
	
	

}
