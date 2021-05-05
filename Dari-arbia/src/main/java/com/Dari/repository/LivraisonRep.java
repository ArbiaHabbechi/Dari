package com.Dari.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Dari.entities.Livraison;


@Repository
public interface LivraisonRep extends CrudRepository<Livraison, Long> {

	
}



