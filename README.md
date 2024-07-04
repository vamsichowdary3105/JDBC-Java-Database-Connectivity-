# JDBC-Java-Database-Connectivity-

# Java MySQL Example

This repository contains a simple Java application that connects to a MySQL database, executes a query, and prints the result.

## Prerequisites

- Java Development Kit (JDK)
- MySQL database
- MySQL Connector/J (JDBC Driver)

## Setup

**Configure your database:**

    Ensure that you have a MySQL database running and that it contains a `student` table with a `student_id` column.
 **Update the database credentials:**

    Update the `url`, `username`, and `password` variables in the `Main.java` file with your database connection details.

    ```java
    String url = "jdbc:mysql://localhost:3306/your-database-name";
    String username = "your-username";
    String password = "your-password";
    ```

## Running the Application

1. **Compile the application:**

    ```sh
    javac Main.java
    ```

2. **Run the application:**

    ```sh
    java Main
    ```

    This will connect to the MySQL database, execute the query, and print the result.

## Troubleshooting

- **SQLException: Column Index out of range:**

    Ensure that you are accessing the correct column index in the result set.

- **No suitable driver found:**

    Make sure that the MySQL Connector/J (JDBC Driver) is included in your classpath.



