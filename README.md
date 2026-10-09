# WorkflowHub API

A RESTful workflow management API built with Java and Spring Boot for managing task lifecycles with full CRUD operations, validation, persistence, and interactive API documentation.

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
```

The server starts at **http://localhost:8081**

## 📖 Interactive API Documentation

Open **http://localhost:8081/swagger-ui/index.html** to test endpoints directly from the browser.

## 📬 Sample Requests

### Create a task

```bash
curl -X POST http://localhost:8081/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn Spring Boot","description":"Build REST API","status":"IN_PROGRESS"}'
```

### Get all tasks

```bash
curl http://localhost:8081/tasks
```

### Delete a task

```bash
curl -X DELETE http://localhost:8081/tasks/1
```

## 🗄️ Database Console

Access at **http://localhost:8081/h2-console**

- JDBC URL: `jdbc:h2:file:./data/workflowhub`
- Username: `sa`
- Password: *(blank)*

## 🧪 Testing

```bash
./mvnw test
```

## 🔮 Future Enhancements

- JWT authentication
- PostgreSQL for production
- Docker containerization
