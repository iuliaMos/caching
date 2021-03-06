docker build -t spring-caching .
docker run -p 8080:8080 spring-caching

---- using jib plugin
mvn jib:dockerBuild
