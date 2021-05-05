package com.Dari.controller.service;

import java.util.List;

import com.Dari.entities.Livraison;

public interface ILivraisonService {
	
	public Livraison ajout_Livraison(Livraison lvr);

	public List<Livraison> getAllLivraison();

	public void deleteLivraisonById(Long id_livraison);
	
	public Livraison update_Livraison(Livraison lvr);
	

}
