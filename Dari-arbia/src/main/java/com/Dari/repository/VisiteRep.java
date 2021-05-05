package com.Dari.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.Dari.entities.Visite;


@Repository
public interface VisiteRep extends CrudRepository<Visite, Long>  {

	List<Visite> findAll = null;

	

	//@Query("SELECT m FROM Visite m WHERE m.addresse LIKE %:search% OR m.date LIKE %:search% ")
	//List<Visite> Searchvisite(@Param("search") String search);

	
	
	


	
}


