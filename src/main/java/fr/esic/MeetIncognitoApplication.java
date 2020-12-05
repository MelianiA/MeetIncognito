package fr.esic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.esic.dao.AnnoncesRepository;
import fr.esic.dao.PersonRepository;
import fr.esic.entities.Annonces;
import  fr.esic.entities.Person;

@SpringBootApplication
public class MeetIncognitoApplication implements CommandLineRunner {
	
	@Autowired 
	private PersonRepository personRepo;
	@Autowired
	private AnnoncesRepository annonceRepo;

	public static void main(String[] args) {
		SpringApplication.run(MeetIncognitoApplication.class, args);
		System.out.println("Fin success");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Lancement de meetIncognito ");
		
		Person p1 = new Person("06555655","Abdou");
		Person p2 = new Person("5426","karim");
		personRepo.save(p2 );
 
		personRepo.save(p1);
		
		personRepo.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		
		Annonces a1 = new Annonces("Cherche sérieux",p1);
		Annonces a2 = new Annonces("Je suis la",p2);

		annonceRepo.save(a1); 
		annonceRepo.save(a2); 

	}

}
