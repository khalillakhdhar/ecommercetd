package com.hql.services;

import java.util.List;
import java.util.Optional;

import com.hql.entities.Produit;

public interface ProduitService {
public Produit saveProduit(Produit produit);
public List<Produit> getAllProduits();
public Optional<Produit> getProduitById(long id);
public Optional<List<Produit>> searchProduitByDescription(String desciption);
public Optional<List<Produit>> searchProduitByTitre(String titre);
public void deleteAllProduits();
public void deleteProduitById(long id);
public Optional<Produit> getProduitByPrixLT(long prix);
public Optional<Produit> getProduitByPrixGT(long prix);
public Optional<Produit> getProduitByPrixBT(long min,double max);
public Optional<Produit> getProduitByQuantiteLT(long prix);



}
