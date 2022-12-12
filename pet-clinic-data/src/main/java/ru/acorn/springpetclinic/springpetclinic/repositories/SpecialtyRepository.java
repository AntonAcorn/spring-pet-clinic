package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.acorn.springpetclinic.springpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
