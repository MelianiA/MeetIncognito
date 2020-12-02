package fr.esic.fr.esic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id @GeneratedValue
	private long id ;
	private String numero;
	private String nomComplet;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String numero, String nomComplet) {
		super();
		this.numero = numero;
		this.nomComplet = nomComplet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	@Override
	public String toString() {
		return "Person [numero=" + numero + ", nomComplet=" + nomComplet + "]";
	}
	
	

}
