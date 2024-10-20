# Spring-Boot-REST-API

REST API is designed to manage student details within an educational system. Built using Spring Boot, the API provides a structured and efficient way to perform CRUD (Create, Read, Update, Delete) operations on student records.

**Student Registration:** -> Allows the creation of new student records by accepting details such as name, age, and email

**Retrieve Student Details:** -> Provides endpoints to fetch individual student information or a list of all students, enabling easy access to student records.

**Update Student Information:** -> Facilitates the modification of existing student details, such as updating student information or changing the name.

**Delete Student Records:** -> Enables the delete a individual student entries or all student entries from the database when they are no longer needed.


**Endpoints:**

- **POST** api/students: Create a new student record.
- **GET** api/students: Retrieve a list of all students.
- **GET** api/students/{id}: Fetch details of a specific student by ID.
- **PUT** api/students/{id}: Update the details of a specific student.
- **DELETE** api/students/{id}: Remove individual student record from the database.
- **DELETE** api/students/delete: Remove all student record from the database.

**Technologies Used:**

- **Spring:** Framework for building the REST API with dependency injection and configuration management.
- **Hibernate:** ORM framework for mapping Java objects to database tables and handling data transactions.
- **MySQL:** Relational database management system used to store student data.
