package com.Dari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dari.controller.service.ILivraisonService;
import com.Dari.controller.service.LivraisonService;
import com.Dari.entities.Livraison;

import com.Dari.repository.LivraisonRep;



@RestController
public class LivraisonController {
	

	@Autowired
	ILivraisonService livraisons;
	
	@Autowired
	LivraisonRep rep;
	
	@Autowired
    private LivraisonService service;
	

	@GetMapping(value="/listoflivraison")
	@ResponseBody
	public List<Livraison> getAllLivraison()  {
		return livraisons.getAllLivraison();
	}
	
	
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Livraison> listLivraisons = service.listAll();
	    model.addAttribute("listLivraisons", listLivraisons);
	     
	    return "index.xhtml";
	}
	
	

	@DeleteMapping("/delete_Livraison/{id_livraison}")
	public void  delete_Livraison(@PathVariable("id_livraison") Long id_livraison) {
		
		 livraisons.deleteLivraisonById(id_livraison);
	
	}
	
	
	@PostMapping("/livraisons/addlivraison")
	@ResponseBody
	public Livraison ajout_Livraison(@RequestBody Livraison lvr)
	{
		System.out.println("livraison ajouté");
		return livraisons.ajout_Livraison(lvr);
	
		
	}
	
	@PutMapping("/updateLivraison")
	public Livraison update_Livraison(@RequestBody Livraison lvr )
	{
		return livraisons.update_Livraison(lvr);
	}	
	
	
}
