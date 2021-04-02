FROM gradle:jdk11

COPY --chown=gradle:gradle . /app-frontend

WORKDIR /app-frontend
RUN gradle build

EXPOSE 3000
WORKDIR /app-frontend

CMD java -jar build/libs/app-frontend-0.0.1-SNAPSHOT.jar --server.port=3000