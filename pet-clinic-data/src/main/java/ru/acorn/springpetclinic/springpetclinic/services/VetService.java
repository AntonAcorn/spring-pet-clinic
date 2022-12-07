package ru.acorn.springpetclinic.springpetclinic.services;

import ru.acorn.springpetclinic.springpetclinic.model.Owner;
import ru.acorn.springpetclinic.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
