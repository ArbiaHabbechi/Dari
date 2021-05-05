package com.Dari.entities;


	import java.io.Serializable;
	import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;




	@Entity
	@Table(name="visite")
	public class Visite implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		
	    @Column(name="addresse")
		private String addresse;
		
		@Temporal(TemporalType.DATE)
	    private Date date;
	

		public Visite() {
			super();
			// TODO Auto-generated constructor stub
		}


		


		
		

		@Override
		public String toString() {
			return "Visite [id=" + id + ", addresse=" + addresse + ", date=" + date + "]";
		}








		public Visite(Long id, String addresse, Date date) {
			super();
			this.id = id;
			this.addresse = addresse;
			this.date = date;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		//public User getUser() {
		//	return user;
		//}


		//public void setUser(User user) {
			//this.user = user;
		//}


		public String getAddresse() {
			return addresse;
		}


		public void setAddresse(String addresse) {
			this.addresse = addresse;
		}


		

		


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}



		

	}
	
