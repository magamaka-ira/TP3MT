package com.example.bestioles.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "animal")
public class Animal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;
    
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    // Constructeurs
    public Animal() {
    }
    
    public Animal(String name, Species species, Person person, Integer age) {
        this.name = name;
        this.species = species;
        this.person = person;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Species getSpecies() {
        return species;
    }
    
    public void setSpecies(Species species) {
        this.species = species;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species=" + (species != null ? species.getName() : "null") +
                ", person=" + (person != null ? person.getFirstName() + " " + person.getLastName() : "null") +
                ", age=" + age +
                '}';
    }
}
