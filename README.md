# TP03 - Bestioles (Spring Data JPA)

> Mapper des entités JPA et utiliser les Repositories - Moneli AGAMAKA | IRA2026

## 🎯 Objectifs

- Mapper des entités JPA sur une BDD existante "bestioles"
- Créer les Repositories (JpaRepository)
- Tester save, findAll, findById, delete avec CommandLineRunner

## 📋 Architecture

### Entités
- **Species** - Les espèces d'animaux (Chat, Chien, etc.)
- **Person** - Les propriétaires
- **Animal** - Les animaux avec relations vers Species et Person

### Repositories
- **SpeciesRepository** - Gestion des espèces
- **PersonRepository** - Gestion des personnes
- **AnimalRepository** - Gestion des animaux

## 📊 Schéma BDD

```
species
├── id (PK)
├── name
├── description
└── created_at

person
├── id (PK)
├── first_name
├── last_name
├── email
└── created_at

animal
├── id (PK)
├── name
├── species_id (FK → species)
├── person_id (FK → person)
├── age
└── created_at
```

## 🚀 Lancer

```bash
cd TP03-Bestioles
mvn clean compile exec:java -Dexec.mainClass="com.example.bestioles.app.BestiolesApplication"
```

## 📊 Tests effectués

1. ✅ findAll() - Afficher toutes les entités
2. ✅ save() - Créer une nouvelle entité
3. ✅ findById() - Rechercher par ID
4. ✅ delete() - Supprimer une entité

## 🧪 Résultat attendu

```
🐾 ========== TP03 - TESTS REPOSITORIES ==========

📌 TEST 1: Afficher toutes les espèces
Nombre d'espèces: 5
  ✓ Species{id=1, name='Chien', ...}
  ...

📌 TEST 2: Afficher toutes les personnes
Nombre de personnes: 3
  ...

[... autres tests ...]

✅ ========== RÉSUMÉ FINAL ==========
📊 Espèces: 5
📊 Personnes: 4
📊 Animaux: 7

🎉 TP03 TERMINÉ!
```

## 🎓 Concepts

✅ JpaRepository - Interface pour gérer les entités
✅ @Entity - Mappage JPA
✅ @ManyToOne - Relations Many-to-One
✅ CommandLineRunner - Exécution au démarrage
✅ Hibernate DDL - validate (ne modifie pas la BDD)

**TP03 Complet!** 🎉

## Mon test 

<img width="786" height="182" alt="Screenshot 2026-05-27 at 02 05 45" src="https://github.com/user-attachments/assets/289e10c0-d535-4582-bcde-7eb7f6df5880" />

