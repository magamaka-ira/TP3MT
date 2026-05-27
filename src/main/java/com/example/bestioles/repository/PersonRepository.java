package com.example.bestioles.repository;

import com.example.bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    // Les méthodes findAll, findById, save, delete sont hérités de JpaRepository
}
