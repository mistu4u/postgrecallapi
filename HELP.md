# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

This project is calling putting data into an intermediate table after fetching data from two other tables. After that
 for each record, it is calling another API and if response from that API is a success, updates the process flag in 
 the intermediate table.
 
 Following SQLs are helpful to test the functionality readymade.
 
 select * from address;
 
 create table person(id int, name text);
 create table food (person_id int, food_id int, food_desc text);
 
 create table additional (food_id int, additional text);
 
 insert into person values (1, 'Subir');
 insert into person values (2, 'Mistu');
 
 insert into food values (1,101,'pizza');
 insert into food values (2,102,'pasta');
 
 insert into additional values (101,'Mirchi');
 insert into additional values (102,'Sauce');
 
 select * from additional;
 
 create table fooddetails(person_id int, food_desc text,processed character);
 create table fooddetails_replica (person_id int, food_desc text);
 
 drop table fooddetails_replica;
 insert into "fooddetails"("person_id","food_desc","processed")  
 select "id","food_desc",'N' from "person","food" where "id" = "person_id";
 insert into fooddetails(person_id,food_desc,processed)  select id,food_desc,'N' from person,food where id = person_id;
 select * from fooddetails;
 select * from fooddetails_replica;
 delete from fooddetails;
 delete from fooddetails_replica;
