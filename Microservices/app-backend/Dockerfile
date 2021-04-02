FROM gradle:jdk11

COPY --chown=gradle:gradle . /app-backend
WORKDIR /app-backend
RUN gradle build

EXPOSE 8080
WORKDIR /app-backend

CMD java -jar build/libs/app-backend-0.0.1-SNAPSHOT.jar
