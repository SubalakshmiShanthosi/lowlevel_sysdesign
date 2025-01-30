# Spring data JPA configuration

Set the USERNAME and PASSWORD to  user credentials of your database

```rb
## default connection pool
spring.datasource.hikari.connectionTimeout=20000
spring.datasource.hikari.maximumPoolSize=5

## PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/<DATABASENAME>
spring.datasource.username={POSTGRES_DB_USERNAME}
spring.datasource.password={POSTGRES_DB_PASSWORD}

## create and drop table, good for testing, production set to none or comment it
spring.jpa.properties.hibernate.hbm2ddl.auto=create
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.properties.hibernate.dialect: org.hibernate.dialect.PostgreSQLDialect
```

## why docker-compose for interacting with postgresSQL

Docker Compose is a tool that allows you to define and run multiple containers, including a PostgreSQL database, in a single application. This can be useful for development, testing, and deployment.

Docker Compose makes it easy to manage and scale your PostgreSQL containers, and it provides a simple and repeatable way to set up your development and testing environment.
