package com.pharmacie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pharmacie.entities.Pharma;

@Repository
public interface IPharma extends JpaRepository<Pharma, Integer>{

	@Query("select p from Pharma p where p.nom = :nom")	
	public List<Pharma> getAllPharmaByNom(@Param("nom") String nom);

	@Query("select p from Pharma p where p.ville = :ville")
	public List<Pharma> getAllPharmaByVille(@Param("ville") String ville);

	@Query("select p from Pharma p where p.quartier = :quartier")
	public List<Pharma> getAllPharmaByQuartier(@Param("quartier") String quartier);
	
	@Query("select p from Pharma p where p.id = :id")
	public Pharma getById(@Param("id") int id);
	
}
