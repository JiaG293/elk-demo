FROM eclipse-temurin:21.0.5_11-jdk-alpine AS build
WORKDIR /app

COPY build.gradle settings.gradle gradlew ./
COPY gradle /app/gradle


RUN chmod +x gradlew && ./gradlew build -x test || return 0

COPY --from=build /app/build/libs/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
