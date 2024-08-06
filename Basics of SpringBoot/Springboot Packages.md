# Springboot Packages

* This document talks about all the packages that are available and how to import them.

# Spring Boot application starters

* The following application starters are provided by Spring Boot under the `org.springframework.boot` group:
  
## spring-boot-starter
* Core starter, including auto-configuration support, logging and YAML

## spring-boot-starter-activemq

* Starter for JMS messaging using Apache ActiveMQ

## spring-boot-starter-amqp

* Starter for using Spring AMQP and Rabbit MQ

## spring-boot-starter-aop

* Starter for aspect-oriented programming with Spring AOP and AspectJ

## spring-boot-starter-artemis

* Starter for JMS messaging using Apache Artemis

## spring-boot-starter-batch

* Starter for using Spring Batch

## spring-boot-starter-cache

* Starter for using Spring Framework’s caching support

## spring-boot-starter-data-cassandra

* Starter for using Cassandra distributed database and Spring Data Cassandra

## spring-boot-starter-data-cassandra-reactive

* Starter for using Cassandra distributed database and Spring Data Cassandra Reactive

## spring-boot-starter-data-couchbase

* Starter for using Couchbase document-oriented database and Spring Data Couchbase

## spring-boot-starter-data-couchbase-reactive

* Starter for using Couchbase document-oriented database and Spring Data Couchbase Reactive

## spring-boot-starter-data-elasticsearch

* Starter for using Elasticsearch search and analytics engine and Spring Data Elasticsearch

## spring-boot-starter-data-jdbc

* Starter for using Spring Data JDBC

## spring-boot-starter-data-jpa

* Starter for using Spring Data JPA with Hibernate

## spring-boot-starter-data-ldap

* Starter for using Spring Data LDAP

## spring-boot-starter-data-mongodb

* Starter for using MongoDB document-oriented database and Spring Data MongoDB

## spring-boot-starter-data-mongodb-reactive

* Starter for using MongoDB document-oriented database and Spring Data MongoDB Reactive

## spring-boot-starter-data-neo4j

* Starter for using Neo4j graph database and Spring Data Neo4j

## spring-boot-starter-data-r2dbc

* Starter for using Spring Data R2DBC

## spring-boot-starter-data-redis

* Starter for using Redis key-value data store with Spring Data Redis and the Lettuce client

## spring-boot-starter-data-redis-reactive

* Starter for using Redis key-value data store with Spring Data Redis reactive and the Lettuce client

## spring-boot-starter-data-rest

* Starter for exposing Spring Data repositories over REST using Spring Data REST and Spring MVC

## spring-boot-starter-freemarker

* Starter for building MVC web applications using FreeMarker views

## spring-boot-starter-graphql

* Starter for building GraphQL applications with Spring GraphQL

## spring-boot-starter-groovy-templates

* Starter for building MVC web applications using Groovy Templates views

## spring-boot-starter-hateoas

* Starter for building hypermedia-based RESTful web application with Spring MVC and Spring HATEOAS

## spring-boot-starter-integration

* Starter for using Spring Integration

## spring-boot-starter-jdbc

* Starter for using JDBC with the HikariCP connection pool

## spring-boot-starter-jersey

* Starter for building RESTful web applications using JAX-RS and Jersey. An alternative to spring-boot-starter-web

## spring-boot-starter-jooq

* Starter for using jOOQ to access SQL databases with JDBC. An alternative to spring-boot-starter-data-jpa or spring-boot-starter-jdbc

## spring-boot-starter-json

* Starter for reading and writing json

## spring-boot-starter-mail

* Starter for using Java Mail and Spring Framework’s email sending support

## spring-boot-starter-mustache

* Starter for building web applications using Mustache views

## spring-boot-starter-oauth2-authorization-server

* Starter for using Spring Authorization Server features

## spring-boot-starter-oauth2-client

* Starter for using Spring Security’s OAuth2/OpenID Connect client features

## spring-boot-starter-oauth2-resource-server

* Starter for using Spring Security’s OAuth2 resource server features

## spring-boot-starter-pulsar

* Starter for using Spring for Apache Pulsar

## spring-boot-starter-pulsar-reactive

* Starter for using Spring for Apache Pulsar Reactive

## spring-boot-starter-quartz

* Starter for using the Quartz scheduler

## spring-boot-starter-rsocket

* Starter for building RSocket clients and servers

## spring-boot-starter-security

* Starter for using Spring Security

## spring-boot-starter-test

* Starter for testing Spring Boot applications with libraries including JUnit Jupiter, Hamcrest and Mockito

spring-boot-starter-thymeleaf

Starter for building MVC web applications using Thymeleaf views

spring-boot-starter-validation

Starter for using Java Bean Validation with Hibernate Validator

spring-boot-starter-web

Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container

spring-boot-starter-web-services

Starter for using Spring Web Services

spring-boot-starter-webflux

Starter for building WebFlux applications using Spring Framework’s Reactive Web support

spring-boot-starter-websocket

Starter for building WebSocket applications using Spring Framework’s MVC WebSocket support

In addition to the application starters, the following starters can be used to add production ready features:

Table 2. Spring Boot production starters
Name	Description
spring-boot-starter-actuator

Starter for using Spring Boot’s Actuator which provides production ready features to help you monitor and manage your application

Finally, Spring Boot also includes the following starters that can be used if you want to exclude or swap specific technical facets:

Table 3. Spring Boot technical starters
Name	Description
spring-boot-starter-jetty

Starter for using Jetty as the embedded servlet container. An alternative to spring-boot-starter-tomcat

spring-boot-starter-log4j2

Starter for using Log4j2 for logging. An alternative to spring-boot-starter-logging

spring-boot-starter-logging

Starter for logging using Logback. Default logging starter

spring-boot-starter-reactor-netty

Starter for using Reactor Netty as the embedded reactive HTTP server.

spring-boot-starter-tomcat

Starter for using Tomcat as the embedded servlet container. Default servlet container starter used by spring-boot-starter-web

spring-boot-starter-undertow

Starter for using Undertow as the embedded servlet container. An alternative to spring-boot-starter-tomcat
