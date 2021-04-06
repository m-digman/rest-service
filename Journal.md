# Spring Boot project using Hibernate

## Day 1 (5/4 5hrs)
### Aim
Get bare-bones endpoint to read data from database
### Actions
- Installed IntelliJ & Oracle JDK 11
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
- New endpoint - http://localhost:8080/api/v1/stars
- Can read empty table and newly added rows

## Day 2 (6/4 ?hrs)
### Aim
Implement search endpoint
### Actions
- Refine DB schema
  * telescope_id bigint(20)
  * telescope_longitude decimal(10,7)
  * telescope_latitude decimal(10,7)
  * telescope_altitude decimal(11,1)
  * star_name varchar(255)
  * star_right_ascension float(2,2)
  * star_declination float(2,2)
  * star_apparent_magnitude float(2,2)
  * measurement_time timestamp
- Find out how to search by name (query)
### Issues
Not clear what the best precision to store star Right ascension, Declination, Apparent magnitude
Could use MySQL spatial extensions (Point) - long/lat decimal(10,7) alt decimal(11,1)
* Entity name also needed for query - @Entity(name = "stars")
### Outcome
New endpoints
- Find by telescope_id - http://localhost:8080/api/v1/telescope/102
- Find by star name - http://localhost:8080/api/v1/stars/test

## Day 3 (7/4 ?hrs)
### Aim
Implement write endpoint
### Actions
### Issues
### Outcome
