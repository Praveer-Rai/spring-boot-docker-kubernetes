# spring-boot-docker-kubernetes

# to set up the db:

docker run --name movies_postgres -p 5432:5432 -e POSTGRES_USER=dbuser -e POSTGRES_DB=movies_db -e POSTGRES_PASSWORD=password -d postgres
