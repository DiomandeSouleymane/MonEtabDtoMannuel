package com.digitalacademy.monetab.services.impl;

import com.digitalacademy.monetab.models.Adresse;
import com.digitalacademy.monetab.repositories.AdresseRepository;
import com.digitalacademy.monetab.services.AdresseService;

import java.util.List;
import java.util.Optional;


public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    @Override
    public Adresse save(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Optional<Adresse> update(Adresse adress) {
        return Optional.empty();
    }

    @Override
    public Optional<Adresse> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Adresse> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
