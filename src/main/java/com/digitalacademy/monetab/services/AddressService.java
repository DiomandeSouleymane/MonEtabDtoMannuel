package com.digitalacademy.monetab.services;

import com.digitalacademy.monetab.models.Adresse;

import java.util.List;
import java.util.Optional;
public interface AdresseService {

    Adresse save(Adresse adress);
    Optional<Adresse> update(Adresse adress);
    Optional<Adresse> findOne(Long id);
    List<Adresse> findAll();
    void delete(Long id);
}
