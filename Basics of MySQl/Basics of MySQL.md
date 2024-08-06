## Basics of MySQL

** Disclaimer only to be used inside the terminal for Ubuntu OS only.

## To start MySQL service
`mysql -u root -p` - To login inside the MySQL

## Operations

`use database_name` - To go inside the database. example: `use users`
`show tables;` - To show all the tables inside the database (Use this after going inside the database only.)
`describe table_name` - To get the structure of the table. example: `describe User;`
output: 
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

`select * from table_name;` - To show all the entries from the table example: `select * from user;`
`drop table table_name;` - To delete a table from the database. example: `drop table user;`
