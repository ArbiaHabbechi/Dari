	package com.Dari.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;







@Entity
@Table(name="T_User")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@OneToOne(mappedBy="user")
	//private Visite visite;
	@OneToMany(mappedBy="user")
	private List <Commande> commandes;
	
	@OneToMany(mappedBy="user")
	private List <Livraison> livraisons;
	@Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @NonNull
	private String Email;
	
	private String Password;
	
	private String Phone;
	
	private boolean isActif;
    
    @Temporal(TemporalType.DATE)
    private Date date;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public User(Long id, String firstName, String lastName, Date date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date + "]";
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public String getPassword() {
		return Password;
	}




	public void setPassword(String password) {
		Password = password;
	}




	public String getPhone() {
		return Phone;
	}




	public void setPhone(String phone) {
		Phone = phone;
	}




	public boolean isActif() {
		return isActif;
	}




	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}
    
    
    
    
	
	

	
}
