# Spring Boot, MySQL, JPA, Rest API

Build Restful CRUD API for a blog using Spring Boot, Mysql, JPA and Hibernate.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/BarathCT/Java-Spring-API.git
```

**2. Create Mysql database**
```bash
create database student
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Run the app using maven**

```bash
mvn spring-boot:run
```
The app will start running at <http://localhost:8080>

## Explore Rest APIs

The app defines following CRUD APIs.


Test them using postman or any other rest client.

## Sample Valid JSON Request Bodys

##### Create Student -> /api/students
(Request Body)
```json
{
	"name": "Barath",
	"age": 21,
	"email": "barath@gmail.com",
}

{
	"name": "Jagadish",
	"age": 22,
	"email": "jagadish@gmail.com",
}

{
	"name": "Prajith",
	"age": 22,
	"email": "prajith@gmail.com",
}
```

##### Update Student -> /api/students/{id}
##### For Example /api/students/1
(Request Body)
```json
{
	"name": "Eswar",
	"age": 21,
	"email": "eswar@gmail.com",
}
```

##### Delete Particular Student -> /api/students/{id}
##### For Example /api/students/1

Student id - 1  -> Student (Eswar)


##### Get All Student -> /api/students
```json
{
	"name": "Jagadish",
	"age": 22,
	"email": "jagadish@gmail.com",
}

{
	"name": "Prajith",
	"age": 22,
	"email": "prajith@gmail.com",
}
```

##### Get Particular Student -> /api/students/{id}
##### For Example /api/students/3

Student id - 3  -> Student (Prajith)

```json
{
	"name": "Prajith",
	"age": 22,
	"email": "prajith@gmail.com",
}
```

##### Delete All Student -> /api/students/delete

It will Delete all Student Records



