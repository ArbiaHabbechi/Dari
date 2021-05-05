package com.Dari.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dari.entities.Livraison;


@Repository
public interface LivraisonRepository  extends JpaRepository<Livraison, Long>{

}
