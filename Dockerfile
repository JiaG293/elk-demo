FROM eclipse-temurin:21.0.5_11-jdk-alpine AS build
WORKDIR /app

RUN chmod +x gradlew && ./gradlew build -x test

COPY --from=build /app/build/libs/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
