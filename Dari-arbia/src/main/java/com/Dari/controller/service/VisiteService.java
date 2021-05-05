package com.Dari.controller.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Dari.entities.Visite;
import com.Dari.repository.VisiteRep;


@Service
public class VisiteService implements IVisiteService {
@Autowired
VisiteRep visites;


     @Override
     public Visite ajout_Visite(Visite vs) {
	     // TODO Auto-generated method stub
	  return visites.save(vs);
	
     }


	@Override
	public List<Visite> getAllVisite() {
		return (List<Visite>) visites.findAll();
		
	}


	
	
	@Override
	public void deleteVisiteById(Long id_visite) {
		Visite vs =visites.findById(id_visite).orElse(null);
		visites.delete(vs);
		
	}


	
	@Override
	public Visite update_Visite(Visite vs){
		return visites.save(vs);
	}


	//@Override
	//public List<Visite> searchvisite(int user_id, String search) {
	//	return 	visites.Searchvisite(search);
	
		
	//}





}



	
