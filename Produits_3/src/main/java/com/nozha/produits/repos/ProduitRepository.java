package com.nozha.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aziz.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}