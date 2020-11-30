package com.pharmacie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacie.dao.IPharma;
import com.pharmacie.entities.Pharma;

@RestController
public class PharmaService {
	@Autowired
	private IPharma pharmadao;
	
	@RequestMapping(value="/pharmacie", method = RequestMethod.GET)
	public List<Pharma> getAll(){
		return pharmadao.findAll();
	}
	
	@RequestMapping(value="/pharmacie/parnom", method = RequestMethod.GET)
	public List<Pharma> getAllPharmaByNom(@RequestParam String nom){
		return pharmadao.getAllPharmaByNom(nom);
	}
	
	@RequestMapping(value="/pharmacie/parville", method = RequestMethod.GET)
	public List<Pharma> getAllPharmaByVille(@RequestParam String ville){
		return pharmadao.getAllPharmaByVille(ville);
	}
	@RequestMapping(value="/pharmacie/parquartier", method = RequestMethod.GET)
	public List<Pharma> getAllPharmaByQuartier(@RequestParam String quartier){
		return pharmadao.getAllPharmaByQuartier(quartier);
	}
	
	@RequestMapping(value="/pharmacie/{save}", method = RequestMethod.POST)
	public List<Pharma> save(Pharma pharma){	
		pharmadao.save(pharma);
		return pharmadao.findAll();
	}
	
	@RequestMapping(value="/pharmacie/delete/{id}", method = RequestMethod.DELETE)
	public List<Pharma> delete(@PathVariable int id){
		if(pharmadao.getById(id) != null) {
		pharmadao.delete(pharmadao.getById(id));
		}
		return pharmadao.findAll();
	}
	
	@RequestMapping(value="/pharmacie/get", method = RequestMethod.GET)
	public Pharma get(@RequestParam int id){	
		return pharmadao.getById(id);
		
	}
	
	@RequestMapping(value="/pharmacie/update/{id}", method = RequestMethod.PUT)
	public List<Pharma> update(@PathVariable int id, Pharma pharma){	
		pharma.setId(id);
		pharmadao.save(pharma);
		return pharmadao.findAll();
		
	}
	
	
}
