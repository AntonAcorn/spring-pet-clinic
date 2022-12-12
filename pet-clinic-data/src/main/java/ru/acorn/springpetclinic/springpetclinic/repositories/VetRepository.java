package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.acorn.springpetclinic.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
