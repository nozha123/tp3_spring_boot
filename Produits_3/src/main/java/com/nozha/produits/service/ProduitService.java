package com.aziz.produits.service;

import java.util.*;

import org.springframework.data.domain.Page;

import com.aziz.produits.entities.Produit;
public interface ProduitService {
Produit saveProduit(Produit p);
Produit updateProduit(Produit p);
void deleteProduit(Produit p);
 void deleteProduitById(Long id);
Produit getProduit(Long id);
List<Produit> getAllProduits();
Page<Produit> getAllProduitsParPage(int page, int size);

}