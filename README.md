# Bank API Spring Boot

REST API developed with Spring Boot for banking user management.

This project was developed as a practical study application inspired by the concepts explored during the **TOTVS - Fundamentos de Engenharia de Dados e Machine Learning** bootcamp, offered by DIO (Digital Innovation One), with adaptations, debugging improvements and implementation adjustments made during development to reinforce concepts of REST APIs, persistence and software architecture.

## Learning Context

The project was developed based on concepts studied during the **TOTVS - Fundamentos de Engenharia de Dados e Machine Learning** bootcamp and expanded through practical implementation activities, including:

- Entity relationship modeling
- REST API development
- CRUD operations
- JPA and Hibernate persistence
- H2 database integration
- API validation using Postman
- SQL troubleshooting and schema adjustments
- Git and GitHub versioning

During development, improvements and fixes were implemented beyond the initial reference structure, including persistence corrections, entity relationship adjustments and database compatibility improvements.

## Domain Model

```
User
 ├── Account
 ├── Card
 ├── Feature[]
 └── News[]
```

Relationships:

- User → Account (1:1)
- User → Card (1:1)
- User → Feature (1:N)
- User → News (1:N)

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Git
- GitHub
- Postman

## Features

- Create users
- List users
- Update users
- Delete users
- Banking account management
- Card management
- Features and news association

## API Endpoints

### Create User

POST

```
/users
```

Example:

```json
{
  "name": "Roberto",
  "account": {
    "number": "12345",
    "agency": "0001",
    "balance": 1500,
    "limit": 5000
  },
  "card": {
    "number": "9999888877776666",
    "limit": 5000
  }
}
```

### List Users

GET

```
/users
```

### Get User By ID

GET

```
/users/{id}
```

### Update User

PUT

```
/users/{id}
```

### Delete User

DELETE

```
/users/{id}
```

## Running locally

Clone repository:

```bash
git clone https://github.com/robertosulkovski/bank-api-springboot.git
```

Enter folder:

```bash
cd bank-api-springboot
```

Run application:

```bash
mvn spring-boot:run
```

Open:

```
http://localhost:8080/users
```

## Project Highlights

During development, practical challenges involving persistence and database modeling were addressed, including:

- SQL reserved keyword conflicts
- Hibernate configuration adjustments
- Entity relationship corrections
- API endpoint validation
- Data persistence troubleshooting

## Reference

Project developed based on concepts studied during the **TOTVS - Fundamentos de Engenharia de Dados e Machine Learning** bootcamp, offered by DIO (Digital Innovation One), adapted and expanded for learning purposes.

## Author

Roberto Sulkovski
