package ru.acorn.springpetclinic.springpetclinic.services;

import ru.acorn.springpetclinic.springpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
