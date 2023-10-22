package com.hql.entities.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Commande;
import com.hql.entities.Client;
import com.hql.entities.Produit;
import java.util.Date;




public interface CommandeRepository extends JpaRepository<Commande, Long> {
List<Commande> findByClients(Client clients);
List<Commande> findByProduits(Produit produits);
List<Commande> findByDateCreation(Date dateCreation);
List<Commande> findByQuantiteGreaterThan(int quantite);
}
