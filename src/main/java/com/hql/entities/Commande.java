package com.hql.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Commande extends AuditModel implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@ManyToMany
@JsonManagedReference 
//les commandes sont gérer depuis l'objet dominant produits
private List<Produit> produits=new ArrayList<Produit>();
@ManyToMany
@JsonManagedReference
private List<Client> clients=new ArrayList<Client>();
@Min(value = 1)
private int quantite;
}
