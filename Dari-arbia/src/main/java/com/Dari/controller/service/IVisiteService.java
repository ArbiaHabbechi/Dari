package com.Dari.controller.service;


import java.util.List;

import com.Dari.entities.Visite;


public interface IVisiteService {
	

	public Visite ajout_Visite(Visite vs);

	public List<Visite> getAllVisite();

	public void deleteVisiteById(Long id_visite);
	
	public Visite update_Visite(Visite vs);
	
	//public List<Visite> searchvisite(int user_id,String search);


}
	
	





