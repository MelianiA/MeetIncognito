package fr.esic.dao;

import org.springframework.data.repository.CrudRepository; 

import fr.esic.fr.esic.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
