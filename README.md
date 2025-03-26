# Application de Gestion des Consultations

## Description

Ce projet est un petit projet universitaire visant à apprendre Java Spring Boot. Il s'agit d'une plateforme web conçue pour gérer les consultations des patients, permettant aux utilisateurs d'ajouter, modifier et visualiser les patients et les consultations. L'application est développée avec **Spring Boot** pour le backend et **Thymeleaf** pour le frontend, avec une base de données **MySQL**.

### Fonctionnalités :
- **Gestion des Patients** : Ajouter, modifier, supprimer et consulter les informations des patients.
- **Gestion des Consultations** : Planifier et gérer les consultations médicales.
- **Interface intuitive** : Navigation facile pour gérer efficacement les patients et les consultations.

## Technologies utilisées
- **Backend** : Spring Boot, Spring Data JPA, Spring Web, Lombok, Hibernate
- **Frontend** : Thymeleaf, Bootstrap, HTML, CSS
- **Base de données** : MySQL

## Installation

### 1️⃣ Cloner le dépôt :

```bash
git clone https://github.com/Youness-Elfatouaky/gestion-consultation.git
```
### 2️⃣ Accéder au répertoire du projet :

```bash
cd gestion-consultations
```

### 3️⃣ Installer les dépendances :

```bash
mvn clean install
```

### 4️⃣ Exécuter l'application :

```bash
mvn spring-boot:run
```

## Utilisation

Accédez à l'application via http://localhost:8080 – ceci est la page d'accueil de l'application.

Utilisez la barre de navigation pour accéder aux différentes sections de l'application :

- **Consultations**: : Consulter, ajouter, modifier ou supprimer des consultations | **Liste des consultations** : Voir toutes les consultations existantes.

- **Patients** : Consulter, ajouter, modifier ou supprimer des patients | **Liste des patients** : Voir tous les patients existants.

---

## Aperçu des pages

### Page d'accueil
**Titre** : Bienvenue dans le Système de Gestion des Consultations  
**Description**: Ceci est la page d'accueil du système, offrant un aperçu et un accès rapide à la gestion des consultations et des dossiers des patients.

![HomePage](https://github.com/user-attachments/assets/4b2e47b6-e5fd-4e8a-bad7-62da4cce476b)


---

### Liste des Patients
**Titre**: Liste des Patients  
**Description**: Cette page permet aux professionnels de santé de consulter, ajouter, modifier et supprimer les dossiers des patients. Toutes les informations essentielles sont affichées pour une gestion simplifiée.

![PatientsList](https://github.com/user-attachments/assets/3f94c4a3-e918-459c-92a0-ba1e6f08708a)


---

### Ajouter un Patient
**Titre**: Ajouter un Nouveau Patient  
**Description**: Cette page affiche un formulaire permettant d'ajouter un nouveau patient au système. L'utilisateur peut saisir les informations essentielles comme le nom, l'email, le téléphone et l'adresse.
 
![AddPatient](https://github.com/user-attachments/assets/a95258e5-0c58-4edf-bce7-eeec4e61a747)


---

### Modifier un Patient
**Titre**: Modifier les Informations d'un Patient  
**Description**: Cette page permet à l'utilisateur de mettre à jour les informations d'un patient, comme le nom, les coordonnées et l'adresse.

![EditPatient](https://github.com/user-attachments/assets/89802c32-a751-446b-a23c-9b4c469d4879)

---

### Détails du Patient
**Titre**: Détails du Patient  
**Description**: Cette page fournit des informations détaillées sur un patient spécifique, y compris les consultations associées. L'utilisateur peut également ajouter une nouvelle consultation depuis cette page.

![PatientDetails](https://github.com/user-attachments/assets/99430269-91a8-4b3b-93b4-adc1c6caa399)


---

### Liste des Consultations
**Titre**: Liste des Consultations  
**Description**: Cette page affiche la liste des consultations médicales, avec des détails comme le nom du patient, la date de la consultation et le motif. L'utilisateur peut consulter, modifier ou supprimer des consultations.

![Consultations List](https://github.com/user-attachments/assets/62ea0bc8-12ad-4066-8065-98701cab46bf)


---

### Ajouter une Consultation
**Titre**: Ajouter une Nouvelle Consultation    
**Description**: Cette page propose un formulaire pour ajouter une nouvelle consultation. L'utilisateur peut sélectionner un patient, saisir la date et décrire la consultation.
 
![AddConsultation](https://github.com/user-attachments/assets/acc518d1-5e0c-4a7d-9fbc-9e88ac5adae7)

---

### Modifier une Consultation
**Titre**: Modifier une Consultation   
**Description**: Cette page permet aux utilisateurs de modifier une consultation existante, y compris les informations du patient, la date et les détails de la consultation.

![EditConsultation](https://github.com/user-attachments/assets/c14760f6-548b-485d-a1ab-6b87918543ef)

---

### Détails de la Consultation
**Titre**: Détails de la Consultation   
**Description**: Cette page fournit des informations détaillées sur une consultation spécifique, y compris le patient associé. L'utilisateur peut consulter tous les détails de la consultation et mettre à jour ses informations.

![ConsultationDetails](https://github.com/user-attachments/assets/526d64b7-38ea-4984-a7ad-7127b83816da)


---

