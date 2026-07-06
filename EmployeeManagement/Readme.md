# Employee Management System

A console-based Employee Management System developed using **Java**, **JDBC**, and a relational database (Oracle/MySQL). This project demonstrates CRUD (Create, Read, Update, Delete) operations using the DAO design pattern.

---

## 📌 Features

- Add a new employee
- View all employees
- Search employee by ID
- Update employee details
- Delete employee
- Database connectivity using JDBC
- Exception handling
- Layered architecture (Bean, DAO, Service, Utility)

---

## 🛠 Technologies Used

- Java
- JDBC
- Oracle Database / MySQL
- VS Code / Eclipse
- JDK 17+ (or your installed version)

---

## 📂 Project Structure

```
EmployeeManagement
│
├── src
│   └── in.kce
│       ├── bean
│       │   └── Employee.java
│       │
│       ├── dao
│       │   └── EmployeeDAO.java
│       │
│       ├── service
│       │   └── EmployeeService.java
│       │
│       ├── util
│       │   └── DBUtil.java
│       │
│       ├── exception
│       │
│       └── main
│           └── TestEmployee.java
│
├── bin
└── sql
```

---

## 📋 Project Architecture

```
User
  │
  ▼
TestEmployee (Main Class)
  │
  ▼
EmployeeService
  │
  ▼
EmployeeDAO
  │
  ▼
DBUtil
  │
  ▼
Database
```

---

## 🗄 Database

Create an Employee table.

Example:

```sql
CREATE TABLE employee (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(100),
    department VARCHAR2(50),
    salary NUMBER(10,2),
    email VARCHAR2(100)
);
```

Sample Data:

```sql
INSERT INTO employee VALUES (101,'John','IT',55000,'john@gmail.com');
INSERT INTO employee VALUES (102,'David','HR',45000,'david@gmail.com');
```

---

## ⚙ JDBC Configuration

Update the database credentials inside **DBUtil.java**.

Example:

```java
private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
private static final String USERNAME = "system";
private static final String PASSWORD = "password";
```

For MySQL:

```java
private static final String URL = "jdbc:mysql://localhost:3306/employeedb";
```

---

## ▶ How to Run

1. Clone the repository

```bash
git clone https://github.com/yourusername/EmployeeManagement.git
```

2. Open the project in VS Code or Eclipse.

3. Add the JDBC Driver to the project.

4. Configure the database connection in `DBUtil.java`.

5. Create the Employee table.

6. Run

```
TestEmployee.java
```

---

## 📖 CRUD Operations

- Insert Employee
- Display Employees
- Search Employee
- Update Employee
- Delete Employee

---

## 📚 Concepts Used

- Object-Oriented Programming
- JDBC
- DAO Pattern
- Service Layer
- Exception Handling
- Java Packages
- SQL CRUD Operations

---

## 📸 Output

```
===== Employee Management System =====

1. Add Employee
2. View Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Exit

Enter your choice:
```

---

## 🚀 Future Enhancements

- Java Swing GUI
- JavaFX Application
- Spring Boot REST API
- Hibernate/JPA Integration
- User Authentication
- Logging
- Unit Testing using JUnit

---

## 👨‍💻 Author

**Lathika Kumar**

B.Tech Artificial Intelligence and Data Science

Karpagam College of Engineering

---

## 📄 License

This project is developed for educational and learning purposes.