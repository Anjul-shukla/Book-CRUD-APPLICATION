# Book-CRUD-APPLICATION


A backend web service built with **Java** and **Spring Boot** designed to manage a library collection of books using a clean Layered Architecture pattern (Controller, Service, Repository, and Entity).

## 🚀 Features (Full CRUD)
This application implements a complete set of REST endpoints to handle the lifecycle of book records:
* **Create**: Add new books with a title and genre.
* **Read**: Retrieve all available books or look up a specific book using its unique ID.
* **Update**: Modify the title or genre details of an existing book record.
* **Delete**: Permanently remove a book from the system using its ID.

## 🛠️ Tech Stack
* **Language:** Java
* **Framework:** Spring Boot (Spring Web, Spring Data JPA)
* **Database:** MySQL (Managed via MySQL Workbench)
* **Libraries:** Lombok (for boilerplate data encapsulation reduction)

## 📁 Project Structure
The project follows a standard backend architectural split:
* `com.example.BookApplication.Controller` - Handles incoming HTTP requests and structures API responses.
* `com.example.BookApplication.Service` - Houses the business logic and application orchestration rules.
* `com.example.BookApplication.Repository` - Extends `JpaRepository` to communicate natively with the database.
* `com.example.BookApplication.Entity` - Defines the database schema and structures data modeling.

## 🔀 API Endpoints
All request endpoints share the base path `/book/v1`. 

| HTTP Method | End Point | Description | Sample Request Body (JSON) |
| :--- | :--- | :--- | :--- |
| **POST** | `/book/v1/addBook` | Creates a new book record | `{"title": "The Hobbit", "genre": "Fantasy"}` |
| **GET** | `/book/v1/all` | Retrieves all stored books | *None* |
| **GET** | `/book/v1/{id}` | Retrieves a single book by ID | *None* |
| **PUT** | `/book/v1/update/{id}` | Modifies an existing book details | `{"title": "The Hobbit (Extended)", "genre": "Fantasy"}` |
| **DELETE** | `/book/v1/delete/{id}` | Removes a book record by its ID | *None* |

## 💻 How to Setup and Run Locally

### Prerequisites
* Java Development Kit (JDK 17 or higher)
* MySQL Server & MySQL Workbench installed locally
* An IDE (such as IntelliJ IDEA, Eclipse, or VS Code)
* Postman (or any API client tool to test the endpoints)

### Execution Steps
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_GITHUB_USERNAME/book-application.git](https://github.com/YOUR_GITHUB_USERNAME/book-application.git)
   cd book-application
