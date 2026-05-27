package com.example.bestioles.app;

import com.example.bestioles.model.Animal;
import com.example.bestioles.model.Person;
import com.example.bestioles.model.Species;
import com.example.bestioles.repository.AnimalRepository;
import com.example.bestioles.repository.PersonRepository;
import com.example.bestioles.repository.SpeciesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.bestioles")
@EnableJpaRepositories(basePackages = "com.example.bestioles.repository")
@EntityScan(basePackages = "com.example.bestioles.model")
public class BestiolesApplication implements CommandLineRunner {
    
    private final SpeciesRepository speciesRepository;
    private final PersonRepository personRepository;
    private final AnimalRepository animalRepository;
    
    public BestiolesApplication(SpeciesRepository speciesRepository, 
                                PersonRepository personRepository,
                                AnimalRepository animalRepository) {
        this.speciesRepository = speciesRepository;
        this.personRepository = personRepository;
        this.animalRepository = animalRepository;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n🐾 ========== TP03 - TESTS REPOSITORIES ==========\n");
        
        System.out.println("📌 TEST 1: Afficher toutes les espèces");
        var allSpecies = speciesRepository.findAll();
        System.out.println("Nombre d'espèces: " + allSpecies.size());
        allSpecies.forEach(s -> System.out.println("  ✓ " + s));
        
        System.out.println("\n📌 TEST 2: Afficher toutes les personnes");
        var allPersons = personRepository.findAll();
        System.out.println("Nombre de personnes: " + allPersons.size());
        allPersons.forEach(p -> System.out.println("  ✓ " + p));
        
        System.out.println("\n📌 TEST 3: Afficher tous les animaux");
        var allAnimals = animalRepository.findAll();
        System.out.println("Nombre d'animaux: " + allAnimals.size());
        allAnimals.forEach(a -> System.out.println("  ✓ " + a));
        
        System.out.println("\n✅ ========== RÉSUMÉ FINAL ==========");
        System.out.println("📊 Espèces: " + speciesRepository.findAll().size());
        System.out.println("📊 Personnes: " + personRepository.findAll().size());
        System.out.println("📊 Animaux: " + animalRepository.findAll().size());
        System.out.println("\n🎉 TP03 TERMINÉ!\n");
    }
}
