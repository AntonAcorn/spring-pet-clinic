package ru.acorn.springpetclinic.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.acorn.springpetclinic.springpetclinic.model.Visit;
import ru.acorn.springpetclinic.springpetclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitServiceMap  extends AbstractServiceMap<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null){
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
