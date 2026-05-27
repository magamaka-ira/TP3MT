package com.example.bestioles.repository;

import com.example.bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {
    // Les méthodes findAll, findById, save, delete sont hérités de JpaRepository
}
