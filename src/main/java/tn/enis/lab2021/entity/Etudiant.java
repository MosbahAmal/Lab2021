package tn.enis.lab2021.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Membre {

	private Date dateInscription;
	private String diplome;

	@ManyToOne
	private EnseignantChercheur encadrant;

	public Etudiant() {
	}

	public Etudiant(Date dateInscription, String diplome) {
		super();
		this.dateInscription = dateInscription;
		this.diplome = diplome;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	@Override
	public String toString() {
		return "Etudiant [dateInscription=" + dateInscription + ", diplome=" + diplome + "]";
	}

}
