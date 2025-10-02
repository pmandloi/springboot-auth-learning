# Spring Boot + Redis (Docker) Demo

This is a simple demo project showing how to integrate **Redis** with **Spring Boot** using `RedisTemplate`.  
It demonstrates storing and retrieving basic **key-value pairs** in Redis.

---

## 🚀 Prerequisites

- [Docker Desktop](https://www.docker.com/products/docker-desktop) installed and running
- JDK 8+
- Maven or Gradle

---

## 🐳 Running Redis in Docker

1. Start a Redis container:
   ```bash
   docker run -d --name redis-test -p 6379:6379 redis
2. Check if Redis is running:
   ```bash
   docker ps
3. Access Redis CLI
   ```bash
   docker exec -it redis redis-cli
   
## ⚙️ Project Setup
1. Clone or create a new Spring Boot project with the following dependency in pom.xml:
    ```xml
   <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-redis</artifactId>
    </dependency>
2. Add Redis configuration in application.properties:
    ```properties
    spring.application.name=redis-demo
    spring.redis.host=localhost
    spring.redis.port=6379

## 🔍 Test the Endpoints
    
```bash
    curl -X POST "http://localhost:8080/redis/save?key=testKey&value=hello"
    curl "http://localhost:8080/redis/get?key=testKey"
