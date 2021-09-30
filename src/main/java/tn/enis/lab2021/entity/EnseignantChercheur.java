package tn.enis.lab2021.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre {

	private String grade;
	private String etablissment;

	public EnseignantChercheur() {
		// TODO Auto-generated constructor stub
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEtablissment() {
		return etablissment;
	}

	public void setEtablissment(String etablissment) {
		this.etablissment = etablissment;
	}

	
}
