package fr.esic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esic.dao.AnnoncesRepository;
import fr.esic.entities.Annonces;

@RestController @CrossOrigin("*")
public class AnnoncesRest {

	@Autowired
	private AnnoncesRepository annonceRepo;
	
	@PostMapping("/annonces")
	public Annonces saveAnnonce(@RequestBody Annonces a) {
		return annonceRepo.save(a);
	}
	
	@GetMapping("/annonces") 
	public List<Annonces> getAllAnnonces(){
		return (List<Annonces>)annonceRepo.findAll();
	}
}
