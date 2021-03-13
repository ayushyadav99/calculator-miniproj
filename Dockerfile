FROM openjdk:8
COPY ./target/calculator-miniproj-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-miniproj-1.0-SNAPSHOT.jar", "App"]