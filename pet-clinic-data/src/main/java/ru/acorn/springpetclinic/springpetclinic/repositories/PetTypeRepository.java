package ru.acorn.springpetclinic.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.acorn.springpetclinic.springpetclinic.model.PetType;

/**
 * Created by jt on 8/5/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
