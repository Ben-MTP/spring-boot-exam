

## Hướng dẫn call api:

CRUD:

Create:

curl -X POST -H "Content-Type: application/json" -d "{\"id\":9,\"name\":\"Angular 12 Tutorial\",\"price\":100}" http://localhost:8080/product

Read:

curl http://localhost:8080/product

Read By Id:

curl http://localhost:8080/product/1

Update:

curl -X PUT -H "Content-Type: application/json" -d "{\"id\":8,\"name\":\"TypeScrpit Tutorial Update\",\"price\":199}" http://localhost:8080/product

Delete:

curl -X DELETE -H "Content-Type: application/json" -d "{\"id\":8,\"name\":\"TypeScrpit Tutorial Update\",\"price\":199}" http://localhost:8080/product
