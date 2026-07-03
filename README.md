# Spring JDBC CRUD Application

A simple **Spring Boot** application that demonstrates **CRUD (Create, Read, Update, Delete)** operations using **Spring JDBC**, **PostgreSQL**, and **Maven**. This project follows a layered architecture with Model, Repository, and Service components.

---

## 🚀 Features

- Create, Read, Update, and Delete student records
- Spring JDBC integration
- PostgreSQL database connectivity
- Layered architecture (Model, Repository, Service)
- SQL scripts for schema and sample data
- Maven-based project

---

## 🛠️ Tech Stack

- Java 21+
- Spring Boot
- Spring JDBC
- PostgreSQL
- Maven

---

## 📁 Project Structure

```
SpringJDBCEx
│── src
│   ├── main
│   │   ├── java
│   │   │   └── com.akash.SpringJDBCEx
│   │   │       ├── model
│   │   │       │   └── Student.java
│   │   │       ├── repo
│   │   │       │   └── StudentRepo.java
│   │   │       ├── service
│   │   │       │   └── StudentService.java
│   │   │       └── SpringJdbcExApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── schema.sql
│   │       └── data.sql
│── pom.xml
```

---

## ⚙️ Prerequisites

- Java JDK 21 or later
- Maven
- PostgreSQL
- IntelliJ IDEA / Eclipse / VS Code

---

## 🗄️ Database Configuration

Configure your PostgreSQL database credentials in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.datasource.driver-class-name=org.postgresql.Driver
```

---

## ▶️ Running the Application

### Clone the repository

```bash
git clone https://github.com/ahireakash09/SpringJDBCEx.git
```

### Navigate to the project

```bash
cd SpringJDBCEx
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

Or run `SpringJdbcExApplication.java` directly from your IDE.

---

## 📚 Concepts Covered

- Spring Boot
- Spring JDBC
- Dependency Injection
- Repository Pattern
- Service Layer
- PostgreSQL Integration
- CRUD Operations
- SQL Schema Initialization

---

## 🎯 Learning Outcomes

This project helps you understand:

- How Spring JDBC interacts with relational databases
- Building layered Spring Boot applications
- Implementing CRUD operations using JdbcTemplate
- Database initialization using `schema.sql` and `data.sql`
- Managing dependencies with Maven

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork this repository and submit a pull request.

---

## 📄 License

This project is created for learning and educational purposes.

---

### ⭐ If you found this project helpful, consider giving it a star on GitHub!
