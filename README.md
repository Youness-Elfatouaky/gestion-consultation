# Gestion Consultation Application

## Description

This project is a small university project aimed at learning Java Spring Boot. It is a web-based platform designed to manage patient consultations, allowing users to add, modify, and view patients and consultations. The application is built using **Spring Boot** for the backend and **Thymeleaf** for the frontend, with a **MySQL** database.

### Features:
- **Patient Management**: Add, update, delete, and view patient information.
- **Consultation Management**: Schedule and manage medical consultations.
- **User-friendly Interface**: Easy navigation to manage patients and consultations efficiently.

## Technologies Used
- **Backend**: Spring Boot, Spring Data JPA, Spring Web, Lombok, Hibernate
- **Frontend**: Thymeleaf, Bootstrap, HTML, CSS
- **Database**: MySQL

## Setup

### 1️⃣ Clone the repository:

```bash
git clone https://github.com/Youness-Elfatouaky/gestion-consultation.git
```
### 2️⃣ Navigate to the project directory:

```bash
cd gestion-consultations
```

### 4️⃣ Run the application:

```bash
mvn clean install
```

### 3️⃣ Build the project using Maven:

```bash
mvn spring-boot:run
```

## Usage

Access the application at [http://localhost:8080](http://localhost:8080) – this is the home page of the application.

Use the navigation bar to access different sections of the application:

- **Consultations**: View, add, edit, or delete consultations | **Consultation List**: View all existing consultations.  
- **Patients**: View, add, edit, or delete patients | **Patient List**: View all existing patients.

---

## Pages Overview

### Home Page
**Title**: Welcome to the Consultation System  
**Description**: This is the homepage of the Patient Consultation System, providing an overview and quick access to manage consultations and patient records.  
**Image**:  
![HomePage](https://github.com/user-attachments/assets/4b2e47b6-e5fd-4e8a-bad7-62da4cce476b)


---

### Patients List
**Title**: Patients List  
**Description**: This page allows healthcare professionals to view, add, edit, and delete patient records. All essential patient details are displayed for easy management.  
**Image**:  
![PatientsList](https://github.com/user-attachments/assets/3f94c4a3-e918-459c-92a0-ba1e6f08708a)


---

### Add Patient
**Title**: Add a New Patient  
**Description**: This page displays a form for adding a new patient to the system. Users can input essential patient details such as name, email, phone, and address.  
**Image**:  
![AddPatient](https://github.com/user-attachments/assets/a95258e5-0c58-4edf-bce7-eeec4e61a747)


---

### Edit Patient
**Title**: Edit Patient Information  
**Description**: This page allows the user to update a patient's information, such as name, contact details, and address.  
**Image**:  
![EditPatient](https://github.com/user-attachments/assets/89802c32-a751-446b-a23c-9b4c469d4879)

---

### Patient Details
**Title**: Patient Details  
**Description**: This page provides detailed information about a specific patient, including consultations related to the patient. Users can also add a new consultation from this page.  
**Image**:  
![PatientDetails](https://github.com/user-attachments/assets/99430269-91a8-4b3b-93b4-adc1c6caa399)


---

### Consultations List
**Title**: Consultations List  
**Description**: This page shows a list of medical consultations, including details like patient name, consultation date, and motif. Users can view, edit, or delete consultations.  
**Image**:  
![Consultations List](https://github.com/user-attachments/assets/62ea0bc8-12ad-4066-8065-98701cab46bf)


---

### Add Consultation
**Title**: Add a New Consultation  
**Description**: This page provides a form for adding a new consultation. The user can select a patient, enter the date, and describe the consultation.  
**Image**:  
![AddConsultation](https://github.com/user-attachments/assets/acc518d1-5e0c-4a7d-9fbc-9e88ac5adae7)

---

### Edit Consultation
**Title**: Edit Consultation  
**Description**: This page allows the user to modify an existing consultation, including patient information, date, and consultation details.  
**Image**:  
![EditConsultation](https://github.com/user-attachments/assets/c14760f6-548b-485d-a1ab-6b87918543ef)


---

