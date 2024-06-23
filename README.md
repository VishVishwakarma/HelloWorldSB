# From Development perspective Spring Boot halleluyah
**A simple Spring Boot 3.3.x app to send hello world message to a user**

## How to Import 
**Import project through STS application git repository**

## Convert to Maven
**Right click on project select configure->convert to mavan**

## How to Run Application

**select on project run as Spring Boot App**

**Send an HTTP GET request to '/' endpoint using any of the two methods**

- **Browser or REST client**
  <br/>```http://localhost:8080/```


- **cURL**
  <br/>```curl --request GET 'http://localhost:8080/hello?print=userInput'```
  <br/>
  <br/>
   
  

# From User perspective Spring Boot halleluyah

**A simple Spring Boot 3.3.x app to send halleluyah message to a user**

## How to Run Application

**Start the application using any of the commands mentioned below**

> **Note:** First two commands need to run inside the root folder of this project i.e inside the **HelloWorldSB** folder


- **Using maven** <br/>``` mvn spring-boot:run```


- **From jar file**
  Create a jar file using '**mvn clean install**' command and then execute
  <br/>```java -jar target/Helloworld-0.0.1-SNAPSHOT.jar```


> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.

<br/>

**Send an HTTP GET request to '/' endpoint using any of the two methods**

- **Browser or REST client**
  <br/>```http://localhost:8080/```


- **cURL**
  <br/>```curl --request GET 'http://localhost:8080/hello?print=userInput'```
