# WorkflowHub API

A RESTful workflow management API built with Java and Spring Boot for managing task lifecycles with full CRUD operations, validation, persistence, and interactive API documentation.

![Swagger UI](docs/swagger-screenshot.png)

## 🚀 Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot 4.1.1
- **Persistence:** Spring Data JPA + Hibernate
- **Database:** H2 (file-based, persistent)
- **Build Tool:** Maven
- **Validation:** Jakarta Bean Validation
- **API Docs:** Swagger UI (springdoc-openapi)
- **Testing:** JUnit 5

## ✨ Features

- Full CRUD operations for workflow tasks
- Input validation with Bean Validation (`@NotBlank`)
- Global exception handler returning structured JSON errors
- File-based H2 database ensuring data survives restarts
- Interactive Swagger UI for endpoint testing
- JUnit 5 integration tests covering the persistence layer
- SQL query logging for debugging

## 📡 API Endpoints

| Method | Endpoint | Description |
|:---|:---|:---|
| `GET` | `/tasks` | Retrieve all tasks |
| `GET` | `/tasks/{id}` | Retrieve a single task by ID |
| `POST` | `/tasks` | Create a new task |
| `PUT` | `/tasks/{id}` | Update an existing task |
| `DELETE` | `/tasks/{id}` | Delete a task |

## 🛠️ How to Run

### Prerequisites
- Java 17 or higher
- Maven (or use the included `mvnw` wrapper)

### Steps

```bash
git clone https://github.com/deveshree003-oss/workflowhub.git
cd workflowhub
./mvnw spring-boot:run
