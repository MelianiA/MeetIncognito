package fr.esic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.esic.dao.PersonRepository;
import fr.esic.fr.esic.Person;

@SpringBootApplication
public class MeetIncognitoApplication implements CommandLineRunner {
	
	@Autowired 
	PersonRepository personRepo;

	public static void main(String[] args) {
		SpringApplication.run(MeetIncognitoApplication.class, args);
		System.out.println("Fin success");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement de meetIncognito ");
		
		Person p1 = new Person("06555655","Abdou");
		personRepo.save(new Person("5426","karim"));
 
		personRepo.save(p1);
		
		personRepo.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		
		
	}

}
