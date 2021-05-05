package com.Dari.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dari.entities.Livraison;

import com.Dari.repository.LivraisonRep;
import com.Dari.repository.LivraisonRepository;

@Service
public class LivraisonService implements ILivraisonService {
@Autowired
	LivraisonRep livraisons;

@Autowired
  private LivraisonRepository repository;

	@Override
	public Livraison ajout_Livraison(Livraison lvr) {
		// TODO Auto-generated method stub
		 return livraisons.save(lvr);
	}

	@Override
	public List<Livraison> getAllLivraison() {
		// TODO Auto-generated method stub
		return (List<Livraison>) livraisons.findAll();
	}

	@Override
	public void deleteLivraisonById(Long id_livraison) {
		// TODO Auto-generated method stub
		Livraison lvr =livraisons.findById(id_livraison).orElse(null);
		livraisons.delete(lvr);
		
	}

	@Override
	public Livraison update_Livraison(Livraison lvr) {
		// TODO Auto-generated method stub
		return livraisons.save(lvr);
	}
	
	//##############################################
	     
	    public List<Livraison> listAll() {
	        return repository.findAll();
	    }
	     
	    public void save(Livraison livraison) {
	    
	        repository.save(livraison);
	      }
	       
	      public Livraison get(long id) {
	          return repository.findById(id).get();
	      }
	       
	      public void delete(long id) {
	          repository.deleteById(id);
	      }

}
