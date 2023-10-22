package com.hql.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Produit extends AuditModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	private String titre,photo,description;
	@Column(name = "code_barre")
	private String codeBarre;
	@Min(value = 0)
	private double prix;
	@Min(value = 0)
	private int quantite;
	@JsonBackReference
	// pour éviter la boucle infinie et faire la sérialisation (puisque le produit vient avant la commande)
	@ManyToMany(mappedBy = "produits")
	private Set<Commande> commandes=new HashSet<Commande>();

}
