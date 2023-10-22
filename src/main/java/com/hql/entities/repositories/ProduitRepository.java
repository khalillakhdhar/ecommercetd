package com.hql.entities.repositories;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
Optional<List<Produit>> findByTitreContaining(String titre);
Optional<List<Produit>> findByDescriptionContaining(String description);
Optional<List<Produit>>  findByPrixGreaterThanEqual(double prix);
Optional<List<Produit>>  findByPrixLessThanEqual(double prix);
Optional<List<Produit>> findByPrixBetween(double prixmin,double prixmax);
Optional<List<Produit>> findByQuantiteLessThan(int quantite);

}
