# 🏋️ Gym Management System

A desktop-based Gym Management System developed using **Java Swing and MySQL** to simplify gym member management and related administrative tasks.

## 📌 Project Overview

The Gym Management System provides a graphical interface for managing gym members. It allows administrators to register new members, view member records, update details, and delete records through a database-connected application.

This project was developed as a college mini-project to demonstrate **Object-Oriented Programming (OOP), Java GUI development, and database connectivity using JDBC**.

## ✨ Features

- 🔐 **Login System** — Access the application through a login screen.
- 🏠 **Home Page** — Navigate between the available modules.
- ➕ **Add New Member** — Register members and store their details in MySQL.
- 📋 **List Members** — View registered members.
- ✏️ **Update Member** — Modify existing member information.
- 🗑️ **Delete Member** — Remove member records.
- 🔄 **Reset Form** — Clear form fields.
- 🚪 **Logout and Exit** — Leave the application or close it.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **GUI:** Java Swing
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** Apache NetBeans
- **Version Control:** Git and GitHub

## 🗄️ Database

The application uses a MySQL database to store gym member information.

The member records include details such as:

- Member ID
- Name
- Contact information
- Gender
- Parent names
- Aadhaar number
- Age
- Gym timing
- Monthly membership amount
- Joining date

## ⚙️ Prerequisites

Before running the project, install:

1. Java Development Kit (JDK)
2. MySQL Server
3. Apache NetBeans IDE
4. MySQL Connector/J

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/f4rahannn/GymManagementSystem.git
```

### 2. Open the Project

Open Apache NetBeans, select **File → Open Project**, and choose the cloned project folder.

### 3. Configure MySQL

- Start your MySQL server.
- Create the required database and `members` table.
- Update the database connection settings in `DBConnection.java`.
- Configure your database username and password locally. Never commit real credentials to GitHub.

### 4. Add MySQL Connector/J

Ensure the MySQL Connector/J library is included in the project's libraries.

### 5. Run the Application

Run the login form from NetBeans and use the application's available features.

> **Note:** Configure the database schema and connection settings before running the application.

## 📚 Concepts Demonstrated

- Object-Oriented Programming (OOP)
- Java Swing GUI development
- JDBC database connectivity
- SQL queries and prepared statements
- CRUD operations (Create, Read, Update, Delete)
- Git version control

## 👨‍💻 Author

**Farhan**

Computer Science Engineering Student

---

*Developed as a college mini-project for learning Java application development and database management.*
