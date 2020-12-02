package fr.esic.api;

import  fr.esic.fr.esic.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.esic.dao.PersonRepository;
 
@RestController
@CrossOrigin("*")
public class PersonRest {

	@Autowired
	PersonRepository personRepo;
	
	@GetMapping("/person")
 	public List<Person> getAllPerson(){
 		return (List<Person>)personRepo.findAll();
 	} 
	
	@PostMapping("person")
	public Person savePerson(@RequestBody Person p) {
		return personRepo.save(p);
	}
	
}
