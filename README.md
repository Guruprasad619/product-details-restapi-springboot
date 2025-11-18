

# Product-Details-RestApi-SpringBoot

Simple Spring Boot application that fetches products from an external API and renders them with Thymeleaf.

## Quick links
- [`com.rest.api.ApiApplication`](src/main/java/com/rest/api/ApiApplication.java)
- [`com.rest.api.MyController`](src/main/java/com/rest/api/MyController.java)
- [`com.rest.api.ApiApplicationTests`](src/test/java/com/rest/api/ApiApplicationTests.java)
- [pom.xml](pom.xml)
- [src/main/resources/application.properties](src/main/resources/application.properties)
- [src/main/resources/templates/Product.html](src/main/resources/templates/Product.html)



## Quick start (Eclipse)
Download the ZIP and extract the folder.  
Open Eclipse.  
File -> Import -> Existing Maven Projects and select the extracted project folder  
Project -> Update Maven Project.  
Open src/main/resources/application.properties and update  To run on port 80, add or set: server.port=80  
Right-click the project -> Run As -> Spring Boot App (or click Run).  
Open a browser and go to: http://localhost

## Run from command line
- Using Maven:
  - Start: mvn spring-boot:run
  - Build: mvn package
  - Run packaged jar: java -jar target/api-0.0.1-SNAPSHOT.jar
- Using the wrapper:
  - Unix: ./mvnw spring-boot:run
  - Windows: mvnw.cmd spring-boot:run

## What this project does
- The controller [`com.rest.api.MyController`](src/main/java/com/rest/api/MyController.java) uses a `RestTemplate` to fetch product data from https://dummyjson.com/products and passes it to the Thymeleaf view.
- The Thymeleaf template is at [src/main/resources/templates/Product.html](src/main/resources/templates/Product.html).
- Application settings are in [src/main/resources/application.properties](src/main/resources/application.properties).

## Tests
Unit tests are located at: [`com.rest.api.ApiApplicationTests`](src/test/java/com/rest/api/ApiApplicationTests.java) and can be run with:
- mvn test

## Notes
- Running on port 80 may require elevated privileges on some OSes. Adjust `server.port` in [src/main/resources/application.properties](src/main/resources/application.properties) if needed.
- See [pom.xml](pom.xml) for dependencies (Spring Boot Starter Web, Thymeleaf, etc.).
