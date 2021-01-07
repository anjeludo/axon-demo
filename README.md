# Spring Boot Axon CQRS Docker Example
This is a simple example how the Axon Framework can be used with Spring Boot to implement CQRS and Event Sourcing.

## Run it
Just run Docker Compose to build and start the containers.
```
docker-compose up --build
```

## Test it
The scenario is simple: you can create a cart

The command service runs on `http POST http://localhost:8080/ecommerce/cart <<<'{"id":"237e9877-e79b-12d4-a765-321741963000", "userId":"237e9877-e79b-12d4-a765-321741963000"}'`.
