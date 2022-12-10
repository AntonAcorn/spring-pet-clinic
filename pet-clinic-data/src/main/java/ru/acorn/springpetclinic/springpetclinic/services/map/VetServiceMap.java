package ru.acorn.springpetclinic.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.acorn.springpetclinic.springpetclinic.model.Specialty;
import ru.acorn.springpetclinic.springpetclinic.model.Vet;
import ru.acorn.springpetclinic.springpetclinic.services.SpecialtyService;
import ru.acorn.springpetclinic.springpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
