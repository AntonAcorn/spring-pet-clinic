package ru.acorn.springpetclinic.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.acorn.springpetclinic.springpetclinic.model.Owner;
import ru.acorn.springpetclinic.springpetclinic.model.Pet;
import ru.acorn.springpetclinic.springpetclinic.model.PetType;
import ru.acorn.springpetclinic.springpetclinic.model.Vet;
import ru.acorn.springpetclinic.springpetclinic.services.OwnerService;
import ru.acorn.springpetclinic.springpetclinic.services.PetTypeService;
import ru.acorn.springpetclinic.springpetclinic.services.VetService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("9 Lenina");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        Pet michaelPet = new Pet();
        michaelPet.setPetType(savedDogPetType);
        michaelPet.setOwner(owner1);
        michaelPet.setBirthDate(LocalDate.now());
        michaelPet.setName("Bella");
        owner1.getPets().add(michaelPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("9 Lenina");
        owner2.setCity("Miami");
        owner2.setTelephone("123456789");

        Pet fionaPet = new Pet();
        fionaPet.setPetType(savedCatPetType);
        fionaPet.setOwner(owner2);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setName("Rick");
        owner2.getPets().add(fionaPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
