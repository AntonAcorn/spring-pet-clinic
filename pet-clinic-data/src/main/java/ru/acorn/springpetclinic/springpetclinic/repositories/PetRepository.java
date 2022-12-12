package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.acorn.springpetclinic.springpetclinic.model.Pet;


public interface PetRepository extends CrudRepository<Pet, Long> {
}
