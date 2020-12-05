package fr.esic.dao;

import org.springframework.data.repository.CrudRepository;

import fr.esic.entities.Annonces;

public interface AnnoncesRepository extends CrudRepository<Annonces, Long> {

}
