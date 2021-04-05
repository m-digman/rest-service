# Spring Boot project using Hibernate

## Day 1 (5/4 4hrs)
Installed IntelliJ & JDK 11
Created project
Added GitHub repo
Create DB table and user (MySQL on NAS)
Added hibernate code and config
New endpoint - http://localhost:8080/api/v1/stars
Issues connecting to remote MySQL DB:
- set spring.datasource.driver-class-name=com.mysql.jdbc.Driver based on version of MySQL
- changed spring.jpa.hibernate.ddl-auto=none
- mysql-connector-java - updated version 5.1.49 to match MySQL verison (5.1.73)
  Outcome:
  Read empty rows and newly added row