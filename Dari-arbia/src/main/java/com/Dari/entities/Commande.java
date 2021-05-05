package com.Dari.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;



@Entity
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ref;
	@OneToOne(mappedBy="commande")
private Livraison livraison;
	@ManyToOne
private User user;
    private String livraisonStatus;
    private boolean paymentStatus;
    private boolean adminStatus;
    private float totalPrice;
    
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Commande(Long id, String ref,  String livraisonStatus, boolean paymentStatus,
			boolean adminStatus, float totalPrice) {
		super();
		this.id = id;
		this.ref = ref;
	
	
		this.livraisonStatus = livraisonStatus;
		this.paymentStatus = paymentStatus;
		this.adminStatus = adminStatus;
		this.totalPrice = totalPrice;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public String getLivraisonStatus() {
		return livraisonStatus;
	}
	public void setLivraisonStatus(String livraisonStatus) {
		this.livraisonStatus = livraisonStatus;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public boolean isAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(boolean adminStatus) {
		this.adminStatus = adminStatus;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

    
    
}

