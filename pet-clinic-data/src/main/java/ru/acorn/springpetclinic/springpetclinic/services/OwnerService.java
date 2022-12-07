package ru.acorn.springpetclinic.springpetclinic.services;

import ru.acorn.springpetclinic.springpetclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
