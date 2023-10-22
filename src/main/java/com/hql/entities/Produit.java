package com.hql.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Produit extends AuditModel {
	@Column(nullable = false)
	private String titre,photo,description;
	@Column(name = "code_barre")
	private String codeBarre;
	@JsonBackReference
	// pour éviter la boucle infinie et faire la sérialisation (puisque le produit vient avant la commande)
	@ManyToMany(mappedBy = "produits")
	private Set<Commande> commandes=new HashSet<Commande>();

}
