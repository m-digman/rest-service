# Spring Boot project using Hibernate

## Day 1 (5/4 5hrs)
### Aim
Get bare-bones endpoint to read data from database
### Actions
- Installed JetBrains IntelliJ & Oracle JDK 11
- Created project using Spring Initializr
- Created GitHub Repo
- Created basic table and user (MySQL on NAS)
- Added hibernate code and config
### Issues
Problem connecting to remote MySQL DB:
- Hibernate star object needed @Id property
- set spring.datasource.driver-class-name=com.mysql.jdbc.Driver based on version of MySQL
- changed spring.jpa.hibernate.ddl-auto=none
- mysql-connector-java - updated version 5.1.49 to match MySQL verison (5.1.73)
### Outcome
- New endpoint: [GET] http://localhost:8080/api/v1/stars
- Can read empty table and newly added rows

## Day 2 (6/4 4hrs)
### Aim
Implement search endpoint
### Actions
- Refine DB schema
- Find out how to search by name (query)
### Issues
Not clear what the best precision to store star Right ascension, Declination, Apparent magnitude
Could use MySQL spatial extensions (Point) - long/lat decimal(10,7) alt decimal(11,1)
* Entity name also needed for query - @Entity(name = "stars")
### Outcome
New endpoints
- Find by star name: [GET] http://localhost:8080/api/v1/stars/{name}
- Find by telescope id: [GET] http://localhost:8080/api/v1/telescope/{id}

## Day 3 (7/4 3hrs)
### Aim
Implement write endpoint and create DB setup script
### Actions
Review and update list by telescope id endpoint
Add PUT endpoint
Install Postman for testing
### Issues
Fixed float data type to be (4,2)
### Outcome
Updated endpoint: [GET] http://localhost:8080/api/v1/stars/telescope/{id}
New endpoint: [PUT] http://localhost:8080/api/v1/stars