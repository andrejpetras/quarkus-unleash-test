# quarkus-unleash-test
Quarkus unleash test repository

# Test case

Start docker containers
```
docker-compose up -d unleash-db
docker-compose up unleash
```
Start test application
```
mvn clean compile quarkus:dev
```
Test request
```
curl http://localhost:8080/unleash
```

# Native
Build native application
```
mvn clean package -Pnative
```
Start native application
```
./target/quarkus-unleasn-test-1.0.0-runner
```
