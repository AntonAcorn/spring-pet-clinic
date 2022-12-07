package ru.acorn.springpetclinic.springpetclinic.services;

import ru.acorn.springpetclinic.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
