# rest-service
Stars Rest API using Spring Boot

Example Stars: Algol, XZ Tauri, Spica, Capella, Betelgeuse, Polaris

## Dependencies:
* Oracle JDK 11.0.10
* MySQL 5.1.73

## Design thoughts and assumptions:
- DB Schema & Data
  * treat data rows like a measurement log
  * could normalise and have primary key, but need to understand more around the requirements
  * for simplicity telescope_id and star_name are not unique, every value cannot be null and timestamp will be set when row is created
  * based on some research decided to use the following data types
    * telescope_id bigint(20)
    * telescope_longitude decimal(10,7)
    * telescope_latitude decimal(10,7)
    * telescope_altitude decimal(11,1)
    * star_name varchar(255)
    * star_right_ascension float(4,2)
    * star_declination float(4,2)
    * star_apparent_magnitude float(4,2)
    * measurement_time timestamp (default when created, but can be set via API)
- Implement API to create and read data
- Create script to initialise schema

## Future considerations
  * API documentation (Swagger)
  * Review endpoint naming based on requirements/db normalisation
  * Error handling and validation
  * Unit tests
  * Performance (indexes/paging)
  * Security (authentication, session mgmt, encryption, validation, sql injection, dependency updates)

## Setup
- Install MySQL and create a database instance (e.g. "test")
- Create read/write user (ALL PRIVILEGES) for this database
- Create "stars" table using create_table.sql in this database 

### Update application.properties file...
- spring.datasource.url=jdbc:mysql://HOST:PORT/DB
- spring.datasource.username=
- spring.datasource.password=

## Build/Run:
- mvnw clean
- mvnw package
- mvnw spring-boot:run

### Endpoints:
- List all: [GET] http://localhost:8080/api/v1/stars
- List by star name: [GET] http://localhost:8080/api/v1/stars/{name}
- List by telescope id: [GET] http://localhost:8080/api/v1/stars/telescope/{id}
- Create: [PUT] http://localhost:8080/api/v1/stars

### Example JSON:
{
"telescopeId": 1004,
"telescopeLongitude": 2.1,
"telescopeLatitude": -4.99,
"telescopeAltitude": 4.2,
"starName": "XZ Tauri",
"starRightAscension": 11.0,
"starDeclination": -22.33,
"starApparentMagnitude": 1.99,
"measurementTime": "2021-04-07T21:18:29.000+00:00"
}