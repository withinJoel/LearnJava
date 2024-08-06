## Basics of MySQL

** Disclaimer only to be used inside the terminal for Ubuntu OS only.

## To start MySQL service
* `mysql -u root -p` - To login inside the MySQL

## To create a table
* Structure:
```
CREATE TABLE table_name (
    column1 datatype constraints,
    column2 datatype constraints,
    ...
);
```
* Example:
```
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
```
## To insert data
* Structure:
```
INSERT INTO table_name (column1, column2, ...)
VALUES (value1, value2, ...);
```
* Example:
```
INSERT INTO users (username, password)
VALUES ('john_doe', 'password123');
```
## Database
* `CREATE DATABASE database_name;` - To create a database.
* `use database_name` - To go inside the database. example: `use users`
* 
## Operations

* `show tables;` - To show all the tables inside the database (Use this after going inside the database only.)
* `describe table_name` - To get the structure of the table. example: `describe User;`
* output: 
```
mysql> describe User;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | bigint       | NO   | PRI | NULL    | auto_increment |
| username | varchar(100) | NO   |     | NULL    |                |
| password | varchar(255) | NO   |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)
```

* `select * from table_name;` - To show all the entries from the table example: `select * from user;`
* `drop table table_name;` - To delete a table from the database. example: `drop table user;`
