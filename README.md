# SMS - School Management System

This project will be in the form of an enterprise class application, with the subject being a platform facilitating educational usage, in other words, a school management system. This application aims to provide students and teachers a platform to access courses and interact with each other through the manipulation of classes.

## Requirements
  #### Functional:
  -	Student users shall be able to search and view available courses
  -	Student users shall be able to add courses to their course list
  -	Student users shall be able to submit assignments on their course page
  -	Student users shall be able to access course information and documents
  -	Teacher users shall be able to create assignments for student courses
  -	Teacher users shall be able to grade student assignment submissions
  -	Teacher users shall be able to add documents to courses
  -	Administrator users shall be able to add and remove student and teacher users to and from courses
  -	Administrator users shall be able to add and remove users to the system
  
  #### Non-Functional:
  -	Availability:
     -	The system shall be able to operate even in the case of request failure
  -	Performance: 
     -	The system shall process user requests within 2 seconds
     -	The system shall return replies within 5 seconds
  -	Portability: 
     -	The system shall be deployed and accessible from different operating systems
  -	Reliability: 
     -	The system shall be able to handle crashes and hangs 
     -	The system shall be able to handle multiple client requests
  -	Security: 
     -	Transfer of data and information shall be protected
     -	The system shall be able to handle unauthorized malicious injection
  -	Usability: 
     -	The application shall be easy-to-use and the interface user-friendly

## Technology, Software, & Architecture
  ### Technology & Software:
  -	Apache Tomcat: To host the web application and provide a testing environment. Provides better configuration and integration with Java based solutions
  -	Java: To code and design the client-server applications 
  -	Spring Framework: To provide web-oriented communication between server and client, provides many useful benefits 
  -	REST/HTTPS: To make the application’s business logic definition inaccessible to the end-user, while maintaining its operability (creating proxy functions to create a layer of abstraction between the client and the business logic)
  -	MySQL: To create and serve the application’s database server-wise
  
  ### Architecture:
  #### Physical Architecture:
  ![](https://github.com/lordeternity/sms/blob/master/docs/architecture/Logical%20Architecture.png)

  #### Physical Architecture - Detailed:
  ![](https://github.com/lordeternity/sms/blob/master/docs/architecture/Physical%20Architecture%20-%20Detailed.png)

  #### Logical Architecture:
  ![](https://github.com/lordeternity/sms/blob/master/docs/architecture/Logical%20Architecture.png)
  
## Design - Class Diagrams
  #### Entity Class Diagram:
  ![](https://github.com/lordeternity/sms/blob/master/docs/design/Data%20Sequence%20Diagram.png)
  
  #### Repository - Services Class Diagram:
  ![](https://github.com/lordeternity/sms/blob/master/docs/design/Repository%20Services%20Class%20Diagram.png)
  
## Design - Sequence Diagrams
  #### Data Sequence Diagram:
  ![](https://github.com/lordeternity/sms/blob/master/docs/design/Data%20Sequence%20Diagram.png)
  
  #### Services Sequence Diagram:
  ![](https://github.com/lordeternity/sms/blob/master/docs/design/Service%20Sequence%20Diagram.png)

## Development
- Clone this repository
- Install mysql (at least v5.7)
- Configure the following:
  - create a database with name "db_sms"
  - create a user with username "smsaccess" and password "smspsswd"
- Do "./gradlew bootRun" in sms project directory
