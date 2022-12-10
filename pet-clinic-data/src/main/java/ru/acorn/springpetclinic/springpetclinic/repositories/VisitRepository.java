package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.acorn.springpetclinic.springpetclinic.model.Visit;

@Repository
public interface VisitRepository extends CrudRepository <Visit, Long> {
}
