# Billetterie - Application de gestion des événements

## 1. Présentation du projet

Billetterie est une application web développée avec Spring Boot permettant de gérer une plateforme de réservation et de billetterie pour différents événements.

## 2. Technologies utilisées

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API
- Git et GitHub

## 3. Entités principales

- Utilisateur
- Evenement
- Lieu
- Categorie
- TypeBillet
- Reservation
- Paiement
- Tag

## 4. Base de données

- Nom : `billetterie_db`
- SGBD : MySQL

## 5. Installation et exécution

1. Cloner le dépôt GitHub.
2. Ouvrir le projet dans Spring Tool Suite.
3. Créer ou vérifier la base de données MySQL `billetterie_db`.
4. Configurer `application.properties`.
5. Installer les dépendances Maven.
6. Exécuter l'application Spring Boot.

## 6. API REST

### Utilisateurs
- GET `/api/utilisateurs`
- GET `/api/utilisateurs/{id}`
- POST `/api/utilisateurs`
- PUT `/api/utilisateurs/{id}`
- DELETE `/api/utilisateurs/{id}`

### Événements
- GET `/api/evenements`
- GET `/api/evenements/{id}`
- POST `/api/evenements`
- PUT `/api/evenements/{id}`
- DELETE `/api/evenements/{id}`

### Catégories
- GET `/api/categories`
- GET `/api/categories/{id}`
- POST `/api/categories`
- PUT `/api/categories/{id}`
- DELETE `/api/categories/{id}`

### Lieux
- GET `/api/lieux`
- GET `/api/lieux/{id}`
- POST `/api/lieux`
- PUT `/api/lieux/{id}`
- DELETE `/api/lieux/{id}`

### Réservations
- GET `/api/reservations`
- GET `/api/reservations/{id}`
- POST `/api/reservations`
- PUT `/api/reservations/{id}`
- DELETE `/api/reservations/{id}`

### Paiements
- GET `/api/paiements`
- GET `/api/paiements/{id}`
- POST `/api/paiements`
- PUT `/api/paiements/{id}`
- DELETE `/api/paiements/{id}`

### Tags
- GET `/api/tags`
- GET `/api/tags/{id}`
- POST `/api/tags`
- PUT `/api/tags/{id}`
- DELETE `/api/tags/{id}`

### Types de billets
- GET `/api/types-billets`
- GET `/api/types-billets/{id}`
- POST `/api/types-billets`
- PUT `/api/types-billets/{id}`
- DELETE `/api/types-billets/{id}`

## 7. Auteur

Projet académique - Spring Boot

**GitHub :** maryemkader