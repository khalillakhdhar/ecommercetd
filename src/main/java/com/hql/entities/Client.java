package com.hql.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Client extends AuditModel implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Column(nullable = false)
@NotBlank
private String nom,prenom,tel,adresse;
@Min(value = 16)
private int age;
@Enumerated(EnumType.STRING)
private Genre genre;
@Enumerated(EnumType.STRING)
private Grade grade;
@Column(nullable = false)
private String password;
@Email
@Column(unique = true)
private String email;

@JsonBackReference
@ManyToMany(mappedBy = "clients")
private Set<Commande> commandes=new HashSet<Commande>();

}
