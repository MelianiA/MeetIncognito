package fr.esic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Annonces {

	@Id @GeneratedValue
	private long id;
	private String contenue;
	
	@ManyToOne
	private Person person;
	
	
	public Annonces() {
		// TODO Auto-generated constructor stub
	}


	public Annonces(String contenue, Person person) {
		super();
		this.contenue = contenue;
		this.person = person;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getContenue() {
		return contenue;
	}


	public void setContenue(String contenue) {
		this.contenue = contenue;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
