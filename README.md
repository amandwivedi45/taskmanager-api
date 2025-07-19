# Task Manager API (Spring Boot)

A RESTful Task Management system built using Java Spring Boot, MySQL, and JWT authentication. This API allows users to register, login, and manage tasks with full CRUD operations and user-task assignment.

---

## 🚀 Features

- User Registration & Login (JWT based)
- Secure Endpoints (JWT Authentication)
- Create, Update, Delete, and View Tasks
- Assign tasks to specific users
- Swagger API Documentation for testing

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Security (JWT)
- Hibernate (JPA)
- MySQL
- Swagger (OpenAPI)
- Postman for API Testing

---

## 📦 How to Run Locally

1. Clone the repo:
```bash
git clone https://github.com/amandwivedi45/taskmanager-api.git
cd taskmanager-api

2. Create your MySQL DB and update the DB credentials in:
src/main/resources/application.properties

3. Run:

bash
Copy
Edit
./mvnw spring-boot:run
