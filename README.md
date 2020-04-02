# SpringJDBCTemplateExample:

created SpringJdbc Example 
I was Using JDBC,Command Prompt,MYSQL,Maven.
In this Project:
Spring JdbcTemplate is a powerful mechanism to connect to the database and execute SQL queries. It internally uses JDBC api, but eliminates a lot of problems of JDBC API.

Problems of JDBC API:
The problems of JDBC API are as follows:

We need to write a lot of code before and after executing the query, such as creating connection, statement, closing resultset, connection etc.
We need to perform exception handling code on the database logic.
We need to handle transaction.
Repetition of all these codes from one to another database logic is a time consuming task.

Description:
Step1:  First I was Created the Employee Table by using MYSql.
Step2:  Created the Controller Part.
Step3:   In ControllerPart I created the Jdbc Part.It contains one property jdbcTemplate and three methods saveEmployee(), updateEmployee and deleteEmployee().
Step4: then Created the Spring .xml File.
Step 5: Clean the Maven And Install it And deploy your Project.
