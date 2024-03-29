# Этап 1 - сборка проекта в jar
FROM maven as maven
WORKDIR /app
COPY . /app
RUN mvn install -Dmaven.test.skip=true

# Этап 2 - указание как запустить проект
FROM openjdk
WORKDIR /app
COPY --from=maven /app/target/job4j_forum.jar app.jar
CMD java -jar app.jar