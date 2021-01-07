# Spring Boot Axon CQRS Docker Example
This is a simple example how the Axon Framework can be used with Spring Boot to implement CQRS and Event Sourcing.

## Run it
Just run Docker Compose to build and start the containers.
```
docker-compose up --build
```

## Test it
The scenario is simple: place a bowl on a table, fill it with some peanuts and don't let them go bad.

The command service runs on `http://localhost:8081`, the query service in `http://localhost:8082`.
