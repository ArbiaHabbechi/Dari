package com.Dari.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dari.controller.service.IVisiteService;
import com.Dari.entities.Visite;
import com.Dari.repository.VisiteRep;





@RestController
public class VisiteController {
	
	@Autowired
	IVisiteService visite;
	
	@Autowired
	VisiteRep rep;
	
	
	
	@GetMapping(value="/listofvisite")
	@ResponseBody
	public List<Visite> getAllVisite()  {
		return visite.getAllVisite();
	}
	
	@DeleteMapping("/delete_Visite/{id_visite}")
	public void  delete_Visite(@PathVariable("id_visite") Long id_visite) {
		
		 visite.deleteVisiteById(id_visite);
	
	}
	
	
	@PostMapping("/visites/addvisite")
	public Visite ajout_Visite(@RequestBody Visite vs)
	{
		System.out.println("visite ajouté");
		visite.ajout_Visite(vs);
		return vs;
		
	}
	
	@PutMapping("/updateVisite")
	public Visite update_Visite(@RequestBody Visite vs )
	{
		return visite.update_Visite(vs);
	}
	
	
	//@GetMapping("/searchvisite/{user_id}/{search}")
	//public List<Visite> searchvisite(@PathVariable("user_id") int user_id, @PathVariable String search) {

		//return visite.searchvisite(user_id, search);
	//}
	


}
