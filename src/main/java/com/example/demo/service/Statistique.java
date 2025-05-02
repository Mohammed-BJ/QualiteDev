package com.example.demo.service;

import com.example.demo.data.Voiture;

public interface Statistique {

    public void ajouter(Voiture voiture);

    /**
     * Calcul d'un prix dégressif en fonction du nombre de voitures :
     * 5% de remise supplémentaire sur chaque voiture à chaque fois que 5 voitures sont ajoutées
     * et une remise maxi de 20 000 euros.
     * @return le prix des voitures
     * @throws ArithmeticException s'il n'y a pas de voiture
     */
    public int prix() throws ArithmeticException;

}