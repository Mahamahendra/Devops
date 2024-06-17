FROM eclipse-temurin:17
COPY target/devOps.jar devOps.jar
CMD ["java", "-jar", "devOps.jar"]