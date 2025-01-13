FROM eclipse-temurin:21.0.5_11-jdk-alpine AS build
WORKDIR /app

COPY . .
RUN chmod +x gradlew && ./gradlew build -x test

FROM eclipse-temurin:21.0.5_11-jre-alpine
WORKDIR /app

COPY --from=build /app/build/libs/elk-demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]