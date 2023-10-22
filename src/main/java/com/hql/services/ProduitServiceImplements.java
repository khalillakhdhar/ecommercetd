package com.hql.services;

import java.util.List;
import java.util.Optional;

import com.hql.entities.Produit;

public class ProduitServiceImplements implements ProduitService {

	@Override
	public Produit saveProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produit> getProduitById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Produit>> searchProduitByDescription(String desciption) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Produit>> searchProduitByTitre(String titre) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteAllProduits() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduitById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Produit> getProduitByPrixLT(long prix) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Produit> getProduitByPrixGT(long prix) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Produit> getProduitByPrixBT(long min, double max) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Produit> getProduitByQuantiteLT(long prix) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
