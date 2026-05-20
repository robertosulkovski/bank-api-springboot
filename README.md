# Bank API Spring Boot

REST API developed with Spring Boot for banking user management.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

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

```bash
git clone https://github.com/robertosulkovski/bank-api-springboot.git
```

```bash
cd bank-api-springboot
```

```bash
mvn spring-boot:run
```

Open:

```
http://localhost:8080/users
```

## Author

Roberto Sulkovski
