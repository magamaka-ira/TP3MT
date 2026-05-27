package com.example.bestioles.repository;

import com.example.bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    // Les méthodes findAll, findById, save, delete sont hérités de JpaRepository
}
