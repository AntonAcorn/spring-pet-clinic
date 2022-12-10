package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.acorn.springpetclinic.springpetclinic.model.Pet;

@Repository
public interface PetRepository extends CrudRepository <Pet, Long>{
}
